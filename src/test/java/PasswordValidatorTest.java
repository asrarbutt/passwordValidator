import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {


    @Test
    void checkPasswordLength(){
        //given
        String number="abcdefgh";

        //when
        int numberPassword= PasswordValidator.checkPasswordLength(number);
        int exspected=8;

        //then
        Assertions.assertEquals(exspected,numberPassword );

    }

    @Test
    void passwordIsLongEnough(){

        //given
        String pwUser="asbddddd";

        //when
        boolean actual=PasswordValidator.isLongThen8(pwUser);
        boolean expected=true;

        //then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void passwordContainsNumbers(){
        //given
        String pwUser="test1234";

        //when
        boolean actual=PasswordValidator.containNumbers(pwUser);
        boolean expected=true;

        //then
        Assertions.assertEquals(expected, actual);
    }    @Test
    void passwordContainsNoNumbers(){
        //given
        String pwUser="test";

        //when
        boolean actual=PasswordValidator.containNumbers(pwUser);
        boolean expected=false;

        //then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void onlyNumber(){

        //given
        String password="123hh";

        //when
        boolean numbers= PasswordValidator.onlyNumber(password);
        boolean expected=true;

        //when
        Assertions.assertEquals(expected, numbers);



    }

    @Test
    void upperLowerCase(){

        //given
        String password="bkadk§§AAA";

        //when
        boolean result= PasswordValidator.upperLowerCase(password);
        boolean expected=true;

        //then
        Assertions.assertEquals(expected,result);


    }

    @Test
    void badPassword(){
        //given
        String passwords="password";

        //when
        boolean result= PasswordValidator.badPassword(passwords);
        boolean expected=false;

        //then
        Assertions.assertEquals(expected, result);
    }


}