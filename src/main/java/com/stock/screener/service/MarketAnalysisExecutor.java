package com.stock.screener.service;

import com.stock.screener.analyser.StockSupportAnalyser;
import com.stock.screener.dhan.DhanAPIService;
import com.stock.screener.dto.MarketDataDTO;
import com.stock.screener.dto.StockSupportAnalysisDTO;
import com.stock.screener.dto.TechnicalAnalysisResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketAnalysisExecutor {

    @Autowired
    private StockMetaDataProvider stockMetaDataProvider;

    @Autowired
    private DhanAPIService dhanAPIService;

    @Autowired
    private StockSupportAnalyser stockSupportAnalyser;

    @Async
    public void execute() {
        List<MarketDataDTO> marketData = dhanAPIService.getStockData();

        TechnicalAnalysisResponseDTO response = new TechnicalAnalysisResponseDTO();

        // Stage 1 - support check
        StockSupportAnalysisDTO analyse = stockSupportAnalyser.analyse(marketData);

//        response.setStockSupportAnalysisResponse(stockSupportAnalyser.analyse(marketData));
    }

}