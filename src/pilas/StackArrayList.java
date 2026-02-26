package pilas;
import java.util.ArrayList;
public class StackArrayList<E> extends AbstractStack<E>{
    private ArrayList<E> data=new ArrayList<>();
    public void push(E item){ data.add(item); size++; }
    public E pop(){ if(isEmpty()) throw new RuntimeException(); size--; return data.remove(data.size()-1); }
    public E peek(){ if(isEmpty()) throw new RuntimeException(); return data.get(data.size()-1); }
}

