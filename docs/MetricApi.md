# MetricApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**recordDailyMetric**](MetricApi.md#recordDailyMetric) | **POST** /v1/org/{orgId}/metric | Record a daily metric |


<a name="recordDailyMetric"></a>
# **recordDailyMetric**
> recordDailyMetric(orgId).recordMetricRequest(recordMetricRequest).execute();

Record a daily metric



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String metric = "metric_example"; // the name of the metric, for example kpi.revenue.arr
    Double value = 3.4D; // the numeric value of the metric
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // the date that the metric applies to (if blank, will default to today)
    try {
      client
              .metric
              .recordDailyMetric(metric, value, orgId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#recordDailyMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metric
              .recordDailyMetric(metric, value, orgId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#recordDailyMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Org identifier (either id or slug) | |
| **recordMetricRequest** | [**RecordMetricRequest**](RecordMetricRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

