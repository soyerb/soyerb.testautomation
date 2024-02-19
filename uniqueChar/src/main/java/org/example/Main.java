package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] kelimeDizisi = {"elma", "armut", "kiraz", "çilek", "ananas"};

        // İki kelime arasında tekrar eden harf içeren yeni bir metin oluştur
        String yeniMetin = yeniMetinOlustur(kelimeDizisi);
        if (yeniMetin != null) {
            System.out.println("Yeni metin: " + yeniMetin);
        } else {
            System.out.println("İki kelime arasında tekrar eden harf bulunamadı.");
        }
    }

    public static String yeniMetinOlustur(String[] kelimeDizisi) {
        for (int i = 0; i < kelimeDizisi.length - 1; i++) {
            for (int j = i + 1; j < kelimeDizisi.length; j++) {
                if (kelimelerAyniHarf(kelimeDizisi[i], kelimeDizisi[j])) {
                    HashSet<Character> benzersizKarakterler = new HashSet<>();
                    for (char c : kelimeDizisi[i].toCharArray()) {
                        benzersizKarakterler.add(c);
                    }
                    for (char c : kelimeDizisi[j].toCharArray()) {
                        benzersizKarakterler.add(c);
                    }
                    StringBuilder sb = new StringBuilder();
                    for (char c : benzersizKarakterler) {
                        sb.append(c);
                    }
                    return sb.toString();
                }
            }
        }
        return null;
    }

    public static boolean kelimelerAyniHarf(String kelime1, String kelime2) {
        HashSet<Character> karakterlerKelime1 = new HashSet<>();
        for (char c : kelime1.toCharArray()) {
            karakterlerKelime1.add(c);
        }

        for (char c : kelime2.toCharArray()) {
            if (karakterlerKelime1.contains(c)) {
                return true;
            }
        }

        return false;
    }
}

