
import java.util.Scanner;

public class Ejercicio1 {
    /**
     * @param args
     */

    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        //Ejercicio 2
         System.out.println("Rachell");
        // Ejercicio 2
        System.out.println("Rachell");

        // 3. Declarar una variable int y mostrar su valor
        // Ejercicio 3
        int x = 20;
        System.out.println(x);

 public static void main(String[] args) {
        String ciudad = "Guatemala";
        System.out.println(ciudad);

         // Ejercicio 6
         double r = x+c;
         System.out.println("el resultado es "+r); 
        // Ejercicio 6
        double r = x + c;
        System.out.println("El resultado es " + r);

        // Ejercicio 7
        double s = x - c;
        System.out.println("El resultado es " + s);

        // Ejercicio 8
        double t = x * c;
        System.out.println("El resultado es " + t);

        // Ejercicio 9
        double p = x / c;
        System.out.println("El resultado es " + p);

        // Ejercicio 10
        System.out.println("Los resultados son:");
        System.out.println("Suma = " + r);
        System.out.println("Resta = " + s);
        System.out.println("Multiplicación = " + t);
        System.out.println("División = " + p);

        // Ejercicio 11
        int n1 = 15;
        int n2 = 10;

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            System.out.println(n1 + " es menor que " + n2);
        }

         // Ejercicio 7
         double s = x-c;
         System.out.println("el resultado es "+s);
        // Ejercicio 12
        int n3 = -15;

          // Ejercicio 8
         double t = x*c;
         System.out.println("el resultado es "+t);
        if (n3 > 0) {
            System.out.println(n3 + " es un número positivo");
        } else {
            System.out.println(n3 + " es un número negativo");
        }

         // Ejercicio 9
         double p = x/c;
         System.out.println("el resultado es "+p);
        // Ejercicio 13
        int n4 = 10;

          // Ejercicio 10 
         
        System.out.println("Los resultados son: Suma = " + r + ", Resta = " + s + ", Multiplicación = " + t + ", División = " + p);;
        if (n4 % 2 == 0) {
            System.out.println(n4 + " es un número par");
        } else {
            System.out.println(n4 + " es un número impar");
        }

          // Ejercicio 11 
          int n1= 15;
          int n2=10;
        if (n1>n2)
        {
        /*  Ejercicio 14
        Scanner s1 = new Scanner(System.in);

        System.out.print("Ingresa el valor inicial: ");
        int num = s1.nextInt();

        System.out.println("El valor actual es: " + num);

        System.out.print("Ingresa un nuevo valor para cambiar num: ");
        num = s1.nextInt();

        System.out.println("El valor guardado es: " + num);
*/
        // Ejercicio 15
        String saludo = "Hola";
        String nombre = "Dulce";

        System.out.println(saludo + " " + nombre);




        // Ejercicio 16
        int longitud = nombre.length();

        System.out.println("El nombre  " + nombre +" tiene " + longitud + " letras.");

        // Ejercicio 17 
       String textoenmayusculas=nombre.toUpperCase();
        System.out.println (textoenmayusculas);

        System.out.println (n1+ " es mayor a "+n2 );
        // Ejercicio 18 
        String texto1="BUEN DIA";
        String textoenminusculas=texto1.toLowerCase();
        System.out.println (textoenminusculas);

        // Ejercicio 19 
        String t1="DIEGO";
        String t2="Rachell";
        if (t1==t2) {
         System.out.println ("los textos coinciden");
        }
        else {
             System.out.println (n1+ "es menor a "+n2 );
        else{
           System.out.println ("los textos no coinciden"); 
        }

        // Ejercicio 12
          int n3= -15;
          
        if (n3>0)
        //Ejercicio 20 
        char primeraletra=t1.charAt(0);
        System.out.println (" la primer letra del texto es "+primeraletra); 

        //Ejercicio 21 
        System.out.println("los numero del 1 al 10 son: ");
        for (int i = 1;i<=10;i++)
        {
        System.out.println (n3+ "el numero es positivo" );
           
            System.out.println (i);
        }
        else {
            System.out.println (n3+ " el numero es negativo" );
       
        //Ejercicio 22 
        System.out.println("los numero del 10 al 1 son: ");
        for (int z = 10;z>=1;z--)
        {
           
            System.out.println (z);
        }
        
        // Ejercicio 13 
          int n4= 10;
          
        if (n4%2==0)

        //Ejercicio 23 
         System.out.println ("los numeros pares del 1 al 20 son:");
        for (int g = 1;g<=20;g++)
        {
        System.out.println (n4+ " el numero es par" );
            if (g%2==0)
            {
              System.out.println (g);
            }
        }
        else {
            System.out.println (n4+ " el numero es impar" );
        //Ejercicio 24 
         System.out.println ("los numeros impares del 1 al 20 son:");
        for (int g = 1;g<=20;g++)
        {
            if (g%2!=0)
            {
              System.out.println (g);
            }
        }
        // Ejercicio 25 
         System.out.println("suma de numeros del 1 al 5: ");
        int Suma =0 ;
        for (int i = 1;i<=5;i++)
        {
           Suma+=i;
            
        }
        System.out.println (Suma);
        //Ejercicio 26 
        System.out.println("suma de numeros del 1 al 5 con while: ");
        int i=1;
        while(i<=5)
        {
            System.out.println (i); 
            i++;
        }
        //Ejercicio 27 
        System.out.println (" repetir la palabra Carro 5 veces ");
        for (int h = 1;h<=5;h++)
        {
           System.out.println (" Carro ");
            
        }
        
        // Ejercicio 14
          Scanner s1=new Scanner (System.in);
          {
          System.out.println ("Ingresa el valor inicial: ");

        int num = s1.nextInt();
         System.out.println ("Ingresa el valor actuall es: "+num);
        System.out.println ("Ingresa un nuevo valor para cambiar num: "+num);

     num = s1.nextInt();
     System.out.println ("el valor guardado es "+num);
      s1.close();
          }
        // Ejercicio 28 
        int tabla=5;
        
          System.out.println("--- TABLA DEL " + tabla + " ---"); 
         
          for (int a=1;a<=10;a++)
            System.out.println( tabla + " x " + a + " = " + (tabla * a));
        // Ejercicio 29 
           System.out.println("Los cuadrados ");
          for (int k = 1; k <= 5; k++) {
            int cuadrado = k * k;
            System.out.println("El cuadrado de " + k + " es: " + cuadrado);
        }
       //Ejercicio 30 
       System.out.println("Los cubos ");
          for (int k = 1; k <= 5; k++) {
            int cubo = k * k* k;
            System.out.println("El cubo de " + k + " es: " + cubo);
        }
    }

}
