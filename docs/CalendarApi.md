# CalendarApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEntriesByTimePeriod**](CalendarApi.md#getEntriesByTimePeriod) | **GET** /v1/org/{orgId}/calendar | Return calendar entries in a given time period |


<a name="getEntriesByTimePeriod"></a>
# **getEntriesByTimePeriod**
> getEntriesByTimePeriod(orgId).start(start).end(end).type(type).q(q).format(format).execute();

Return calendar entries in a given time period



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CalendarApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String start = "start_example"; // Start date
    String end = "end_example"; // End date
    String type = "type_example"; // Type of calendar entries to retrieve (timeoff, anniversary, birthday)
    String q = "q_example"; // Query filter to filter for part of the organization
    String format = "format_example"; // Format to return data in
    try {
      client
              .calendar
              .getEntriesByTimePeriod(orgId)
              .start(start)
              .end(end)
              .type(type)
              .q(q)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getEntriesByTimePeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .calendar
              .getEntriesByTimePeriod(orgId)
              .start(start)
              .end(end)
              .type(type)
              .q(q)
              .format(format)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getEntriesByTimePeriod");
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
| **start** | **String**| Start date | [optional] |
| **end** | **String**| End date | [optional] |
| **type** | **String**| Type of calendar entries to retrieve (timeoff, anniversary, birthday) | [optional] |
| **q** | **String**| Query filter to filter for part of the organization | [optional] |
| **format** | **String**| Format to return data in | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

