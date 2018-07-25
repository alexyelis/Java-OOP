package com.gmail.tsa;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Barsik", 3, "Sfinks");
        catOne.setPlaying(true);
        Cat catTwo = new Cat("Masik", 2, "Dvormiazhka");
        catOne.setSlepping(true);
        Cat catThree = new Cat("Ryzhik", 5, "Dvorniazhka");
        Triangl trngl = new Triangl(6, 4, 4);
        trngl.getSqr();
        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println(catThree);
        Triangl trng2 = new Triangl(5, 2, 5);
        trng2.getSqr();
        Triangl trng3 = new Triangl();
        trng3.setA(2);
        trng3.setB(4);
        trng3.setC(5);
        trng3.getSqr();
        System.out.println(trngl);
        System.out.println(trng2);
        System.out.println(trng3);

    }
}
