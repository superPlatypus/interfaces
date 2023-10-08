package org.example._1.POJO;

public class AllCurrenciesRoot {
    public String id;
    public String symbol;
    public String name;

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'';
    }
}
