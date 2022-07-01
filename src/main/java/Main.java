public class Main {

    public static void main(String[] args) {



        System.out.println(badPassword("password"));

    }


    public static int numberControl(String passwordInput){

        int passwordLenght=passwordInput.length();

        return passwordLenght;
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
