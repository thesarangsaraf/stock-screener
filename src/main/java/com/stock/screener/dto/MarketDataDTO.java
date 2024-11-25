package com.stock.screener.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class MarketDataDTO {

    private Enum<CandleTimeFrame> timeframe;
    private Date date;
    private Double candleOpen;
    private Double candleHigh;
    private Double candleLow;
    private Double candleClose;
    private Long volume;

}