# MediaApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetadata**](MediaApi.md#getMetadata) | **GET** /v1/media/{mediaId} | Returns metadata about a piece of media |
| [**getMetadata_0**](MediaApi.md#getMetadata_0) | **GET** /v1/org/{orgId}/media/{mediaId} | Returns metadata about a piece of media |
| [**uploadNewMedia**](MediaApi.md#uploadNewMedia) | **POST** /v1/media | Upload a new piece of media |
| [**uploadNewPiece**](MediaApi.md#uploadNewPiece) | **POST** /v1/org/{orgId}/media | Upload a new piece of media |


<a name="getMetadata"></a>
# **getMetadata**
> Media getMetadata(mediaId).execute();

Returns metadata about a piece of media



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MediaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String mediaId = "mediaId_example"; // Media id
    try {
      Media result = client
              .media
              .getMetadata(mediaId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getPath());
      System.out.println(result.getType());
      System.out.println(result.getBytes());
      System.out.println(result.getWidth());
      System.out.println(result.getHeight());
      System.out.println(result.getVersions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#getMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Media> response = client
              .media
              .getMetadata(mediaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#getMetadata");
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
| **mediaId** | **String**| Media id | |

### Return type

[**Media**](Media.md)

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
| **404** | Media not found |  -  |

<a name="getMetadata_0"></a>
# **getMetadata_0**
> Media getMetadata_0(orgId, mediaId).execute();

Returns metadata about a piece of media



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MediaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String mediaId = "mediaId_example"; // Media id
    try {
      Media result = client
              .media
              .getMetadata_0(orgId, mediaId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getPath());
      System.out.println(result.getType());
      System.out.println(result.getBytes());
      System.out.println(result.getWidth());
      System.out.println(result.getHeight());
      System.out.println(result.getVersions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#getMetadata_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Media> response = client
              .media
              .getMetadata_0(orgId, mediaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#getMetadata_0");
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
| **mediaId** | **String**| Media id | |

### Return type

[**Media**](Media.md)

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
| **404** | Media not found |  -  |

<a name="uploadNewMedia"></a>
# **uploadNewMedia**
> Media uploadNewMedia().fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Upload a new piece of media



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MediaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    File _file = new File("/path/to/file");
    try {
      Media result = client
              .media
              .uploadNewMedia()
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getPath());
      System.out.println(result.getType());
      System.out.println(result.getBytes());
      System.out.println(result.getWidth());
      System.out.println(result.getHeight());
      System.out.println(result.getVersions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#uploadNewMedia");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Media> response = client
              .media
              .uploadNewMedia()
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#uploadNewMedia");
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
| **fileUploadNewFileRequest** | [**FileUploadNewFileRequest**](FileUploadNewFileRequest.md)|  | [optional] |

### Return type

[**Media**](Media.md)

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

<a name="uploadNewPiece"></a>
# **uploadNewPiece**
> Media uploadNewPiece(orgId).fileUploadNewFileRequest(fileUploadNewFileRequest).execute();

Upload a new piece of media



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MediaApi;
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
    try {
      Media result = client
              .media
              .uploadNewPiece(orgId)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getPath());
      System.out.println(result.getType());
      System.out.println(result.getBytes());
      System.out.println(result.getWidth());
      System.out.println(result.getHeight());
      System.out.println(result.getVersions());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#uploadNewPiece");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Media> response = client
              .media
              .uploadNewPiece(orgId)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#uploadNewPiece");
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
| **fileUploadNewFileRequest** | [**FileUploadNewFileRequest**](FileUploadNewFileRequest.md)|  | [optional] |

### Return type

[**Media**](Media.md)

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

