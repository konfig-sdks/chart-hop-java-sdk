# FormApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewForm**](FormApi.md#createNewForm) | **POST** /v1/org/{orgId}/form | Create a form |
| [**deleteFormById**](FormApi.md#deleteFormById) | **DELETE** /v1/org/{orgId}/form/{formId} | Delete a form |
| [**deleteFormById_0**](FormApi.md#deleteFormById_0) | **DELETE** /v1/org/{orgId}/form/delete | Delete forms |
| [**deleteFormDraft**](FormApi.md#deleteFormDraft) | **DELETE** /v1/org/{orgId}/form/draft/{draftId} | Delete the given form draft |
| [**getApplicableFormsForPerson**](FormApi.md#getApplicableFormsForPerson) | **GET** /v1/org/{orgId}/form/person/{personId} | Return all active forms applicable to a particular person |
| [**getById**](FormApi.md#getById) | **GET** /v1/org/{orgId}/form/{formId} | Return a particular form by id |
| [**getCurrentStateOfDraftData**](FormApi.md#getCurrentStateOfDraftData) | **GET** /v1/org/{orgId}/form/{formId}/draft | Get the current state of form draft data |
| [**listAvailableForms**](FormApi.md#listAvailableForms) | **GET** /v1/org/{orgId}/form/available | Return all active forms applicable to a particular entity |
| [**listOrgForms**](FormApi.md#listOrgForms) | **GET** /v1/org/{orgId}/form | Return all forms in the organization paginated |
| [**renderForDisplay**](FormApi.md#renderForDisplay) | **GET** /v1/org/{orgId}/form/{formId}/render | Render a form for display |
| [**rerenderQuestionUpdate**](FormApi.md#rerenderQuestionUpdate) | **POST** /v1/org/{orgId}/form/{formId}/rerender/question/{updateQuestionId} | Re-render form blocks based on changes to the form values |
| [**sendEmailsAndChatNotifications**](FormApi.md#sendEmailsAndChatNotifications) | **POST** /v1/org/{orgId}/form/{formId}/collect | Collect data for an existing form, sending emails and chat notifications to people being requested |
| [**sendReminderNotification**](FormApi.md#sendReminderNotification) | **POST** /v1/org/{orgId}/form/{formId}/remind | Sends reminder for a form with existing tasks, sending emails/chat notifications to people being requested |
| [**submitDraftData**](FormApi.md#submitDraftData) | **POST** /v1/org/{orgId}/form/{formId}/draft | Submit draft data from a form |
| [**submitFormData**](FormApi.md#submitFormData) | **POST** /v1/org/{orgId}/form/{formId}/submit | Submit data from a form |
| [**submitFormDraft**](FormApi.md#submitFormDraft) | **POST** /v1/org/{orgId}/form/{formId}/submit/draft | Submit data from a form draft |
| [**submitFormResponse**](FormApi.md#submitFormResponse) | **POST** /v1/org/{orgId}/form/{formId} | Submit data from a form |
| [**updateExistingForm**](FormApi.md#updateExistingForm) | **PATCH** /v1/org/{orgId}/form/{formId} | Update an existing form |
| [**updateFormStatus**](FormApi.md#updateFormStatus) | **POST** /v1/org/{orgId}/form/status | Update status for existing forms |


<a name="createNewForm"></a>
# **createNewForm**
> Form createNewForm(orgId).createForm(createForm).execute();

Create a form



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String label = "label_example"; // human-readable full name of form
    List<FormField> fields = Arrays.asList(); // ordered list of fields being collected in this form
    List<FormBlock> blocks = Arrays.asList(); // ordered list of blocks being collected in this form
    String status = "ACTIVE"; // status of the form
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String description = "description_example"; // description of form
    String type = "BUILT_IN"; // type of the form
    String targetType = "NONE"; // target type that the form can be filled out about (null defaults to PERSON for backwards compatibility)
    String targetFilter = "targetFilter_example"; // filter that controls on which profiles this tab will appear
    String submitFilter = "submitFilter_example"; // filter that controls which respondents can submit this form. The form:submit permission, if present, overrides this filter
    String responseReadFilter = "responseReadFilter_example"; // filter that controls who can read the form responses. The formResponse:read permission, if present, overrides this filter
    Boolean useFieldAccess = true; // if this option is on, then form response answers will use field permissions to determine access to those responses
    String approval = "MANAGER"; // approval needed, if any approval is required
    String authorSensitive = "ANONYMOUS"; // view sensitivity for the author of this form - the level of view access required to view the createId and updateId fields. If null, the author's identity is always visible as long as the viewer can read the form response. If set to PRIVATE, the author's identity is stored in ChartHop, but protected such that even users with sensitive access cannot access the data. If set to ANONYMOUS, the author's identity is not stored in ChartHop at all.
    Object options = null; // options, such as notification settings
    try {
      Form result = client
              .form
              .createNewForm(label, fields, blocks, status, orgId)
              .description(description)
              .type(type)
              .targetType(targetType)
              .targetFilter(targetFilter)
              .submitFilter(submitFilter)
              .responseReadFilter(responseReadFilter)
              .useFieldAccess(useFieldAccess)
              .approval(approval)
              .authorSensitive(authorSensitive)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getFields());
      System.out.println(result.getBlocks());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
      System.out.println(result.getTargetType());
      System.out.println(result.getTargetFilter());
      System.out.println(result.getSubmitFilter());
      System.out.println(result.getResponseReadFilter());
      System.out.println(result.getUseFieldAccess());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getOptions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#createNewForm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Form> response = client
              .form
              .createNewForm(label, fields, blocks, status, orgId)
              .description(description)
              .type(type)
              .targetType(targetType)
              .targetFilter(targetFilter)
              .submitFilter(submitFilter)
              .responseReadFilter(responseReadFilter)
              .useFieldAccess(useFieldAccess)
              .approval(approval)
              .authorSensitive(authorSensitive)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#createNewForm");
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
| **createForm** | [**CreateForm**](CreateForm.md)| Form data to create | [optional] |

### Return type

[**Form**](Form.md)

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

<a name="deleteFormById"></a>
# **deleteFormById**
> deleteFormById(orgId, formId).execute();

Delete a form



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    try {
      client
              .form
              .deleteFormById(orgId, formId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#deleteFormById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .form
              .deleteFormById(orgId, formId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#deleteFormById");
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
| **formId** | **String**| Form id | |

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

<a name="deleteFormById_0"></a>
# **deleteFormById_0**
> deleteFormById_0(orgId).requestBody(requestBody).execute();

Delete forms



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
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
      client
              .form
              .deleteFormById_0(orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#deleteFormById_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .form
              .deleteFormById_0(orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#deleteFormById_0");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| Form ids | [optional] |

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

<a name="deleteFormDraft"></a>
# **deleteFormDraft**
> FormDraft deleteFormDraft(orgId, draftId).execute();

Delete the given form draft



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String draftId = "draftId_example"; // Form Draft id
    try {
      FormDraft result = client
              .form
              .deleteFormDraft(orgId, draftId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getFormId());
      System.out.println(result.getPersonId());
      System.out.println(result.getData());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getPendingApprovalChangeId());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#deleteFormDraft");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FormDraft> response = client
              .form
              .deleteFormDraft(orgId, draftId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#deleteFormDraft");
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
| **draftId** | **String**| Form Draft id | |

### Return type

[**FormDraft**](FormDraft.md)

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

<a name="getApplicableFormsForPerson"></a>
# **getApplicableFormsForPerson**
> ResultsForm getApplicableFormsForPerson(orgId, personId).execute();

Return all active forms applicable to a particular person



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String personId = "personId_example"; // Person id
    try {
      ResultsForm result = client
              .form
              .getApplicableFormsForPerson(orgId, personId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#getApplicableFormsForPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsForm> response = client
              .form
              .getApplicableFormsForPerson(orgId, personId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#getApplicableFormsForPerson");
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
| **personId** | **String**| Person id | |

### Return type

[**ResultsForm**](ResultsForm.md)

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
> Form getById(orgId, formId).evalJobId(evalJobId).execute();

Return a particular form by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String evalJobId = "evalJobId_example"; // Evaluate any expressions inside the form relative to a particular job
    try {
      Form result = client
              .form
              .getById(orgId, formId)
              .evalJobId(evalJobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getFields());
      System.out.println(result.getBlocks());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
      System.out.println(result.getTargetType());
      System.out.println(result.getTargetFilter());
      System.out.println(result.getSubmitFilter());
      System.out.println(result.getResponseReadFilter());
      System.out.println(result.getUseFieldAccess());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getOptions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Form> response = client
              .form
              .getById(orgId, formId)
              .evalJobId(evalJobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#getById");
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
| **formId** | **String**| Form id | |
| **evalJobId** | **String**| Evaluate any expressions inside the form relative to a particular job | [optional] |

### Return type

[**Form**](Form.md)

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

<a name="getCurrentStateOfDraftData"></a>
# **getCurrentStateOfDraftData**
> FormDraft getCurrentStateOfDraftData(orgId, formId).personId(personId).execute();

Get the current state of form draft data



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String personId = "personId_example"; // Person id
    try {
      FormDraft result = client
              .form
              .getCurrentStateOfDraftData(orgId, formId)
              .personId(personId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getFormId());
      System.out.println(result.getPersonId());
      System.out.println(result.getData());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getPendingApprovalChangeId());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#getCurrentStateOfDraftData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FormDraft> response = client
              .form
              .getCurrentStateOfDraftData(orgId, formId)
              .personId(personId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#getCurrentStateOfDraftData");
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
| **formId** | **String**| Form id | |
| **personId** | **String**| Person id | [optional] |

### Return type

[**FormDraft**](FormDraft.md)

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
| **404** | org not found |  -  |

<a name="listAvailableForms"></a>
# **listAvailableForms**
> ResultsFormSummary listAvailableForms(orgId).targetId(targetId).targetType(targetType).execute();

Return all active forms applicable to a particular entity



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String targetId = "targetId_example"; // Target id
    String targetType = "NONE"; // Target type
    try {
      ResultsFormSummary result = client
              .form
              .listAvailableForms(orgId)
              .targetId(targetId)
              .targetType(targetType)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#listAvailableForms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsFormSummary> response = client
              .form
              .listAvailableForms(orgId)
              .targetId(targetId)
              .targetType(targetType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#listAvailableForms");
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
| **targetId** | **String**| Target id | [optional] |
| **targetType** | **String**| Target type | [optional] [enum: NONE, PERSON] |

### Return type

[**ResultsFormSummary**](ResultsFormSummary.md)

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

<a name="listOrgForms"></a>
# **listOrgForms**
> ResultsForm listOrgForms(orgId).status(status).from(from).limit(limit).execute();

Return all forms in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String status = "ACTIVE"; // Status to filter by
    String from = "from_example"; // Form id to start paginating from
    Integer limit = 56; // Number of results to return
    try {
      ResultsForm result = client
              .form
              .listOrgForms(orgId)
              .status(status)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#listOrgForms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsForm> response = client
              .form
              .listOrgForms(orgId)
              .status(status)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#listOrgForms");
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
| **status** | **String**| Status to filter by | [optional] [enum: ACTIVE, INACTIVE, ARCHIVED] |
| **from** | **String**| Form id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsForm**](ResultsForm.md)

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

<a name="renderForDisplay"></a>
# **renderForDisplay**
> FormRender renderForDisplay(orgId, formId).targetId(targetId).targetType(targetType).formResponseId(formResponseId).formResponseChangeId(formResponseChangeId).formVersionId(formVersionId).execute();

Render a form for display



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String targetId = "targetId_example"; // Target id
    String targetType = "NONE"; // Target type
    String formResponseId = "formResponseId_example"; // Form response id, if editing a prior form response (unsupported)
    String formResponseChangeId = "formResponseChangeId_example"; // Form response change id, if editing a prior form response (deprecated)
    String formVersionId = "formVersionId_example"; // Form version id, if rendering a previous version of the form
    try {
      FormRender result = client
              .form
              .renderForDisplay(orgId, formId)
              .targetId(targetId)
              .targetType(targetType)
              .formResponseId(formResponseId)
              .formResponseChangeId(formResponseChangeId)
              .formVersionId(formVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getLabel());
      System.out.println(result.getOptions());
      System.out.println(result.getBlocks());
      System.out.println(result.getRerenderQuestionIds());
      System.out.println(result.getResponseSensitive());
      System.out.println(result.getAuthorSensitive());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#renderForDisplay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FormRender> response = client
              .form
              .renderForDisplay(orgId, formId)
              .targetId(targetId)
              .targetType(targetType)
              .formResponseId(formResponseId)
              .formResponseChangeId(formResponseChangeId)
              .formVersionId(formVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#renderForDisplay");
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
| **formId** | **String**| Form id | |
| **targetId** | **String**| Target id | [optional] |
| **targetType** | **String**| Target type | [optional] [enum: NONE, PERSON] |
| **formResponseId** | **String**| Form response id, if editing a prior form response (unsupported) | [optional] |
| **formResponseChangeId** | **String**| Form response change id, if editing a prior form response (deprecated) | [optional] |
| **formVersionId** | **String**| Form version id, if rendering a previous version of the form | [optional] |

### Return type

[**FormRender**](FormRender.md)

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

<a name="rerenderQuestionUpdate"></a>
# **rerenderQuestionUpdate**
> FormRerender rerenderQuestionUpdate(orgId, formId, updateQuestionId).targetId(targetId).targetType(targetType).formVersionId(formVersionId).requestBody(requestBody).execute();

Re-render form blocks based on changes to the form values



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String updateQuestionId = "updateQuestionId_example"; // The question id that is being updated to trigger the re-render
    String targetId = "targetId_example"; // Target id
    String targetType = "NONE"; // Target type
    String formVersionId = "formVersionId_example"; // Form version id, if rendering a previous version of the form
    try {
      FormRerender result = client
              .form
              .rerenderQuestionUpdate(orgId, formId, updateQuestionId)
              .targetId(targetId)
              .targetType(targetType)
              .formVersionId(formVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getBlocks());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#rerenderQuestionUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FormRerender> response = client
              .form
              .rerenderQuestionUpdate(orgId, formId, updateQuestionId)
              .targetId(targetId)
              .targetType(targetType)
              .formVersionId(formVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#rerenderQuestionUpdate");
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
| **formId** | **String**| Form id | |
| **updateQuestionId** | **String**| The question id that is being updated to trigger the re-render | |
| **targetId** | **String**| Target id | [optional] |
| **targetType** | **String**| Target type | [optional] [enum: NONE, PERSON] |
| **formVersionId** | **String**| Form version id, if rendering a previous version of the form | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| Form data to submit | [optional] |

### Return type

[**FormRerender**](FormRerender.md)

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

<a name="sendEmailsAndChatNotifications"></a>
# **sendEmailsAndChatNotifications**
> Form sendEmailsAndChatNotifications(orgId, formId).formCollectRequest(formCollectRequest).execute();

Collect data for an existing form, sending emails and chat notifications to people being requested



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Boolean preview = true; // Is this a preview?
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String assessmentId = "assessmentId_example"; // the assessment id that this form collection request aligns to (for example a performance review cycle)
    String targetFilter = "targetFilter_example"; // filter query to apply on who should receive the form collection request
    String submitFilter = "submitFilter_example"; // Filter to for jobs/person that match via relationship
    String message = "message_example"; // message to include in notification
    try {
      Form result = client
              .form
              .sendEmailsAndChatNotifications(preview, orgId, formId)
              .assessmentId(assessmentId)
              .targetFilter(targetFilter)
              .submitFilter(submitFilter)
              .message(message)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getFields());
      System.out.println(result.getBlocks());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
      System.out.println(result.getTargetType());
      System.out.println(result.getTargetFilter());
      System.out.println(result.getSubmitFilter());
      System.out.println(result.getResponseReadFilter());
      System.out.println(result.getUseFieldAccess());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getOptions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#sendEmailsAndChatNotifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Form> response = client
              .form
              .sendEmailsAndChatNotifications(preview, orgId, formId)
              .assessmentId(assessmentId)
              .targetFilter(targetFilter)
              .submitFilter(submitFilter)
              .message(message)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#sendEmailsAndChatNotifications");
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
| **formId** | **String**| Form id | |
| **formCollectRequest** | [**FormCollectRequest**](FormCollectRequest.md)| Details on the data collection | [optional] |

### Return type

[**Form**](Form.md)

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

<a name="sendReminderNotification"></a>
# **sendReminderNotification**
> Form sendReminderNotification(orgId, formId).formCollectRequest(formCollectRequest).execute();

Sends reminder for a form with existing tasks, sending emails/chat notifications to people being requested



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Boolean preview = true; // Is this a preview?
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String assessmentId = "assessmentId_example"; // the assessment id that this form collection request aligns to (for example a performance review cycle)
    String targetFilter = "targetFilter_example"; // filter query to apply on who should receive the form collection request
    String submitFilter = "submitFilter_example"; // Filter to for jobs/person that match via relationship
    String message = "message_example"; // message to include in notification
    try {
      Form result = client
              .form
              .sendReminderNotification(preview, orgId, formId)
              .assessmentId(assessmentId)
              .targetFilter(targetFilter)
              .submitFilter(submitFilter)
              .message(message)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getLabel());
      System.out.println(result.getFields());
      System.out.println(result.getBlocks());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
      System.out.println(result.getTargetType());
      System.out.println(result.getTargetFilter());
      System.out.println(result.getSubmitFilter());
      System.out.println(result.getResponseReadFilter());
      System.out.println(result.getUseFieldAccess());
      System.out.println(result.getApproval());
      System.out.println(result.getAuthorSensitive());
      System.out.println(result.getOptions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#sendReminderNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Form> response = client
              .form
              .sendReminderNotification(preview, orgId, formId)
              .assessmentId(assessmentId)
              .targetFilter(targetFilter)
              .submitFilter(submitFilter)
              .message(message)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#sendReminderNotification");
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
| **formId** | **String**| Form id | |
| **formCollectRequest** | [**FormCollectRequest**](FormCollectRequest.md)| Details on the data collection | [optional] |

### Return type

[**Form**](Form.md)

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

<a name="submitDraftData"></a>
# **submitDraftData**
> FormDraft submitDraftData(orgId, formId).formSubmitRequest(formSubmitRequest).execute();

Submit draft data from a form



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String personId = "personId_example"; // person data is being filled out on behalf of
    Map<String, Object> data = new HashMap(); // data being submitted
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Org id
    Map<String, Object> blocksData = new HashMap(); // data being submitted
    try {
      FormDraft result = client
              .form
              .submitDraftData(personId, data, orgId, formId)
              .blocksData(blocksData)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getFormId());
      System.out.println(result.getPersonId());
      System.out.println(result.getData());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getPendingApprovalChangeId());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#submitDraftData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FormDraft> response = client
              .form
              .submitDraftData(personId, data, orgId, formId)
              .blocksData(blocksData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#submitDraftData");
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
| **formId** | **String**| Org id | |
| **formSubmitRequest** | [**FormSubmitRequest**](FormSubmitRequest.md)| Form data to submit | [optional] |

### Return type

[**FormDraft**](FormDraft.md)

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

<a name="submitFormData"></a>
# **submitFormData**
> submitFormData(orgId, formId).targetId(targetId).targetType(targetType).requestBody(requestBody).execute();

Submit data from a form



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String targetId = "targetId_example"; // Target id
    String targetType = "NONE"; // Target type
    try {
      client
              .form
              .submitFormData(orgId, formId)
              .targetId(targetId)
              .targetType(targetType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#submitFormData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .form
              .submitFormData(orgId, formId)
              .targetId(targetId)
              .targetType(targetType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#submitFormData");
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
| **formId** | **String**| Form id | |
| **targetId** | **String**| Target id | [optional] |
| **targetType** | **String**| Target type | [optional] [enum: NONE, PERSON] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| Form data to submit | [optional] |

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
| **404** | org not found |  -  |

<a name="submitFormDraft"></a>
# **submitFormDraft**
> FormDraft submitFormDraft(orgId, formId).targetId(targetId).targetType(targetType).requestBody(requestBody).execute();

Submit data from a form draft



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String targetId = "targetId_example"; // Target id
    String targetType = "NONE"; // Target type
    try {
      FormDraft result = client
              .form
              .submitFormDraft(orgId, formId)
              .targetId(targetId)
              .targetType(targetType)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getFormId());
      System.out.println(result.getPersonId());
      System.out.println(result.getData());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getPendingApprovalChangeId());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#submitFormDraft");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FormDraft> response = client
              .form
              .submitFormDraft(orgId, formId)
              .targetId(targetId)
              .targetType(targetType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#submitFormDraft");
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
| **formId** | **String**| Form id | |
| **targetId** | **String**| Target id | [optional] |
| **targetType** | **String**| Target type | [optional] [enum: NONE, PERSON] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| Form data to submit | [optional] |

### Return type

[**FormDraft**](FormDraft.md)

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

<a name="submitFormResponse"></a>
# **submitFormResponse**
> submitFormResponse(orgId, formId).formSubmitRequest(formSubmitRequest).execute();

Submit data from a form



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String personId = "personId_example"; // person data is being filled out on behalf of
    Map<String, Object> data = new HashMap(); // data being submitted
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Org id
    Map<String, Object> blocksData = new HashMap(); // data being submitted
    try {
      client
              .form
              .submitFormResponse(personId, data, orgId, formId)
              .blocksData(blocksData)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#submitFormResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .form
              .submitFormResponse(personId, data, orgId, formId)
              .blocksData(blocksData)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#submitFormResponse");
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
| **formId** | **String**| Org id | |
| **formSubmitRequest** | [**FormSubmitRequest**](FormSubmitRequest.md)| Form data to submit | [optional] |

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
| **404** | org not found |  -  |

<a name="updateExistingForm"></a>
# **updateExistingForm**
> updateExistingForm(orgId, formId).updateForm(updateForm).execute();

Update an existing form



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String formId = "formId_example"; // Form id
    String description = "description_example"; // description of form
    String label = "label_example"; // human-readable full name of form
    List<FormField> fields = Arrays.asList(); // ordered list of fields being collected in this form
    List<FormBlock> blocks = Arrays.asList(); // ordered list of blocks being collected in this form
    String status = "ACTIVE"; // status of the form
    String type = "BUILT_IN"; // type of the form
    String targetType = "NONE"; // target type that the form can be filled out about (null defaults to PERSON for backwards compatibility)
    String targetFilter = "targetFilter_example"; // filter that controls on which profiles this tab will appear
    String submitFilter = "submitFilter_example"; // filter that controls which respondents can submit this form. The form:submit permission, if present, overrides this filter
    String responseReadFilter = "responseReadFilter_example"; // filter that controls who can read the form responses. The formResponse:read permission, if present, overrides this filter
    Boolean useFieldAccess = true; // if this option is on, then form response answers will use field permissions to determine access to those responses
    String approval = "MANAGER"; // approval needed, if any approval is required
    String authorSensitive = "ANONYMOUS"; // view sensitivity for the author of this form - the level of view access required to view the createId and updateId fields. If null, the author's identity is always visible as long as the viewer can read the form response. If set to PRIVATE, the author's identity is stored in ChartHop, but protected such that even users with sensitive access cannot access the data. If set to ANONYMOUS, the author's identity is not stored in ChartHop at all.
    Object options = null; // options, such as notification settings
    try {
      client
              .form
              .updateExistingForm(orgId, formId)
              .description(description)
              .label(label)
              .fields(fields)
              .blocks(blocks)
              .status(status)
              .type(type)
              .targetType(targetType)
              .targetFilter(targetFilter)
              .submitFilter(submitFilter)
              .responseReadFilter(responseReadFilter)
              .useFieldAccess(useFieldAccess)
              .approval(approval)
              .authorSensitive(authorSensitive)
              .options(options)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#updateExistingForm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .form
              .updateExistingForm(orgId, formId)
              .description(description)
              .label(label)
              .fields(fields)
              .blocks(blocks)
              .status(status)
              .type(type)
              .targetType(targetType)
              .targetFilter(targetFilter)
              .submitFilter(submitFilter)
              .responseReadFilter(responseReadFilter)
              .useFieldAccess(useFieldAccess)
              .approval(approval)
              .authorSensitive(authorSensitive)
              .options(options)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#updateExistingForm");
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
| **formId** | **String**| Form id | |
| **updateForm** | [**UpdateForm**](UpdateForm.md)| Form data to update | [optional] |

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

<a name="updateFormStatus"></a>
# **updateFormStatus**
> updateFormStatus(orgId).formStatusUpdateRequest(formStatusUpdateRequest).execute();

Update status for existing forms



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FormApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String updateStatus = "ACTIVE"; // New status to update
    List<String> formIds = Arrays.asList(); // Form ids
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    try {
      client
              .form
              .updateFormStatus(updateStatus, formIds, orgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#updateFormStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .form
              .updateFormStatus(updateStatus, formIds, orgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FormApi#updateFormStatus");
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
| **formStatusUpdateRequest** | [**FormStatusUpdateRequest**](FormStatusUpdateRequest.md)| Form data to update | [optional] |

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

