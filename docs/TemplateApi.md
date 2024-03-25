# TemplateApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkDelete**](TemplateApi.md#bulkDelete) | **POST** /v1/org/{orgId}/template/bulk/delete | Delete a set of templates |
| [**createBulkDuplicate**](TemplateApi.md#createBulkDuplicate) | **POST** /v1/org/{orgId}/template/bulk/duplicate | Duplicate a set of templates |
| [**createEmail**](TemplateApi.md#createEmail) | **POST** /v1/org/{orgId}/template/email | Create a template |
| [**createNewTemplate**](TemplateApi.md#createNewTemplate) | **POST** /v1/org/{orgId}/template | Create a template |
| [**evaluateAgainstJob**](TemplateApi.md#evaluateAgainstJob) | **POST** /v1/org/{orgId}/template/{templateId}/render | Render a template by evaluating it against an existing job |
| [**generatePdfsAndEmails**](TemplateApi.md#generatePdfsAndEmails) | **POST** /v1/org/{orgId}/template/{templateId}/generate | Automatically generate PDFs of the templates, and distribute emails to managers and people to download |
| [**generateTemplatePreview**](TemplateApi.md#generateTemplatePreview) | **POST** /v1/org/{orgId}/template/{templateId}/preview | Preview template content without saving it |
| [**getAllInOrgs**](TemplateApi.md#getAllInOrgs) | **GET** /v1/org/{orgId}/template | Return all templates in the organization paginated |
| [**getById**](TemplateApi.md#getById) | **GET** /v1/org/{orgId}/template/{templateId} | Return a particular template by id |
| [**getByName**](TemplateApi.md#getByName) | **GET** /v1/org/{orgId}/template/email/{templateName} | Return a particular email template by name |
| [**removeById**](TemplateApi.md#removeById) | **DELETE** /v1/org/{orgId}/template/{templateId} | Delete a template |
| [**removeEmail**](TemplateApi.md#removeEmail) | **DELETE** /v1/org/{orgId}/template/email/{templateName} | Delete a template |
| [**updateEmailTemplate**](TemplateApi.md#updateEmailTemplate) | **PATCH** /v1/org/{orgId}/template/email/{templateName} | Update an existing template |
| [**updateExisting**](TemplateApi.md#updateExisting) | **PATCH** /v1/org/{orgId}/template/{templateId} | Update an existing template |


<a name="bulkDelete"></a>
# **bulkDelete**
> Process bulkDelete(orgId).requestBody(requestBody).execute();

Delete a set of templates



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
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
              .template
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
      System.err.println("Exception when calling TemplateApi#bulkDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .template
              .bulkDelete(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#bulkDelete");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of template ids to delete | [optional] |

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
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="createBulkDuplicate"></a>
# **createBulkDuplicate**
> Process createBulkDuplicate(orgId).requestBody(requestBody).execute();

Duplicate a set of templates



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
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
              .template
              .createBulkDuplicate(orgId)
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
      System.err.println("Exception when calling TemplateApi#createBulkDuplicate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .template
              .createBulkDuplicate(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createBulkDuplicate");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of template ids to duplicate | [optional] |

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
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="createEmail"></a>
# **createEmail**
> Template createEmail().createTemplate(createTemplate).execute();

Create a template



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // template name, must be unique to organization
    String content = "content_example"; // template content
    List<String> tags = Arrays.asList(); // tags to organize the purpose of the template
    String description = "description_example"; // description of template
    String stylesheet = "stylesheet_example"; // template inline stylesheet
    String type = "DOCUMENT"; // type of template
    String filename = "filename_example"; // document filename CQL
    try {
      Template result = client
              .template
              .createEmail(name, content)
              .tags(tags)
              .description(description)
              .stylesheet(stylesheet)
              .type(type)
              .filename(filename)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getContent());
      System.out.println(result.getStylesheet());
      System.out.println(result.getFormat());
      System.out.println(result.getType());
      System.out.println(result.getFilename());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Template> response = client
              .template
              .createEmail(name, content)
              .tags(tags)
              .description(description)
              .stylesheet(stylesheet)
              .type(type)
              .filename(filename)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createEmail");
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
| **createTemplate** | [**CreateTemplate**](CreateTemplate.md)| Template data to create | [optional] |

### Return type

[**Template**](Template.md)

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

<a name="createNewTemplate"></a>
# **createNewTemplate**
> Template createNewTemplate(orgId).createTemplate(createTemplate).execute();

Create a template



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // template name, must be unique to organization
    String content = "content_example"; // template content
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    List<String> tags = Arrays.asList(); // tags to organize the purpose of the template
    String description = "description_example"; // description of template
    String stylesheet = "stylesheet_example"; // template inline stylesheet
    String type = "DOCUMENT"; // type of template
    String filename = "filename_example"; // document filename CQL
    try {
      Template result = client
              .template
              .createNewTemplate(name, content, orgId)
              .tags(tags)
              .description(description)
              .stylesheet(stylesheet)
              .type(type)
              .filename(filename)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getContent());
      System.out.println(result.getStylesheet());
      System.out.println(result.getFormat());
      System.out.println(result.getType());
      System.out.println(result.getFilename());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createNewTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Template> response = client
              .template
              .createNewTemplate(name, content, orgId)
              .tags(tags)
              .description(description)
              .stylesheet(stylesheet)
              .type(type)
              .filename(filename)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createNewTemplate");
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
| **createTemplate** | [**CreateTemplate**](CreateTemplate.md)| Template data to create | [optional] |

### Return type

[**Template**](Template.md)

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

<a name="evaluateAgainstJob"></a>
# **evaluateAgainstJob**
> TemplateRenderResponse evaluateAgainstJob(orgId, templateId).jobId(jobId).scenarioId(scenarioId).date(date).format(format).changeGroupingType(changeGroupingType).changeGroupingId(changeGroupingId).useScenarioChanges(useScenarioChanges).execute();

Render a template by evaluating it against an existing job



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String templateId = "templateId_example"; // Template id
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date
    String format = "TEXT"; // Format
    String changeGroupingType = "PRIMARY"; // Type of change grouping
    String changeGroupingId = "changeGroupingId_example"; // Change grouping id to query (null for primary)
    Boolean useScenarioChanges = true; // Generate documents for only the changes that are in the scenario. This option also allows you to reference the change within the template, which is otherwise not allowed
    try {
      TemplateRenderResponse result = client
              .template
              .evaluateAgainstJob(orgId, templateId)
              .jobId(jobId)
              .scenarioId(scenarioId)
              .date(date)
              .format(format)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .useScenarioChanges(useScenarioChanges)
              .execute();
      System.out.println(result);
      System.out.println(result.getContent());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#evaluateAgainstJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateRenderResponse> response = client
              .template
              .evaluateAgainstJob(orgId, templateId)
              .jobId(jobId)
              .scenarioId(scenarioId)
              .date(date)
              .format(format)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .useScenarioChanges(useScenarioChanges)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#evaluateAgainstJob");
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
| **templateId** | **String**| Template id | |
| **jobId** | **String**| Job id | [optional] |
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **format** | **String**| Format | [optional] [default to TEXT] [enum: TEXT, PDF] |
| **changeGroupingType** | **String**| Type of change grouping | [optional] [enum: PRIMARY, SCENARIO, COMP_REVIEW] |
| **changeGroupingId** | **String**| Change grouping id to query (null for primary) | [optional] |
| **useScenarioChanges** | **Boolean**| Generate documents for only the changes that are in the scenario. This option also allows you to reference the change within the template, which is otherwise not allowed | [optional] |

### Return type

[**TemplateRenderResponse**](TemplateRenderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="generatePdfsAndEmails"></a>
# **generatePdfsAndEmails**
> Process generatePdfsAndEmails(orgId, templateId).generateTemplateRequest(generateTemplateRequest).execute();

Automatically generate PDFs of the templates, and distribute emails to managers and people to download



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    Boolean saveToFiles = true;
    Boolean sendToManagers = true;
    Boolean sendToPersons = true;
    Boolean useScenarioChanges = true;
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String templateId = "templateId_example"; // Template id
    String filter = "filter_example";
    String emailSubject = "emailSubject_example";
    String emailMessage = "emailMessage_example";
    String fileSensitive = "GLOBAL";
    String fileField = "fileField_example";
    String scenarioId = "scenarioId_example";
    LocalDate date = LocalDate.now();
    String changeGroupingType = "PRIMARY";
    String changeGroupingId = "changeGroupingId_example";
    try {
      Process result = client
              .template
              .generatePdfsAndEmails(saveToFiles, sendToManagers, sendToPersons, useScenarioChanges, orgId, templateId)
              .filter(filter)
              .emailSubject(emailSubject)
              .emailMessage(emailMessage)
              .fileSensitive(fileSensitive)
              .fileField(fileField)
              .scenarioId(scenarioId)
              .date(date)
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
      System.err.println("Exception when calling TemplateApi#generatePdfsAndEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Process> response = client
              .template
              .generatePdfsAndEmails(saveToFiles, sendToManagers, sendToPersons, useScenarioChanges, orgId, templateId)
              .filter(filter)
              .emailSubject(emailSubject)
              .emailMessage(emailMessage)
              .fileSensitive(fileSensitive)
              .fileField(fileField)
              .scenarioId(scenarioId)
              .date(date)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#generatePdfsAndEmails");
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
| **templateId** | **String**| Template id | |
| **generateTemplateRequest** | [**GenerateTemplateRequest**](GenerateTemplateRequest.md)|  | [optional] |

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
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="generateTemplatePreview"></a>
# **generateTemplatePreview**
> TemplateRenderResponse generateTemplatePreview(orgId).jobId(jobId).scenarioId(scenarioId).date(date).format(format).changeGroupingType(changeGroupingType).changeGroupingId(changeGroupingId).useScenarioChanges(useScenarioChanges).templatePreviewRequest(templatePreviewRequest).execute();

Preview template content without saving it



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String content = "content_example";
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String stylesheet = "stylesheet_example";
    String jobId = "jobId_example"; // Job id
    String scenarioId = "scenarioId_example"; // Scenario id to query
    LocalDate date = LocalDate.now(); // Date
    String format = "TEXT"; // Format
    String changeGroupingType = "PRIMARY"; // Type of change grouping
    String changeGroupingId = "changeGroupingId_example"; // Change grouping id to query (null for primary)
    Boolean useScenarioChanges = true; // Generate documents for only the changes that are in the scenario. This option also allows you to reference the change within the template, which is otherwise not allowed
    try {
      TemplateRenderResponse result = client
              .template
              .generateTemplatePreview(content, orgId)
              .stylesheet(stylesheet)
              .jobId(jobId)
              .scenarioId(scenarioId)
              .date(date)
              .format(format)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .useScenarioChanges(useScenarioChanges)
              .execute();
      System.out.println(result);
      System.out.println(result.getContent());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#generateTemplatePreview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateRenderResponse> response = client
              .template
              .generateTemplatePreview(content, orgId)
              .stylesheet(stylesheet)
              .jobId(jobId)
              .scenarioId(scenarioId)
              .date(date)
              .format(format)
              .changeGroupingType(changeGroupingType)
              .changeGroupingId(changeGroupingId)
              .useScenarioChanges(useScenarioChanges)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#generateTemplatePreview");
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
| **jobId** | **String**| Job id | [optional] |
| **scenarioId** | **String**| Scenario id to query | [optional] |
| **date** | **LocalDate**| Date | [optional] |
| **format** | **String**| Format | [optional] [default to TEXT] [enum: TEXT, PDF] |
| **changeGroupingType** | **String**| Type of change grouping | [optional] [enum: PRIMARY, SCENARIO, COMP_REVIEW] |
| **changeGroupingId** | **String**| Change grouping id to query (null for primary) | [optional] |
| **useScenarioChanges** | **Boolean**| Generate documents for only the changes that are in the scenario. This option also allows you to reference the change within the template, which is otherwise not allowed | [optional] |
| **templatePreviewRequest** | [**TemplatePreviewRequest**](TemplatePreviewRequest.md)|  | [optional] |

### Return type

[**TemplateRenderResponse**](TemplateRenderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid data |  -  |
| **401** | not authorized |  -  |
| **403** | permission denied |  -  |
| **404** | not found |  -  |

<a name="getAllInOrgs"></a>
# **getAllInOrgs**
> ResultsTemplate getAllInOrgs(orgId).type(type).from(from).limit(limit).execute();

Return all templates in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String type = "DOCUMENT"; // Type of template to filter by
    String from = "from_example"; // Template id to start paginating from
    Integer limit = 56; // Number of results to return
    try {
      ResultsTemplate result = client
              .template
              .getAllInOrgs(orgId)
              .type(type)
              .from(from)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getAllInOrgs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsTemplate> response = client
              .template
              .getAllInOrgs(orgId)
              .type(type)
              .from(from)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getAllInOrgs");
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
| **type** | **String**| Type of template to filter by | [optional] [enum: DOCUMENT, EMAIL] |
| **from** | **String**| Template id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |

### Return type

[**ResultsTemplate**](ResultsTemplate.md)

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
> Template getById(orgId, templateId).execute();

Return a particular template by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String templateId = "templateId_example"; // Template id
    try {
      Template result = client
              .template
              .getById(orgId, templateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getContent());
      System.out.println(result.getStylesheet());
      System.out.println(result.getFormat());
      System.out.println(result.getType());
      System.out.println(result.getFilename());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Template> response = client
              .template
              .getById(orgId, templateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getById");
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
| **templateId** | **String**| Template id | |

### Return type

[**Template**](Template.md)

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

<a name="getByName"></a>
# **getByName**
> Template getByName(templateName).execute();

Return a particular email template by name



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String templateName = "templateName_example"; // Template name
    try {
      Template result = client
              .template
              .getByName(templateName)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getName());
      System.out.println(result.getContent());
      System.out.println(result.getStylesheet());
      System.out.println(result.getFormat());
      System.out.println(result.getType());
      System.out.println(result.getFilename());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Template> response = client
              .template
              .getByName(templateName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getByName");
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
| **templateName** | **String**| Template name | |

### Return type

[**Template**](Template.md)

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

<a name="removeById"></a>
# **removeById**
> removeById(orgId, templateId).execute();

Delete a template



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String templateId = "templateId_example"; // Template id
    try {
      client
              .template
              .removeById(orgId, templateId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .template
              .removeById(orgId, templateId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#removeById");
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
| **templateId** | **String**| Template id | |

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

<a name="removeEmail"></a>
# **removeEmail**
> removeEmail(templateName).execute();

Delete a template



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String templateName = "templateName_example"; // Template name
    try {
      client
              .template
              .removeEmail(templateName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#removeEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .template
              .removeEmail(templateName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#removeEmail");
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
| **templateName** | **String**| Template name | |

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

<a name="updateEmailTemplate"></a>
# **updateEmailTemplate**
> updateEmailTemplate(templateName).updateTemplate(updateTemplate).execute();

Update an existing template



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String templateName = "templateName_example"; // Template name
    List<String> tags = Arrays.asList(); // tags to organize the purpose of the template
    String description = "description_example"; // description of template
    String name = "name_example"; // template name, must be unique to organization
    String content = "content_example"; // template content
    String stylesheet = "stylesheet_example"; // template inline stylesheet
    String type = "DOCUMENT"; // type of template
    String filename = "filename_example"; // document filename CQL
    try {
      client
              .template
              .updateEmailTemplate(templateName)
              .tags(tags)
              .description(description)
              .name(name)
              .content(content)
              .stylesheet(stylesheet)
              .type(type)
              .filename(filename)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateEmailTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .template
              .updateEmailTemplate(templateName)
              .tags(tags)
              .description(description)
              .name(name)
              .content(content)
              .stylesheet(stylesheet)
              .type(type)
              .filename(filename)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateEmailTemplate");
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
| **templateName** | **String**| Template name | |
| **updateTemplate** | [**UpdateTemplate**](UpdateTemplate.md)| Template data to update | [optional] |

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

<a name="updateExisting"></a>
# **updateExisting**
> updateExisting(orgId, templateId).updateTemplate(updateTemplate).execute();

Update an existing template



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String templateId = "templateId_example"; // Template id
    List<String> tags = Arrays.asList(); // tags to organize the purpose of the template
    String description = "description_example"; // description of template
    String name = "name_example"; // template name, must be unique to organization
    String content = "content_example"; // template content
    String stylesheet = "stylesheet_example"; // template inline stylesheet
    String type = "DOCUMENT"; // type of template
    String filename = "filename_example"; // document filename CQL
    try {
      client
              .template
              .updateExisting(orgId, templateId)
              .tags(tags)
              .description(description)
              .name(name)
              .content(content)
              .stylesheet(stylesheet)
              .type(type)
              .filename(filename)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateExisting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .template
              .updateExisting(orgId, templateId)
              .tags(tags)
              .description(description)
              .name(name)
              .content(content)
              .stylesheet(stylesheet)
              .type(type)
              .filename(filename)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateExisting");
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
| **templateId** | **String**| Template id | |
| **updateTemplate** | [**UpdateTemplate**](UpdateTemplate.md)| Template data to update | [optional] |

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

