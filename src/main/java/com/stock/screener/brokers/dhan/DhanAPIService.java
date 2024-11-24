package com.stock.screener.brokers.dhan;

import com.stock.screener.dto.DhanResponseDTO;
import com.stock.screener.dto.MarketDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhanAPIService {

    @Autowired
    private DhanAPIConnector dhanAPIConnector;

    @Autowired
    private DhanResponseMapper dhanResponseMapper;

    public List<MarketDataDTO> getStockData() {
        DhanResponseDTO historicIntradayData = dhanAPIConnector.getHistoricIntradayData("", "", "", "");
        return dhanResponseMapper.map(historicIntradayData);
    }

}
