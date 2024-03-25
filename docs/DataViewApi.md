# DataViewApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDataView**](DataViewApi.md#createNewDataView) | **POST** /v1/org/{orgId}/data-view | Create a data view |
| [**deleteDataView**](DataViewApi.md#deleteDataView) | **DELETE** /v1/org/{orgId}/data-view/{dataViewId} | Delete a data  view |
| [**getAllPaginated**](DataViewApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/data-view | Return all data views in the organization paginated |
| [**getById**](DataViewApi.md#getById) | **GET** /v1/org/{orgId}/data-view/{dataViewId} | Return a particular data view by id |
| [**updateExistingView**](DataViewApi.md#updateExistingView) | **PATCH** /v1/org/{orgId}/data-view/{dataViewId} | Update an existing data view |


<a name="createNewDataView"></a>
# **createNewDataView**
> DataView createNewDataView(orgId).createDataView(createDataView).execute();

Create a data view



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataViewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // data view name
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String columns = "columns_example"; // comma delimited list of columns
    String type = "ANY"; // type of data view
    String entityType = "entityType_example"; // entity type being viewed
    Map<String, Double> columnWidths = new HashMap(); // map of column names to widths in pixels
    String date = "date_example"; // date of view, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today
    String startDate = "startDate_example"; // start date of view, if displaying a date range, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today
    String endDate = "endDate_example"; // end date of view, if displaying a date range, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today
    String filter = "filter_example"; // filter query
    String sort = "sort_example"; // comma delimited list of columns by which to sort
    String groupBy = "groupBy_example"; // column to group duplicates by
    List<ShareAccess> shareAccess = Arrays.asList(); // users who are specifically granted permission to view or edit this data view
    String sensitive = "GLOBAL"; // sensitivity level of data view
    try {
      DataView result = client
              .dataView
              .createNewDataView(name, orgId)
              .columns(columns)
              .type(type)
              .entityType(entityType)
              .columnWidths(columnWidths)
              .date(date)
              .startDate(startDate)
              .endDate(endDate)
              .filter(filter)
              .sort(sort)
              .groupBy(groupBy)
              .shareAccess(shareAccess)
              .sensitive(sensitive)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getSlug());
      System.out.println(result.getColumns());
      System.out.println(result.getType());
      System.out.println(result.getEntityType());
      System.out.println(result.getColumnWidths());
      System.out.println(result.getDate());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getFilter());
      System.out.println(result.getSort());
      System.out.println(result.getGroupBy());
      System.out.println(result.getShareAccess());
      System.out.println(result.getSensitive());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#createNewDataView");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataView> response = client
              .dataView
              .createNewDataView(name, orgId)
              .columns(columns)
              .type(type)
              .entityType(entityType)
              .columnWidths(columnWidths)
              .date(date)
              .startDate(startDate)
              .endDate(endDate)
              .filter(filter)
              .sort(sort)
              .groupBy(groupBy)
              .shareAccess(shareAccess)
              .sensitive(sensitive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#createNewDataView");
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
| **createDataView** | [**CreateDataView**](CreateDataView.md)| Data view data to create | [optional] |

### Return type

[**DataView**](DataView.md)

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

<a name="deleteDataView"></a>
# **deleteDataView**
> deleteDataView(orgId, dataViewId).execute();

Delete a data  view



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataViewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String dataViewId = "dataViewId_example"; // Data view id
    try {
      client
              .dataView
              .deleteDataView(orgId, dataViewId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#deleteDataView");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dataView
              .deleteDataView(orgId, dataViewId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#deleteDataView");
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
| **dataViewId** | **String**| Data view id | |

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

<a name="getAllPaginated"></a>
# **getAllPaginated**
> ResultsDataView getAllPaginated(orgId).from(from).type(type).limit(limit).ids(ids).returnAccess(returnAccess).execute();

Return all data views in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataViewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String from = "from_example"; // Data view id to start paginating from
    String type = "ANY"; // Data view type to filter by
    Integer limit = 56; // Number of results to return
    String ids = "ids_example"; // Comma delimited of ids to return
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsDataView result = client
              .dataView
              .getAllPaginated(orgId)
              .from(from)
              .type(type)
              .limit(limit)
              .ids(ids)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#getAllPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsDataView> response = client
              .dataView
              .getAllPaginated(orgId)
              .from(from)
              .type(type)
              .limit(limit)
              .ids(ids)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#getAllPaginated");
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
| **from** | **String**| Data view id to start paginating from | [optional] |
| **type** | **String**| Data view type to filter by | [optional] [enum: ANY, DATA_SHEET, ORG_CHART, MAP] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **ids** | **String**| Comma delimited of ids to return | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ResultsDataView**](ResultsDataView.md)

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

<a name="getById"></a>
# **getById**
> DataView getById(orgId, dataViewId).execute();

Return a particular data view by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataViewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String dataViewId = "dataViewId_example"; // Data view id
    try {
      DataView result = client
              .dataView
              .getById(orgId, dataViewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getSlug());
      System.out.println(result.getColumns());
      System.out.println(result.getType());
      System.out.println(result.getEntityType());
      System.out.println(result.getColumnWidths());
      System.out.println(result.getDate());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getFilter());
      System.out.println(result.getSort());
      System.out.println(result.getGroupBy());
      System.out.println(result.getShareAccess());
      System.out.println(result.getSensitive());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataView> response = client
              .dataView
              .getById(orgId, dataViewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#getById");
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
| **dataViewId** | **String**| Data view id | |

### Return type

[**DataView**](DataView.md)

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

<a name="updateExistingView"></a>
# **updateExistingView**
> DataView updateExistingView(orgId, dataViewId).updateDataView(updateDataView).execute();

Update an existing data view



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataViewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String dataViewId = "dataViewId_example"; // Data view id
    String name = "name_example"; // data view name
    String columns = "columns_example"; // comma delimited list of columns
    String type = "ANY"; // type of data view
    String entityType = "entityType_example"; // entity type being viewed
    Map<String, Double> columnWidths = new HashMap(); // map of column names to widths in pixels
    String date = "date_example"; // date of view, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today
    String startDate = "startDate_example"; // start date of view, if displaying a date range, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today
    String endDate = "endDate_example"; // end date of view, if displaying a date range, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today
    String filter = "filter_example"; // filter query
    String sort = "sort_example"; // comma delimited list of columns by which to sort
    String groupBy = "groupBy_example"; // column to group duplicates by
    List<ShareAccess> shareAccess = Arrays.asList(); // users who are specifically granted permission to view or edit this data view
    String sensitive = "GLOBAL"; // sensitivity level of data view
    try {
      DataView result = client
              .dataView
              .updateExistingView(orgId, dataViewId)
              .name(name)
              .columns(columns)
              .type(type)
              .entityType(entityType)
              .columnWidths(columnWidths)
              .date(date)
              .startDate(startDate)
              .endDate(endDate)
              .filter(filter)
              .sort(sort)
              .groupBy(groupBy)
              .shareAccess(shareAccess)
              .sensitive(sensitive)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getSlug());
      System.out.println(result.getColumns());
      System.out.println(result.getType());
      System.out.println(result.getEntityType());
      System.out.println(result.getColumnWidths());
      System.out.println(result.getDate());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getFilter());
      System.out.println(result.getSort());
      System.out.println(result.getGroupBy());
      System.out.println(result.getShareAccess());
      System.out.println(result.getSensitive());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#updateExistingView");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataView> response = client
              .dataView
              .updateExistingView(orgId, dataViewId)
              .name(name)
              .columns(columns)
              .type(type)
              .entityType(entityType)
              .columnWidths(columnWidths)
              .date(date)
              .startDate(startDate)
              .endDate(endDate)
              .filter(filter)
              .sort(sort)
              .groupBy(groupBy)
              .shareAccess(shareAccess)
              .sensitive(sensitive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewApi#updateExistingView");
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
| **dataViewId** | **String**| Data view id | |
| **updateDataView** | [**UpdateDataView**](UpdateDataView.md)| Data view data to update | [optional] |

### Return type

[**DataView**](DataView.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

