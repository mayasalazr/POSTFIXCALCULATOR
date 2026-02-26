package listas;

public class ListaSimple<E> extends AbstractLista<E> {
    private static class Nodo<E>{E data;Nodo<E> next;Nodo(E d){data=d;}}
    private Nodo<E> head;
    public void add(E item){
        Nodo<E> n=new Nodo<>(item);
        if(head==null)head=n;
        else{Nodo<E> t=head;while(t.next!=null)t=t.next;t.next=n;}
        size++;
    }
    
    public E removeLast(){
        if(isEmpty())throw new RuntimeException("Lista vacía");
        if(head.next==null){E d=head.data;head=null;size--;return d;}
        Nodo<E> t=head;
        while(t.next.next!=null)t=t.next;
        E d=t.next.data;t.next=null;size--;return d;
    }
    
    public E getLast(){
        if(isEmpty())throw new RuntimeException("Lista vacía");
        Nodo<E> t=head;while(t.next!=null)t=t.next;return t.data;
    }
    
}
