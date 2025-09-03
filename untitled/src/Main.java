import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Crear una lista de enteros con tamaño 6
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Imprimir la lista
        System.out.println("Lista de números: " + numeros);

        // 2. Sumar los valores usando foreach
        int suma = 0;
        for (int num : numeros) {
            suma += num; // suma = suma + num
        }

        // Mostrar el resultado
        System.out.println("La suma de los números es: " + suma);

        // 3. Crear una lista de nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Maria");
        nombres.add("Camila");
        nombres.add("Daniel");
        nombres.add("Julian");

        // Imprimir usando FOR
        System.out.println("\nImprimir con FOR:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        // Imprimir usando FOREACH
        System.out.println("\nImprimir con FOREACH:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        System.out.println("\nImprimir con WHILE:");
        int i = 0;
        while (i < nombres.size()) {
            System.out.println(nombres.get(i));
            i++;
        }
    }
}
