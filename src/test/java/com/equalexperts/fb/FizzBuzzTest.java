package com.equalexperts.fb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class FizzBuzzTest {

  @Test
  public void expectStringWhenRangeIsValid() {

    final String TEST_VALUE_1_TO_20 = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";
    int start = 1;
    int finish = 20;

    String result = FizzBuzz.convertRange(start, finish);

    assertNotNull(result);
    assertEquals(TEST_VALUE_1_TO_20, result);
  }

  @Test
  public void shouldConvertToFizz() {

    String result = FizzBuzz.convert(FizzBuzz.FIZZ_VALUE);
    assertNotNull(result);
    assertEquals("fizz", result);
  }

  @Test
  public void shouldConvertToBuzz() {

    String result = FizzBuzz.convert(FizzBuzz.BUZZ_VALUE);
    assertNotNull(result);
    assertEquals("buzz", result);
  }

  @Test
  public void shouldConvertToFizzBuzz() {

    String result = FizzBuzz.convert(FizzBuzz.FIZZBUZZ_VALUE);
    assertNotNull(result);
    assertEquals("fizzbuzz", result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void expectIllegalArgumentExceptionWhenRangeIncorrectOrder() {

    FizzBuzz.runFizzBuzz(11,9);
    fail("IllegalArgumentException expected.");
  }

  @Test
  public void whenRangeIsEqualAssertNotNull() {

    String result = FizzBuzz.convertRange(11,11);
    assertNotNull(result);
  }
}
