# PositionApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignJobToPosition**](PositionApi.md#assignJobToPosition) | **POST** /v2/org/{orgId}/position/{positionId}/job/{jobId} | Assign a job to a position |
| [**createNewPosition**](PositionApi.md#createNewPosition) | **POST** /v2/org/{orgId}/position | Create a position |
| [**deleteAndPurge**](PositionApi.md#deleteAndPurge) | **DELETE** /v2/org/{orgId}/position/{positionId}/purge | Delete a position and purge it from all history |
| [**deletePosition**](PositionApi.md#deletePosition) | **DELETE** /v2/org/{orgId}/position/{positionId} | Delete a position |
| [**getById**](PositionApi.md#getById) | **GET** /v2/org/{orgId}/position/{positionId} | Return a particular position by id |
| [**getHistoryById**](PositionApi.md#getHistoryById) | **GET** /v2/org/{orgId}/position/{positionId}/history | Return the history of a particular position by id |
| [**importCsvDataWithFilePath**](PositionApi.md#importCsvDataWithFilePath) | **POST** /v2/org/{orgId}/position/import | Import positions as a CSV |
| [**list**](PositionApi.md#list) | **GET** /v2/org/{orgId}/position | Return a list of positions |
| [**removeJobFromPosition**](PositionApi.md#removeJobFromPosition) | **DELETE** /v2/org/{orgId}/position/{positionId}/job/{jobId} | Remove a job from a position |
| [**updateJobDatesOnPosition**](PositionApi.md#updateJobDatesOnPosition) | **PATCH** /v2/org/{orgId}/position/{positionId}/job/{jobId} | Update assign or remove date of a job for a position |
| [**updatePositionDetails**](PositionApi.md#updatePositionDetails) | **PATCH** /v2/org/{orgId}/position/{positionId} | Update a position |


<a name="assignJobToPosition"></a>
# **assignJobToPosition**
> Object assignJobToPosition(orgId, positionId, jobId).scenarioId(scenarioId).date(date).execute();

Assign a job to a position



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String positionId = "positionId_example"; // Position id
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to assign the job in
    LocalDate date = LocalDate.now(); // Effective date of assignment
    try {
      Object result = client
              .position
              .assignJobToPosition(orgId, positionId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#assignJobToPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .position
              .assignJobToPosition(orgId, positionId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#assignJobToPosition");
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
| **positionId** | **String**| Position id | |
| **jobId** | **String**| Job id | |
| **scenarioId** | **String**| Scenario id to assign the job in | [optional] |
| **date** | **LocalDate**| Effective date of assignment | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="createNewPosition"></a>
# **createNewPosition**
> Object createNewPosition(orgId).scenarioId(scenarioId).date(date).requestBody(requestBody).execute();

Create a position



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id to create the position in
    LocalDate date = LocalDate.now(); // Effective date of position creation
    try {
      Object result = client
              .position
              .createNewPosition(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#createNewPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .position
              .createNewPosition(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#createNewPosition");
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
| **scenarioId** | **String**| Scenario id to create the position in | [optional] |
| **date** | **LocalDate**| Effective date of position creation | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deleteAndPurge"></a>
# **deleteAndPurge**
> Object deleteAndPurge(orgId, positionId).execute();

Delete a position and purge it from all history



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String positionId = "positionId_example"; // Position id
    try {
      Object result = client
              .position
              .deleteAndPurge(orgId, positionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#deleteAndPurge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .position
              .deleteAndPurge(orgId, positionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#deleteAndPurge");
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
| **positionId** | **String**| Position id | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deletePosition"></a>
# **deletePosition**
> Object deletePosition(orgId, positionId).scenarioId(scenarioId).date(date).execute();

Delete a position



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String positionId = "positionId_example"; // Position id
    String scenarioId = "scenarioId_example"; // Scenario id to delete the position in
    LocalDate date = LocalDate.now(); // Effective date of position deletion
    try {
      Object result = client
              .position
              .deletePosition(orgId, positionId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#deletePosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .position
              .deletePosition(orgId, positionId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#deletePosition");
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
| **positionId** | **String**| Position id | |
| **scenarioId** | **String**| Scenario id to delete the position in | [optional] |
| **date** | **LocalDate**| Effective date of position deletion | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getById"></a>
# **getById**
> Map&lt;String, Object&gt; getById(orgId, positionId).scenarioId(scenarioId).date(date).fields(fields).includeDeleted(includeDeleted).format(format).execute();

Return a particular position by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String positionId = "positionId_example"; // Position identifier
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    Boolean includeDeleted = true; // Include deleted positions in the result
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      Map<String, Object> result = client
              .position
              .getById(orgId, positionId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .includeDeleted(includeDeleted)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .position
              .getById(orgId, positionId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .includeDeleted(includeDeleted)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#getById");
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
| **positionId** | **String**| Position identifier | |
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **includeDeleted** | **Boolean**| Include deleted positions in the result | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

### Return type

**Map&lt;String, Object&gt;**

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

<a name="getHistoryById"></a>
# **getHistoryById**
> Map&lt;String, Object&gt; getHistoryById(orgId, positionId).scenarioId(scenarioId).date(date).fields(fields).format(format).execute();

Return the history of a particular position by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String positionId = "positionId_example"; // Position identifier
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      Map<String, Object> result = client
              .position
              .getHistoryById(orgId, positionId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#getHistoryById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .position
              .getHistoryById(orgId, positionId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#getHistoryById");
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
| **positionId** | **String**| Position identifier | |
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

### Return type

**Map&lt;String, Object&gt;**

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

<a name="importCsvDataWithFilePath"></a>
# **importCsvDataWithFilePath**
> Process importCsvDataWithFilePath(orgId).importFromProcessId(importFromProcessId).parentProcessId(parentProcessId).date(date)._file(_file).positionImportCsvDataWithFilePathRequest(positionImportCsvDataWithFilePathRequest).execute();

Import positions as a CSV



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String importFromProcessId = "importFromProcessId_example"; // Import a file from another process, instead of directly uploading it
    String parentProcessId = "parentProcessId_example"; // Parent process id to attach to
    LocalDate date = LocalDate.now(); // Effective date to import positions as of, if date column not provided
    File _file = new File("/path/to/file");
    try {
      Process result = client
              .position
              .importCsvDataWithFilePath(orgId)
              .importFromProcessId(importFromProcessId)
              .parentProcessId(parentProcessId)
              .date(date)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getFilePath());
      System.out.println(result.getLogPath());
      System.out.println(result.getRunUserId());
      System.out.println(result.getParentProcessId());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getStartAt());
      System.out.println(result.getEndAt());
      System.out.println(result.getMessage());
      System.out.println(result.getProgress());
      System.out.println(result.getInternalError());
      System.out.println(result.getOptions());
      System.out.println(result.getResults());
      System.out.println(result.getLogDataList());
      System.out.println(result.getState());
      System.out.println(result.getAppId());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#importCsvDataWithFilePath");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .position
              .importCsvDataWithFilePath(orgId)
              .importFromProcessId(importFromProcessId)
              .parentProcessId(parentProcessId)
              .date(date)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#importCsvDataWithFilePath");
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
| **importFromProcessId** | **String**| Import a file from another process, instead of directly uploading it | [optional] |
| **parentProcessId** | **String**| Parent process id to attach to | [optional] |
| **date** | **LocalDate**| Effective date to import positions as of, if date column not provided | [optional] |
| **_file** | **File**|  | [optional] |
| **positionImportCsvDataWithFilePathRequest** | [**PositionImportCsvDataWithFilePathRequest**](PositionImportCsvDataWithFilePathRequest.md)|  | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="list"></a>
# **list**
> Map&lt;String, Object&gt; list(orgId).scenarioId(scenarioId).groupId(groupId).date(date).from(from).limit(limit).fields(fields).includeDeleted(includeDeleted).format(format).execute();

Return a list of positions



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id to query
    String groupId = "groupId_example"; // Group id to query
    LocalDate date = LocalDate.now(); // Date
    String from = "from_example"; // Position id to start paginating from
    Integer limit = 56; // Number of results to return
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    Boolean includeDeleted = true; // Include deleted positions in the result
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      Map<String, Object> result = client
              .position
              .list(orgId)
              .scenarioId(scenarioId)
              .groupId(groupId)
              .date(date)
              .from(from)
              .limit(limit)
              .fields(fields)
              .includeDeleted(includeDeleted)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .position
              .list(orgId)
              .scenarioId(scenarioId)
              .groupId(groupId)
              .date(date)
              .from(from)
              .limit(limit)
              .fields(fields)
              .includeDeleted(includeDeleted)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#list");
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
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **groupId** | **String**| Group id to query | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **from** | **String**| Position id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **includeDeleted** | **Boolean**| Include deleted positions in the result | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

### Return type

**Map&lt;String, Object&gt;**

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

<a name="removeJobFromPosition"></a>
# **removeJobFromPosition**
> Object removeJobFromPosition(orgId, positionId, jobId).scenarioId(scenarioId).date(date).execute();

Remove a job from a position



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String positionId = "positionId_example"; // Position id
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to remove the job in
    LocalDate date = LocalDate.now(); // Effective date of removal
    try {
      Object result = client
              .position
              .removeJobFromPosition(orgId, positionId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#removeJobFromPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .position
              .removeJobFromPosition(orgId, positionId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#removeJobFromPosition");
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
| **positionId** | **String**| Position id | |
| **jobId** | **String**| Job id | |
| **scenarioId** | **String**| Scenario id to remove the job in | [optional] |
| **date** | **LocalDate**| Effective date of removal | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="updateJobDatesOnPosition"></a>
# **updateJobDatesOnPosition**
> Object updateJobDatesOnPosition(orgId, positionId, jobId).scenarioId(scenarioId).removeDate(removeDate).assigndate(assigndate).execute();

Update assign or remove date of a job for a position



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String positionId = "positionId_example"; // Position id
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to remove the job in
    LocalDate removeDate = LocalDate.now(); // Effective date of removal
    LocalDate assigndate = LocalDate.now(); // Effective date of assignment
    try {
      Object result = client
              .position
              .updateJobDatesOnPosition(orgId, positionId, jobId)
              .scenarioId(scenarioId)
              .removeDate(removeDate)
              .assigndate(assigndate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#updateJobDatesOnPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .position
              .updateJobDatesOnPosition(orgId, positionId, jobId)
              .scenarioId(scenarioId)
              .removeDate(removeDate)
              .assigndate(assigndate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#updateJobDatesOnPosition");
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
| **positionId** | **String**| Position id | |
| **jobId** | **String**| Job id | |
| **scenarioId** | **String**| Scenario id to remove the job in | [optional] |
| **removeDate** | **LocalDate**| Effective date of removal | [optional] |
| **assigndate** | **LocalDate**| Effective date of assignment | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="updatePositionDetails"></a>
# **updatePositionDetails**
> Object updatePositionDetails(orgId, positionId).scenarioId(scenarioId).date(date).requestBody(requestBody).execute();

Update a position



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String positionId = "positionId_example"; // Position id
    String scenarioId = "scenarioId_example"; // Scenario id to update the position in
    LocalDate date = LocalDate.now(); // Effective date of position update
    try {
      Object result = client
              .position
              .updatePositionDetails(orgId, positionId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#updatePositionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .position
              .updatePositionDetails(orgId, positionId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#updatePositionDetails");
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
| **positionId** | **String**| Position id | |
| **scenarioId** | **String**| Scenario id to update the position in | [optional] |
| **date** | **LocalDate**| Effective date of position update | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

