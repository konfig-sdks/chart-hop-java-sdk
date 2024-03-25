# ProcessApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkProcessStatus**](ProcessApi.md#checkProcessStatus) | **GET** /v1/org/{orgId}/process/{processId} | Check the status of a particular process |
| [**createNewPendingProcess**](ProcessApi.md#createNewPendingProcess) | **POST** /v1/org/{orgId}/process | Creates a new process in the pending state |
| [**createPendingProcess**](ProcessApi.md#createPendingProcess) | **POST** /v1/org/{orgId}/process/self-serve | Creates a new process in the pending state |
| [**createPendingProcessWithUserId**](ProcessApi.md#createPendingProcessWithUserId) | **POST** /v1/org/{orgId}/process/{createIdOverride} | Creates a new process with a specified createId in the pending state |
| [**decrementStep**](ProcessApi.md#decrementStep) | **PUT** /v1/org/{orgId}/process/{processId}/decrement | Decrement the step of an asynchronous process |
| [**downloadFileById**](ProcessApi.md#downloadFileById) | **GET** /v1/org/{orgId}/process/{processId}/file | Download the file associated with a particular process |
| [**downloadLog**](ProcessApi.md#downloadLog) | **GET** /v1/org/{orgId}/process/{processId}/log | Download the newline-delimited JSON log associated with a particular process |
| [**getEventsByProcessId**](ProcessApi.md#getEventsByProcessId) | **GET** /v1/org/{orgId}/process/{processId}/events | Get events associated to a particular process |
| [**getLastSyncForAppUser**](ProcessApi.md#getLastSyncForAppUser) | **GET** /v1/org/{orgId}/process/last-sync/{appUserId} | Get last success sync and last sync for given appUserId |
| [**getPreviouslyRunProcesses**](ProcessApi.md#getPreviouslyRunProcesses) | **GET** /v1/org/{orgId}/process | Retrieve a number of previously run processes |
| [**incrementProcessStep**](ProcessApi.md#incrementProcessStep) | **PUT** /v1/org/{orgId}/process/{processId}/increment | Increment the step of an asynchronous process |
| [**resumeProcessWithUserId**](ProcessApi.md#resumeProcessWithUserId) | **PUT** /v1/org/{orgId}/process/{processId}/resume | Resume an asynchronous process |
| [**resumeWithFile**](ProcessApi.md#resumeWithFile) | **PUT** /v1/org/{orgId}/process/{processId}/resumeWithFile | Resume an asynchronous process |
| [**updateProcessState**](ProcessApi.md#updateProcessState) | **PUT** /v1/org/{orgId}/process/{processId}/state | Update process state |
| [**updateStatusOfProcess**](ProcessApi.md#updateStatusOfProcess) | **PATCH** /v1/org/{orgId}/process/{processId} | Update the status of a process, marking its progress or setting status to DONE or ERROR |
| [**uploadFileAndMarkComplete**](ProcessApi.md#uploadFileAndMarkComplete) | **POST** /v1/org/{orgId}/process/{processId}/file | Upload a file to be attached to a process, and mark the process as complete |


<a name="checkProcessStatus"></a>
# **checkProcessStatus**
> Process checkProcessStatus(orgId, processId).showState(showState).execute();

Check the status of a particular process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    Boolean showState = true; // showState
    try {
      Process result = client
              .process
              .checkProcessStatus(orgId, processId)
              .showState(showState)
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
      System.err.println("Exception when calling ProcessApi#checkProcessStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .process
              .checkProcessStatus(orgId, processId)
              .showState(showState)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#checkProcessStatus");
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
| **processId** | **String**| process id | |
| **showState** | **Boolean**| showState | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="createNewPendingProcess"></a>
# **createNewPendingProcess**
> Process createNewPendingProcess(orgId).createProcess(createProcess).execute();

Creates a new process in the pending state



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // parent org id
    String label = "label_example"; // human-readable label that identifies this process
    String type = "type_example"; // process type
    String status = "PENDING"; // current status of process
    String runUserId = "runUserId_example"; // user id who is running the process
    Object options = null; // options passed to the process
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String filePath = "filePath_example"; // data file path
    String parentProcessId = "parentProcessId_example"; // process id of parent process
    String message = "message_example"; // status or error message
    Double progress = 3.4D; // percent progress so far
    String internalError = "internalError_example"; // internal-only error message
    Map<String, Object> results = new HashMap(); // results summary for the process
    List<LogData> logDataList = Arrays.asList(); // list of log data that occurred during running of this process
    Object state = null; // process-specific state data
    String appId = "appId_example"; // app id of the process
    String uuid = "uuid_example"; // unique ID of the process at queue time
    try {
      Process result = client
              .process
              .createNewPendingProcess(orgId, label, type, status, runUserId, options, orgId)
              .filePath(filePath)
              .parentProcessId(parentProcessId)
              .message(message)
              .progress(progress)
              .internalError(internalError)
              .results(results)
              .logDataList(logDataList)
              .state(state)
              .appId(appId)
              .uuid(uuid)
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
      System.err.println("Exception when calling ProcessApi#createNewPendingProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .process
              .createNewPendingProcess(orgId, label, type, status, runUserId, options, orgId)
              .filePath(filePath)
              .parentProcessId(parentProcessId)
              .message(message)
              .progress(progress)
              .internalError(internalError)
              .results(results)
              .logDataList(logDataList)
              .state(state)
              .appId(appId)
              .uuid(uuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#createNewPendingProcess");
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
| **createProcess** | [**CreateProcess**](CreateProcess.md)| Process data to create | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="createPendingProcess"></a>
# **createPendingProcess**
> createPendingProcess(orgId).type(type).maxRows(maxRows).minColumns(minColumns).isSync(isSync)._file(_file).state(state).processCreatePendingProcessRequest(processCreatePendingProcessRequest).execute();

Creates a new process in the pending state



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Process type
    Integer maxRows = 56; // Max rows allowed in an imported spreadsheet file
    Integer minColumns = 56; // Min columns required in an imported spreadsheet file
    Boolean isSync = true; // Whether the created process is sync flow or manual flow
    File _file = new File("/path/to/file");
    Object state = null;
    try {
      client
              .process
              .createPendingProcess(orgId)
              .type(type)
              .maxRows(maxRows)
              .minColumns(minColumns)
              .isSync(isSync)
              ._file(_file)
              .state(state)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#createPendingProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .createPendingProcess(orgId)
              .type(type)
              .maxRows(maxRows)
              .minColumns(minColumns)
              .isSync(isSync)
              ._file(_file)
              .state(state)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#createPendingProcess");
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
| **type** | **String**| Process type | [optional] |
| **maxRows** | **Integer**| Max rows allowed in an imported spreadsheet file | [optional] |
| **minColumns** | **Integer**| Min columns required in an imported spreadsheet file | [optional] |
| **isSync** | **Boolean**| Whether the created process is sync flow or manual flow | [optional] |
| **_file** | **File**|  | [optional] |
| **state** | [**Object**](Object.md)|  | [optional] |
| **processCreatePendingProcessRequest** | [**ProcessCreatePendingProcessRequest**](ProcessCreatePendingProcessRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="createPendingProcessWithUserId"></a>
# **createPendingProcessWithUserId**
> Process createPendingProcessWithUserId(orgId, createIdOverride).createProcess(createProcess).execute();

Creates a new process with a specified createId in the pending state



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // parent org id
    String label = "label_example"; // human-readable label that identifies this process
    String type = "type_example"; // process type
    String status = "PENDING"; // current status of process
    String runUserId = "runUserId_example"; // user id who is running the process
    Object options = null; // options passed to the process
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String createIdOverride = "createIdOverride_example"; // created user id override
    String filePath = "filePath_example"; // data file path
    String parentProcessId = "parentProcessId_example"; // process id of parent process
    String message = "message_example"; // status or error message
    Double progress = 3.4D; // percent progress so far
    String internalError = "internalError_example"; // internal-only error message
    Map<String, Object> results = new HashMap(); // results summary for the process
    List<LogData> logDataList = Arrays.asList(); // list of log data that occurred during running of this process
    Object state = null; // process-specific state data
    String appId = "appId_example"; // app id of the process
    String uuid = "uuid_example"; // unique ID of the process at queue time
    try {
      Process result = client
              .process
              .createPendingProcessWithUserId(orgId, label, type, status, runUserId, options, orgId, createIdOverride)
              .filePath(filePath)
              .parentProcessId(parentProcessId)
              .message(message)
              .progress(progress)
              .internalError(internalError)
              .results(results)
              .logDataList(logDataList)
              .state(state)
              .appId(appId)
              .uuid(uuid)
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
      System.err.println("Exception when calling ProcessApi#createPendingProcessWithUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .process
              .createPendingProcessWithUserId(orgId, label, type, status, runUserId, options, orgId, createIdOverride)
              .filePath(filePath)
              .parentProcessId(parentProcessId)
              .message(message)
              .progress(progress)
              .internalError(internalError)
              .results(results)
              .logDataList(logDataList)
              .state(state)
              .appId(appId)
              .uuid(uuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#createPendingProcessWithUserId");
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
| **createIdOverride** | **String**| created user id override | |
| **createProcess** | [**CreateProcess**](CreateProcess.md)| Process data to create | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="decrementStep"></a>
# **decrementStep**
> decrementStep(orgId, processId).execute();

Decrement the step of an asynchronous process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    try {
      client
              .process
              .decrementStep(orgId, processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#decrementStep");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .decrementStep(orgId, processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#decrementStep");
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
| **processId** | **String**| process id | |

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
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="downloadFileById"></a>
# **downloadFileById**
> downloadFileById(orgId, processId).execute();

Download the file associated with a particular process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    try {
      client
              .process
              .downloadFileById(orgId, processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#downloadFileById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .downloadFileById(orgId, processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#downloadFileById");
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
| **processId** | **String**| process id | |

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
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="downloadLog"></a>
# **downloadLog**
> downloadLog(orgId, processId).execute();

Download the newline-delimited JSON log associated with a particular process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    try {
      client
              .process
              .downloadLog(orgId, processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#downloadLog");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .downloadLog(orgId, processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#downloadLog");
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
| **processId** | **String**| process id | |

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
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="getEventsByProcessId"></a>
# **getEventsByProcessId**
> ProcessEventResponse getEventsByProcessId(orgId, processId).execute();

Get events associated to a particular process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    try {
      ProcessEventResponse result = client
              .process
              .getEventsByProcessId(orgId, processId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#getEventsByProcessId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProcessEventResponse> response = client
              .process
              .getEventsByProcessId(orgId, processId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#getEventsByProcessId");
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
| **processId** | **String**| process id | |

### Return type

[**ProcessEventResponse**](ProcessEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="getLastSyncForAppUser"></a>
# **getLastSyncForAppUser**
> AppProcessStatus getLastSyncForAppUser(orgId, appUserId).execute();

Get last success sync and last sync for given appUserId



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String appUserId = "appUserId_example"; // app user id
    try {
      AppProcessStatus result = client
              .process
              .getLastSyncForAppUser(orgId, appUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAppLastSync());
      System.out.println(result.getAppLastSuccessSync());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#getLastSyncForAppUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppProcessStatus> response = client
              .process
              .getLastSyncForAppUser(orgId, appUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#getLastSyncForAppUser");
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
| **appUserId** | **String**| app user id | |

### Return type

[**AppProcessStatus**](AppProcessStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="getPreviouslyRunProcesses"></a>
# **getPreviouslyRunProcesses**
> ResultsProcess getPreviouslyRunProcesses(orgId).isAppProcess(isAppProcess).appId(appId).parentProcessId(parentProcessId).type(type).completedAtStart(completedAtStart).completedAtEnd(completedAtEnd).statuses(statuses).isParentProcess(isParentProcess).processTypes(processTypes).searchValue(searchValue).from(from).limit(limit).syncDirections(syncDirections).syncCauses(syncCauses).execute();

Retrieve a number of previously run processes



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    Boolean isAppProcess = true; // Boolean if an app process
    String appId = "appId_example"; // App ID to filter by
    String parentProcessId = "parentProcessId_example"; // Parent process ID to search for children
    String type = "type_example"; // Type to filter by. Accepted values: ['auto', 'manual']
    Long completedAtStart = 56L; // completed at start
    Long completedAtEnd = 56L; // completed at end
    String statuses = "statuses_example"; // Statuses to filter by, comma-separated. Accepted values: ['DONE', 'ERROR', 'PENDING', 'RUNNING', 'DONE_WITH_ERRORS']
    Boolean isParentProcess = true; // Boolean if a parent process
    String processTypes = "processTypes_example"; // Process types to filter by, comma-separated.
    String searchValue = "searchValue_example"; // Search term for general filtering
    String from = "from_example"; // from id
    Integer limit = 56; // limit
    String syncDirections = "syncDirections_example"; // direction
    String syncCauses = "syncCauses_example"; // V2 Causes to filter by, comma-separated. Accepted values: ['MANUAL', 'AUTO', 'EVENT_BASED]
    try {
      ResultsProcess result = client
              .process
              .getPreviouslyRunProcesses(orgId)
              .isAppProcess(isAppProcess)
              .appId(appId)
              .parentProcessId(parentProcessId)
              .type(type)
              .completedAtStart(completedAtStart)
              .completedAtEnd(completedAtEnd)
              .statuses(statuses)
              .isParentProcess(isParentProcess)
              .processTypes(processTypes)
              .searchValue(searchValue)
              .from(from)
              .limit(limit)
              .syncDirections(syncDirections)
              .syncCauses(syncCauses)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#getPreviouslyRunProcesses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsProcess> response = client
              .process
              .getPreviouslyRunProcesses(orgId)
              .isAppProcess(isAppProcess)
              .appId(appId)
              .parentProcessId(parentProcessId)
              .type(type)
              .completedAtStart(completedAtStart)
              .completedAtEnd(completedAtEnd)
              .statuses(statuses)
              .isParentProcess(isParentProcess)
              .processTypes(processTypes)
              .searchValue(searchValue)
              .from(from)
              .limit(limit)
              .syncDirections(syncDirections)
              .syncCauses(syncCauses)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#getPreviouslyRunProcesses");
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
| **isAppProcess** | **Boolean**| Boolean if an app process | [optional] |
| **appId** | **String**| App ID to filter by | [optional] |
| **parentProcessId** | **String**| Parent process ID to search for children | [optional] |
| **type** | **String**| Type to filter by. Accepted values: [&#39;auto&#39;, &#39;manual&#39;] | [optional] |
| **completedAtStart** | **Long**| completed at start | [optional] |
| **completedAtEnd** | **Long**| completed at end | [optional] |
| **statuses** | **String**| Statuses to filter by, comma-separated. Accepted values: [&#39;DONE&#39;, &#39;ERROR&#39;, &#39;PENDING&#39;, &#39;RUNNING&#39;, &#39;DONE_WITH_ERRORS&#39;] | [optional] |
| **isParentProcess** | **Boolean**| Boolean if a parent process | [optional] |
| **processTypes** | **String**| Process types to filter by, comma-separated. | [optional] |
| **searchValue** | **String**| Search term for general filtering | [optional] |
| **from** | **String**| from id | [optional] |
| **limit** | **Integer**| limit | [optional] |
| **syncDirections** | **String**| direction | [optional] |
| **syncCauses** | **String**| V2 Causes to filter by, comma-separated. Accepted values: [&#39;MANUAL&#39;, &#39;AUTO&#39;, &#39;EVENT_BASED] | [optional] |

### Return type

[**ResultsProcess**](ResultsProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="incrementProcessStep"></a>
# **incrementProcessStep**
> incrementProcessStep(orgId, processId).execute();

Increment the step of an asynchronous process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    try {
      client
              .process
              .incrementProcessStep(orgId, processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#incrementProcessStep");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .incrementProcessStep(orgId, processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#incrementProcessStep");
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
| **processId** | **String**| process id | |

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
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="resumeProcessWithUserId"></a>
# **resumeProcessWithUserId**
> resumeProcessWithUserId(orgId, processId).requestBody(requestBody).execute();

Resume an asynchronous process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    try {
      client
              .process
              .resumeProcessWithUserId(orgId, processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#resumeProcessWithUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .resumeProcessWithUserId(orgId, processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#resumeProcessWithUserId");
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
| **processId** | **String**| process id | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| data to process | [optional] |

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

<a name="resumeWithFile"></a>
# **resumeWithFile**
> resumeWithFile(orgId, processId).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Resume an asynchronous process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    File _file = new File("/path/to/file");
    try {
      client
              .process
              .resumeWithFile(orgId, processId)
              ._file(_file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#resumeWithFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .resumeWithFile(orgId, processId)
              ._file(_file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#resumeWithFile");
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
| **processId** | **String**| process id | |
| **fileUploadNewFileRequest** | [**FileUploadNewFileRequest**](FileUploadNewFileRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="updateProcessState"></a>
# **updateProcessState**
> updateProcessState(orgId, processId).requestBody(requestBody).execute();

Update process state



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    try {
      client
              .process
              .updateProcessState(orgId, processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#updateProcessState");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .updateProcessState(orgId, processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#updateProcessState");
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
| **processId** | **String**| process id | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| state | [optional] |

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

<a name="updateStatusOfProcess"></a>
# **updateStatusOfProcess**
> updateStatusOfProcess(orgId, processId).updateProcess(updateProcess).execute();

Update the status of a process, marking its progress or setting status to DONE or ERROR



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    String status = "PENDING"; // current status of process
    String filePath = "filePath_example"; // data file path
    String message = "message_example"; // status or error message
    Double progress = 3.4D; // percent progress so far
    String internalError = "internalError_example"; // internal-only error message
    Object options = null; // options passed to the process
    Map<String, Object> results = new HashMap(); // results summary for the process
    List<LogData> logDataList = Arrays.asList(); // list of log data that occurred during running of this process
    Object state = null; // process-specific state data
    String appId = "appId_example"; // app id of the process
    try {
      client
              .process
              .updateStatusOfProcess(orgId, processId)
              .status(status)
              .filePath(filePath)
              .message(message)
              .progress(progress)
              .internalError(internalError)
              .options(options)
              .results(results)
              .logDataList(logDataList)
              .state(state)
              .appId(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#updateStatusOfProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .updateStatusOfProcess(orgId, processId)
              .status(status)
              .filePath(filePath)
              .message(message)
              .progress(progress)
              .internalError(internalError)
              .options(options)
              .results(results)
              .logDataList(logDataList)
              .state(state)
              .appId(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#updateStatusOfProcess");
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
| **processId** | **String**| process id | |
| **updateProcess** | [**UpdateProcess**](UpdateProcess.md)|  | [optional] |

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

<a name="uploadFileAndMarkComplete"></a>
# **uploadFileAndMarkComplete**
> uploadFileAndMarkComplete(orgId, processId).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Upload a file to be attached to a process, and mark the process as complete



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProcessApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String processId = "processId_example"; // process id
    File _file = new File("/path/to/file");
    try {
      client
              .process
              .uploadFileAndMarkComplete(orgId, processId)
              ._file(_file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#uploadFileAndMarkComplete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .process
              .uploadFileAndMarkComplete(orgId, processId)
              ._file(_file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessApi#uploadFileAndMarkComplete");
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
| **processId** | **String**| process id | |
| **fileUploadNewFileRequest** | [**FileUploadNewFileRequest**](FileUploadNewFileRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | invalid manifest data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

