package calculadora;

import java.util.Stack;

public class PostFixCalculatorI Implements PostfixCalculator{
    private Stack<Integer> stack;

    public PostFixCalculatorI (Stack<Integer> stack){
        this.stack = stack;

    }

    @Override
    public int evaluate(String expression){
        String[] tokens = expression.spliy(" ");
        for (String toke : tokens){
            if (isNumber(token)){
                stack.push(Integer.parseInt(token));


            } else if (isOperator(token)){
                if (stack.size() < 2){
                    throw new RuntimeException("Operandos insuficientes");

                }
                int b= stack.pop();
                int a = stack.pop();
                int result = applyOperTOR(A, B, token);

                stack.push(result);

            }else {
                System.out.println("Invalido:" + token);

            }

            
        }

        return stack.pop();
    }
    private boolean isOperator(String s){
            return"+-*/".contains(s);
    }
    private int applyOperator(int a, int b, String op){
        switch(op){
            case "+":
                return a + b;

            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if ( b== 0){
                    System.out.println("División invalidad: entre cero");

                }
                return a / b;


        }
    }
}






    

