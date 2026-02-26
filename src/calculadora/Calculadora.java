package calculadora;
import pilas.Stack;
public class Calculadora{
    private static Calculadora instance;
    private Calculadora(){}
    public static Calculadora getInstance(){
        if(instance==null) instance=new Calculadora();
        return instance;
    }
    public int evaluarPostfix(String exp, Stack<Integer> stack){
        String[] tokens=exp.split(" ");
        for(String t:tokens){
            if(t.matches("-?\\d+")) stack.push(Integer.parseInt(t));
            else{
                int b=stack.pop();
                int a=stack.pop();
                switch(t){
                    case "+": stack.push(a+b); break;
                    case "-": stack.push(a-b); break;
                    case "*": stack.push(a*b); break;
                    case "/": stack.push(a/b); break;
                }
            }
        }
        return stack.pop();
    }
}
