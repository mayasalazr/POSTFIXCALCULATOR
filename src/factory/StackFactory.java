package factory;
import pilas.*;
import listas.*;
public class StackFactory {
    public static <E> Stack<E> getStack(String tipoStack,String tipoLista){
        switch(tipoStack.toLowerCase()){
            case "arraylist": return new StackArrayList<>();
            case "vector": return new StackVector<>();
            case "lista":
                if(tipoLista.equalsIgnoreCase("simple"))
                    return new StackLista<>(new ListaSimple<>());
                else
                    return new StackLista<>(new ListaDoble<>());
            default: throw new IllegalArgumentException("Tipo inválido");

                
    
        
    }
 }
}