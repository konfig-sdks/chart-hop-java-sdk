/*
 * ChartHop API
 * REST API for ChartHop
 *
 * The version of the OpenAPI document: V1.0.0
 * Contact: support@charthop.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import java.time.LocalDate;
import com.konfigthis.client.model.RecordMetricRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetricApi
 */
@Disabled
public class MetricApiTest {

    private static MetricApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MetricApi(apiClient);
    }

    /**
     * Record a daily metric
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordDailyMetricTest() throws ApiException {
        String metric = null;
        Double value = null;
        String orgId = null;
        LocalDate date = null;
        api.recordDailyMetric(metric, value, orgId)
                .date(date)
                .execute();
        // TODO: test validations
    }

}
