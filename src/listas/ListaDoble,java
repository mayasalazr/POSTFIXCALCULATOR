package listas;

public class ListaDoble<E> extends AbstractLista<E>{
    private static class Nodo<E>{E data;Nodo<E> next,prev;Nodo(E d){data=d;}}
    private Nodo<E> head,tail;

    public void add(E item){
        Nodo<E> n=new Nodo<>(item);
        if(head==null){head=tail=n;}
        else{tail.next=n;n.prev=tail;tail=n;}
        size++;}

    public E removeLast(){
        if(isEmpty())throw new RuntimeException("Lista vacía");
        E d=tail.data;
        tail=tail.prev;
        if(tail!=null)tail.next=null;else head=null;
        size--;return d;
    }

    public E getLast(){
        if(isEmpty())throw new RuntimeException("Lista vacía");
        return tail.data;
    }
}