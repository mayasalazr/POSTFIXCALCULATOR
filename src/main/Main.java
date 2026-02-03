package main;

import pilas.Stack;
import pilas.StackArrayList;
import calculadora.PostfixCalculator;
import calculadora.PostFixCalculatorI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new StackArrayList<>();
        PostfixCalculator calculator = new PostFixCalculatorI(stack);
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {

                // Ignorar líneas vacías
                if (line.trim().isEmpty()) {
                    continue;
                }

                try {
                    int result = calculator.evaluate(line);
                    System.out.println("Expresión: " + line);
                    System.out.println("Resultado: " + result);
                    System.out.println("--------------------");

                } catch (RuntimeException e) {
                    System.out.println("Error en la expresión: " + line);
                    System.out.println(e.getMessage());
                    System.out.println("--------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo datos.txt");
        }
    }
}


