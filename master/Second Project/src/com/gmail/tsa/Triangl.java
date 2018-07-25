package com.gmail.tsa;

public class Triangl {
    private double a;
    private double b;
    private double c;
    private double p;
    private double high;
    private double s;

    public Triangl(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangl() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    protected double getHalfPerimeter() {
        p = (a + b + c) / 2;
        System.out.println("p = "+p);
        return p;
    }


    public double getSqr() {
        getHalfPerimeter();
        System.out.println(high);
        s = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        return s;
    }

    @Override
    public String toString() {
        return "Triangl{" +
                "s=" + s +
                '}';
    }
}
