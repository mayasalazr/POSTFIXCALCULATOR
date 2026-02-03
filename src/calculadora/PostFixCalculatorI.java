package calculadora;

import pilas.Stack;

public class PostFixCalculatorI implements PostfixCalculator {

    private Stack<Integer> stack;

    public PostFixCalculatorI(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public int evaluate(String expression) {

        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));

            } else if (isOperator(token)) {

                if (stack.size() < 2) {
                    throw new RuntimeException("Operandos insuficientes");
                }

                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(a, b, token);

                stack.push(result);

            } else {
                throw new RuntimeException("Token inválido: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new RuntimeException("Expresión postfix inválida");
        }

        return stack.pop();
    }

    private boolean isNumber(String s) {
        return s.matches("-?\\d+");
    }

    private boolean isOperator(String s) {
        return "+-*/".contains(s);
    }

    private int applyOperator(int a, int b, String op) {

        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("División entre cero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operador desconocido");
        }
    }
}







    

