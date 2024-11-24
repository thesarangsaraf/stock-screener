package com.stock.screener.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MarketDataDTO {

    private Enum<CandleTimeFrame> timeframe;
    private Date date;
    private Double candleOpen;
    private Double candleHigh;
    private Double candleLow;
    private Double candleClose;
    private Long volume;

}