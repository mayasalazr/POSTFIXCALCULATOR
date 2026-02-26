package calculadora;

import pilas.Stack;

public class Calculadora {


    private static Calculadora instance;

    private Calculadora() {}

    public static Calculadora getInstance() {
        if (instance == null) {
            instance = new Calculadora();
        }
        return instance;
    }


    public String infixToPostfix(String expresion, Stack<String> pila) {
        StringBuilder salida = new StringBuilder();

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);


            if (Character.isDigit(caracter)) {
                while (i < expresion.length() && Character.isDigit(expresion.charAt(i))) {
                    salida.append(expresion.charAt(i));
                    i++;
                }
                salida.append(" ");
                i--; 
            }

            else if (caracter == '(') {
                pila.push(String.valueOf(caracter));
            }

            else if (caracter == ')') {
                while (!pila.isEmpty() && !pila.peek().equals("(")) {
                    salida.append(pila.pop()).append(" ");
                }
                pila.pop(); // Elimina el "("
            }

            else if ("+-*/".indexOf(caracter) >= 0) {
                while (!pila.isEmpty() &&
                       prioridad(pila.peek()) >= prioridad(String.valueOf(caracter))) {
                    salida.append(pila.pop()).append(" ");
                }
                pila.push(String.valueOf(caracter));
            }
        }

        // Vaciar la pila restante
        while (!pila.isEmpty()) {
            salida.append(pila.pop()).append(" ");
        }

        return salida.toString().trim();
    }


    private int prioridad(String operador) {
        if (operador.equals("+") || operador.equals("-")) {
            return 1;
        }
        if (operador.equals("*") || operador.equals("/")) {
            return 2;
        }
        return 0;
    }


    public int evaluarPostfix(String expresion, Stack<Integer> pila) {
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {


            if (token.matches("-?\\d+")) {
                pila.push(Integer.parseInt(token));
            }


            else {
                int b = pila.pop();
                int a = pila.pop();

                switch (token) {
                    case "+":
                        pila.push(a + b);
                        break;
                    case "-":
                        pila.push(a - b);
                        break;
                    case "*":
                        pila.push(a * b);
                        break;
                    case "/":
                        pila.push(a / b);
                        break;
                }
            }
        }

        return pila.pop();
    }
}
