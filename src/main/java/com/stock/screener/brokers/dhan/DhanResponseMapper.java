package com.stock.screener.brokers.dhan;

import com.stock.screener.dto.DhanResponseDTO;
import com.stock.screener.dto.MarketDataDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DhanResponseMapper {

    public List<MarketDataDTO> map(DhanResponseDTO dhanResponse) {
        List<MarketDataDTO> marketDatas = new ArrayList<>();

        List<Long> timeStamps = dhanResponse.getTimestamp();

        for (int i = 0; i < timeStamps.size(); i++) {
            MarketDataDTO marketData = new MarketDataDTO();
            marketData.setDate(new Date(timeStamps.get(i)));
            marketData.setCandleOpen(dhanResponse.getOpen().get(i));
            marketData.setCandleHigh(dhanResponse.getHigh().get(i));
            marketData.setCandleLow(dhanResponse.getLow().get(i));
            marketData.setCandleClose(dhanResponse.getClose().get(i));
            marketDatas.add(marketData);
        }

        return marketDatas;
    }

}