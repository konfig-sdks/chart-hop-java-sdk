# ChangeApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**amendScenarioChange**](ChangeApi.md#amendScenarioChange) | **PATCH** /v1/org/{orgId}/scenario/{scenarioId}/change/{changeId} | Amend a change within a scenario, and potentially return the updated data |
| [**approveOrReject**](ChangeApi.md#approveOrReject) | **POST** /v1/org/{orgId}/change/{changeId}/approve | Approve or reject a change |
| [**bulkUpdateJobs**](ChangeApi.md#bulkUpdateJobs) | **POST** /v1/org/{orgId}/change/bulkupdate | Perform a bulk update on a number of jobs |
| [**checkApproverEligibility**](ChangeApi.md#checkApproverEligibility) | **GET** /v1/org/{orgId}/change/{changeId}/approver | Given a of change id, see if the person can approve/reject |
| [**createDepartRehirePair**](ChangeApi.md#createDepartRehirePair) | **POST** /v1/org/{orgId}/change/depart-rehire | Create a depart-rehire pair of changes, for filling in historical data |
| [**createIfNotExists**](ChangeApi.md#createIfNotExists) | **POST** /v1/org/{orgId}/change/sync/{type} | Sync a change (create the change only if it does not already exist) |
| [**createNewChange**](ChangeApi.md#createNewChange) | **POST** /v1/org/{orgId}/change/{type} | Create a new change |
| [**deletePreviousChange**](ChangeApi.md#deletePreviousChange) | **DELETE** /v1/org/{orgId}/change/{changeId} | Delete a previous change |
| [**findScenarioChanges**](ChangeApi.md#findScenarioChanges) | **GET** /v1/org/{orgId}/change/scenario/{scenarioId} | Return all changes for a particular scenario, with before job |
| [**getById**](ChangeApi.md#getById) | **GET** /v1/org/{orgId}/change/{changeId} | Return a particular change by id |
| [**getById_0**](ChangeApi.md#getById_0) | **GET** /v2/org/{orgId}/change/{changeId} | Return a particular change by id |
| [**getRecentChanges**](ChangeApi.md#getRecentChanges) | **GET** /v1/org/{orgId}/change | Return recent changes across an org, or for a particular person or job |
| [**getRecentChangesForOrgOrPerson**](ChangeApi.md#getRecentChangesForOrgOrPerson) | **GET** /v2/org/{orgId}/change | Return recent changes across an org, or for a particular person or job |
| [**getStatus**](ChangeApi.md#getStatus) | **GET** /v1/org/{orgId}/scenario/{scenarioId}/change/{changeId}/status/{processId} | Get the status of a running change within a scenario |
| [**performBulkChange**](ChangeApi.md#performBulkChange) | **POST** /v1/org/{orgId}/change/bulkchange | Perform a series of changes at once |
| [**updateChangeById**](ChangeApi.md#updateChangeById) | **PATCH** /v1/org/{orgId}/change/{changeId} | Make a change to a change |
| [**validateChangeOperation**](ChangeApi.md#validateChangeOperation) | **POST** /v1/org/{orgId}/change/{type}/validate | Validate a change |


<a name="amendScenarioChange"></a>
# **amendScenarioChange**
> UpdateScenarioChangeResponse amendScenarioChange(orgId, scenarioId, changeId).fields(fields).includeUpdatedFields(includeUpdatedFields).format(format).requestBody(requestBody).execute();

Amend a change within a scenario, and potentially return the updated data



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    String changeId = "changeId_example"; // Change id
    String fields = "fields_example"; // Fields to retrieve
    Boolean includeUpdatedFields = true; // Include all updated fields in the response, including change.after.fieldName for each updated field
    String format = "format_example"; // Data format to return; default is json, can also use json-extended or json-readable
    try {
      UpdateScenarioChangeResponse result = client
              .change
              .amendScenarioChange(orgId, scenarioId, changeId)
              .fields(fields)
              .includeUpdatedFields(includeUpdatedFields)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getProcessId());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#amendScenarioChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateScenarioChangeResponse> response = client
              .change
              .amendScenarioChange(orgId, scenarioId, changeId)
              .fields(fields)
              .includeUpdatedFields(includeUpdatedFields)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#amendScenarioChange");
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
| **scenarioId** | **String**| Scenario id | |
| **changeId** | **String**| Change id | |
| **fields** | **String**| Fields to retrieve | [optional] |
| **includeUpdatedFields** | **Boolean**| Include all updated fields in the response, including change.after.fieldName for each updated field | [optional] |
| **format** | **String**| Data format to return; default is json, can also use json-extended or json-readable | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| Column and data to update (must contain only one entry) | [optional] |

### Return type

[**UpdateScenarioChangeResponse**](UpdateScenarioChangeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="approveOrReject"></a>
# **approveOrReject**
> approveOrReject(orgId, changeId).approveChange(approveChange).execute();

Approve or reject a change



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String status = "ACTIVE";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String changeId = "changeId_example"; // Change id
    String approvalNote = "approvalNote_example";
    String changeId = "changeId_example";
    try {
      client
              .change
              .approveOrReject(status, orgId, changeId)
              .approvalNote(approvalNote)
              .changeId(changeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#approveOrReject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .change
              .approveOrReject(status, orgId, changeId)
              .approvalNote(approvalNote)
              .changeId(changeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#approveOrReject");
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
| **changeId** | **String**| Change id | |
| **approveChange** | [**ApproveChange**](ApproveChange.md)| Change approval details | [optional] |

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
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="bulkUpdateJobs"></a>
# **bulkUpdateJobs**
> Process bulkUpdateJobs(orgId).bulkUpdateRequest(bulkUpdateRequest).execute();

Perform a bulk update on a number of jobs



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Set<String> jobIds = Arrays.asList(); // list of job ids to update
    JobUpdate update = new JobUpdate();
    LocalDate date = LocalDate.now(); // date of update
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // scenario id
    String note = "note_example"; // note for update
    try {
      Process result = client
              .change
              .bulkUpdateJobs(jobIds, update, date, orgId)
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
      System.err.println("Exception when calling ChangeApi#bulkUpdateJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .change
              .bulkUpdateJobs(jobIds, update, date, orgId)
              .scenarioId(scenarioId)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#bulkUpdateJobs");
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
| **bulkUpdateRequest** | [**BulkUpdateRequest**](BulkUpdateRequest.md)| Bulk update data | [optional] |

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

<a name="checkApproverEligibility"></a>
# **checkApproverEligibility**
> Boolean checkApproverEligibility(orgId, changeId).date(date).execute();

Given a of change id, see if the person can approve/reject



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String changeId = "changeId_example"; // Change Id
    LocalDate date = LocalDate.now(); // Date to check the approval on
    try {
      Boolean result = client
              .change
              .checkApproverEligibility(orgId, changeId)
              .date(date)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#checkApproverEligibility");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Boolean> response = client
              .change
              .checkApproverEligibility(orgId, changeId)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#checkApproverEligibility");
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
| **changeId** | **String**| Change Id | |
| **date** | **LocalDate**| Date to check the approval on | [optional] |

### Return type

**Boolean**

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

<a name="createDepartRehirePair"></a>
# **createDepartRehirePair**
> Change createDepartRehirePair(orgId).startDate(startDate).createChange(createChange).execute();

Create a depart-rehire pair of changes, for filling in historical data



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // job id
    String orgId = "orgId_example"; // parent organization id
    String scenarioId = "scenarioId_example"; // scenario that this change belongs to
    String personId = "personId_example"; // the id of the person involved, or empty if no person attached to job
    String otherJobId = "otherJobId_example"; // for MOVE changes, the id of the job moving from; for RELATE changes, the id of the other job
    String type = "HIRE"; // type of change
    LocalDate date = LocalDate.now(); // date of change
    LocalDate announceDate = LocalDate.now(); // for HIRE and DEPART changes, the announce date, if the announce date is different from the date of change
    String departType = "VOLUNTARY"; // for DEPART changes, the type of departure
    String departRegret = "REGRET"; // for DEPART changes, whether the departure is regrettable
    String reason = "reason_example"; // the reason of the change
    String promotionType = "PROMOTION"; // if it's a promotion or a demotion
    PartialJob job = new PartialJob();
    JobUpdate update = new JobUpdate();
    String note = "note_example"; // note on the change
    LocalDate startDate = LocalDate.now(); // Rehire start date
    try {
      Change result = client
              .change
              .createDepartRehirePair(orgId)
              .jobId(jobId)
              .orgId(orgId)
              .scenarioId(scenarioId)
              .personId(personId)
              .otherJobId(otherJobId)
              .type(type)
              .date(date)
              .announceDate(announceDate)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .startDate(startDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJobId());
      System.out.println(result.getOrgId());
      System.out.println(result.getScenarioId());
      System.out.println(result.getMergeScenarioId());
      System.out.println(result.getParentChangeId());
      System.out.println(result.getPriorStateChangeId());
      System.out.println(result.getType());
      System.out.println(result.getDate());
      System.out.println(result.getSort());
      System.out.println(result.getAnnounceDate());
      System.out.println(result.getStatus());
      System.out.println(result.getPersonId());
      System.out.println(result.getOtherJobId());
      System.out.println(result.getOtherPersonId());
      System.out.println(result.getDepartType());
      System.out.println(result.getDepartRegret());
      System.out.println(result.getPromotionType());
      System.out.println(result.getReason());
      System.out.println(result.getRelateType());
      System.out.println(result.getRefs());
      System.out.println(result.getJob());
      System.out.println(result.getOtherJob());
      System.out.println(result.getFormId());
      System.out.println(result.getAssessmentId());
      System.out.println(result.getUpdate());
      System.out.println(result.getUpcoming());
      System.out.println(result.getConflict());
      System.out.println(result.getNote());
      System.out.println(result.getCreateId());
      System.out.println(result.getMergeId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getStatusAt());
      System.out.println(result.getApprovalAt());
      System.out.println(result.getApprovalId());
      System.out.println(result.getApprovalNote());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getCanEdit());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#createDepartRehirePair");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Change> response = client
              .change
              .createDepartRehirePair(orgId)
              .jobId(jobId)
              .orgId(orgId)
              .scenarioId(scenarioId)
              .personId(personId)
              .otherJobId(otherJobId)
              .type(type)
              .date(date)
              .announceDate(announceDate)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .startDate(startDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#createDepartRehirePair");
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
| **startDate** | **LocalDate**| Rehire start date | [optional] |
| **createChange** | [**CreateChange**](CreateChange.md)| Depart data | [optional] |

### Return type

[**Change**](Change.md)

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

<a name="createIfNotExists"></a>
# **createIfNotExists**
> Change createIfNotExists(orgId, type).processId(processId).createChange(createChange).execute();

Sync a change (create the change only if it does not already exist)



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Change type
    String jobId = "jobId_example"; // job id
    String orgId = "orgId_example"; // parent organization id
    String scenarioId = "scenarioId_example"; // scenario that this change belongs to
    String personId = "personId_example"; // the id of the person involved, or empty if no person attached to job
    String otherJobId = "otherJobId_example"; // for MOVE changes, the id of the job moving from; for RELATE changes, the id of the other job
    String type = "HIRE"; // type of change
    LocalDate date = LocalDate.now(); // date of change
    LocalDate announceDate = LocalDate.now(); // for HIRE and DEPART changes, the announce date, if the announce date is different from the date of change
    String departType = "VOLUNTARY"; // for DEPART changes, the type of departure
    String departRegret = "REGRET"; // for DEPART changes, whether the departure is regrettable
    String reason = "reason_example"; // the reason of the change
    String promotionType = "PROMOTION"; // if it's a promotion or a demotion
    PartialJob job = new PartialJob();
    JobUpdate update = new JobUpdate();
    String note = "note_example"; // note on the change
    String processId = "processId_example"; // Process id of person creation
    try {
      Change result = client
              .change
              .createIfNotExists(orgId, type)
              .jobId(jobId)
              .orgId(orgId)
              .scenarioId(scenarioId)
              .personId(personId)
              .otherJobId(otherJobId)
              .type(type)
              .date(date)
              .announceDate(announceDate)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .processId(processId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJobId());
      System.out.println(result.getOrgId());
      System.out.println(result.getScenarioId());
      System.out.println(result.getMergeScenarioId());
      System.out.println(result.getParentChangeId());
      System.out.println(result.getPriorStateChangeId());
      System.out.println(result.getType());
      System.out.println(result.getDate());
      System.out.println(result.getSort());
      System.out.println(result.getAnnounceDate());
      System.out.println(result.getStatus());
      System.out.println(result.getPersonId());
      System.out.println(result.getOtherJobId());
      System.out.println(result.getOtherPersonId());
      System.out.println(result.getDepartType());
      System.out.println(result.getDepartRegret());
      System.out.println(result.getPromotionType());
      System.out.println(result.getReason());
      System.out.println(result.getRelateType());
      System.out.println(result.getRefs());
      System.out.println(result.getJob());
      System.out.println(result.getOtherJob());
      System.out.println(result.getFormId());
      System.out.println(result.getAssessmentId());
      System.out.println(result.getUpdate());
      System.out.println(result.getUpcoming());
      System.out.println(result.getConflict());
      System.out.println(result.getNote());
      System.out.println(result.getCreateId());
      System.out.println(result.getMergeId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getStatusAt());
      System.out.println(result.getApprovalAt());
      System.out.println(result.getApprovalId());
      System.out.println(result.getApprovalNote());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getCanEdit());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#createIfNotExists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Change> response = client
              .change
              .createIfNotExists(orgId, type)
              .jobId(jobId)
              .orgId(orgId)
              .scenarioId(scenarioId)
              .personId(personId)
              .otherJobId(otherJobId)
              .type(type)
              .date(date)
              .announceDate(announceDate)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .processId(processId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#createIfNotExists");
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
| **type** | **String**| Change type | |
| **processId** | **String**| Process id of person creation | [optional] |
| **createChange** | [**CreateChange**](CreateChange.md)| Change data | [optional] |

### Return type

[**Change**](Change.md)

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

<a name="createNewChange"></a>
# **createNewChange**
> Change createNewChange(orgId, type).source(source).processId(processId).createChange(createChange).execute();

Create a new change



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Change type
    String jobId = "jobId_example"; // job id
    String orgId = "orgId_example"; // parent organization id
    String scenarioId = "scenarioId_example"; // scenario that this change belongs to
    String personId = "personId_example"; // the id of the person involved, or empty if no person attached to job
    String otherJobId = "otherJobId_example"; // for MOVE changes, the id of the job moving from; for RELATE changes, the id of the other job
    String type = "HIRE"; // type of change
    LocalDate date = LocalDate.now(); // date of change
    LocalDate announceDate = LocalDate.now(); // for HIRE and DEPART changes, the announce date, if the announce date is different from the date of change
    String departType = "VOLUNTARY"; // for DEPART changes, the type of departure
    String departRegret = "REGRET"; // for DEPART changes, whether the departure is regrettable
    String reason = "reason_example"; // the reason of the change
    String promotionType = "PROMOTION"; // if it's a promotion or a demotion
    PartialJob job = new PartialJob();
    JobUpdate update = new JobUpdate();
    String note = "note_example"; // note on the change
    String source = "source_example"; // Source of change
    String processId = "processId_example"; // Process id of change creation
    try {
      Change result = client
              .change
              .createNewChange(orgId, type)
              .jobId(jobId)
              .orgId(orgId)
              .scenarioId(scenarioId)
              .personId(personId)
              .otherJobId(otherJobId)
              .type(type)
              .date(date)
              .announceDate(announceDate)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .source(source)
              .processId(processId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJobId());
      System.out.println(result.getOrgId());
      System.out.println(result.getScenarioId());
      System.out.println(result.getMergeScenarioId());
      System.out.println(result.getParentChangeId());
      System.out.println(result.getPriorStateChangeId());
      System.out.println(result.getType());
      System.out.println(result.getDate());
      System.out.println(result.getSort());
      System.out.println(result.getAnnounceDate());
      System.out.println(result.getStatus());
      System.out.println(result.getPersonId());
      System.out.println(result.getOtherJobId());
      System.out.println(result.getOtherPersonId());
      System.out.println(result.getDepartType());
      System.out.println(result.getDepartRegret());
      System.out.println(result.getPromotionType());
      System.out.println(result.getReason());
      System.out.println(result.getRelateType());
      System.out.println(result.getRefs());
      System.out.println(result.getJob());
      System.out.println(result.getOtherJob());
      System.out.println(result.getFormId());
      System.out.println(result.getAssessmentId());
      System.out.println(result.getUpdate());
      System.out.println(result.getUpcoming());
      System.out.println(result.getConflict());
      System.out.println(result.getNote());
      System.out.println(result.getCreateId());
      System.out.println(result.getMergeId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getStatusAt());
      System.out.println(result.getApprovalAt());
      System.out.println(result.getApprovalId());
      System.out.println(result.getApprovalNote());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getCanEdit());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#createNewChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Change> response = client
              .change
              .createNewChange(orgId, type)
              .jobId(jobId)
              .orgId(orgId)
              .scenarioId(scenarioId)
              .personId(personId)
              .otherJobId(otherJobId)
              .type(type)
              .date(date)
              .announceDate(announceDate)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .source(source)
              .processId(processId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#createNewChange");
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
| **type** | **String**| Change type | |
| **source** | **String**| Source of change | [optional] |
| **processId** | **String**| Process id of change creation | [optional] |
| **createChange** | [**CreateChange**](CreateChange.md)| Change data | [optional] |

### Return type

[**Change**](Change.md)

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

<a name="deletePreviousChange"></a>
# **deletePreviousChange**
> deletePreviousChange(orgId, changeId).processId(processId).execute();

Delete a previous change



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String changeId = "changeId_example"; // Change id
    String processId = "processId_example"; // Process id of person creation
    try {
      client
              .change
              .deletePreviousChange(orgId, changeId)
              .processId(processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#deletePreviousChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .change
              .deletePreviousChange(orgId, changeId)
              .processId(processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#deletePreviousChange");
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
| **changeId** | **String**| Change id | |
| **processId** | **String**| Process id of person creation | [optional] |

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
| **404** | not found |  -  |

<a name="findScenarioChanges"></a>
# **findScenarioChanges**
> ScenarioChangesWithBudgetRollup findScenarioChanges(orgId, scenarioId).fields(fields).format(format).q(q).returnAccess(returnAccess).execute();

Return all changes for a particular scenario, with before job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    String fields = "fields_example"; // Fields to retrieve
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String q = "q_example"; // Search query
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ScenarioChangesWithBudgetRollup result = client
              .change
              .findScenarioChanges(orgId, scenarioId)
              .fields(fields)
              .format(format)
              .q(q)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getChanges());
      System.out.println(result.getBudgetPoolSummaries());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#findScenarioChanges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScenarioChangesWithBudgetRollup> response = client
              .change
              .findScenarioChanges(orgId, scenarioId)
              .fields(fields)
              .format(format)
              .q(q)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#findScenarioChanges");
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
| **scenarioId** | **String**| Scenario id | |
| **fields** | **String**| Fields to retrieve | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **q** | **String**| Search query | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ScenarioChangesWithBudgetRollup**](ScenarioChangesWithBudgetRollup.md)

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
> Change getById(orgId, changeId).format(format).execute();

Return a particular change by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String changeId = "changeId_example"; // Change id
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      Change result = client
              .change
              .getById(orgId, changeId)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJobId());
      System.out.println(result.getOrgId());
      System.out.println(result.getScenarioId());
      System.out.println(result.getMergeScenarioId());
      System.out.println(result.getParentChangeId());
      System.out.println(result.getPriorStateChangeId());
      System.out.println(result.getType());
      System.out.println(result.getDate());
      System.out.println(result.getSort());
      System.out.println(result.getAnnounceDate());
      System.out.println(result.getStatus());
      System.out.println(result.getPersonId());
      System.out.println(result.getOtherJobId());
      System.out.println(result.getOtherPersonId());
      System.out.println(result.getDepartType());
      System.out.println(result.getDepartRegret());
      System.out.println(result.getPromotionType());
      System.out.println(result.getReason());
      System.out.println(result.getRelateType());
      System.out.println(result.getRefs());
      System.out.println(result.getJob());
      System.out.println(result.getOtherJob());
      System.out.println(result.getFormId());
      System.out.println(result.getAssessmentId());
      System.out.println(result.getUpdate());
      System.out.println(result.getUpcoming());
      System.out.println(result.getConflict());
      System.out.println(result.getNote());
      System.out.println(result.getCreateId());
      System.out.println(result.getMergeId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getStatusAt());
      System.out.println(result.getApprovalAt());
      System.out.println(result.getApprovalId());
      System.out.println(result.getApprovalNote());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getCanEdit());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Change> response = client
              .change
              .getById(orgId, changeId)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getById");
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
| **changeId** | **String**| Change id | |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

### Return type

[**Change**](Change.md)

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

<a name="getById_0"></a>
# **getById_0**
> getById_0(orgId, changeId).fields(fields).format(format).execute();

Return a particular change by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String changeId = "changeId_example"; // Change id
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    try {
      client
              .change
              .getById_0(orgId, changeId)
              .fields(fields)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getById_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .change
              .getById_0(orgId, changeId)
              .fields(fields)
              .format(format)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getById_0");
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
| **changeId** | **String**| Change id | |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |

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
| **404** | not found |  -  |

<a name="getRecentChanges"></a>
# **getRecentChanges**
> ResultsChange getRecentChanges(orgId).scenarioId(scenarioId).date(date).endDate(endDate).type(type).fields(fields).personId(personId).jobId(jobId).includeBackfill(includeBackfill).refs(refs).q(q).from(from).limit(limit).open(open).desc(desc).scenarioOnly(scenarioOnly).parentOnly(parentOnly).includeGrantSchedule(includeGrantSchedule).excludeAtsRecruitingFields(excludeAtsRecruitingFields).includeStruck(includeStruck).status(status).stripUpdates(stripUpdates).format(format).fieldEntityTypes(fieldEntityTypes).returnAccess(returnAccess).execute();

Return recent changes across an org, or for a particular person or job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    LocalDate date = LocalDate.now(); // Date to start from
    LocalDate endDate = LocalDate.now(); // Date to get changes through (inclusive)
    String type = "type_example"; // Types of change to filter by
    String fields = "fields_example"; // Return changes that modify these fields
    String personId = "personId_example"; // Person id to filter by
    String jobId = "jobId_example"; // Job id to filter by
    Boolean includeBackfill = true; // Find and include first backfill if it exists
    String refs = "refs_example"; // References to filter by
    String q = "q_example"; // Query to filter against
    String from = "from_example"; // Change id to start paginating from
    Integer limit = 56; // Number of results to return
    String open = "FILLED"; // Whether the role is open or not
    Boolean desc = true; // Descending (default false)
    Boolean scenarioOnly = true; // Scenario only (exclude primary changes)
    Boolean parentOnly = true; // Parent changes only (exclude child changes)
    Boolean includeGrantSchedule = true; // Whether to include full grant schedule when returning equity updates
    Boolean excludeAtsRecruitingFields = true; // Whether to exclude ats recruiting fields. Only applies when fieldEntityTypeString is passed
    Boolean includeStruck = true; // Deprecated parameter for backwards-compatibility (use statuses) - whether to include STRUCK and PROPOSED changes, or just ACTIVE changes
    String status = "status_example"; // Statuses to filter by
    Boolean stripUpdates = true; // Whether to strip returned update changes of update types that were not explicitly requested
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String fieldEntityTypes = "fieldEntityTypes_example"; // Only return changes which set fields with these entity types
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsChange result = client
              .change
              .getRecentChanges(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .endDate(endDate)
              .type(type)
              .fields(fields)
              .personId(personId)
              .jobId(jobId)
              .includeBackfill(includeBackfill)
              .refs(refs)
              .q(q)
              .from(from)
              .limit(limit)
              .open(open)
              .desc(desc)
              .scenarioOnly(scenarioOnly)
              .parentOnly(parentOnly)
              .includeGrantSchedule(includeGrantSchedule)
              .excludeAtsRecruitingFields(excludeAtsRecruitingFields)
              .includeStruck(includeStruck)
              .status(status)
              .stripUpdates(stripUpdates)
              .format(format)
              .fieldEntityTypes(fieldEntityTypes)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getRecentChanges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsChange> response = client
              .change
              .getRecentChanges(orgId)
              .scenarioId(scenarioId)
              .date(date)
              .endDate(endDate)
              .type(type)
              .fields(fields)
              .personId(personId)
              .jobId(jobId)
              .includeBackfill(includeBackfill)
              .refs(refs)
              .q(q)
              .from(from)
              .limit(limit)
              .open(open)
              .desc(desc)
              .scenarioOnly(scenarioOnly)
              .parentOnly(parentOnly)
              .includeGrantSchedule(includeGrantSchedule)
              .excludeAtsRecruitingFields(excludeAtsRecruitingFields)
              .includeStruck(includeStruck)
              .status(status)
              .stripUpdates(stripUpdates)
              .format(format)
              .fieldEntityTypes(fieldEntityTypes)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getRecentChanges");
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
| **scenarioId** | **String**| Scenario id | [optional] |
| **date** | **LocalDate**| Date to start from | [optional] |
| **endDate** | **LocalDate**| Date to get changes through (inclusive) | [optional] |
| **type** | **String**| Types of change to filter by | [optional] |
| **fields** | **String**| Return changes that modify these fields | [optional] |
| **personId** | **String**| Person id to filter by | [optional] |
| **jobId** | **String**| Job id to filter by | [optional] |
| **includeBackfill** | **Boolean**| Find and include first backfill if it exists | [optional] |
| **refs** | **String**| References to filter by | [optional] |
| **q** | **String**| Query to filter against | [optional] |
| **from** | **String**| Change id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **open** | **String**| Whether the role is open or not | [optional] [enum: FILLED, OPEN] |
| **desc** | **Boolean**| Descending (default false) | [optional] |
| **scenarioOnly** | **Boolean**| Scenario only (exclude primary changes) | [optional] |
| **parentOnly** | **Boolean**| Parent changes only (exclude child changes) | [optional] |
| **includeGrantSchedule** | **Boolean**| Whether to include full grant schedule when returning equity updates | [optional] |
| **excludeAtsRecruitingFields** | **Boolean**| Whether to exclude ats recruiting fields. Only applies when fieldEntityTypeString is passed | [optional] |
| **includeStruck** | **Boolean**| Deprecated parameter for backwards-compatibility (use statuses) - whether to include STRUCK and PROPOSED changes, or just ACTIVE changes | [optional] |
| **status** | **String**| Statuses to filter by | [optional] |
| **stripUpdates** | **Boolean**| Whether to strip returned update changes of update types that were not explicitly requested | [optional] |
| **format** | **String**| Data format to use; default is json, can also use json-extended or json-readable | [optional] |
| **fieldEntityTypes** | **String**| Only return changes which set fields with these entity types | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ResultsChange**](ResultsChange.md)

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

<a name="getRecentChangesForOrgOrPerson"></a>
# **getRecentChangesForOrgOrPerson**
> ResultsData getRecentChangesForOrgOrPerson(orgId).jobId(jobId).personId(personId).scenarioId(scenarioId).type(type).status(status).fields(fields).fieldsChanged(fieldsChanged).q(q).open(open).includeGrantSchedule(includeGrantSchedule).fromDate(fromDate).from(from).limit(limit).desc(desc).format(format).returnAccess(returnAccess).execute();

Return recent changes across an org, or for a particular person or job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String jobId = "jobId_example"; // Job id to filter by
    String personId = "personId_example"; // Person id to filter by
    String scenarioId = "scenarioId_example"; // Scenario id
    String type = "type_example"; // Types of change to filter by, comma-separated
    String status = "status_example"; // Statuses to filter by, comma-separated
    String fields = "fields_example"; // Fields to retrieve, comma-separated
    String fieldsChanged = "fieldsChanged_example"; // Changed fields to filter by, comma-separated
    String q = "q_example"; // Query to filter against
    String open = "FILLED"; // Whether the role is open or not
    Boolean includeGrantSchedule = true; // Whether to include full grant schedule when returning equity updates
    LocalDate fromDate = LocalDate.now(); // Date to start from
    String from = "from_example"; // Change id to start paginating from
    Integer limit = 56; // Number of results to return
    Boolean desc = true; // Descending (default false)
    String format = "format_example"; // Data format to use; default is json, can also use json-extended or json-readable
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsData result = client
              .change
              .getRecentChangesForOrgOrPerson(orgId)
              .jobId(jobId)
              .personId(personId)
              .scenarioId(scenarioId)
              .type(type)
              .status(status)
              .fields(fields)
              .fieldsChanged(fieldsChanged)
              .q(q)
              .open(open)
              .includeGrantSchedule(includeGrantSchedule)
              .fromDate(fromDate)
              .from(from)
              .limit(limit)
              .desc(desc)
              .format(format)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getRecentChangesForOrgOrPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .change
              .getRecentChangesForOrgOrPerson(orgId)
              .jobId(jobId)
              .personId(personId)
              .scenarioId(scenarioId)
              .type(type)
              .status(status)
              .fields(fields)
              .fieldsChanged(fieldsChanged)
              .q(q)
              .open(open)
              .includeGrantSchedule(includeGrantSchedule)
              .fromDate(fromDate)
              .from(from)
              .limit(limit)
              .desc(desc)
              .format(format)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getRecentChangesForOrgOrPerson");
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
| **jobId** | **String**| Job id to filter by | [optional] |
| **personId** | **String**| Person id to filter by | [optional] |
| **scenarioId** | **String**| Scenario id | [optional] |
| **type** | **String**| Types of change to filter by, comma-separated | [optional] |
| **status** | **String**| Statuses to filter by, comma-separated | [optional] |
| **fields** | **String**| Fields to retrieve, comma-separated | [optional] |
| **fieldsChanged** | **String**| Changed fields to filter by, comma-separated | [optional] |
| **q** | **String**| Query to filter against | [optional] |
| **open** | **String**| Whether the role is open or not | [optional] [enum: FILLED, OPEN] |
| **includeGrantSchedule** | **Boolean**| Whether to include full grant schedule when returning equity updates | [optional] |
| **fromDate** | **LocalDate**| Date to start from | [optional] |
| **from** | **String**| Change id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **desc** | **Boolean**| Descending (default false) | [optional] |
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
| **400** | bad request |  -  |
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getStatus"></a>
# **getStatus**
> ChangeStatusResponse getStatus(orgId, scenarioId, changeId, processId).execute();

Get the status of a running change within a scenario



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String scenarioId = "scenarioId_example"; // Scenario id
    String changeId = "changeId_example"; // Change id
    Integer processId = 56; // Process id
    try {
      ChangeStatusResponse result = client
              .change
              .getStatus(orgId, scenarioId, changeId, processId)
              .execute();
      System.out.println(result);
      System.out.println(result.getProcessId());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeStatusResponse> response = client
              .change
              .getStatus(orgId, scenarioId, changeId, processId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#getStatus");
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
| **scenarioId** | **String**| Scenario id | |
| **changeId** | **String**| Change id | |
| **processId** | **Integer**| Process id | |

### Return type

[**ChangeStatusResponse**](ChangeStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **404** | not found |  -  |

<a name="performBulkChange"></a>
# **performBulkChange**
> Process performBulkChange(orgId).bulkChangeRequest(bulkChangeRequest).execute();

Perform a series of changes at once



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    List<CreateChange> changes = Arrays.asList(); // list of changes to create
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      Process result = client
              .change
              .performBulkChange(changes, orgId)
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
      System.err.println("Exception when calling ChangeApi#performBulkChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .change
              .performBulkChange(changes, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#performBulkChange");
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
| **bulkChangeRequest** | [**BulkChangeRequest**](BulkChangeRequest.md)| Bulk change data | [optional] |

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

<a name="updateChangeById"></a>
# **updateChangeById**
> updateChangeById(orgId, changeId).processId(processId).updateChange(updateChange).execute();

Make a change to a change



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String changeId = "changeId_example"; // Change id
    LocalDate date = LocalDate.now(); // date of change
    LocalDate announceDate = LocalDate.now(); // for HIRE and DEPART changes, the announce date, if the announce date is different from the date of change
    String status = "ACTIVE"; // whether the change is active or not
    String departType = "VOLUNTARY"; // for DEPART changes, the type of departure
    String departRegret = "REGRET"; // for DEPART changes, whether the departure is regrettable
    String reason = "reason_example"; // the reason of the change
    String promotionType = "PROMOTION"; // if it's a promotion or a demotion
    PartialJob job = new PartialJob();
    JobUpdate update = new JobUpdate();
    String note = "note_example"; // note on the change
    String approvalNote = "approvalNote_example"; // approval/rejection note
    String processId = "processId_example"; // Process id of person creation
    try {
      client
              .change
              .updateChangeById(orgId, changeId)
              .date(date)
              .announceDate(announceDate)
              .status(status)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .approvalNote(approvalNote)
              .processId(processId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#updateChangeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .change
              .updateChangeById(orgId, changeId)
              .date(date)
              .announceDate(announceDate)
              .status(status)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .approvalNote(approvalNote)
              .processId(processId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#updateChangeById");
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
| **changeId** | **String**| Change id | |
| **processId** | **String**| Process id of person creation | [optional] |
| **updateChange** | [**UpdateChange**](UpdateChange.md)| Change data | [optional] |

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
| **400** | bad request |  -  |
| **404** | not found |  -  |

<a name="validateChangeOperation"></a>
# **validateChangeOperation**
> Change validateChangeOperation(orgId, type).createChange(createChange).execute();

Validate a change



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "type_example"; // Change type
    String jobId = "jobId_example"; // job id
    String orgId = "orgId_example"; // parent organization id
    String scenarioId = "scenarioId_example"; // scenario that this change belongs to
    String personId = "personId_example"; // the id of the person involved, or empty if no person attached to job
    String otherJobId = "otherJobId_example"; // for MOVE changes, the id of the job moving from; for RELATE changes, the id of the other job
    String type = "HIRE"; // type of change
    LocalDate date = LocalDate.now(); // date of change
    LocalDate announceDate = LocalDate.now(); // for HIRE and DEPART changes, the announce date, if the announce date is different from the date of change
    String departType = "VOLUNTARY"; // for DEPART changes, the type of departure
    String departRegret = "REGRET"; // for DEPART changes, whether the departure is regrettable
    String reason = "reason_example"; // the reason of the change
    String promotionType = "PROMOTION"; // if it's a promotion or a demotion
    PartialJob job = new PartialJob();
    JobUpdate update = new JobUpdate();
    String note = "note_example"; // note on the change
    try {
      Change result = client
              .change
              .validateChangeOperation(orgId, type)
              .jobId(jobId)
              .orgId(orgId)
              .scenarioId(scenarioId)
              .personId(personId)
              .otherJobId(otherJobId)
              .type(type)
              .date(date)
              .announceDate(announceDate)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJobId());
      System.out.println(result.getOrgId());
      System.out.println(result.getScenarioId());
      System.out.println(result.getMergeScenarioId());
      System.out.println(result.getParentChangeId());
      System.out.println(result.getPriorStateChangeId());
      System.out.println(result.getType());
      System.out.println(result.getDate());
      System.out.println(result.getSort());
      System.out.println(result.getAnnounceDate());
      System.out.println(result.getStatus());
      System.out.println(result.getPersonId());
      System.out.println(result.getOtherJobId());
      System.out.println(result.getOtherPersonId());
      System.out.println(result.getDepartType());
      System.out.println(result.getDepartRegret());
      System.out.println(result.getPromotionType());
      System.out.println(result.getReason());
      System.out.println(result.getRelateType());
      System.out.println(result.getRefs());
      System.out.println(result.getJob());
      System.out.println(result.getOtherJob());
      System.out.println(result.getFormId());
      System.out.println(result.getAssessmentId());
      System.out.println(result.getUpdate());
      System.out.println(result.getUpcoming());
      System.out.println(result.getConflict());
      System.out.println(result.getNote());
      System.out.println(result.getCreateId());
      System.out.println(result.getMergeId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getStatusAt());
      System.out.println(result.getApprovalAt());
      System.out.println(result.getApprovalId());
      System.out.println(result.getApprovalNote());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getCanEdit());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#validateChangeOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Change> response = client
              .change
              .validateChangeOperation(orgId, type)
              .jobId(jobId)
              .orgId(orgId)
              .scenarioId(scenarioId)
              .personId(personId)
              .otherJobId(otherJobId)
              .type(type)
              .date(date)
              .announceDate(announceDate)
              .departType(departType)
              .departRegret(departRegret)
              .reason(reason)
              .promotionType(promotionType)
              .job(job)
              .update(update)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeApi#validateChangeOperation");
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
| **type** | **String**| Change type | |
| **createChange** | [**CreateChange**](CreateChange.md)| Change data | [optional] |

### Return type

[**Change**](Change.md)

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

