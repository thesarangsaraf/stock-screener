package com.stock.screener.analyser;

import com.stock.screener.dto.MarketDataDTO;
import com.stock.screener.dto.StockSupportAnalysisDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockSupportAnalyser {

    public StockSupportAnalysisDTO analyse(List<MarketDataDTO> marketDatas) {

        // identify bullish scenario when stock is falling
        StockSupportAnalysisDTO analysisDTO = new StockSupportAnalysisDTO();

        for (MarketDataDTO marketData : marketDatas) {
            Double candleOpen = marketData.getCandleOpen();
            Double candleLow = marketData.getCandleLow();
            Double candleClose = marketData.getCandleClose();

            if (candleOpen > candleClose) { // This candle is bullish
                Double candleMid = (candleOpen + candleClose) / 2;
                System.out.println("Candle Mid " + candleMid);
                if (candleClose >= candleMid) {
                    System.out.println("Reliance bullish candle " + marketData);
                }
            } else {
                System.out.println("Reliance bearish candle " + marketData);
            }
        }

        // TODO write support analysis logic
        return analysisDTO;
    }

}