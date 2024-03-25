# ImportApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**csvData**](ImportApi.md#csvData) | **POST** /v1/org/{orgId}/import/csv/data | Import data from CSV file |
| [**csvDataColumnMatch**](ImportApi.md#csvDataColumnMatch) | **POST** /v1/org/{orgId}/import/csv/initialColumnMatch | Parse a CSV file in preparation for column matching as part of spreadsheet import process |
| [**csvDataWithColumnMatch**](ImportApi.md#csvDataWithColumnMatch) | **POST** /v1/org/{orgId}/import/csv/columnMatch | Import data from CSV file |
| [**csvDataWithFilePath**](ImportApi.md#csvDataWithFilePath) | **POST** /v1/org/{orgId}/import/csv/filepath | Import data from CSV file |
| [**spreadsheetValidation**](ImportApi.md#spreadsheetValidation) | **POST** /v1/org/{orgId}/import/spreadsheet/validateFormat | Check if a spreadsheet file is valid to be imported |


<a name="csvData"></a>
# **csvData**
> Process csvData(orgId).scenarioId(scenarioId).skipErrors(skipErrors).upsert(upsert).createGroups(createGroups).disableSyncHireDate(disableSyncHireDate).updateTypes(updateTypes).notifyUserIds(notifyUserIds).notifyAppName(notifyAppName).defaultChangeDate(defaultChangeDate).disableOverwritePerson(disableOverwritePerson).importDryRun(importDryRun).importAfterDryRun(importAfterDryRun).parentProcessId(parentProcessId).importSource(importSource).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Import data from CSV file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    File _file = new File("/path/to/file");
    String scenarioId = "scenarioId_example"; // scenario id to import into
    Boolean skipErrors = true; // whether to skip erroneous rows, or reject the entire upload if any are invalid (default)
    Boolean upsert = true; // whether to create persons/jobs that are not matched
    Boolean createGroups = true; // whether to create groups that are not matched
    Boolean disableSyncHireDate = true; // whether to disable adjusting dates of hires in cases where the start dates differ
    String updateTypes = "updateTypes_example"; // types of updates to apply (default all: title,comp,group,relationship,data,other)
    String notifyUserIds = "notifyUserIds_example"; // comma-separated list of user ids who should be notified when the import is complete
    String notifyAppName = "notifyAppName_example"; // name of the app that should be listed in the notify
    LocalDate defaultChangeDate = LocalDate.now(); // date of the changes - if not presented on the csv file
    Boolean disableOverwritePerson = true; // disable overwriting changes to persons' data -- only update data if the person field is null
    Boolean importDryRun = true; // import dry run
    Boolean importAfterDryRun = true; // whether to automatically import if dry run succeeds
    String parentProcessId = "parentProcessId_example"; // process id of parent process
    String importSource = "importSource_example"; // self identified source caller into this method
    try {
      Process result = client
              .import
              .csvData(orgId)
              ._file(_file)
              .scenarioId(scenarioId)
              .skipErrors(skipErrors)
              .upsert(upsert)
              .createGroups(createGroups)
              .disableSyncHireDate(disableSyncHireDate)
              .updateTypes(updateTypes)
              .notifyUserIds(notifyUserIds)
              .notifyAppName(notifyAppName)
              .defaultChangeDate(defaultChangeDate)
              .disableOverwritePerson(disableOverwritePerson)
              .importDryRun(importDryRun)
              .importAfterDryRun(importAfterDryRun)
              .parentProcessId(parentProcessId)
              .importSource(importSource)
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
      System.err.println("Exception when calling ImportApi#csvData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .import
              .csvData(orgId)
              ._file(_file)
              .scenarioId(scenarioId)
              .skipErrors(skipErrors)
              .upsert(upsert)
              .createGroups(createGroups)
              .disableSyncHireDate(disableSyncHireDate)
              .updateTypes(updateTypes)
              .notifyUserIds(notifyUserIds)
              .notifyAppName(notifyAppName)
              .defaultChangeDate(defaultChangeDate)
              .disableOverwritePerson(disableOverwritePerson)
              .importDryRun(importDryRun)
              .importAfterDryRun(importAfterDryRun)
              .parentProcessId(parentProcessId)
              .importSource(importSource)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#csvData");
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
| **scenarioId** | **String**| scenario id to import into | [optional] |
| **skipErrors** | **Boolean**| whether to skip erroneous rows, or reject the entire upload if any are invalid (default) | [optional] |
| **upsert** | **Boolean**| whether to create persons/jobs that are not matched | [optional] |
| **createGroups** | **Boolean**| whether to create groups that are not matched | [optional] |
| **disableSyncHireDate** | **Boolean**| whether to disable adjusting dates of hires in cases where the start dates differ | [optional] |
| **updateTypes** | **String**| types of updates to apply (default all: title,comp,group,relationship,data,other) | [optional] |
| **notifyUserIds** | **String**| comma-separated list of user ids who should be notified when the import is complete | [optional] |
| **notifyAppName** | **String**| name of the app that should be listed in the notify | [optional] |
| **defaultChangeDate** | **LocalDate**| date of the changes - if not presented on the csv file | [optional] |
| **disableOverwritePerson** | **Boolean**| disable overwriting changes to persons&#39; data -- only update data if the person field is null | [optional] |
| **importDryRun** | **Boolean**| import dry run | [optional] |
| **importAfterDryRun** | **Boolean**| whether to automatically import if dry run succeeds | [optional] |
| **parentProcessId** | **String**| process id of parent process | [optional] |
| **importSource** | **String**| self identified source caller into this method | [optional] |
| **fileUploadNewFileRequest** | [**FileUploadNewFileRequest**](FileUploadNewFileRequest.md)|  | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | successful operation |  -  |
| **400** | invalid manifest data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="csvDataColumnMatch"></a>
# **csvDataColumnMatch**
> csvDataColumnMatch(orgId).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Parse a CSV file in preparation for column matching as part of spreadsheet import process



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    File _file = new File("/path/to/file");
    try {
      client
              .import
              .csvDataColumnMatch(orgId)
              ._file(_file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#csvDataColumnMatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .import
              .csvDataColumnMatch(orgId)
              ._file(_file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#csvDataColumnMatch");
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
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="csvDataWithColumnMatch"></a>
# **csvDataWithColumnMatch**
> Process csvDataWithColumnMatch(orgId).scenarioId(scenarioId).skipErrors(skipErrors).upsert(upsert).createGroups(createGroups).disableSyncHireDate(disableSyncHireDate).updateTypes(updateTypes).notifyUserIds(notifyUserIds).notifyAppName(notifyAppName).defaultChangeDate(defaultChangeDate).disableOverwritePerson(disableOverwritePerson).importDryRun(importDryRun).importAfterDryRun(importAfterDryRun).parentProcessId(parentProcessId).importSource(importSource).syncImages(syncImages)._file(_file).userDefinedFieldAliases(userDefinedFieldAliases).importCsvDataWithColumnMatchRequest(importCsvDataWithColumnMatchRequest).execute();

Import data from CSV file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // scenario id to import into
    Boolean skipErrors = true; // whether to skip erroneous rows, or reject the entire upload if any are invalid (default)
    Boolean upsert = true; // whether to create persons/jobs that are not matched
    Boolean createGroups = true; // whether to create groups that are not matched
    Boolean disableSyncHireDate = true; // whether to disable adjusting dates of hires in cases where the start dates differ
    String updateTypes = "updateTypes_example"; // types of updates to apply (default all: title,comp,group,relationship,data,other)
    String notifyUserIds = "notifyUserIds_example"; // comma-separated list of user ids who should be notified when the import is complete
    String notifyAppName = "notifyAppName_example"; // name of the app that should be listed in the notify
    LocalDate defaultChangeDate = LocalDate.now(); // date of the changes - if not presented on the csv file
    Boolean disableOverwritePerson = true; // disable overwriting changes to persons' data -- only update data if the person field is null
    Boolean importDryRun = true; // import dry run
    Boolean importAfterDryRun = true; // whether to automatically import if dry run succeeds
    String parentProcessId = "parentProcessId_example"; // process id of parent process
    String importSource = "importSource_example"; // self identified source caller into this method
    Boolean syncImages = true; // import images from csv
    File _file = new File("/path/to/file");
    Object userDefinedFieldAliases = null; // user defined field aliases for column matching
    try {
      Process result = client
              .import
              .csvDataWithColumnMatch(orgId)
              .scenarioId(scenarioId)
              .skipErrors(skipErrors)
              .upsert(upsert)
              .createGroups(createGroups)
              .disableSyncHireDate(disableSyncHireDate)
              .updateTypes(updateTypes)
              .notifyUserIds(notifyUserIds)
              .notifyAppName(notifyAppName)
              .defaultChangeDate(defaultChangeDate)
              .disableOverwritePerson(disableOverwritePerson)
              .importDryRun(importDryRun)
              .importAfterDryRun(importAfterDryRun)
              .parentProcessId(parentProcessId)
              .importSource(importSource)
              .syncImages(syncImages)
              ._file(_file)
              .userDefinedFieldAliases(userDefinedFieldAliases)
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
      System.err.println("Exception when calling ImportApi#csvDataWithColumnMatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .import
              .csvDataWithColumnMatch(orgId)
              .scenarioId(scenarioId)
              .skipErrors(skipErrors)
              .upsert(upsert)
              .createGroups(createGroups)
              .disableSyncHireDate(disableSyncHireDate)
              .updateTypes(updateTypes)
              .notifyUserIds(notifyUserIds)
              .notifyAppName(notifyAppName)
              .defaultChangeDate(defaultChangeDate)
              .disableOverwritePerson(disableOverwritePerson)
              .importDryRun(importDryRun)
              .importAfterDryRun(importAfterDryRun)
              .parentProcessId(parentProcessId)
              .importSource(importSource)
              .syncImages(syncImages)
              ._file(_file)
              .userDefinedFieldAliases(userDefinedFieldAliases)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#csvDataWithColumnMatch");
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
| **scenarioId** | **String**| scenario id to import into | [optional] |
| **skipErrors** | **Boolean**| whether to skip erroneous rows, or reject the entire upload if any are invalid (default) | [optional] |
| **upsert** | **Boolean**| whether to create persons/jobs that are not matched | [optional] |
| **createGroups** | **Boolean**| whether to create groups that are not matched | [optional] |
| **disableSyncHireDate** | **Boolean**| whether to disable adjusting dates of hires in cases where the start dates differ | [optional] |
| **updateTypes** | **String**| types of updates to apply (default all: title,comp,group,relationship,data,other) | [optional] |
| **notifyUserIds** | **String**| comma-separated list of user ids who should be notified when the import is complete | [optional] |
| **notifyAppName** | **String**| name of the app that should be listed in the notify | [optional] |
| **defaultChangeDate** | **LocalDate**| date of the changes - if not presented on the csv file | [optional] |
| **disableOverwritePerson** | **Boolean**| disable overwriting changes to persons&#39; data -- only update data if the person field is null | [optional] |
| **importDryRun** | **Boolean**| import dry run | [optional] |
| **importAfterDryRun** | **Boolean**| whether to automatically import if dry run succeeds | [optional] |
| **parentProcessId** | **String**| process id of parent process | [optional] |
| **importSource** | **String**| self identified source caller into this method | [optional] |
| **syncImages** | **Boolean**| import images from csv | [optional] |
| **_file** | **File**|  | [optional] |
| **userDefinedFieldAliases** | [**Object**](Object.md)| user defined field aliases for column matching | [optional] |
| **importCsvDataWithColumnMatchRequest** | [**ImportCsvDataWithColumnMatchRequest**](ImportCsvDataWithColumnMatchRequest.md)|  | [optional] |

### Return type

[**Process**](Process.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | successful operation |  -  |
| **400** | invalid manifest data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="csvDataWithFilePath"></a>
# **csvDataWithFilePath**
> Process csvDataWithFilePath(orgId).filePath(filePath).scenarioId(scenarioId).skipErrors(skipErrors).upsert(upsert).createGroups(createGroups).disableSyncHireDate(disableSyncHireDate).updateTypes(updateTypes).notifyUserIds(notifyUserIds).notifyAppName(notifyAppName).defaultChangeDate(defaultChangeDate).disableOverwritePerson(disableOverwritePerson).importDryRun(importDryRun).importAfterDryRun(importAfterDryRun).parentProcessId(parentProcessId).importSource(importSource).execute();

Import data from CSV file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String filePath = "filePath_example"; // filePath
    String scenarioId = "scenarioId_example"; // scenario id to import into
    Boolean skipErrors = true; // whether to skip erroneous rows, or reject the entire upload if any are invalid (default)
    Boolean upsert = true; // whether to create persons/jobs that are not matched
    Boolean createGroups = true; // whether to create groups that are not matched
    Boolean disableSyncHireDate = true; // whether to disable adjusting dates of hires in cases where the start dates differ
    String updateTypes = "updateTypes_example"; // types of updates to apply (default all: title,comp,group,relationship,data,other)
    String notifyUserIds = "notifyUserIds_example"; // comma-separated list of user ids who should be notified when the import is complete
    String notifyAppName = "notifyAppName_example"; // name of the app that should be listed in the notify
    LocalDate defaultChangeDate = LocalDate.now(); // date of the changes - if not presented on the csv file
    Boolean disableOverwritePerson = true; // disable overwriting changes to persons' data -- only update data if the person field is null
    Boolean importDryRun = true; // import dry run
    Boolean importAfterDryRun = true; // whether to automatically import if dry run succeeds
    String parentProcessId = "parentProcessId_example"; // process id of parent process
    String importSource = "importSource_example"; // self identified source caller into this method
    try {
      Process result = client
              .import
              .csvDataWithFilePath(orgId)
              .filePath(filePath)
              .scenarioId(scenarioId)
              .skipErrors(skipErrors)
              .upsert(upsert)
              .createGroups(createGroups)
              .disableSyncHireDate(disableSyncHireDate)
              .updateTypes(updateTypes)
              .notifyUserIds(notifyUserIds)
              .notifyAppName(notifyAppName)
              .defaultChangeDate(defaultChangeDate)
              .disableOverwritePerson(disableOverwritePerson)
              .importDryRun(importDryRun)
              .importAfterDryRun(importAfterDryRun)
              .parentProcessId(parentProcessId)
              .importSource(importSource)
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
      System.err.println("Exception when calling ImportApi#csvDataWithFilePath");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .import
              .csvDataWithFilePath(orgId)
              .filePath(filePath)
              .scenarioId(scenarioId)
              .skipErrors(skipErrors)
              .upsert(upsert)
              .createGroups(createGroups)
              .disableSyncHireDate(disableSyncHireDate)
              .updateTypes(updateTypes)
              .notifyUserIds(notifyUserIds)
              .notifyAppName(notifyAppName)
              .defaultChangeDate(defaultChangeDate)
              .disableOverwritePerson(disableOverwritePerson)
              .importDryRun(importDryRun)
              .importAfterDryRun(importAfterDryRun)
              .parentProcessId(parentProcessId)
              .importSource(importSource)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#csvDataWithFilePath");
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
| **filePath** | **String**| filePath | [optional] |
| **scenarioId** | **String**| scenario id to import into | [optional] |
| **skipErrors** | **Boolean**| whether to skip erroneous rows, or reject the entire upload if any are invalid (default) | [optional] |
| **upsert** | **Boolean**| whether to create persons/jobs that are not matched | [optional] |
| **createGroups** | **Boolean**| whether to create groups that are not matched | [optional] |
| **disableSyncHireDate** | **Boolean**| whether to disable adjusting dates of hires in cases where the start dates differ | [optional] |
| **updateTypes** | **String**| types of updates to apply (default all: title,comp,group,relationship,data,other) | [optional] |
| **notifyUserIds** | **String**| comma-separated list of user ids who should be notified when the import is complete | [optional] |
| **notifyAppName** | **String**| name of the app that should be listed in the notify | [optional] |
| **defaultChangeDate** | **LocalDate**| date of the changes - if not presented on the csv file | [optional] |
| **disableOverwritePerson** | **Boolean**| disable overwriting changes to persons&#39; data -- only update data if the person field is null | [optional] |
| **importDryRun** | **Boolean**| import dry run | [optional] |
| **importAfterDryRun** | **Boolean**| whether to automatically import if dry run succeeds | [optional] |
| **parentProcessId** | **String**| process id of parent process | [optional] |
| **importSource** | **String**| self identified source caller into this method | [optional] |

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
| **202** | successful operation |  -  |
| **400** | invalid manifest data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="spreadsheetValidation"></a>
# **spreadsheetValidation**
> spreadsheetValidation(orgId).maxRows(maxRows).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Check if a spreadsheet file is valid to be imported



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    File _file = new File("/path/to/file");
    Integer maxRows = 56; // Max rows allowed in an imported spreadsheet file
    try {
      client
              .import
              .spreadsheetValidation(orgId)
              ._file(_file)
              .maxRows(maxRows)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#spreadsheetValidation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .import
              .spreadsheetValidation(orgId)
              ._file(_file)
              .maxRows(maxRows)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#spreadsheetValidation");
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
| **maxRows** | **Integer**| Max rows allowed in an imported spreadsheet file | [optional] |
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
| **400** | bad request |  -  |
| **404** | not found |  -  |

