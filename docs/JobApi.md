# JobApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewJob**](JobApi.md#createNewJob) | **POST** /v2/org/{orgId}/job | Create a job |
| [**findInOrganization**](JobApi.md#findInOrganization) | **GET** /v2/org/{orgId}/job/{jobId} | Return a particular job by id |
| [**findInOrganization_0**](JobApi.md#findInOrganization_0) | **GET** /v2/org/{orgId}/job | Find jobs in the organization |
| [**getOrganizationJobCount**](JobApi.md#getOrganizationJobCount) | **GET** /v2/org/{orgId}/job/count | Count jobs or people in the organization |
| [**getRegionJobsGraph**](JobApi.md#getRegionJobsGraph) | **GET** /v2/org/{orgId}/job/graph | Retrieve jobs from a region of the job graph |
| [**getSiblingsAndDirectsMap**](JobApi.md#getSiblingsAndDirectsMap) | **GET** /v2/org/{orgId}/job/graph-counts | Returns a map of jobId to their sibling and direct counts and the corresponding ids |
| [**listOccupiedPositionsByJobAndDate**](JobApi.md#listOccupiedPositionsByJobAndDate) | **GET** /v2/org/{orgId}/job/{jobId}/position | Get a list of positions occupied by a job on specific date |
| [**performBulkUpdate**](JobApi.md#performBulkUpdate) | **POST** /v2/org/{orgId}/job/bulkupdate | Perform a bulk update on a number of jobs |
| [**removeById**](JobApi.md#removeById) | **DELETE** /v2/org/{orgId}/job/{jobId} | Delete a job |
| [**updateJobDetails**](JobApi.md#updateJobDetails) | **PATCH** /v2/org/{orgId}/job/{jobId} | Update a job |


<a name="createNewJob"></a>
# **createNewJob**
> Object createNewJob(orgId).scenarioId(scenarioId).date(date).requestBody(requestBody).execute();

Create a job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id to create the job in
    LocalDate date = LocalDate.now(); // Effective date of job creation
    try {
      Object result = client
              .job
              .createNewJob(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#createNewJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .job
              .createNewJob(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#createNewJob");
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
| **scenarioId** | **String**| Scenario id to create the job in | [optional] |
| **date** | **LocalDate**| Effective date of job creation | [optional] |
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

<a name="findInOrganization"></a>
# **findInOrganization**
> Object findInOrganization(orgId, jobId).scenarioId(scenarioId).date(date).fields(fields).format(format).execute();

Return a particular job by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      Object result = client
              .job
              .findInOrganization(orgId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .fields(fields)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#findInOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .job
              .findInOrganization(orgId, jobId)
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
      System.err.println("Exception when calling JobApi#findInOrganization");
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
| **jobId** | **String**| Job id | |
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

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
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="findInOrganization_0"></a>
# **findInOrganization_0**
> ResultsData findInOrganization_0(orgId).scenarioId(scenarioId).compReviewId(compReviewId).approvalChainId(approvalChainId).date(date).q(q).from(from).limit(limit).fields(fields).fieldsList(fieldsList).format(format).useScenarioChanges(useScenarioChanges).returnAccess(returnAccess).execute();

Find jobs in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
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
    String compReviewId = "compReviewId_example"; // Comp review id to query
    String approvalChainId = "approvalChainId_example"; // Approval chain id to query; only relevant when there is a comp review id
    LocalDate date = LocalDate.now(); // Date to search as of
    String q = "q_example"; // Search query
    String from = "from_example"; // Job id to start paginating from
    Integer limit = 56; // Number of results to return
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    List<String> fieldsList = Arrays.asList(); // Fields to retrieve, list syntax
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    Boolean useScenarioChanges = true; // Find jobs only based on the changes that are in the scenario. This option also allows you to reference the change within the filter, which is otherwise not allowed
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsData result = client
              .job
              .findInOrganization_0(orgId)
              .scenarioId(scenarioId)
              .compReviewId(compReviewId)
              .approvalChainId(approvalChainId)
              .date(date)
              .q(q)
              .from(from)
              .limit(limit)
              .fields(fields)
              .fieldsList(fieldsList)
              .format(format)
              .useScenarioChanges(useScenarioChanges)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#findInOrganization_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .job
              .findInOrganization_0(orgId)
              .scenarioId(scenarioId)
              .compReviewId(compReviewId)
              .approvalChainId(approvalChainId)
              .date(date)
              .q(q)
              .from(from)
              .limit(limit)
              .fields(fields)
              .fieldsList(fieldsList)
              .format(format)
              .useScenarioChanges(useScenarioChanges)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#findInOrganization_0");
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
| **compReviewId** | **String**| Comp review id to query | [optional] |
| **approvalChainId** | **String**| Approval chain id to query; only relevant when there is a comp review id | [optional] |
| **date** | **LocalDate**| Date to search as of | [optional] |
| **q** | **String**| Search query | [optional] |
| **from** | **String**| Job id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **fieldsList** | [**List&lt;String&gt;**](String.md)| Fields to retrieve, list syntax | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **useScenarioChanges** | **Boolean**| Find jobs only based on the changes that are in the scenario. This option also allows you to reference the change within the filter, which is otherwise not allowed | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

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

<a name="getOrganizationJobCount"></a>
# **getOrganizationJobCount**
> OrgCount getOrganizationJobCount(orgId).scenarioId(scenarioId).date(date).q(q).execute();

Count jobs or people in the organization



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
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
    LocalDate date = LocalDate.now(); // Date to search as of
    String q = "q_example"; // Search query
    try {
      OrgCount result = client
              .job
              .getOrganizationJobCount(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobCount());
      System.out.println(result.getPersonCount());
      System.out.println(result.getStartingCount());
      System.out.println(result.getDepartingCount());
      System.out.println(result.getGroupCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#getOrganizationJobCount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgCount> response = client
              .job
              .getOrganizationJobCount(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#getOrganizationJobCount");
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
| **date** | **LocalDate**| Date to search as of | [optional] |
| **q** | **String**| Search query | [optional] |

### Return type

[**OrgCount**](OrgCount.md)

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

<a name="getRegionJobsGraph"></a>
# **getRegionJobsGraph**
> ResultsData getRegionJobsGraph(orgId).start(start).depth(depth).approxLimit(approxLimit).scenarioId(scenarioId).q(q).date(date).fields(fields).format(format).returnAccess(returnAccess).execute();

Retrieve jobs from a region of the job graph



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String start = "start_example"; // Job id to use as the starting point for the search
    Integer depth = 56; // Number of levels down to search
    Integer approxLimit = 56; // Number of results to return, approximately
    String scenarioId = "scenarioId_example"; // Scenario id to query
    String q = "q_example"; // Query string to filter by
    LocalDate date = LocalDate.now(); // Date to search as of
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsData result = client
              .job
              .getRegionJobsGraph(orgId)
              .start(start)
              .depth(depth)
              .approxLimit(approxLimit)
              .scenarioId(scenarioId)
              .q(q)
              .date(date)
              .fields(fields)
              .format(format)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#getRegionJobsGraph");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .job
              .getRegionJobsGraph(orgId)
              .start(start)
              .depth(depth)
              .approxLimit(approxLimit)
              .scenarioId(scenarioId)
              .q(q)
              .date(date)
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
      System.err.println("Exception when calling JobApi#getRegionJobsGraph");
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
| **start** | **String**| Job id to use as the starting point for the search | [optional] |
| **depth** | **Integer**| Number of levels down to search | [optional] |
| **approxLimit** | **Integer**| Number of results to return, approximately | [optional] |
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **q** | **String**| Query string to filter by | [optional] |
| **date** | **LocalDate**| Date to search as of | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

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
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getSiblingsAndDirectsMap"></a>
# **getSiblingsAndDirectsMap**
> GraphCountsResponse getSiblingsAndDirectsMap(orgId).scenarioId(scenarioId).date(date).q(q).execute();

Returns a map of jobId to their sibling and direct counts and the corresponding ids



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
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
    LocalDate date = LocalDate.now(); // Date to search as of
    String q = "q_example"; // Query string to filter by
    try {
      GraphCountsResponse result = client
              .job
              .getSiblingsAndDirectsMap(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getCounts());
      System.out.println(result.getManagerToJobMap());
      System.out.println(result.getJobToManagerMap());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#getSiblingsAndDirectsMap");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GraphCountsResponse> response = client
              .job
              .getSiblingsAndDirectsMap(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#getSiblingsAndDirectsMap");
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
| **date** | **LocalDate**| Date to search as of | [optional] |
| **q** | **String**| Query string to filter by | [optional] |

### Return type

[**GraphCountsResponse**](GraphCountsResponse.md)

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

<a name="listOccupiedPositionsByJobAndDate"></a>
# **listOccupiedPositionsByJobAndDate**
> ResultsData listOccupiedPositionsByJobAndDate(orgId, jobId).scenarioId(scenarioId).date(date).from(from).limit(limit).positionFields(positionFields).format(format).execute();

Get a list of positions occupied by a job on specific date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to update the job in
    LocalDate date = LocalDate.now(); // Effective date of un-assignment
    String from = "from_example"; // Position id to start paginating from
    Integer limit = 56; // Number of results to return
    String positionFields = "positionFields_example"; // Position fields to retrieve, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      ResultsData result = client
              .job
              .listOccupiedPositionsByJobAndDate(orgId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .from(from)
              .limit(limit)
              .positionFields(positionFields)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#listOccupiedPositionsByJobAndDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .job
              .listOccupiedPositionsByJobAndDate(orgId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .from(from)
              .limit(limit)
              .positionFields(positionFields)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#listOccupiedPositionsByJobAndDate");
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
| **jobId** | **String**| Job id | |
| **scenarioId** | **String**| Scenario id to update the job in | [optional] |
| **date** | **LocalDate**| Effective date of un-assignment | [optional] |
| **from** | **String**| Position id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **positionFields** | **String**| Position fields to retrieve, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

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

<a name="performBulkUpdate"></a>
# **performBulkUpdate**
> Process performBulkUpdate(orgId).bulkJobUpdateRequest(bulkJobUpdateRequest).execute();

Perform a bulk update on a number of jobs



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    List<UpdateOperation> updates = Arrays.asList(); // list of update operations to perform
    LocalDate date = LocalDate.now(); // date of update
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // scenario id
    String note = "note_example"; // note for update
    try {
      Process result = client
              .job
              .performBulkUpdate(updates, date, orgId)
              .scenarioId(scenarioId)
              .note(note)
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
      System.err.println("Exception when calling JobApi#performBulkUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .job
              .performBulkUpdate(updates, date, orgId)
              .scenarioId(scenarioId)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#performBulkUpdate");
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
| **bulkJobUpdateRequest** | [**BulkJobUpdateRequest**](BulkJobUpdateRequest.md)| Bulk update data | [optional] |

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
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(orgId, jobId).scenarioId(scenarioId).date(date).execute();

Delete a job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to update the job in
    LocalDate date = LocalDate.now(); // Effective date of job update
    try {
      client
              .job
              .removeById(orgId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .job
              .removeById(orgId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#removeById");
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
| **jobId** | **String**| Job id | |
| **scenarioId** | **String**| Scenario id to update the job in | [optional] |
| **date** | **LocalDate**| Effective date of job update | [optional] |

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

<a name="updateJobDetails"></a>
# **updateJobDetails**
> updateJobDetails(orgId, jobId).scenarioId(scenarioId).date(date).requestBody(requestBody).execute();

Update a job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to update the job in
    LocalDate date = LocalDate.now(); // Effective date of job update
    try {
      client
              .job
              .updateJobDetails(orgId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#updateJobDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .job
              .updateJobDetails(orgId, jobId)
              .scenarioId(scenarioId)
              .date(date)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#updateJobDetails");
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
| **jobId** | **String**| Job id | |
| **scenarioId** | **String**| Scenario id to update the job in | [optional] |
| **date** | **LocalDate**| Effective date of job update | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

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

