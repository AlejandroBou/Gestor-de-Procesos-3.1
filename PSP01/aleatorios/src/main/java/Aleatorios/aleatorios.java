package Aleatorios;

import java.util.Random;

public class aleatorios
{

    // Constantes configurables
    private static final int CANTIDAD_NUMEROS = 40;
    private static final int VALOR_MINIMO = 0;
    private static final int VALOR_MAXIMO = 100;

    public static void main(String[] args)
    {
        // Determinar cantidad de números a generar
        int cantidad = CANTIDAD_NUMEROS;

        // Si se proporciona un argumento, usarlo como cantidad
        if (args.length > 0)
        {
            try {
                cantidad = Integer.parseInt(args[0]);
                if (cantidad < 1)
                {
                    System.err.println("La cantidad debe ser al menos 1. Usando valor por defecto: " + CANTIDAD_NUMEROS);
                    cantidad = CANTIDAD_NUMEROS;
                }
            } catch (NumberFormatException e)
            {
                System.err.println("Argumento no válido. Usando valor por defecto: " + CANTIDAD_NUMEROS);
            }
        }

        // Crear generador de números Aleatorios.aleatorios
        Random random = new Random();

        // Mostrar información inicial (a stderr para no interferir con la tubería)
        System.err.println("Generando " + cantidad + " números entre " + VALOR_MINIMO + " y " + VALOR_MAXIMO);

        // Generar y mostrar los números aleatorios
        for (int i = 0; i < cantidad; i++)
        {
            // Generar número aleatorio entre VALOR_MINIMO y VALOR_MAXIMO (inclusive)
            int numeroAleatorio = random.nextInt(VALOR_MAXIMO - VALOR_MINIMO + 1) + VALOR_MINIMO;

            // Escribir el número en la salida estándar
            System.out.println(numeroAleatorio);
        }
    }
}