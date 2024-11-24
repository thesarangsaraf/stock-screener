package com.stock.screener.brokers.alphavantage;

import com.stock.screener.core.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.HashMap;

@Component
public class AlphavantageAPIConnector {

    // https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=RELIANCE.BSE&apikey=M9C8PJ94L7A9FGD4

//    @Value("alphavantage_access_token")
    private String accessToken = "M9C8PJ94L7A9FGD4";

//    @Value("alphavantage_api_host")
    private String apiHost = "https://www.alphavantage.co";

    @Autowired
    private RestClient restClient;

    public HashMap<String, Object> getHistoricIntradayData() {
        // Only one indian BSE stock is supported
        String query = "/query?function=TIME_SERIES_DAILY&symbol=RELIANCE.BSE&apikey=" + accessToken;
        URI uri = URI.create(apiHost + query);

        return restClient.get(uri, HashMap.class);
    }

}