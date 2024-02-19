package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Builder kullanarak Araba nesnesi oluşturma
        Araba araba = new ArabaBuilder()
                .setMarka("Toyota")
                .setModel("Corolla")
                .setUretimYili(2022)
                .setRenk("Beyaz")
                .build();

        // Oluşturulan Araba nesnesini yazdırma
        System.out.println(araba);
    }
}