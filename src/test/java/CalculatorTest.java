import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    public static void beforeAllMetod(){
    System.out.println("BeforeAll");

}
    @BeforeEach
    public void beforeEachMetod() {
        System.out.println("beforeEachMetod");
        calculator = new Calculator();
    }
    @AfterEach
    public void afterEachMethod(){
        System.out.println("AfterEach call");
    }
    @Test
    
    public void plus() {
        //arrange
        int x = 1;
        int y = 2;
        int expected = 3;
        //act
        int result = calculator.plus.apply(x, y);
        //assert
        Assertions.assertEquals(expected, result);
        System.out.println("test1");
    }

    @Test
    public void minus() {

        int x = 2;
        int y = 1;
        int expected = 1;

        int result = calculator.minus.apply(x, y);

        Assertions.assertEquals(expected, result);
        System.out.println("test2");
    }


    @Test
    void devide() {
        
        final int x = 35;
        final int y = 0;
        
        Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculator.devide.apply(x, y)
        );
    }



}
