import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void numberControl(){
        //given
        String number="abcdefgh";

        //when
        int numberPassword= Main.numberControl(number);
        int exspected=8;

        //then
        Assertions.assertEquals(exspected,numberPassword );

    }

    @Test
    void onlyNumber(){

        //given
        String password="123hh";

        //when
        boolean numbers=Main.onlyNumber(password);
        boolean expected=true;

        //when
        Assertions.assertEquals(expected, numbers);



    }

    @Test
    void upperLowerCase(){

        //given
        String password="bkadk§§AAA";

        //when
        boolean result=Main.upperLowerCase(password);
        boolean expected=true;

        //then
        Assertions.assertEquals(expected,result);


    }

    @Test
    void badPassword(){
        //given
        String passwords="password";

        //when
        boolean result= Main.badPassword(passwords);
        boolean expected=false;

        //then
        Assertions.assertEquals(expected, result);
    }


}