package main;

import factory.StackFactory;
import pilas.Stack;
import calculadora.Calculadora;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.ArrayList 2.Vector 3.Lista");
        int op = sc.nextInt();
        String tipoStack = "";
        String tipoLista = "";

        switch (op) {
            case 1:
                tipoStack = "arraylist";
                break;
            case 2:
                tipoStack = "vector";
                break;
            case 3:
                tipoStack = "lista";
                System.out.println("1.Simple 2.Doble");
                int op2 = sc.nextInt();
                tipoLista = (op2 == 1) ? "simple" : "doble";
                break;
        }

        Stack<String> stackConv = StackFactory.getStack(tipoStack, tipoLista);
        Stack<Integer> stackEval = StackFactory.getStack(tipoStack, tipoLista);
        Calculadora calc = Calculadora.getInstance();

        BufferedReader br = new BufferedReader(new FileReader("datos.txt"));

        String line;
        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty())
                continue;

            String postfix = calc.infixToPostfix(line, stackConv);
            int result = calc.evaluarPostfix(postfix, stackEval);

            System.out.println("Infix: " + line);
            System.out.println("Postfix: " + postfix);
            System.out.println("Resultado: " + result);
            System.out.println("------------------");
        }

        br.close(); // cerrar manualmente
    }
}


