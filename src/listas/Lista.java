package listas;

public interface Lista<E>{
    void add(E item);
    E removeLast();
    E getLast();
    boolean isEmpty();
    int size();
}
