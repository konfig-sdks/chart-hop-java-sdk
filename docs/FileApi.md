# FileApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetadata**](FileApi.md#getMetadata) | **GET** /v1/org/{orgId}/file | Returns metadata about a file |
| [**getMetadataById**](FileApi.md#getMetadataById) | **GET** /v1/org/{orgId}/file/{fileId}/download | Download a file |
| [**getMetadata_0**](FileApi.md#getMetadata_0) | **GET** /v1/org/{orgId}/file/{fileId} | Returns metadata about a file |
| [**removeFileById**](FileApi.md#removeFileById) | **DELETE** /v1/org/{orgId}/file/{fileId} | Delete a file |
| [**uploadNewFile**](FileApi.md#uploadNewFile) | **POST** /v1/org/{orgId}/file | Upload a new file |


<a name="getMetadata"></a>
# **getMetadata**
> ResultsFileEntity getMetadata(orgId).entityId(entityId).entityType(entityType).limit(limit).from(from).execute();

Returns metadata about a file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String entityId = "entityId_example"; // Entity id
    String entityType = "entityType_example"; // Entity type
    Integer limit = 56; // Number of results to return
    String from = "from_example"; // From result id
    try {
      ResultsFileEntity result = client
              .file
              .getMetadata(orgId)
              .entityId(entityId)
              .entityType(entityType)
              .limit(limit)
              .from(from)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsFileEntity> response = client
              .file
              .getMetadata(orgId)
              .entityId(entityId)
              .entityType(entityType)
              .limit(limit)
              .from(from)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getMetadata");
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
| **entityId** | **String**| Entity id | [optional] |
| **entityType** | **String**| Entity type | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **from** | **String**| From result id | [optional] |

### Return type

[**ResultsFileEntity**](ResultsFileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Not authorized |  -  |
| **403** | Permission denied |  -  |
| **404** | File not found |  -  |

<a name="getMetadataById"></a>
# **getMetadataById**
> getMetadataById(orgId, fileId).execute();

Download a file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fileId = "fileId_example"; // File id
    try {
      client
              .file
              .getMetadataById(orgId, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getMetadataById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .file
              .getMetadataById(orgId, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getMetadataById");
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
| **fileId** | **String**| File id | |

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
| **401** | Not authorized |  -  |
| **403** | Permission denied |  -  |
| **404** | File not found |  -  |

<a name="getMetadata_0"></a>
# **getMetadata_0**
> FileEntity getMetadata_0(orgId, fileId).execute();

Returns metadata about a file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fileId = "fileId_example"; // File id
    try {
      FileEntity result = client
              .file
              .getMetadata_0(orgId, fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getField());
      System.out.println(result.getSensitive());
      System.out.println(result.getFilename());
      System.out.println(result.getOriginalFilename());
      System.out.println(result.getType());
      System.out.println(result.getExt());
      System.out.println(result.getBytes());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getMetadata_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileEntity> response = client
              .file
              .getMetadata_0(orgId, fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getMetadata_0");
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
| **fileId** | **String**| File id | |

### Return type

[**FileEntity**](FileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Not authorized |  -  |
| **403** | Permission denied |  -  |
| **404** | File not found |  -  |

<a name="removeFileById"></a>
# **removeFileById**
> removeFileById(orgId, fileId).execute();

Delete a file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String fileId = "fileId_example"; // File id
    try {
      client
              .file
              .removeFileById(orgId, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#removeFileById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .file
              .removeFileById(orgId, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#removeFileById");
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
| **fileId** | **String**| File id | |

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

<a name="uploadNewFile"></a>
# **uploadNewFile**
> FileEntity uploadNewFile(orgId).entityId(entityId).entityType(entityType).field(field).sensitive(sensitive).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Upload a new file



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
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
    String entityId = "entityId_example"; // entity id (if not passed, defaults to user id)
    String entityType = "entityType_example"; // entity type (if not passed, defaults to user)
    String field = "field_example"; // field name - can leave blank for a general upload
    String sensitive = "sensitive_example"; // file sensitivity level - defaults to PERSONAL
    try {
      FileEntity result = client
              .file
              .uploadNewFile(orgId)
              ._file(_file)
              .entityId(entityId)
              .entityType(entityType)
              .field(field)
              .sensitive(sensitive)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getEntityId());
      System.out.println(result.getEntityType());
      System.out.println(result.getField());
      System.out.println(result.getSensitive());
      System.out.println(result.getFilename());
      System.out.println(result.getOriginalFilename());
      System.out.println(result.getType());
      System.out.println(result.getExt());
      System.out.println(result.getBytes());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#uploadNewFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileEntity> response = client
              .file
              .uploadNewFile(orgId)
              ._file(_file)
              .entityId(entityId)
              .entityType(entityType)
              .field(field)
              .sensitive(sensitive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#uploadNewFile");
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
| **entityId** | **String**| entity id (if not passed, defaults to user id) | [optional] |
| **entityType** | **String**| entity type (if not passed, defaults to user) | [optional] |
| **field** | **String**| field name - can leave blank for a general upload | [optional] |
| **sensitive** | **String**| file sensitivity level - defaults to PERSONAL | [optional] |
| **fileUploadNewFileRequest** | [**FileUploadNewFileRequest**](FileUploadNewFileRequest.md)|  | [optional] |

### Return type

[**FileEntity**](FileEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | Invalid type or bad request |  -  |
| **401** | Not authorized |  -  |

