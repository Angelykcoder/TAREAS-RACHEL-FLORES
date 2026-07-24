public class ArreglosMetodos {
    public static void main(String[] args) {
          //Ejercicio 1 
      
          int[] numeros = {10, 20, 30};

          System.out.println("Los números del arreglo son:");
          for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
         }

          //Ejercicio 2

           int[] numeros5 = {10, 20, 30,40,50};

           System.out.println("Los números del arreglo son:");
          for (int i = 0; i < numeros5.length; i++) {
            System.out.println("Posición " + i + ": " + numeros5[i]);
         }

            //Ejercicio 3 

            int[] numeros6 = {10, 20, 30,40,50};

            int suma = 0;

         for (int num : numeros6) {
            suma += num; 
         }

         System.out.println("La suma de los elementos es: " + suma);
         
          // Ejjercicio 4 
          int [] arreglo4={12,34,56,};
          int mayor = arreglo4[0];

        
         for (int i = 1; i < numeros.length; i++) {
            if (arreglo4[i] > mayor) {
                mayor = arreglo4[i]; 
            }
         }

        
         System.out.println("El número mayor es: " + mayor);

         //Ejercicio 5 
          int [] arreglo5={12,34,56};
          int menor = arreglo5[0];

        
         for (int i = 1; i < numeros.length; i++) {
            if (arreglo5[i] < menor ) {
                menor = arreglo5[i]; 
            }
         }

        
         System.out.println("El número menor es: " + menor);

          //Ejercicio 6 
         String[] frutas = {"Manzana", "Banana", "Naranja", "Uva", "Pera"};

        
          int cantidad = frutas.length;
  
        
           System.out.println("El arreglo tiene " + cantidad + " elementos.");

           //Ejercicio 7 
           String[] nom2 = {"Ana", "Carlos", "Sofia", "Diego"};

              
             System.out.println("--- Usando for tradicional ---");
             for (int i = 0; i < nom2.length; i++) {
            System.out.println("Elemento " + i + ": " +nom2[i]);
    
    }
            //Ejercicio 8 
            int []
    }
    
}
