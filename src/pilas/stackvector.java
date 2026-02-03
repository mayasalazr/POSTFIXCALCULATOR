import java.util.Vector;


public class stackvector<E> implements stack<E> {
    private Vector<E> data;

    public stackvector(){
        data = new Vector<>();
    }
    
    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacpia");

        }
        return data.remove(data.size() - 1);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return data.lastElement();
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
