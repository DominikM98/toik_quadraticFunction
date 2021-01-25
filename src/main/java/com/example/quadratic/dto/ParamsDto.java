package com.example.quadratic.dto;

public class ParamsDto {

    private double a;
    private double b;
    private double c;

    public ParamsDto() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "ParamsDto{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
