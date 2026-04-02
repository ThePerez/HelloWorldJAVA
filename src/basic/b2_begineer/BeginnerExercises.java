package basic.b2_begineer;

public class BeginnerExercises {

    public static void main(String[] args){
        // 1. Declara una variable de tipo String y asígnale tu nombre.
            String nombre = "Alex";
        // 2. Crea una variable de tipo int y asígnale tu edad.
            int edad = 40;
        // 3. Crea una variable double con tu altura en metros.
            double altura = 1.80;
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
            boolean teGustaViajar = true;
        // 5. Declara una constante con tu email.
            final String email = "alex@ejemplo.com";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
            char miInicial = 'A';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
            String localidad = "Buenos Aires";
            System.out.println("Localidad: " + localidad);
            localidad = "Bariloche";
            System.out.println("Nueva localidad: "+ localidad);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
            int a = 100;
            int b = 101;
            System.out.println("La sumatoria de a + b = " + (a+b));
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("La variable 'a' es de tipo: " + ((Object) a).getClass().getSimpleName());
        System.out.println("La variable 'b' es de tipo: " + ((Object) b).getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int puntaje; // Declaración
        puntaje = 100; // Inicialización
        System.out.println("Mi puntaje es: " + puntaje);
    }

}
