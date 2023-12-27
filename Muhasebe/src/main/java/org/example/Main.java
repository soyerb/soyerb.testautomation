package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Personel maaşı hesaplamak için aşağıdaki bilgileri giriniz:");

        System.out.print("Çalıştığı gün sayısı: ");
        int calismaGunu = scanner.nextInt();

        System.out.print("Günlük maaş: ");
        double gunlukMaas = scanner.nextDouble();

        double toplamMaas = calismaGunu * gunlukMaas;

        if (calismaGunu > 25) {
            double fazlaCalismaUcreti = (calismaGunu - 25) * 1000;
            toplamMaas += fazlaCalismaUcreti;

        }

        System.out.println("Toplam maaş: " + toplamMaas);
    }
}
