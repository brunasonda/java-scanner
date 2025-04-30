import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ¿Cómo te llamas?");
        String name = scanner.nextLine();
        System.out.println("Hola " + name + "! ¿Cual tu apellido?");
        String lastname = scanner.nextLine();
        System.out.println(lastname + "? Verdad? ¿Será que somos primos? ...Pues " + name + " " + lastname + " digita tu nombre de usuario.");
        String user = scanner.nextLine();
        System.out.println(user + ", digita tu contraseña");
        String password = scanner.nextLine();
        System.out.println("Hola " + name + " " + lastname + " tu nombre de usuario es " + user + " y tu contraseña es " + password + ", gracias por registrarte.");

        //Recoge el dato
        //Añade una nueva línea.
        System.out.println("¡Eso es excelente! Mucho gusto haber hablado contigo " + name + ", ¡Hablamos luego!");
        scanner.close();
        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner

    }
}
