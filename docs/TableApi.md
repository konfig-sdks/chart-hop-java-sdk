# TableApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTable**](TableApi.md#createNewTable) | **POST** /v1/org/{orgId}/table | Create a table |
| [**deleteRow**](TableApi.md#deleteRow) | **DELETE** /v1/org/{orgId}/table/{tableId}/data/{keyColumn}/{keyValue} | Delete an existing row |
| [**deleteRowFromHistory**](TableApi.md#deleteRowFromHistory) | **DELETE** /v1/org/{orgId}/table/{tableId}/data/{keyColumn}/{keyValue}/purge | Delete an existing row, purging from history entirely |
| [**exportDataToCsv**](TableApi.md#exportDataToCsv) | **POST** /v1/org/{orgId}/table/{tableId}/export | Export table data to CSV file |
| [**getAllRows**](TableApi.md#getAllRows) | **GET** /v1/org/{orgId}/table/{tableId}/data | Retrieve all rows from the table |
| [**getRowByColumn**](TableApi.md#getRowByColumn) | **GET** /v1/org/{orgId}/table/{tableId}/data/{keyColumn}/{keyValue} | Retrieve a particular row |
| [**getTableByIdOrName**](TableApi.md#getTableByIdOrName) | **GET** /v1/org/{orgId}/table/{tableId} | Return a particular table by id or name |
| [**importDataFromCsvFile**](TableApi.md#importDataFromCsvFile) | **POST** /v1/org/{orgId}/table/{tableId}/import | Import data from CSV file |
| [**listInOrgPaginated**](TableApi.md#listInOrgPaginated) | **GET** /v1/org/{orgId}/table | Return all tables in the organization paginated |
| [**removeById**](TableApi.md#removeById) | **DELETE** /v1/org/{orgId}/table/{tableId} | Delete a table |
| [**updateExistingRowData**](TableApi.md#updateExistingRowData) | **PATCH** /v1/org/{orgId}/table/{tableId}/data/{keyColumn}/{keyValue} | Update an existing row |
| [**updateExistingTable**](TableApi.md#updateExistingTable) | **PATCH** /v1/org/{orgId}/table/{tableId} | Update an existing table |
| [**upsertRowData**](TableApi.md#upsertRowData) | **POST** /v1/org/{orgId}/table/{tableId}/data | Upsert row data |


<a name="createNewTable"></a>
# **createNewTable**
> Table createNewTable(orgId).createTable(createTable).execute();

Create a table



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // name of table
    Boolean effectiveDated = true; // whether or not the table is time tracked with effective dates (allows time travel or not). If false, then the values set in the table will be the same across all dates.
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String label = "label_example"; // human readable label for the table
    String sensitive = "GLOBAL"; // base sensitivity of this table and entities in it -- should be either ORG or HIGH
    List<ShareAccess> shareAccess = Arrays.asList(); // users who are specifically granted permission to this table
    try {
      Table result = client
              .table
              .createNewTable(name, effectiveDated, orgId)
              .label(label)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getLabel());
      System.out.println(result.getLabelColumnId());
      System.out.println(result.getEffectiveDated());
      System.out.println(result.getSensitive());
      System.out.println(result.getShareAccess());
      System.out.println(result.getRowCount());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#createNewTable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Table> response = client
              .table
              .createNewTable(name, effectiveDated, orgId)
              .label(label)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#createNewTable");
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
| **createTable** | [**CreateTable**](CreateTable.md)| Table data to create | [optional] |

### Return type

[**Table**](Table.md)

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
| **404** | org not found |  -  |

<a name="deleteRow"></a>
# **deleteRow**
> ResultsData deleteRow(orgId, tableId, keyColumn, keyValue).date(date).scenarioId(scenarioId).execute();

Delete an existing row



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or unique name to update
    String keyColumn = "keyColumn_example"; // Column name to look up the row by (for example: id)
    String keyValue = "keyValue_example"; // Value of the key column
    LocalDate date = LocalDate.now(); // Date to delete as of
    String scenarioId = "scenarioId_example"; // Scenario id to delete from
    try {
      ResultsData result = client
              .table
              .deleteRow(orgId, tableId, keyColumn, keyValue)
              .date(date)
              .scenarioId(scenarioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#deleteRow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .table
              .deleteRow(orgId, tableId, keyColumn, keyValue)
              .date(date)
              .scenarioId(scenarioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#deleteRow");
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
| **tableId** | **String**| Table id or unique name to update | |
| **keyColumn** | **String**| Column name to look up the row by (for example: id) | |
| **keyValue** | **String**| Value of the key column | |
| **date** | **LocalDate**| Date to delete as of | [optional] |
| **scenarioId** | **String**| Scenario id to delete from | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deleteRowFromHistory"></a>
# **deleteRowFromHistory**
> ResultsData deleteRowFromHistory(orgId, tableId, keyColumn, keyValue).date(date).execute();

Delete an existing row, purging from history entirely



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or unique name to update
    String keyColumn = "keyColumn_example"; // Column name to look up the row by (for example: id)
    String keyValue = "keyValue_example"; // Value of the key column
    LocalDate date = LocalDate.now(); // Date to look up as of
    try {
      ResultsData result = client
              .table
              .deleteRowFromHistory(orgId, tableId, keyColumn, keyValue)
              .date(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#deleteRowFromHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .table
              .deleteRowFromHistory(orgId, tableId, keyColumn, keyValue)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#deleteRowFromHistory");
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
| **tableId** | **String**| Table id or unique name to update | |
| **keyColumn** | **String**| Column name to look up the row by (for example: id) | |
| **keyValue** | **String**| Value of the key column | |
| **date** | **LocalDate**| Date to look up as of | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="exportDataToCsv"></a>
# **exportDataToCsv**
> Process exportDataToCsv(orgId, tableId).requestBody(requestBody).execute();

Export table data to CSV file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or unique name to update
    try {
      Process result = client
              .table
              .exportDataToCsv(orgId, tableId)
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
      System.err.println("Exception when calling TableApi#exportDataToCsv");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .table
              .exportDataToCsv(orgId, tableId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#exportDataToCsv");
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
| **tableId** | **String**| Table id or unique name to update | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| export options | [optional] |

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
| **202** | successful operation |  -  |
| **400** | invalid manifest data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |

<a name="getAllRows"></a>
# **getAllRows**
> ResultsData getAllRows(orgId, tableId).date(date).scenarioId(scenarioId).columns(columns).format(format).execute();

Retrieve all rows from the table



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or unique name to retrieve
    LocalDate date = LocalDate.now(); // Date to search as of
    String scenarioId = "scenarioId_example"; // Scenario id to retrieve from
    String columns = "columns_example"; // Columns to retrieve, comma-separated (defaults to all columns)
    String format = "format_example"; // Data format to use; default is json, can also use json-extended, json-readable, or csv
    try {
      ResultsData result = client
              .table
              .getAllRows(orgId, tableId)
              .date(date)
              .scenarioId(scenarioId)
              .columns(columns)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#getAllRows");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .table
              .getAllRows(orgId, tableId)
              .date(date)
              .scenarioId(scenarioId)
              .columns(columns)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#getAllRows");
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
| **tableId** | **String**| Table id or unique name to retrieve | |
| **date** | **LocalDate**| Date to search as of | [optional] |
| **scenarioId** | **String**| Scenario id to retrieve from | [optional] |
| **columns** | **String**| Columns to retrieve, comma-separated (defaults to all columns) | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended, json-readable, or csv | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getRowByColumn"></a>
# **getRowByColumn**
> ResultsData getRowByColumn(orgId, tableId, keyColumn, keyValue).date(date).scenarioId(scenarioId).columns(columns).format(format).execute();

Retrieve a particular row



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or unique name to retrieve
    String keyColumn = "keyColumn_example"; // Column name to look up the row by (for example: id)
    String keyValue = "keyValue_example"; // Value of the column
    LocalDate date = LocalDate.now(); // Date to search as of
    String scenarioId = "scenarioId_example"; // Scenario id to retrieve from
    String columns = "columns_example"; // Columns to retrieve, comma-separated (defaults to all columns)
    String format = "format_example"; // Data format to use; default is json, can also use json-extended, json-readable, or csv
    try {
      ResultsData result = client
              .table
              .getRowByColumn(orgId, tableId, keyColumn, keyValue)
              .date(date)
              .scenarioId(scenarioId)
              .columns(columns)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#getRowByColumn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .table
              .getRowByColumn(orgId, tableId, keyColumn, keyValue)
              .date(date)
              .scenarioId(scenarioId)
              .columns(columns)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#getRowByColumn");
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
| **tableId** | **String**| Table id or unique name to retrieve | |
| **keyColumn** | **String**| Column name to look up the row by (for example: id) | |
| **keyValue** | **String**| Value of the column | |
| **date** | **LocalDate**| Date to search as of | [optional] |
| **scenarioId** | **String**| Scenario id to retrieve from | [optional] |
| **columns** | **String**| Columns to retrieve, comma-separated (defaults to all columns) | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended, json-readable, or csv | [optional] |

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
| **202** | snapshot currently building |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getTableByIdOrName"></a>
# **getTableByIdOrName**
> Table getTableByIdOrName(orgId, tableId).execute();

Return a particular table by id or name



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or name
    try {
      Table result = client
              .table
              .getTableByIdOrName(orgId, tableId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getLabel());
      System.out.println(result.getLabelColumnId());
      System.out.println(result.getEffectiveDated());
      System.out.println(result.getSensitive());
      System.out.println(result.getShareAccess());
      System.out.println(result.getRowCount());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#getTableByIdOrName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Table> response = client
              .table
              .getTableByIdOrName(orgId, tableId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#getTableByIdOrName");
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
| **tableId** | **String**| Table id or name | |

### Return type

[**Table**](Table.md)

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

<a name="importDataFromCsvFile"></a>
# **importDataFromCsvFile**
> Process importDataFromCsvFile(orgId, tableId).date(date).importFromProcessId(importFromProcessId).parentProcessId(parentProcessId).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Import data from CSV file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or unique name to update
    File _file = new File("/path/to/file");
    LocalDate date = LocalDate.now(); // Date to update as of
    String importFromProcessId = "importFromProcessId_example"; // Import a file from another process, instead of directly uploading it
    String parentProcessId = "parentProcessId_example"; // Parent process id to attach to
    try {
      Process result = client
              .table
              .importDataFromCsvFile(orgId, tableId)
              ._file(_file)
              .date(date)
              .importFromProcessId(importFromProcessId)
              .parentProcessId(parentProcessId)
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
      System.err.println("Exception when calling TableApi#importDataFromCsvFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .table
              .importDataFromCsvFile(orgId, tableId)
              ._file(_file)
              .date(date)
              .importFromProcessId(importFromProcessId)
              .parentProcessId(parentProcessId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#importDataFromCsvFile");
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
| **tableId** | **String**| Table id or unique name to update | |
| **date** | **LocalDate**| Date to update as of | [optional] |
| **importFromProcessId** | **String**| Import a file from another process, instead of directly uploading it | [optional] |
| **parentProcessId** | **String**| Parent process id to attach to | [optional] |
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

<a name="listInOrgPaginated"></a>
# **listInOrgPaginated**
> ResultsTable listInOrgPaginated(orgId).from(from).limit(limit).includeBuiltIns(includeBuiltIns).names(names).execute();

Return all tables in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String from = "from_example"; // Table id to start paginating from
    Integer limit = 56; // Number of results to return
    Boolean includeBuiltIns = true; // Whether to include built-in tables
    String names = "names_example"; // Table names to filter to
    try {
      ResultsTable result = client
              .table
              .listInOrgPaginated(orgId)
              .from(from)
              .limit(limit)
              .includeBuiltIns(includeBuiltIns)
              .names(names)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#listInOrgPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsTable> response = client
              .table
              .listInOrgPaginated(orgId)
              .from(from)
              .limit(limit)
              .includeBuiltIns(includeBuiltIns)
              .names(names)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#listInOrgPaginated");
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
| **from** | **String**| Table id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **includeBuiltIns** | **Boolean**| Whether to include built-in tables | [optional] |
| **names** | **String**| Table names to filter to | [optional] |

### Return type

[**ResultsTable**](ResultsTable.md)

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

<a name="removeById"></a>
# **removeById**
> removeById(orgId, tableId).execute();

Delete a table



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or name
    try {
      client
              .table
              .removeById(orgId, tableId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .table
              .removeById(orgId, tableId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#removeById");
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
| **tableId** | **String**| Table id or name | |

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
| **404** | not found |  -  |

<a name="updateExistingRowData"></a>
# **updateExistingRowData**
> ResultsData updateExistingRowData(orgId, tableId, keyColumn, keyValue).date(date).scenarioId(scenarioId).requestBody(requestBody).execute();

Update an existing row



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or unique name to update
    String keyColumn = "keyColumn_example"; // Column name to look up the row by (for example: id)
    String keyValue = "keyValue_example"; // Value of the key column
    LocalDate date = LocalDate.now(); // Date to update as of
    String scenarioId = "scenarioId_example"; // Scenario id to update
    try {
      ResultsData result = client
              .table
              .updateExistingRowData(orgId, tableId, keyColumn, keyValue)
              .date(date)
              .scenarioId(scenarioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#updateExistingRowData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .table
              .updateExistingRowData(orgId, tableId, keyColumn, keyValue)
              .date(date)
              .scenarioId(scenarioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#updateExistingRowData");
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
| **tableId** | **String**| Table id or unique name to update | |
| **keyColumn** | **String**| Column name to look up the row by (for example: id) | |
| **keyValue** | **String**| Value of the key column | |
| **date** | **LocalDate**| Date to update as of | [optional] |
| **scenarioId** | **String**| Scenario id to update | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

[**ResultsData**](ResultsData.md)

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

<a name="updateExistingTable"></a>
# **updateExistingTable**
> updateExistingTable(orgId, tableId).updateTable(updateTable).execute();

Update an existing table



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or name
    String name = "name_example"; // name of table
    String label = "label_example"; // human readable label for the table
    String labelColumnId = "labelColumnId_example"; // if set, use this column id as the label when referencing rows
    Boolean effectiveDated = true; // whether or not the table is time tracked with effective dates (allows time travel or not). If false, then the values set in the table will be the same across all dates.
    String sensitive = "GLOBAL"; // base sensitivity of this table and entities in it -- should be either ORG or HIGH
    List<ShareAccess> shareAccess = Arrays.asList(); // users who are specifically granted permission to this table
    try {
      client
              .table
              .updateExistingTable(orgId, tableId)
              .name(name)
              .label(label)
              .labelColumnId(labelColumnId)
              .effectiveDated(effectiveDated)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#updateExistingTable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .table
              .updateExistingTable(orgId, tableId)
              .name(name)
              .label(label)
              .labelColumnId(labelColumnId)
              .effectiveDated(effectiveDated)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#updateExistingTable");
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
| **tableId** | **String**| Table id or name | |
| **updateTable** | [**UpdateTable**](UpdateTable.md)| Table data to update | [optional] |

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

<a name="upsertRowData"></a>
# **upsertRowData**
> ResultsData upsertRowData(orgId, tableId).date(date).scenarioId(scenarioId).requestBody(requestBody).execute();

Upsert row data



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TableApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String tableId = "tableId_example"; // Table id or unique name to update
    LocalDate date = LocalDate.now(); // Date to update as of
    String scenarioId = "scenarioId_example"; // Scenario id to update
    try {
      ResultsData result = client
              .table
              .upsertRowData(orgId, tableId)
              .date(date)
              .scenarioId(scenarioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#upsertRowData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .table
              .upsertRowData(orgId, tableId)
              .date(date)
              .scenarioId(scenarioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TableApi#upsertRowData");
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
| **tableId** | **String**| Table id or unique name to update | |
| **date** | **LocalDate**| Date to update as of | [optional] |
| **scenarioId** | **String**| Scenario id to update | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

[**ResultsData**](ResultsData.md)

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

