# JobLevelApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewJobLevel**](JobLevelApi.md#createNewJobLevel) | **POST** /v1/org/{orgId}/job-level | Create a job level |
| [**deleteJobLevel**](JobLevelApi.md#deleteJobLevel) | **DELETE** /v1/org/{orgId}/job-level/{jobLevelId} | Delete a job level |
| [**findInOrganization**](JobLevelApi.md#findInOrganization) | **GET** /v1/org/{orgId}/job-level | Find job levels in the organization |
| [**getByEffectiveDate**](JobLevelApi.md#getByEffectiveDate) | **GET** /v1/org/{orgId}/job-level/{jobLevelId} | Return a particular job level by id on an effective date |
| [**updateJobLevel**](JobLevelApi.md#updateJobLevel) | **PATCH** /v1/org/{orgId}/job-level/{jobLevelId} | Update a job level |


<a name="createNewJobLevel"></a>
# **createNewJobLevel**
> createNewJobLevel(orgId).date(date).createJobLevel(createJobLevel).execute();

Create a job level



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobLevelApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // human-readable name of job level
    String orgId = "orgId_example"; // org identifier (either id or slug)
    String code = "code_example"; // job level code
    EnumValue benchmarkType = new EnumValue();
    EnumValue benchmarkLevel = new EnumValue();
    LocalDate date = LocalDate.now(); // Effective date of job level creation
    try {
      client
              .jobLevel
              .createNewJobLevel(label, orgId)
              .code(code)
              .benchmarkType(benchmarkType)
              .benchmarkLevel(benchmarkLevel)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#createNewJobLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jobLevel
              .createNewJobLevel(label, orgId)
              .code(code)
              .benchmarkType(benchmarkType)
              .benchmarkLevel(benchmarkLevel)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#createNewJobLevel");
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
| **orgId** | **String**| org identifier (either id or slug) | |
| **date** | **LocalDate**| Effective date of job level creation | [optional] |
| **createJobLevel** | [**CreateJobLevel**](CreateJobLevel.md)|  | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deleteJobLevel"></a>
# **deleteJobLevel**
> deleteJobLevel(orgId, jobLevelId).date(date).execute();

Delete a job level



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobLevelApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobLevelId = "jobLevelId_example"; // Job level id
    LocalDate date = LocalDate.now(); // Effective date of group update
    try {
      client
              .jobLevel
              .deleteJobLevel(orgId, jobLevelId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#deleteJobLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jobLevel
              .deleteJobLevel(orgId, jobLevelId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#deleteJobLevel");
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
| **jobLevelId** | **String**| Job level id | |
| **date** | **LocalDate**| Effective date of group update | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="findInOrganization"></a>
# **findInOrganization**
> ResultsData findInOrganization(orgId).date(date).from(from).limit(limit).includeDeleted(includeDeleted).execute();

Find job levels in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobLevelApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    LocalDate date = LocalDate.now(); // Date to search as of
    String from = "from_example"; // Job level id to start paginating from
    Integer limit = 56; // Number of results to return
    Boolean includeDeleted = true; // Include deleted job levels
    try {
      ResultsData result = client
              .jobLevel
              .findInOrganization(orgId)
              .date(date)
              .from(from)
              .limit(limit)
              .includeDeleted(includeDeleted)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#findInOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .jobLevel
              .findInOrganization(orgId)
              .date(date)
              .from(from)
              .limit(limit)
              .includeDeleted(includeDeleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#findInOrganization");
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
| **date** | **LocalDate**| Date to search as of | [optional] |
| **from** | **String**| Job level id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **includeDeleted** | **Boolean**| Include deleted job levels | [optional] |

### Return type

[**ResultsData**](ResultsData.md)

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
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getByEffectiveDate"></a>
# **getByEffectiveDate**
> ResultsData getByEffectiveDate(orgId, jobLevelId).date(date).execute();

Return a particular job level by id on an effective date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobLevelApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobLevelId = "jobLevelId_example"; // Job level id
    LocalDate date = LocalDate.now(); // Date to search as of
    try {
      ResultsData result = client
              .jobLevel
              .getByEffectiveDate(orgId, jobLevelId)
              .date(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#getByEffectiveDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .jobLevel
              .getByEffectiveDate(orgId, jobLevelId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#getByEffectiveDate");
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
| **jobLevelId** | **String**| Job level id | |
| **date** | **LocalDate**| Date to search as of | [optional] |

### Return type

[**ResultsData**](ResultsData.md)

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
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="updateJobLevel"></a>
# **updateJobLevel**
> updateJobLevel(orgId, jobLevelId).date(date).updateJobLevel(updateJobLevel).execute();

Update a job level



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobLevelApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobLevelId = "jobLevelId_example"; // Job level id
    String label = "label_example"; // human-readable name of job level
    String code = "code_example"; // job level code
    EnumValue benchmarkType = new EnumValue();
    EnumValue benchmarkLevel = new EnumValue();
    LocalDate date = LocalDate.now(); // Effective date of jobLevel update
    try {
      client
              .jobLevel
              .updateJobLevel(orgId, jobLevelId)
              .label(label)
              .code(code)
              .benchmarkType(benchmarkType)
              .benchmarkLevel(benchmarkLevel)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#updateJobLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jobLevel
              .updateJobLevel(orgId, jobLevelId)
              .label(label)
              .code(code)
              .benchmarkType(benchmarkType)
              .benchmarkLevel(benchmarkLevel)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLevelApi#updateJobLevel");
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
| **jobLevelId** | **String**| Job level id | |
| **date** | **LocalDate**| Effective date of jobLevel update | [optional] |
| **updateJobLevel** | [**UpdateJobLevel**](UpdateJobLevel.md)|  | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

