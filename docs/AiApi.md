# AiApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateTextSummary**](AiApi.md#generateTextSummary) | **POST** /v1/org/{orgId}/ai/form-response/summary | Use AI to generate a summary of text form responses |


<a name="generateTextSummary"></a>
# **generateTextSummary**
> SummarizeResponse generateTextSummary(orgId).summarizeFormResponsesRequest(summarizeFormResponsesRequest).execute();

Use AI to generate a summary of text form responses



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String questionId = "questionId_example";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example";
    String assessmentId = "assessmentId_example";
    try {
      SummarizeResponse result = client
              .ai
              .generateTextSummary(questionId, orgId)
              .formId(formId)
              .assessmentId(assessmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummary());
      System.out.println(result.getResponseCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling AiApi#generateTextSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SummarizeResponse> response = client
              .ai
              .generateTextSummary(questionId, orgId)
              .formId(formId)
              .assessmentId(assessmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AiApi#generateTextSummary");
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
| **summarizeFormResponsesRequest** | [**SummarizeFormResponsesRequest**](SummarizeFormResponsesRequest.md)|  | [optional] |

### Return type

[**SummarizeResponse**](SummarizeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

