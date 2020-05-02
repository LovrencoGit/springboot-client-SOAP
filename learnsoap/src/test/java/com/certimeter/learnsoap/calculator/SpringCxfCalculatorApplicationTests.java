package com.certimeter.learnsoap.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.certimeter.learnsoap.soap.client.CalculatorSoapClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringCxfCalculatorApplicationTests {

  @Autowired
  private CalculatorSoapClient calculatorClient;

  
  @Test
  public void testSum() {
    assertThat( calculatorClient.add(8, 2) ).isEqualTo( 10 );
  }
  @Test
  public void testSubstract() {
	  assertThat( calculatorClient.subtract(8, 2) ).isEqualTo( 6 );
  }
  @Test
  public void testMultiply() {
	  assertThat( calculatorClient.multiply(8, 2) ).isEqualTo( 16 );
  }
  @Test
  public void testDivide() {
	  assertThat( calculatorClient.divide(8, 2) ).isEqualTo( 4 );
  }
}
