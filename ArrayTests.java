import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input = {10, 15, 20};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {20, 15, 10}, input);
  }

  @Test
  public void testReversed2(){
    int[] input = {10, 15, 20};
    int[] input2 = ArrayExamples.reversed(input);
    assertArrayEquals(new int[] {20, 15, 10}, input2);
  }

  @Test
  public void averageWithoutLowest(){
    double[] input = {2, 2, 2, 2};
    double result = ArrayExamples.averageWithoutLowest(input);
    double expected = 2.0;
    assertEquals(expected, result, 0.0);
  }

}
