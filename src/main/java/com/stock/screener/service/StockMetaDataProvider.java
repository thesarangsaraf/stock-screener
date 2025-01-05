package com.stock.screener.service;

import com.stock.screener.dto.StockMetaData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockMetaDataProvider {

    // todo fetch meta data from app properties / database
    public List<StockMetaData> getMetaDataOfDhan() {
        List<StockMetaData> result = new ArrayList<>();

        StockMetaData relianceMeta = new StockMetaData("reliance_id");
        result.add(relianceMeta);

        return result;
    }

}
