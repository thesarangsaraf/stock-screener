package com.stock.screener.mapper;

import com.stock.screener.dto.DhanResponseDTO;
import com.stock.screener.dto.MarketDataDTO;
import org.springframework.stereotype.Component;

@Component
public class DhanResponseMapper {

    public MarketDataDTO map(DhanResponseDTO dhanResponse) {
        MarketDataDTO marketData = new MarketDataDTO();
        // TODO implement mapping logic
        return marketData;
    }

}
