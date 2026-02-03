package pilas;

import java.util.ArrayList;

public class StackArrayList<E> implements Stack<E> {

    private ArrayList<E> data;

    public StackArrayList() {
        data = new ArrayList<>();
    }

    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return data.remove(data.size() - 1);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return data.get(data.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }
}

