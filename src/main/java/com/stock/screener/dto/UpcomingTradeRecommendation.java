package com.stock.screener.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UpcomingTradeRecommendation {

    private TradeRecommendationAction tradeAction; // BUY
    private TradeRecommendationReason tradeRecommendationReason; // ON_SUPPORT
    private Double tradeRecommendationPrice; // 50
    private Double stopLoss; // 45
    private Double target; // 60

}