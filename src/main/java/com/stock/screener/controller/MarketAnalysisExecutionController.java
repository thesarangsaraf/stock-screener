package com.stock.screener.controller;

import com.stock.screener.dto.TechnicalAnalysisResponseDTO;
import com.stock.screener.service.MarketAnalysisExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/execute")
public class MarketAnalysisExecutionController {

    @Autowired
    private MarketAnalysisExecutor marketAnalysisExecutor;

    @GetMapping
    public TechnicalAnalysisResponseDTO execute(@RequestParam String broker) {
        return marketAnalysisExecutor.execute(broker);
    }

}
