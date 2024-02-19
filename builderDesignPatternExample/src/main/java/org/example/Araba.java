package org.example;

class Araba {
    private String marka;
    private String model;
    private int uretimYili;
    private String renk;

    public Araba(String marka, String model, int uretimYili, String renk) {
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", uretimYili=" + uretimYili +
                ", renk='" + renk + '\'' +
                '}';
    }
}

// Builder sınıfı
class ArabaBuilder {
    private String marka;
    private String model;
    private int uretimYili;
    private String renk;

    public ArabaBuilder setMarka(String marka) {
        this.marka = marka;
        return this;
    }

    public ArabaBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public ArabaBuilder setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
        return this;
    }

    public ArabaBuilder setRenk(String renk) {
        this.renk = renk;
        return this;
    }

    public Araba build() {
        return new Araba(marka, model, uretimYili, renk);
    }
}
