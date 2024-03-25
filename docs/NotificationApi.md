# NotificationApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendEmailOrInAppNotification**](NotificationApi.md#sendEmailOrInAppNotification) | **POST** /v1/org/{orgId}/notification | Send a email or in-app notification |


<a name="sendEmailOrInAppNotification"></a>
# **sendEmailOrInAppNotification**
> sendEmailOrInAppNotification(orgId).notificationRequest(notificationRequest).execute();

Send a email or in-app notification



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String templateName = "templateName_example"; // name of message template
    List<String> toUserIds = Arrays.asList(); // user ids for users to be notified
    NotificationJobData jobData = new NotificationJobData();
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String atsName = "atsName_example"; // name of the ATS system
    String orgName = "orgName_example"; // name of the organization
    String userName = "userName_example"; // preferred name of the user
    String syncSummary = "syncSummary_example"; // summary of reason for email
    String processId = "processId_example"; // id of the sync history process
    try {
      client
              .notification
              .sendEmailOrInAppNotification(templateName, toUserIds, jobData, orgId)
              .atsName(atsName)
              .orgName(orgName)
              .userName(userName)
              .syncSummary(syncSummary)
              .processId(processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#sendEmailOrInAppNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .notification
              .sendEmailOrInAppNotification(templateName, toUserIds, jobData, orgId)
              .atsName(atsName)
              .orgName(orgName)
              .userName(userName)
              .syncSummary(syncSummary)
              .processId(processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#sendEmailOrInAppNotification");
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
| **notificationRequest** | [**NotificationRequest**](NotificationRequest.md)| Notification request | [optional] |

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
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

