package com.stock.screener.dto;

import lombok.Data;

@Data
public class MarketDataDTO {

    private Enum<CandleTimeFrame> timeframe;
    private Integer candleOpen;
    private Integer candleHigh;
    private Integer candleLow;
    private Integer candleClose;

}