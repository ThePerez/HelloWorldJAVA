package basic.b2_begineer;

public class VariablesAndConstants {

    public static void main(String[] args) {
        //Variables
        String name = "Alex";
        System.out.println(name);

        name = "Developer";
        System.out.println(name);

      //  name = 40; (No podemos cambiar el tipo de dato) Error!

        int age = 40;
        System.out.println(age);

        var email = "alexander@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);


        // Constantes

        final String EMAIL = "alexperez@gmail.com";
        // EMAIL es la constante
        System.out.println(EMAIL);
    }
}
