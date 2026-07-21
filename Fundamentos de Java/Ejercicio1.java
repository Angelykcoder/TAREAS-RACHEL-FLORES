import java.util.Scanner;
public class Ejercicio1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        //Ejercicio 2
         System.out.println("Rachell");

        // 3. Declarar una variable int y mostrar su valor
        int x = 20;
        System.out.println(x);

        // Ejercicio 4
        double c = 23.5;
        System.out.println(c);

        // Ejercicio 5
        String ciudad = "Guatemala";
        System.out.println(ciudad);

         // Ejercicio 6
         double r = x+c;
         System.out.println("el resultado es "+r); 

         // Ejercicio 7
         double s = x-c;
         System.out.println("el resultado es "+s);

          // Ejercicio 8
         double t = x*c;
         System.out.println("el resultado es "+t);

         // Ejercicio 9
         double p = x/c;
         System.out.println("el resultado es "+p);

          // Ejercicio 10 
         
        System.out.println("Los resultados son: Suma = " + r + ", Resta = " + s + ", Multiplicación = " + t + ", División = " + p);;

          // Ejercicio 11 
          int n1= 15;
          int n2=10;
        if (n1>n2)
        {

        System.out.println (n1+ " es mayor a "+n2 );
        }
        else {
             System.out.println (n1+ "es menor a "+n2 );
        }

        // Ejercicio 12
          int n3= -15;
          
        if (n3>0)
        {
        System.out.println (n3+ "el numero es positivo" );
        }
        else {
            System.out.println (n3+ " el numero es negativo" );
        }
        
        // Ejercicio 13 
          int n4= 10;
          
        if (n4%2==0)
        {
        System.out.println (n4+ " el numero es par" );
        }
        else {
            System.out.println (n4+ " el numero es impar" );
        }
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
    }
