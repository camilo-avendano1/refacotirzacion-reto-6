
package reto6banco;

import java.util.Scanner;

public class Utileria {

    public static String ingresoString(String text) { //metodo para ingresar Strings y recibe de parametro el mensaje que arrojara antes de ingresar el dato
        System.out.println(text);
        Scanner lector = new Scanner(System.in);
        return (lector.nextLine());
    }

    public static Integer ingresoInteger(String text){ //metodo para ingresar enteros y recibe de parametro el mensaje que arrojara antes de ingresar el dato
        System.out.println(text);
        Scanner lector = new Scanner(System.in);
        return (lector.nextInt());
    }
    public static int ingresoInt(String text) { //metodo para ingresar enteros y recibe de parametro el mensaje que arrojara antes de ingresar el dato
        System.out.println(text);
        Scanner lector = new Scanner(System.in);
        return (lector.nextInt());
    }
        public static String ingresoOtroString(String text) { //metodo para ingresar enteros y recibe de parametro el mensaje que arrojara antes de ingresar el dato
        System.out.println(text);
        Scanner lector = new Scanner(System.in);
        return (lector.nextLine());
    }

    public static double ingresoDouble(String text){  //metodo para ingresar Doubles y recibe de parametro el mensaje que arrojara antes de ingresar el dato
        System.out.println(text);
        Scanner lector = new Scanner(System.in);
        return(lector.nextDouble());
    }
}
