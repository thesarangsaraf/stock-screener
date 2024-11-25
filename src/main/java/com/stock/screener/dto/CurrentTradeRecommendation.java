package com.stock.screener.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CurrentTradeRecommendation {

    private TradeRecommendationAction tradeAction;
    private TradeRecommendationReason tradeRecommendationReason;
    private Double tradeRecommendationPrice;
    private Double stopLoss;
    private Double target;

}