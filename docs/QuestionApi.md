# QuestionApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](QuestionApi.md#create) | **POST** /v1/org/{orgId}/question | Create a question |
| [**getAllInOrg**](QuestionApi.md#getAllInOrg) | **GET** /v1/org/{orgId}/question | Return all questions in the organization paginated |
| [**getById**](QuestionApi.md#getById) | **GET** /v1/org/{orgId}/question/{questionId} | Return a particular question by id |
| [**remove**](QuestionApi.md#remove) | **DELETE** /v1/org/{orgId}/question/{questionId} | Delete a question |
| [**updateByOrgAndId**](QuestionApi.md#updateByOrgAndId) | **PATCH** /v1/org/{orgId}/question/{questionId} | Update an existing question |


<a name="create"></a>
# **create**
> Question create(orgId).createQuestion(createQuestion).execute();

Create a question



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String question = "question_example"; // text of the question
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String orgId = "orgId_example"; // parent organization id (empty if global)
    String fieldId = "fieldId_example"; // if the question is linked to a field, the id of that field. Any question responses will be automatically saved to the field
    String type = "ADDRESS"; // datatype of the question
    String plural = "SINGLE"; // plural type of the question datatype (either SINGLE, LIST, or SET)
    List<EnumValue> values = Arrays.asList(); // possible values (enum type only)
    Object options = null; // validation options
    try {
      Question result = client
              .question
              .create(question, orgId)
              .orgId(orgId)
              .fieldId(fieldId)
              .type(type)
              .plural(plural)
              .values(values)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getQuestion());
      System.out.println(result.getFieldId());
      System.out.println(result.getType());
      System.out.println(result.getPlural());
      System.out.println(result.getValues());
      System.out.println(result.getOptions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Question> response = client
              .question
              .create(question, orgId)
              .orgId(orgId)
              .fieldId(fieldId)
              .type(type)
              .plural(plural)
              .values(values)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#create");
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
| **createQuestion** | [**CreateQuestion**](CreateQuestion.md)| Question data to create | [optional] |

### Return type

[**Question**](Question.md)

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

<a name="getAllInOrg"></a>
# **getAllInOrg**
> ResultsQuestion getAllInOrg(orgId).from(from).limit(limit).ids(ids).execute();

Return all questions in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String from = "from_example"; // Question id to start paginating from
    Integer limit = 56; // Number of results to return
    String ids = "ids_example"; // Comma separated Question Ids to find
    try {
      ResultsQuestion result = client
              .question
              .getAllInOrg(orgId)
              .from(from)
              .limit(limit)
              .ids(ids)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#getAllInOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsQuestion> response = client
              .question
              .getAllInOrg(orgId)
              .from(from)
              .limit(limit)
              .ids(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#getAllInOrg");
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
| **from** | **String**| Question id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **ids** | **String**| Comma separated Question Ids to find | [optional] |

### Return type

[**ResultsQuestion**](ResultsQuestion.md)

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
> Question getById(orgId, questionId).execute();

Return a particular question by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String questionId = "questionId_example"; // Question id
    try {
      Question result = client
              .question
              .getById(orgId, questionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getQuestion());
      System.out.println(result.getFieldId());
      System.out.println(result.getType());
      System.out.println(result.getPlural());
      System.out.println(result.getValues());
      System.out.println(result.getOptions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Question> response = client
              .question
              .getById(orgId, questionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#getById");
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
| **questionId** | **String**| Question id | |

### Return type

[**Question**](Question.md)

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

<a name="remove"></a>
# **remove**
> remove(orgId, questionId).execute();

Delete a question



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String questionId = "questionId_example"; // Question id
    try {
      client
              .question
              .remove(orgId, questionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .question
              .remove(orgId, questionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#remove");
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
| **questionId** | **String**| Question id | |

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

<a name="updateByOrgAndId"></a>
# **updateByOrgAndId**
> updateByOrgAndId(orgId, questionId).updateQuestion(updateQuestion).execute();

Update an existing question



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String questionId = "questionId_example"; // Question id
    String question = "question_example"; // text of the question
    String fieldId = "fieldId_example"; // if the question is linked to a field, the id of that field. Any question responses will be automatically saved to the field
    String type = "ADDRESS"; // datatype of the question
    String plural = "SINGLE"; // plural type of the question datatype (either SINGLE, LIST, or SET)
    List<EnumValue> values = Arrays.asList(); // possible values (enum type only)
    Object options = null; // validation options
    try {
      client
              .question
              .updateByOrgAndId(orgId, questionId)
              .question(question)
              .fieldId(fieldId)
              .type(type)
              .plural(plural)
              .values(values)
              .options(options)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#updateByOrgAndId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .question
              .updateByOrgAndId(orgId, questionId)
              .question(question)
              .fieldId(fieldId)
              .type(type)
              .plural(plural)
              .values(values)
              .options(options)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#updateByOrgAndId");
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
| **questionId** | **String**| Question id | |
| **updateQuestion** | [**UpdateQuestion**](UpdateQuestion.md)| Question data to update | [optional] |

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

