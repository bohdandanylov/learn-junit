import learnspringboot.junit.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    private MyMath math = new MyMath();
    @Test
    void calculateSum(){
        assertEquals(6, math.calculateSum(new int[]{0, 1, 2, 3}));
    }

    @Test
    void lengthZero(){
        assertEquals(0, math.calculateSum(new int[]{}));
    }

    @Test
    void elementZero(){
        boolean containsZero = false;
        for(int element: new int[]{0, 1, 2, 3}){
            if(element == 0){
                containsZero = true;
                break;
            }
        }
        assertTrue(containsZero);
    }

}
