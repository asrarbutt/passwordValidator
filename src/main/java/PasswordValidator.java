public class PasswordValidator {

    public static void main(String[] args) {



        System.out.println(isValid("ddde1234"));

    }

    public static boolean isValid(String pwUser) {

        return containNumbers(pwUser)&& isLongThen8(pwUser);
    }
    public static int checkPasswordLength(String pwUser){

        int pwLengthIs=pwUser.length();

        return pwLengthIs;
    }

    public static boolean isLongThen8(String pwUser) {
        return pwUser.length() >=8;
    }


    public static boolean containNumbers(String pwUser) {


        for (char d: pwUser.toCharArray()) {
            if(Character.isDigit(d)){
                return true;
            }
        }


        return false;

    }


    public static boolean onlyNumber(String passwordInput){

        int i=0;


        while (i<10){


            if(passwordInput.contains(""+i)){
                return true;
            }
            i++;
        }
        return false;



    }

    public static boolean upperLowerCase(String password){


        boolean upperLower=false;
        for (int i=0; i<password.length(); i++){

            char w = password.charAt(i);
            if (Character.isUpperCase(w)){

                return true;

            }else if(Character.isLowerCase(w)) {
                return true;
            }else {
                return false;
            }

        }


return false;
    }

    public static boolean badPassword(String passwords) {



        for (int i=0; i<passwords.length(); i++){
            if (passwords=="password"){
                return false;
            } else if (passwords=="123456") {

              return false;
            }

        }
return true;

    }



}
