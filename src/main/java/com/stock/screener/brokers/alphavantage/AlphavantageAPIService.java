package com.stock.screener.brokers.alphavantage;

import com.stock.screener.dto.MarketDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AlphavantageAPIService {

    @Autowired
    private AlphavantageAPIConnector alphavantageAPIConnector;

    @Autowired
    private AlphavantageResponseMapper alphavantageResponseMapper;

    public List<MarketDataDTO> getStockData(String stockName) {
        HashMap<String, Object> historicIntradayData = alphavantageAPIConnector.getHistoricIntradayData();
        return alphavantageResponseMapper.map(historicIntradayData);
    }

}
