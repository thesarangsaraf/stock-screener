package com.stock.screener.service;

import com.stock.screener.analyser.StockSupportAnalyser;
import com.stock.screener.brokers.alphavantage.AlphavantageAPIService;
import com.stock.screener.brokers.dhan.DhanAPIService;
import com.stock.screener.dto.MarketDataDTO;
import com.stock.screener.dto.TechnicalAnalysisResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketAnalysisExecutor {

    @Autowired
    private DhanAPIService dhanAPIService;

    @Autowired
    private AlphavantageAPIService alphavantageAPIService;

    @Autowired
    private StockSupportAnalyser stockSupportAnalyser;

    public TechnicalAnalysisResponseDTO execute(String broker) {
        List<MarketDataDTO> marketData = null;
        switch (broker) {
            case "dhan":
                marketData = dhanAPIService.getStockData();
                break;
            case "alphavantage":
                // Only for Reliance BSE
                marketData = alphavantageAPIService.getStockData("RELIANCE.BSE");
                break;
        }

        TechnicalAnalysisResponseDTO response = new TechnicalAnalysisResponseDTO();
        // Stage 1 - support check
        response.setStockSupportAnalysisResponse(stockSupportAnalyser.analyse(marketData));
        return response;
    }

}