# ReportApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkDelete**](ReportApi.md#bulkDelete) | **POST** /v1/org/{orgId}/report/bulk-delete | Delete a set of reports |
| [**createExactCopy**](ReportApi.md#createExactCopy) | **POST** /v1/org/{orgId}/report/{reportId}/clone | Create an exact copy of an existing report |
| [**createNewReport**](ReportApi.md#createNewReport) | **POST** /v1/org/{orgId}/report | Create a report |
| [**duplicateReports**](ReportApi.md#duplicateReports) | **POST** /v1/org/{orgId}/report/bulk-duplicate | Duplicate a set of reports |
| [**exportChartCsv**](ReportApi.md#exportChartCsv) | **POST** /v1/org/{orgId}/report/{reportId}/chart/{chartId}/export/csv | Export a particular chart in a report |
| [**findReportById**](ReportApi.md#findReportById) | **GET** /v1/org/{orgId}/report/{reportId} | Return a particular report by id |
| [**getAllPaginated**](ReportApi.md#getAllPaginated) | **GET** /v1/org/{orgId}/report | Return all reports in the organization paginated |
| [**getAllReportCharts**](ReportApi.md#getAllReportCharts) | **GET** /v1/org/{orgId}/report/{reportId}/query | Query all the charts in a report |
| [**getCountOfReportsInOrganization**](ReportApi.md#getCountOfReportsInOrganization) | **GET** /v1/org/{orgId}/report/count | Return count of reports in an organization |
| [**removeById**](ReportApi.md#removeById) | **DELETE** /v1/org/{orgId}/report/{reportId} | Delete a report |
| [**timeseriesDataArbitraryQueries**](ReportApi.md#timeseriesDataArbitraryQueries) | **POST** /v1/org/{orgId}/report/query | Return timeseries data from arbitrary queries |
| [**updateExistingReport**](ReportApi.md#updateExistingReport) | **PATCH** /v1/org/{orgId}/report/{reportId} | Update an existing report |


<a name="bulkDelete"></a>
# **bulkDelete**
> Process bulkDelete(orgId).requestBody(requestBody).execute();

Delete a set of reports



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      Process result = client
              .report
              .bulkDelete(orgId)
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
      System.err.println("Exception when calling ReportApi#bulkDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .report
              .bulkDelete(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#bulkDelete");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of report ids to delete | [optional] |

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
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="createExactCopy"></a>
# **createExactCopy**
> Report createExactCopy(orgId, reportId).execute();

Create an exact copy of an existing report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
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
      Report result = client
              .report
              .createExactCopy(orgId, reportId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getFilter());
      System.out.println(result.getShare());
      System.out.println(result.getSensitive());
      System.out.println(result.getShareAccess());
      System.out.println(result.getChartIds());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#createExactCopy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Report> response = client
              .report
              .createExactCopy(orgId, reportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#createExactCopy");
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

[**Report**](Report.md)

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

<a name="createNewReport"></a>
# **createNewReport**
> Report createNewReport(orgId).createReport(createReport).execute();

Create a report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // report label
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String description = "description_example"; // report description
    String filter = "filter_example"; // filter automatically applied to every chart in this report
    String share = "NORMAL"; // sharing settings of report
    String sensitive = "GLOBAL"; // sensitivity level of report
    List<ShareAccess> shareAccess = Arrays.asList(); // users who are specifically granted permission to view or edit this report
    List<String> chartIds = Arrays.asList(); // list of charts in this report
    try {
      Report result = client
              .report
              .createNewReport(label, orgId)
              .description(description)
              .filter(filter)
              .share(share)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .chartIds(chartIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getFilter());
      System.out.println(result.getShare());
      System.out.println(result.getSensitive());
      System.out.println(result.getShareAccess());
      System.out.println(result.getChartIds());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#createNewReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Report> response = client
              .report
              .createNewReport(label, orgId)
              .description(description)
              .filter(filter)
              .share(share)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .chartIds(chartIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#createNewReport");
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
| **createReport** | [**CreateReport**](CreateReport.md)| Report data to create | [optional] |

### Return type

[**Report**](Report.md)

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

<a name="duplicateReports"></a>
# **duplicateReports**
> Process duplicateReports(orgId).requestBody(requestBody).execute();

Duplicate a set of reports



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      Process result = client
              .report
              .duplicateReports(orgId)
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
      System.err.println("Exception when calling ReportApi#duplicateReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .report
              .duplicateReports(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#duplicateReports");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of report ids to duplicate | [optional] |

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
| **200** | successful operation |  -  |
| **400** | invalid data |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="exportChartCsv"></a>
# **exportChartCsv**
> Process exportChartCsv(orgId, reportId, chartId).startDate(startDate).endDate(endDate).interval(interval).scenarioId(scenarioId).projectHires(projectHires).filter(filter).changeGroupingType(changeGroupingType).changeGroupingId(changeGroupingId).execute();

Export a particular chart in a report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
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
    String filter = "filter_example"; // Additional filter to apply
    String changeGroupingType = "PRIMARY"; // Type of change grouping
    String changeGroupingId = "changeGroupingId_example"; // Change grouping id to query (null for primary)
    try {
      Process result = client
              .report
              .exportChartCsv(orgId, reportId, chartId)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .scenarioId(scenarioId)
              .projectHires(projectHires)
              .filter(filter)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
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
      System.err.println("Exception when calling ReportApi#exportChartCsv");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .report
              .exportChartCsv(orgId, reportId, chartId)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .scenarioId(scenarioId)
              .projectHires(projectHires)
              .filter(filter)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#exportChartCsv");
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
| **filter** | **String**| Additional filter to apply | [optional] |
| **changeGroupingType** | **String**| Type of change grouping | [optional] [enum: PRIMARY, SCENARIO, COMP_REVIEW] |
| **changeGroupingId** | **String**| Change grouping id to query (null for primary) | [optional] |

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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="findReportById"></a>
# **findReportById**
> Report findReportById(orgId, reportId).execute();

Return a particular report by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
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
      Report result = client
              .report
              .findReportById(orgId, reportId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getFilter());
      System.out.println(result.getShare());
      System.out.println(result.getSensitive());
      System.out.println(result.getShareAccess());
      System.out.println(result.getChartIds());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#findReportById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Report> response = client
              .report
              .findReportById(orgId, reportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#findReportById");
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

[**Report**](Report.md)

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

<a name="getAllPaginated"></a>
# **getAllPaginated**
> ReportDataStreamResults getAllPaginated(orgId).fromId(fromId).limit(limit).sort(sort).filter(filter).fields(fields).format(format).returnAccess(returnAccess).execute();

Return all reports in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fromId = "fromId_example"; // Offset
    Integer limit = 56; // Limit
    String sort = "sort_example"; // Sort
    String filter = "filter_example"; // Filter
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ReportDataStreamResults result = client
              .report
              .getAllPaginated(orgId)
              .fromId(fromId)
              .limit(limit)
              .sort(sort)
              .filter(filter)
              .fields(fields)
              .format(format)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getAllPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportDataStreamResults> response = client
              .report
              .getAllPaginated(orgId)
              .fromId(fromId)
              .limit(limit)
              .sort(sort)
              .filter(filter)
              .fields(fields)
              .format(format)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getAllPaginated");
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
| **fromId** | **String**| Offset | [optional] |
| **limit** | **Integer**| Limit | [optional] |
| **sort** | **String**| Sort | [optional] |
| **filter** | **String**| Filter | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ReportDataStreamResults**](ReportDataStreamResults.md)

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

<a name="getAllReportCharts"></a>
# **getAllReportCharts**
> List&lt;ReportResult&gt; getAllReportCharts(orgId, reportId).startDate(startDate).endDate(endDate).interval(interval).scenarioId(scenarioId).projectHires(projectHires).filter(filter).changeGroupingType(changeGroupingType).changeGroupingId(changeGroupingId).execute();

Query all the charts in a report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
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
    String startDate = "startDate_example"; // Start date, inclusive
    String endDate = "endDate_example"; // End date, exclusive
    String interval = "DAY"; // Interval
    String scenarioId = "scenarioId_example"; // Scenario id
    Boolean projectHires = true; // Project future hires
    String filter = "filter_example"; // Filter to apply to all results
    String changeGroupingType = "PRIMARY"; // Type of change grouping
    String changeGroupingId = "changeGroupingId_example"; // Change grouping id to query (null for primary)
    try {
      List<ReportResult> result = client
              .report
              .getAllReportCharts(orgId, reportId)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .scenarioId(scenarioId)
              .projectHires(projectHires)
              .filter(filter)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getAllReportCharts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ReportResult>> response = client
              .report
              .getAllReportCharts(orgId, reportId)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .scenarioId(scenarioId)
              .projectHires(projectHires)
              .filter(filter)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getAllReportCharts");
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
| **startDate** | **String**| Start date, inclusive | [optional] |
| **endDate** | **String**| End date, exclusive | [optional] |
| **interval** | **String**| Interval | [optional] [enum: DAY, WEEK, MONTH, QUARTER, FISCAL_QUARTER, YEAR, FISCAL_YEAR] |
| **scenarioId** | **String**| Scenario id | [optional] |
| **projectHires** | **Boolean**| Project future hires | [optional] |
| **filter** | **String**| Filter to apply to all results | [optional] |
| **changeGroupingType** | **String**| Type of change grouping | [optional] [enum: PRIMARY, SCENARIO, COMP_REVIEW] |
| **changeGroupingId** | **String**| Change grouping id to query (null for primary) | [optional] |

### Return type

[**List&lt;ReportResult&gt;**](ReportResult.md)

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

<a name="getCountOfReportsInOrganization"></a>
# **getCountOfReportsInOrganization**
> ReportCount getCountOfReportsInOrganization(orgId).execute();

Return count of reports in an organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      ReportCount result = client
              .report
              .getCountOfReportsInOrganization(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getCountOfReportsInOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportCount> response = client
              .report
              .getCountOfReportsInOrganization(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getCountOfReportsInOrganization");
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

### Return type

[**ReportCount**](ReportCount.md)

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
> removeById(orgId, reportId).execute();

Delete a report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
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
      client
              .report
              .removeById(orgId, reportId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .report
              .removeById(orgId, reportId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#removeById");
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

<a name="timeseriesDataArbitraryQueries"></a>
# **timeseriesDataArbitraryQueries**
> List&lt;ReportResult&gt; timeseriesDataArbitraryQueries(orgId).reportQuery(reportQuery).execute();

Return timeseries data from arbitrary queries



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Object options = null; // options, including format, scenarioId, projectHires
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    List<ReportSeriesQuery> series = Arrays.asList(); // series to evaluate
    List<ReportFilter> filters = Arrays.asList(); // filters to crosstab all results by (deprecated in reports V2, should use groupBy instead)
    String content = "content_example"; // content block to evaluate as a Carrot Template, as an alternative to using series
    String startDate = "startDate_example"; // start date, in either relative (-7d) or exact (YYYY-MM-DD) format
    String endDate = "endDate_example"; // end date, in either relative (-7d) or exact (YYYY-MM-DD) format; if not present, defaults to today
    String interval = "DAY"; // interval, if the query is a timeseries; if no interval, query is crosstabbed
    List<LocalDate> intervalDates = Arrays.asList(); // interval dates, if a specific set of irregular dates are being queried in a timeseries
    try {
      List<ReportResult> result = client
              .report
              .timeseriesDataArbitraryQueries(options, orgId)
              .series(series)
              .filters(filters)
              .content(content)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .intervalDates(intervalDates)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#timeseriesDataArbitraryQueries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ReportResult>> response = client
              .report
              .timeseriesDataArbitraryQueries(options, orgId)
              .series(series)
              .filters(filters)
              .content(content)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .intervalDates(intervalDates)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#timeseriesDataArbitraryQueries");
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
| **reportQuery** | [**ReportQuery**](ReportQuery.md)|  | [optional] |

### Return type

[**List&lt;ReportResult&gt;**](ReportResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="updateExistingReport"></a>
# **updateExistingReport**
> updateExistingReport(orgId, reportId).referencedReportUrl(referencedReportUrl).updateReport(updateReport).execute();

Update an existing report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportApi;
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
    String description = "description_example"; // report description
    String label = "label_example"; // report label
    String filter = "filter_example"; // filter automatically applied to every chart in this report
    String share = "NORMAL"; // sharing settings of report
    String sensitive = "GLOBAL"; // sensitivity level of report
    List<ShareAccess> shareAccess = Arrays.asList(); // users who are specifically granted permission to view or edit this report
    List<String> chartIds = Arrays.asList(); // list of charts in this report
    String referencedReportUrl = "referencedReportUrl_example"; // Displayed report url
    try {
      client
              .report
              .updateExistingReport(orgId, reportId)
              .description(description)
              .label(label)
              .filter(filter)
              .share(share)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .chartIds(chartIds)
              .referencedReportUrl(referencedReportUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#updateExistingReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .report
              .updateExistingReport(orgId, reportId)
              .description(description)
              .label(label)
              .filter(filter)
              .share(share)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .chartIds(chartIds)
              .referencedReportUrl(referencedReportUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#updateExistingReport");
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
| **referencedReportUrl** | **String**| Displayed report url | [optional] |
| **updateReport** | [**UpdateReport**](UpdateReport.md)| Report data to update | [optional] |

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

