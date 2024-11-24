package com.stock.screener.dto;

import lombok.Data;

import java.util.List;

@Data
public class DhanResponseDTO {

    private List<Double> open;
    private List<Double> high;
    private List<Double> low;
    private List<Double> close;
    private List<Long> volume;
    private List<Long> timestamp;

}
