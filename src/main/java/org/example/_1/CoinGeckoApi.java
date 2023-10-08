package org.example._1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example._1.POJO.AllCurrenciesRoot;
import org.example._1.POJO.BitcoinAndEthereumInfoRoot;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class CoinGeckoApi {
    public void bitcoinAndEthereumInfo() {

        String apiUrl = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=bitcoin%2Cethereum&order=market_cap_desc&per_page=5&page=1&sparkline=false&locale=en";
        String json = getJsonFromUrl(apiUrl);
        if (json != null) {
            Gson gson = new Gson();
            List<BitcoinAndEthereumInfoRoot> bitcoinAndEthereumInfoRoots = gson.fromJson(json, new TypeToken<List<BitcoinAndEthereumInfoRoot>>() {}.getType());
            bitcoinAndEthereumInfoRoots.forEach(System.out::println);
        }
        else {
            System.out.println("Ошибка!");
        }
    }

    public void allCurrencies() {
        String apiUrl = "https://api.coingecko.com/api/v3/coins/list";
        String json = getJsonFromUrl(apiUrl);
        if (json != null){
            Gson gson = new Gson();
            List<AllCurrenciesRoot> allCurrenciesRoots = gson.fromJson(json, new TypeToken<List<AllCurrenciesRoot>>() {}.getType());
            try{
                FileWriter fileWriter = new FileWriter("src/main/java/org/example/_1/Output/AllCurrencies.txt");
                for (AllCurrenciesRoot allCurrenciesRoot: allCurrenciesRoots) {
                    fileWriter.write(allCurrenciesRoot + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Ошибка!");
        }
    }

    private String getJsonFromUrl(String apiUrl) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(apiUrl).openConnection();

            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                return response.toString();

            } else {
                System.out.println("Ошибка при получении данных. HTTP-код: " + responseCode);
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
