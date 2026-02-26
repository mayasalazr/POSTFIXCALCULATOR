package listas;

public abstract class AbstractLista<E> implements Lista<E>{
    protected int size=0;
    public boolean isEmpty(){ return size==0; }
    public int size(){ return size; }
}