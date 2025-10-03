package OrdenarNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ordenarNumeros
{
    
    public static void main(String[] args)
    {
        // Lista para almacenar los números
        List<Integer> numeros = new ArrayList<>();
        
        // Scanner para leer de la entrada estándar
        Scanner scanner = new Scanner(System.in);
        
        // Leer números de la entrada estándar
        while (scanner.hasNextLine())
        {
            String linea = scanner.nextLine().trim();
            
            // Ignorar líneas vacías
            if (linea.isEmpty())
            {
                continue;
            }
            
            try {
                // Intentar convertir la línea a número
                int numero = Integer.parseInt(linea);
                numeros.add(numero);
            } catch (NumberFormatException e)
            {
                // Si no es un número válido, mostrar advertencia pero continuar
                System.err.println("Advertencia: '" + linea + "' no es un número válido. Se ignora.");
            }
        }
        
        scanner.close();
        
        // Verificar si se leyeron números
        if (numeros.isEmpty())
        {
            System.out.println("No se recibieron números válidos para ordenar.");
            return;
        }
        
        // Ordenar los números
        Collections.sort(numeros);
        
        // Mostrar los números ordenados
        System.out.println("\n NÚMEROS ORDENADOS");
        for (int numero : numeros)
        {
            System.out.println(numero);
        }
    }
}