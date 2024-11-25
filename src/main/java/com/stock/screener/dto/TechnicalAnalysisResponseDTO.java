package com.stock.screener.dto;

import lombok.Data;

import java.util.List;

@Data
public class TechnicalAnalysisResponseDTO {

    private List<UpcomingTradeRecommendation> upcomingTradeRecommendations;

    private List<CurrentTradeRecommendation> currentTradeRecommendations;

//    private StockSupportAnalysisDTO stockSupportAnalysisResponse;

}