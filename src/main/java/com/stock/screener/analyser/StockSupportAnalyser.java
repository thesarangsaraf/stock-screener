package com.stock.screener.analyser;

import com.stock.screener.dto.MarketDataDTO;
import com.stock.screener.dto.StockSupportAnalysisDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockSupportAnalyser {

    public StockSupportAnalysisDTO analyse(List<MarketDataDTO> marketData) {
        // TODO write support analysis logic
        return new StockSupportAnalysisDTO();
    }

}