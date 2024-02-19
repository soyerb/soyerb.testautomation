package org.example;

public class Main {

    public static double calculateTotalSalary(int calismaGunu, double gunlukMaas) {
        double toplamMaas = calismaGunu * gunlukMaas;

        if (calismaGunu > 25) {
            double fazlaCalismaUcreti = (calismaGunu - 25) * 1000;
            toplamMaas += fazlaCalismaUcreti;
        }

        return toplamMaas;
    }

    public static void main(String[] args) {
        // Ana sınıfın asıl kodu burada
    }
}
