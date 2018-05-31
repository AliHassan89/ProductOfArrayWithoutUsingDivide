package test.java;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import main.java.ProductOfAllNumbers;
import org.junit.Test;

public class ProductOfAllNumbersTest {

  private static final ProductOfAllNumbers product = new ProductOfAllNumbers();

  @Test
  public void shouldGetProductOfAllNumbers(){
    //given
    int[] arr = {10,3,5,6,2};
    int[] expected = {180, 600, 360, 300, 900};

    //when
    int[] prod = product.productOfNumbers(arr);

    //then
    assertThat(prod, notNullValue());
    assertThat(prod, equalTo(expected));
  }

}
