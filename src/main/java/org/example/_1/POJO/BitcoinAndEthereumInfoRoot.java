package org.example._1.POJO;

import java.util.Date;

public class BitcoinAndEthereumInfoRoot {
    public String id;
    public String symbol;
    public String name;
    public String image;
    public double current_price;
    public Object market_cap;
    public int market_cap_rank;
    public Object fully_diluted_valuation;
    public Object total_volume;
    public double high_24h;
    public double low_24h;
    public double price_change_24h;
    public double price_change_percentage_24h;
    public double market_cap_change_24h;
    public double market_cap_change_percentage_24h;
    public double circulating_supply;
    public double total_supply;
    public int max_supply;
    public double ath;
    public double ath_change_percentage;
    public Date ath_date;
    public double atl;
    public double atl_change_percentage;
    public Date atl_date;
    public Roi roi;
    public Date last_updated;

    @Override
    public String toString() {
        return "Root{" +
                "id='" + id + '\n' + '\t' +
                ", symbol='" + symbol + '\n' + '\t' +
                ", name='" + name + '\n' + '\t' +
                ", image='" + image + '\n' + '\t' +
                ", current_price=" + current_price + '\n' + '\t' +
                ", market_cap=" + market_cap + '\n' + '\t' +
                ", market_cap_rank=" + market_cap_rank + '\n' + '\t' +
                ", fully_diluted_valuation=" + fully_diluted_valuation + '\n' + '\t' +
                ", total_volume=" + total_volume + '\n' + '\t' +
                ", high_24h=" + high_24h + '\n' + '\t' +
                ", low_24h=" + low_24h + '\n' + '\t' +
                ", price_change_24h=" + price_change_24h + '\n' + '\t' +
                ", price_change_percentage_24h=" + price_change_percentage_24h + '\n' + '\t' +
                ", market_cap_change_24h=" + market_cap_change_24h + '\n' + '\t' +
                ", market_cap_change_percentage_24h=" + market_cap_change_percentage_24h + '\n' + '\t' +
                ", circulating_supply=" + circulating_supply + '\n' + '\t' +
                ", total_supply=" + total_supply + '\n' + '\t' +
                ", max_supply=" + max_supply + '\n' + '\t' +
                ", ath=" + ath + '\n' + '\t' +
                ", ath_change_percentage=" + ath_change_percentage + '\n' + '\t' +
                ", ath_date='" + ath_date + '\n' + '\t' +
                ", atl=" + atl + '\n' + '\t' +
                ", atl_change_percentage=" + atl_change_percentage + '\n' + '\t' +
                ", atl_date='" + atl_date + '\n' + '\t' +
                ", roi=" + roi + '\n' + '\t' +
                ", last_updated='" + last_updated + '\n' + '\t' +
                '}';
    }
}

