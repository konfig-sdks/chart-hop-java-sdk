# ReportChartApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloneChart**](ReportChartApi.md#cloneChart) | **POST** /v1/org/{orgId}/report/{reportId}/chart/{chartId}/clone | Clone a chart in a report |
| [**createNewChart**](ReportChartApi.md#createNewChart) | **POST** /v1/org/{orgId}/report/{reportId}/chart | Create a new chart in a report |
| [**exportData**](ReportChartApi.md#exportData) | **GET** /v1/org/{orgId}/report/{reportId}/chart/{chartId}/data | Export a particular chart&#39;s data |
| [**getAll**](ReportChartApi.md#getAll) | **GET** /v1/org/{orgId}/report/{reportId}/chart | Return all of the charts for a particular report |
| [**getByChartId**](ReportChartApi.md#getByChartId) | **GET** /v1/org/{orgId}/report/chart/{chartId} | Return a particular report chart by id |
| [**queryUnderlyingDataInChart**](ReportChartApi.md#queryUnderlyingDataInChart) | **GET** /v1/org/{orgId}/report/{reportId}/chart/{chartId}/query | Query for the underlying data in a chart |
| [**removeById**](ReportChartApi.md#removeById) | **DELETE** /v1/org/{orgId}/report/chart/{chartId} | Delete a chart from a report |
| [**updateExistingChartData**](ReportChartApi.md#updateExistingChartData) | **PATCH** /v1/org/{orgId}/report/chart/{chartId} | Update an existing report chart |


<a name="cloneChart"></a>
# **cloneChart**
> ReportChart cloneChart(orgId, reportId, chartId).chartLabel(chartLabel).execute();

Clone a chart in a report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportChartApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String reportId = "reportId_example"; // Report id
    String chartId = "chartId_example"; // Chart id
    String chartLabel = "chartLabel_example"; // New label
    try {
      ReportChart result = client
              .reportChart
              .cloneChart(orgId, reportId, chartId)
              .chartLabel(chartLabel)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getReportId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getFilter());
      System.out.println(result.getFilterOverride());
      System.out.println(result.getQuery());
      System.out.println(result.getSort());
      System.out.println(result.getIsAdvancedQueryMode());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#cloneChart");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportChart> response = client
              .reportChart
              .cloneChart(orgId, reportId, chartId)
              .chartLabel(chartLabel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#cloneChart");
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
| **reportId** | **String**| Report id | |
| **chartId** | **String**| Chart id | |
| **chartLabel** | **String**| New label | [optional] |

### Return type

[**ReportChart**](ReportChart.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | org not found |  -  |

<a name="createNewChart"></a>
# **createNewChart**
> ReportChart createNewChart(orgId, reportId).createReportChart(createReportChart).execute();

Create a new chart in a report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportChartApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // chart label
    String type = "LINE"; // chart type
    ReportQuery query = new ReportQuery();
    Integer sort = 56; // sort order
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String reportId = "reportId_example"; // Report id
    String filter = "filter_example"; // filter that applies to this chart
    Boolean filterOverride = true; // whether the chart filter overrides the global filter
    Boolean isAdvancedQueryMode = true; // whether the chart configuration is using advanced mode
    try {
      ReportChart result = client
              .reportChart
              .createNewChart(label, type, query, sort, orgId, reportId)
              .filter(filter)
              .filterOverride(filterOverride)
              .isAdvancedQueryMode(isAdvancedQueryMode)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getReportId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getFilter());
      System.out.println(result.getFilterOverride());
      System.out.println(result.getQuery());
      System.out.println(result.getSort());
      System.out.println(result.getIsAdvancedQueryMode());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#createNewChart");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportChart> response = client
              .reportChart
              .createNewChart(label, type, query, sort, orgId, reportId)
              .filter(filter)
              .filterOverride(filterOverride)
              .isAdvancedQueryMode(isAdvancedQueryMode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#createNewChart");
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
| **reportId** | **String**| Report id | |
| **createReportChart** | [**CreateReportChart**](CreateReportChart.md)| Report chart data to create | [optional] |

### Return type

[**ReportChart**](ReportChart.md)

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

<a name="exportData"></a>
# **exportData**
> exportData(orgId, reportId, chartId).startDate(startDate).endDate(endDate).interval(interval).scenarioId(scenarioId).projectHires(projectHires).format(format).execute();

Export a particular chart&#39;s data



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportChartApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String reportId = "reportId_example"; // Report id
    String chartId = "chartId_example"; // Chart id
    String startDate = "startDate_example"; // Start date, inclusive
    String endDate = "endDate_example"; // End date, exclusive
    String interval = "DAY"; // Interval
    String scenarioId = "scenarioId_example"; // Scenario id
    Boolean projectHires = true; // Project future hires
    String format = "format_example"; // Data format to use; default is json, can also use html
    try {
      client
              .reportChart
              .exportData(orgId, reportId, chartId)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .scenarioId(scenarioId)
              .projectHires(projectHires)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#exportData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reportChart
              .exportData(orgId, reportId, chartId)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .scenarioId(scenarioId)
              .projectHires(projectHires)
              .format(format)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#exportData");
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
| **reportId** | **String**| Report id | |
| **chartId** | **String**| Chart id | |
| **startDate** | **String**| Start date, inclusive | [optional] |
| **endDate** | **String**| End date, exclusive | [optional] |
| **interval** | **String**| Interval | [optional] [enum: DAY, WEEK, MONTH, QUARTER, FISCAL_QUARTER, YEAR, FISCAL_YEAR] |
| **scenarioId** | **String**| Scenario id | [optional] |
| **projectHires** | **Boolean**| Project future hires | [optional] |
| **format** | **String**| Data format to use; default is json, can also use html | [optional] |

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

<a name="getAll"></a>
# **getAll**
> ResultsReportChart getAll(orgId, reportId).execute();

Return all of the charts for a particular report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportChartApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String reportId = "reportId_example"; // Report id
    try {
      ResultsReportChart result = client
              .reportChart
              .getAll(orgId, reportId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsReportChart> response = client
              .reportChart
              .getAll(orgId, reportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#getAll");
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
| **reportId** | **String**| Report id | |

### Return type

[**ResultsReportChart**](ResultsReportChart.md)

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

<a name="getByChartId"></a>
# **getByChartId**
> ReportChart getByChartId(orgId, chartId).execute();

Return a particular report chart by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportChartApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String chartId = "chartId_example"; // Chart id
    try {
      ReportChart result = client
              .reportChart
              .getByChartId(orgId, chartId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getReportId());
      System.out.println(result.getLabel());
      System.out.println(result.getType());
      System.out.println(result.getFilter());
      System.out.println(result.getFilterOverride());
      System.out.println(result.getQuery());
      System.out.println(result.getSort());
      System.out.println(result.getIsAdvancedQueryMode());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#getByChartId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportChart> response = client
              .reportChart
              .getByChartId(orgId, chartId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#getByChartId");
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
| **chartId** | **String**| Chart id | |

### Return type

[**ReportChart**](ReportChart.md)

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

<a name="queryUnderlyingDataInChart"></a>
# **queryUnderlyingDataInChart**
> ReportMetricsReturnType queryUnderlyingDataInChart(orgId, reportId, chartId).providedQuery(providedQuery).startDate(startDate).endDate(endDate).interval(interval).scenarioId(scenarioId).projectHires(projectHires).changeGroupingType(changeGroupingType).changeGroupingId(changeGroupingId).execute();

Query for the underlying data in a chart



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportChartApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String reportId = "reportId_example"; // Report id
    String chartId = "chartId_example"; // Chart id
    String providedQuery = "providedQuery_example"; // Query to run
    String startDate = "startDate_example"; // Start date, inclusive
    String endDate = "endDate_example"; // End date, exclusive
    String interval = "DAY"; // Interval
    String scenarioId = "scenarioId_example"; // Scenario id
    Boolean projectHires = true; // Project future hires
    String changeGroupingType = "PRIMARY"; // Type of change grouping
    String changeGroupingId = "changeGroupingId_example"; // Change grouping id to query (null for primary)
    try {
      ReportMetricsReturnType result = client
              .reportChart
              .queryUnderlyingDataInChart(orgId, reportId, chartId)
              .providedQuery(providedQuery)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .scenarioId(scenarioId)
              .projectHires(projectHires)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getMetricCollection());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#queryUnderlyingDataInChart");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportMetricsReturnType> response = client
              .reportChart
              .queryUnderlyingDataInChart(orgId, reportId, chartId)
              .providedQuery(providedQuery)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .scenarioId(scenarioId)
              .projectHires(projectHires)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#queryUnderlyingDataInChart");
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
| **reportId** | **String**| Report id | |
| **chartId** | **String**| Chart id | |
| **providedQuery** | **String**| Query to run | [optional] |
| **startDate** | **String**| Start date, inclusive | [optional] |
| **endDate** | **String**| End date, exclusive | [optional] |
| **interval** | **String**| Interval | [optional] [enum: DAY, WEEK, MONTH, QUARTER, FISCAL_QUARTER, YEAR, FISCAL_YEAR] |
| **scenarioId** | **String**| Scenario id | [optional] |
| **projectHires** | **Boolean**| Project future hires | [optional] |
| **changeGroupingType** | **String**| Type of change grouping | [optional] [enum: PRIMARY, SCENARIO, COMP_REVIEW] |
| **changeGroupingId** | **String**| Change grouping id to query (null for primary) | [optional] |

### Return type

[**ReportMetricsReturnType**](ReportMetricsReturnType.md)

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
> removeById(orgId, chartId).execute();

Delete a chart from a report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportChartApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String chartId = "chartId_example"; // Chart id
    try {
      client
              .reportChart
              .removeById(orgId, chartId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reportChart
              .removeById(orgId, chartId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#removeById");
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
| **chartId** | **String**| Chart id | |

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

<a name="updateExistingChartData"></a>
# **updateExistingChartData**
> updateExistingChartData(orgId, chartId).updateReportChart(updateReportChart).execute();

Update an existing report chart



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportChartApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String chartId = "chartId_example"; // Chart id
    String label = "label_example"; // chart label
    String type = "LINE"; // chart type
    String filter = "filter_example"; // filter that applies to this chart
    Boolean filterOverride = true; // whether the chart filter overrides the global filter
    ReportQuery query = new ReportQuery();
    Integer sort = 56; // sort order
    Boolean isAdvancedQueryMode = true; // whether the chart configuration is using advanced mode
    try {
      client
              .reportChart
              .updateExistingChartData(orgId, chartId)
              .label(label)
              .type(type)
              .filter(filter)
              .filterOverride(filterOverride)
              .query(query)
              .sort(sort)
              .isAdvancedQueryMode(isAdvancedQueryMode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#updateExistingChartData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reportChart
              .updateExistingChartData(orgId, chartId)
              .label(label)
              .type(type)
              .filter(filter)
              .filterOverride(filterOverride)
              .query(query)
              .sort(sort)
              .isAdvancedQueryMode(isAdvancedQueryMode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportChartApi#updateExistingChartData");
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
| **chartId** | **String**| Chart id | |
| **updateReportChart** | [**UpdateReportChart**](UpdateReportChart.md)| Chart data to update | [optional] |

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

