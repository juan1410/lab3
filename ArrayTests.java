import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {5};
    ArrayExamples.reverseInPlace(input1);
    int[] input2 = {5};
    assertArrayEquals(input2, input1);
	}


  // @Test
  // public void testReversed() {
  //   int[] input1 = { };
  //   assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  // }

  @Test
  public void testReverseInPlace2(){
    int[] input = {10, 15, 20, 35, 40};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {40, 35, 20, 15, 10}, input);
  }

  // @Test
  // public void testReversed2(){
  //   int[] input = {10, 15, 20};
  //   int[] input2 = ArrayExamples.reversed(input);
  //   assertArrayEquals(new int[] {20, 15, 10}, input2);
  // }

  // @Test
  // public void averageWithoutLowest(){
  //   double[] input = {2, 2, 2, 2};
  //   double result = ArrayExamples.averageWithoutLowest(input);
  //   double expected = 2.0;
  //   assertEquals(expected, result, 0.0);
  // }

}
