package factory;
import pilas.*;
public class StackFactory {
    public static <E> Stack<E> getStack(String tipo){
        if(tipo.equalsIgnoreCase("arraylist"))
            return new StackArrayList<>();
        throw new IllegalArgumentException();
    }
}
