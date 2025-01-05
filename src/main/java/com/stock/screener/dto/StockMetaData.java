package com.stock.screener.dto;

import lombok.Data;

@Data
public class StockMetaData {

    private String securityId;
    private String exchangeSegment = "NSE_EQ";
    private String instrumentType = "EQUITY";
    private Integer expiryCode = 0; // Always zero for stocks

    public StockMetaData(String securityId){
        this.securityId = securityId;
    }

}