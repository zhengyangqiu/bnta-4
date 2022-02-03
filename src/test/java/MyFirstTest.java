import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyFirstTest {
    @Test
    void hello(){
        //given
        int numberOne=4;
        int numberTwo=4;
        //when

        int result =numberOne+numberTwo;

        //then
        assertThat(result).isEqualTo(8);


    }

    @Test
    void hello1(){


    }
}
