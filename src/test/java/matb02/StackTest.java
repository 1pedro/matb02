package matb02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class StackTest {

	  Stack<Integer> stack;

	  @Before
	  public void init() {
	    stack = new Stack<Integer>();
	  }

	  @Test
	  public void testEmptyStack() {
	    assertTrue(stack.isEmpty());
	  }

	  @Test
	  public void testNotEmptyStack() {
	    stack.push(10);
	    assertFalse(stack.isEmpty());
	  }

	  @Test
	  public void testSizeStack() {
	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    int size = stack.size();
	    assertEquals(9,size);
	  }

	  @Test
	  public void testPushPopStack() {
	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    int result = stack.pop();
	    result = stack.pop();
	    assertEquals(20,result);
	  }

	  @Test(expected = java.util.EmptyStackException.class)
	  public void testEmptyStackException() {
	    stack.push(10);
	    int result = stack.pop();
	    result = stack.pop();
	  }

	}