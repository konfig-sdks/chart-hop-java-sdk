# SearchApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orgDataByOrgIdAndSearchString**](SearchApi.md#orgDataByOrgIdAndSearchString) | **GET** /v1/org/{orgId}/search | Return people, job, group, and field data for a particular org that match a provided search string |


<a name="orgDataByOrgIdAndSearchString"></a>
# **orgDataByOrgIdAndSearchString**
> SearchResultResponse orgDataByOrgIdAndSearchString(orgId).q(q).entityTypes(entityTypes).limit(limit).includeFormer(includeFormer).date(date).scenarioId(scenarioId).canAccess(canAccess).includeExternalRecruiter(includeExternalRecruiter).execute();

Return people, job, group, and field data for a particular org that match a provided search string



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String q = "q_example"; // Query search term
    String entityTypes = "entityTypes_example"; // Entity types
    Integer limit = 56; // Limit
    Boolean includeFormer = true; // Include former users or persons
    LocalDate date = LocalDate.now(); // Date
    String scenarioId = "scenarioId_example"; // Scenario Id
    String canAccess = "canAccess_example"; // entity action pairs that can be accessed
    Boolean includeExternalRecruiter = true; // Include External Recruiter
    try {
      SearchResultResponse result = client
              .search
              .orgDataByOrgIdAndSearchString(orgId)
              .q(q)
              .entityTypes(entityTypes)
              .limit(limit)
              .includeFormer(includeFormer)
              .date(date)
              .scenarioId(scenarioId)
              .canAccess(canAccess)
              .includeExternalRecruiter(includeExternalRecruiter)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrgs());
      System.out.println(result.getCustomers());
      System.out.println(result.getJobs());
      System.out.println(result.getPersons());
      System.out.println(result.getGroups());
      System.out.println(result.getFields());
      System.out.println(result.getFunctions());
      System.out.println(result.getReports());
      System.out.println(result.getScenarios());
      System.out.println(result.getUsers());
      System.out.println(result.getAppUsers());
      System.out.println(result.getCompBands());
      System.out.println(result.getQuestions());
      System.out.println(result.getContents());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#orgDataByOrgIdAndSearchString");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SearchResultResponse> response = client
              .search
              .orgDataByOrgIdAndSearchString(orgId)
              .q(q)
              .entityTypes(entityTypes)
              .limit(limit)
              .includeFormer(includeFormer)
              .date(date)
              .scenarioId(scenarioId)
              .canAccess(canAccess)
              .includeExternalRecruiter(includeExternalRecruiter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#orgDataByOrgIdAndSearchString");
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
| **q** | **String**| Query search term | [optional] |
| **entityTypes** | **String**| Entity types | [optional] |
| **limit** | **Integer**| Limit | [optional] |
| **includeFormer** | **Boolean**| Include former users or persons | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **scenarioId** | **String**| Scenario Id | [optional] |
| **canAccess** | **String**| entity action pairs that can be accessed | [optional] |
| **includeExternalRecruiter** | **Boolean**| Include External Recruiter | [optional] |

### Return type

[**SearchResultResponse**](SearchResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **404** | not found |  -  |

