package pilas;

import listas.Lista;

public class StackLista<E> extends AbstractStack<E>{
    private Lista<E> lista;
    public StackLista(Lista<E> lista){this.lista=lista;}
    public void push(E item){lista.add(item);size++;}
    public E pop(){if(isEmpty())throw new RuntimeException("Pila vacía");size--;return lista.removeLast();}
    public E peek(){if(isEmpty())throw new RuntimeException("Pila vacía");return lista.getLast();}
    
}
