package pilas;

public abstract class AbstractStack<E> implements Stack<E> {
    protected int size = 0;
    public int size(){ return size; }
    public boolean isEmpty(){ return size==0; }
    
}
