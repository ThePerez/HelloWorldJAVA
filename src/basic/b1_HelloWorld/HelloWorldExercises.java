package basic.b1_HelloWorld;

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Alexander");
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        //Primera Línea imprime mi nombre
        // 4. Crea un comentario en varias líneas.
        /*
        Segunda Línea
        Imprime Hola Mundo en 2 líneas
         */
        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("40\nVerde\nBuenos Aires");
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.out.println("Este es un mensaje normal de salida.");
        System.err.println("¡CUIDADO! Este es un mensaje de error.");
        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Ejercicio número 7");
        System.err.println("Mensaje de error.");
        System.out.println("Curso de JAVA");
        System.err.println("ESTE TIPO DE PRINT SIRVE PARA MOSTRAR ERRORES!");
// 8. Imprime un diseño ASCII (una cara feliz y un robot)
                System.out.println("  *****  ");
                System.out.println(" *     * ");
                System.out.println("*  o o  *");
                System.out.println("*   ^   *");
                System.out.println("*  ---  *");
                System.out.println(" *     * ");
                System.out.println("  *****  ");

                System.out.println("   [---]   ");
                System.out.println("  | o o |  ");
                System.out.println("  |  ^  |  ");
                System.out.println("  | --- |  ");
                System.out.println("   -----   ");
                System.out.println("  /|   |\\ ");
                System.out.println(" / |   | \\");
                System.out.println("   |   |   ");
                System.out.println("  /     \\ ");
        // 9. Intenta ejecutar el programa sin el método main y observa el error.
            //GENERA ERROR
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        //Genera error --->> java: class MisPracticas is public, should be declared in a file named MisPracticas.java
    }
}