package pilas;

import java.util.Vector;

public class StackVector<E> extends AbstractStack<E> {
    private Vector<E> data=new Vector<>();
    public void push(E item){data.add(item);size++;}
    public E pop(){if(isEmpty())throw new RuntimeException("Pila vacía");size--;return data.remove(data.size()-1);}
    public E peek(){if(isEmpty())throw new RuntimeException("Pila vacía");return data.get(data.size()-1);}
}
