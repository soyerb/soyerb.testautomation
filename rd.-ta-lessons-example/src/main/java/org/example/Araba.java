package org.example;

public class Araba {
    String marka;
    String model;
    String renk;
    int hiz;

    public void calistir(){
        System.out.println(marka+ "arabası calıstırıldı");
    }

    public void durdur(){
        System.out.println(marka+ "arabası durduruldu");
    }

    public void hizlan(int artis){
        hiz += artis;

    }
}
