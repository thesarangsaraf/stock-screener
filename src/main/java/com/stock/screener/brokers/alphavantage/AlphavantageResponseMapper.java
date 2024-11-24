package com.stock.screener.brokers.alphavantage;

import com.stock.screener.dto.MarketDataDTO;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class AlphavantageResponseMapper {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public List<MarketDataDTO> map(HashMap<String, Object> response) {
        List<MarketDataDTO> marketDatas = new ArrayList<>();

        HashMap<String, HashMap<String, String>> map = (HashMap<String, HashMap<String, String>>) response.get("Time Series (Daily)");

        for (String date : map.keySet()) {
            MarketDataDTO marketData = new MarketDataDTO();
            try {
                marketData.setDate(dateFormat.parse(date));
            } catch (Exception e) {
                e.printStackTrace();
            }
            HashMap<String, String> candleData = map.get(date);
            marketData.setCandleOpen(Double.valueOf(candleData.get("1. open")));
            marketData.setCandleHigh(Double.valueOf(candleData.get("2. high")));
            marketData.setCandleLow(Double.valueOf(candleData.get("3. low")));
            marketData.setCandleClose(Double.valueOf(candleData.get("4. close")));
            marketDatas.add(marketData);
        }
        return marketDatas;
    }

}
