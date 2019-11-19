import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.lang.reflect.Method;


public class CalculatorTest {
    Calculator calculator;
    double expected;
    double actual;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }
    @AfterEach
    void after(){
        System.out.println("Test Done");    }
    @Test
    @Order(1)
   public void testSum() {
         expected = 2;
         actual = calculator.sum(1, 1);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    @Order(2)
    public void testRest()  {
         expected = 5;
         actual = calculator.rest(10, 5);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @Order(3)
   public void testMultiply() {
        Calculator calculator = new Calculator();
         expected = 72;
         actual = calculator.multiply(8, 9);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @Order(4)
    public void testDivide()  {
         expected = 20;
         actual = calculator.divide(100, 5);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testDivision() throws Exception {
        Method method = Calculator.class.getDeclaredMethod("division", int.class, int.class);
        method.setAccessible(true);
        Assertions.assertEquals(2, method.invoke(calculator, 4,2));
    }

    @Test
    @DisplayName("Exception thrown when integer is divided by zero")
    public void testArithmeticException(){
        Assertions.assertThrows(ArithmeticException.class ,()->calculator.divide(20,0),"Divide by zero should throw");
    }
    @ParameterizedTest
    @ValueSource(doubles = {1,2,3,4,5})
    @Order(5)
   public void test_ValueSourcePCT (double number){
        expected = (number)/100;
         actual = calculator.pct(number);
       Assertions.assertEquals(expected,actual);
    }
    @Test
    @Order(6)
    public void testArray() {
        Calculator calculator = new Calculator();
        int expected = 4;
        int actual = calculator.d.length;
        Assertions.assertEquals(expected, actual);
    }
}


