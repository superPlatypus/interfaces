package org.example._1;

public class Main {
    public static void main(String[] args) {
        CoinGeckoApi api = new CoinGeckoApi();
        api.bitcoinAndEthereumInfo();
        api.allCurrencies();
    }
}
