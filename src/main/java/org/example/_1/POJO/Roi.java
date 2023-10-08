package org.example._1.POJO;

public class Roi {
    public double times;
    public String currency;
    public double percentage;

    @Override
    public String toString() {
        return "Roi{" +
                "times=" + times +
                ", currency='" + currency + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
