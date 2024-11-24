package com.stock.screener.dto;

import lombok.Data;

@Data
public class StockSupportAnalysisDTO {

    private Boolean isOnSupport;
    private Enum<Confidence> confidence;
    private Integer[] supportRange;

}