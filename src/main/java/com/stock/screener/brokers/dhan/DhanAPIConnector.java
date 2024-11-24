package com.stock.screener.brokers.dhan;

import com.stock.screener.core.RestClient;
import com.stock.screener.dto.DhanResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.HashMap;

@Service
public class DhanAPIConnector {

    @Value("dhan_access_token")
    private String accessToken;

    @Value("dhan_api_host")
    private String apiHost;

    private String intradaySubpath = "/charts/intraday";

    @Autowired
    private RestClient restClient;

    public DhanResponseDTO getHistoricIntradayData(String stockId, String interval, String startDate, String endDate) {
        URI uri = URI.create(apiHost + intradaySubpath);
        HashMap<String, String> payload = new HashMap<>();

        payload.put("securityId", stockId); // get this from static csv by dhan
        payload.put("exchangeSegment", "NSE_EQ"); // default
        payload.put("instrument", "EQUITY"); // default
        payload.put("interval", interval); // in minutes 1, 5, 15, 25, 60
        payload.put("fromDate", startDate); // start date
        payload.put("toDate", endDate); // end date

        return restClient.post(uri, payload, DhanResponseDTO.class);
    }

}
