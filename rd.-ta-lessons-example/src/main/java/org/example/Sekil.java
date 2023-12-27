package org.example;

public class Sekil {

    String isim;
    int kenar;
    int kenarSayisi;
    int kenarUzunlugu;

    public void cevre(int kenar, int kenarUzunlugu){

        int cevre = kenar + kenarUzunlugu;

        System.out.println("Seklinizin;" + isim + " cevre uzunlugu" + cevre);
    }

    public void alan(int kenarSayisi, int kenarUzunlugu){
        int alan = kenarSayisi * kenarUzunlugu;
        System.out.println("Sekliniz:"+ isim + "alan uzunlugu" + alan);

    }
}
