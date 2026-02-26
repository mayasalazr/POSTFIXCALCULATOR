import org.junit.jupiter.api.Test;
import listas.ListaSimple;
import static org.junit.jupiter.api.Assertions.*;

public class ListaSimpleTest {

    @Test
    void testAddRemove() {
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.add(5);
        lista.add(10);
        assertEquals(10, lista.removeLast());
        assertEquals(5, lista.removeLast());
    }
}
