package com.practice.opp.practico02;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberMapManager {
    public static void main(String[] args){
        Map<Integer,String> lista = new HashMap<>();
        int n=10;
        fillMap(lista, n);


        System.out.println("Colección original:");


        displayMap(lista);

        updateValueToUppercase(lista, "diez");

        System.out.println("\nColección después de la búsqueda y actualización:");
        displayMap(lista);
    }
    public static void fillMap(Map<Integer, String> map, int n) {
        Random random = new Random();
        while (map.size() < n) {
            int num = random.nextInt(101); // Intervalo [0, 100]
            // La clave es el número y el valor su representación en texto [cite: 23, 24]
            map.put(num, convertNumberToWords(num));
        }
    }

    public static void updateValueToUppercase(Map<Integer, String> map, String valueToSearch) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(valueToSearch)) {
                map.put(entry.getKey(), entry.getValue().toUpperCase());
                System.out.println("\n-> Se encontró '" + valueToSearch + "' y se actualizó a mayúsculas.");
            }
        }
    }

    private static String convertNumberToWords(int n) {
        String[] units = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte"};
        String[] tens = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa", "cien"};

        if (n <= 20) return units[n];
        if (n == 100) return tens[10];
        if (n % 10 == 0) return tens[n / 10];

        return tens[n / 10] + " y " + units[n % 10];
    }

    public static void displayMap(Map<Integer, String> map) {
        map.forEach((key, value) -> System.out.println("<" + key + ", \"" + value + "\">"));
    }

}
