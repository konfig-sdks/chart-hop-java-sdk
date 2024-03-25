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
import com.konfigthis.client.model.OkResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
@Disabled
public class StatusApiTest {

    private static StatusApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new StatusApi(apiClient);
    }

    /**
     * Returns true if the API is up and available
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiIsUpAndAvailableTest() throws ApiException {
        OkResponse response = api.apiIsUpAndAvailable()
                .execute();
        // TODO: test validations
    }

}
