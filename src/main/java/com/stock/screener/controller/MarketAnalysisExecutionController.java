package com.stock.screener.controller;

import com.stock.screener.dto.APIResponseDTO;
import com.stock.screener.service.MarketAnalysisExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/execute")
public class MarketAnalysisExecutionController {

    @Autowired
    private MarketAnalysisExecutor marketAnalysisExecutor;

    @GetMapping
    public APIResponseDTO execute() {

        // Start async operation
        marketAnalysisExecutor.execute();

        return new APIResponseDTO("ACCEPTED");
    }

}
