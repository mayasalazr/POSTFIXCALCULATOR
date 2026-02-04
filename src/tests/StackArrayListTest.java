package tests;

import pilas.Stack;
import pilas.StackArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackArrayListTest {

    @Test
    public void testPushPop() {
        Stack<Integer> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }
}

