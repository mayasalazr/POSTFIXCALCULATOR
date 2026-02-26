package main;
import calculadora.Calculadora;
import factory.StackFactory;
import pilas.Stack;
public class Main{
    public static void main(String[] args){
        Stack<Integer> stack=StackFactory.getStack("arraylist");
        Calculadora calc=Calculadora.getInstance();
        System.out.println(calc.evaluarPostfix("10 20 + 9 *", stack));
    }
}


