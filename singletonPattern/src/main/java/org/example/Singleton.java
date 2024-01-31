package org.example;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public static class SingletonBuilder {
        private String data;

        public SingletonBuilder(String data) {
            this.data = data;
        }

        public SingletonBuilder setData(String data) {
            this.data = data;
            return this;
        }

        public Singleton build() {
            return Singleton.getInstance(data);
        }
    }

    public static void main(String[] args) {
        Singleton singleton1 = new Singleton.SingletonBuilder("Data1").build();
        Singleton singleton2 = new Singleton.SingletonBuilder("Data2").build();

        System.out.println("Singleton1 data: " + singleton1.getData());
        System.out.println("Singleton2 data: " + singleton2.getData());

        // Both singletons should have the same instance
        System.out.println("Are singletons equal: " + (singleton1 == singleton2));
    }
}