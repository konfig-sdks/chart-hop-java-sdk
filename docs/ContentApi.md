# ContentApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPiece**](ContentApi.md#createNewPiece) | **POST** /v1/org/{orgId}/content | Create a new piece of content |
| [**getById**](ContentApi.md#getById) | **GET** /v1/org/{orgId}/content/{contentId} | Return a particular content by id |
| [**getByPath**](ContentApi.md#getByPath) | **GET** /v1/org/{orgId}/content/path/{path} | Return a particular content by path |
| [**getPaginated**](ContentApi.md#getPaginated) | **GET** /v1/org/{orgId}/content | Return all content in the organization paginated |
| [**removeById**](ContentApi.md#removeById) | **DELETE** /v1/org/{orgId}/content/{contentId} | Delete a content |
| [**renderByPath**](ContentApi.md#renderByPath) | **GET** /v1/org/{orgId}/content/path/{path}/render | Return a particular content by path, and render its contents |
| [**renderHomepageContents**](ContentApi.md#renderHomepageContents) | **GET** /v1/org/{orgId}/content/homepage/render | Render the contents of the homepage |
| [**updateHomepageContent**](ContentApi.md#updateHomepageContent) | **PATCH** /v1/org/{orgId}/content/homepage | Update the homepage content |
| [**updatePieceById**](ContentApi.md#updatePieceById) | **PATCH** /v1/org/{orgId}/content/{contentId} | Update an existing piece of content |


<a name="createNewPiece"></a>
# **createNewPiece**
> Content createNewPiece(orgId).createContent(createContent).execute();

Create a new piece of content



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String title = "title_example"; // title of the content page
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String parentContentId = "parentContentId_example"; // parent content id in the hierarchy
    String path = "path_example"; // full path to the content, if not set, defaults to an id/slug generated URL
    List<ContentBlock> blocks = Arrays.asList(); // content blocks
    String imagePath = "imagePath_example"; // path to the image for the page
    String emoji = "emoji_example"; // emoji, if an emoji is used to represent the page
    String coverImagePath = "coverImagePath_example"; // path to the cover image for the content page
    String sensitive = "GLOBAL"; // sensitivity level (ORG public, HIGHly sensitive, or PRIVATE)
    List<ShareAccess> shareAccess = Arrays.asList(); // list of users and groups who have the content shared with them
    String status = "DRAFT"; // current status of the content page
    try {
      Content result = client
              .content
              .createNewPiece(title, orgId)
              .parentContentId(parentContentId)
              .path(path)
              .blocks(blocks)
              .imagePath(imagePath)
              .emoji(emoji)
              .coverImagePath(coverImagePath)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getParentContentId());
      System.out.println(result.getPath());
      System.out.println(result.getBlocks());
      System.out.println(result.getImagePath());
      System.out.println(result.getEmoji());
      System.out.println(result.getCoverImagePath());
      System.out.println(result.getSensitive());
      System.out.println(result.getShareAccess());
      System.out.println(result.getStatus());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#createNewPiece");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Content> response = client
              .content
              .createNewPiece(title, orgId)
              .parentContentId(parentContentId)
              .path(path)
              .blocks(blocks)
              .imagePath(imagePath)
              .emoji(emoji)
              .coverImagePath(coverImagePath)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#createNewPiece");
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
| **createContent** | [**CreateContent**](CreateContent.md)| Content data to create | [optional] |

### Return type

[**Content**](Content.md)

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

<a name="getById"></a>
# **getById**
> Content getById(orgId, contentId).execute();

Return a particular content by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String contentId = "contentId_example"; // Content id
    try {
      Content result = client
              .content
              .getById(orgId, contentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getParentContentId());
      System.out.println(result.getPath());
      System.out.println(result.getBlocks());
      System.out.println(result.getImagePath());
      System.out.println(result.getEmoji());
      System.out.println(result.getCoverImagePath());
      System.out.println(result.getSensitive());
      System.out.println(result.getShareAccess());
      System.out.println(result.getStatus());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Content> response = client
              .content
              .getById(orgId, contentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#getById");
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
| **contentId** | **String**| Content id | |

### Return type

[**Content**](Content.md)

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

<a name="getByPath"></a>
# **getByPath**
> Content getByPath(orgId, path).execute();

Return a particular content by path



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String path = "path_example"; // Path
    try {
      Content result = client
              .content
              .getByPath(orgId, path)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getParentContentId());
      System.out.println(result.getPath());
      System.out.println(result.getBlocks());
      System.out.println(result.getImagePath());
      System.out.println(result.getEmoji());
      System.out.println(result.getCoverImagePath());
      System.out.println(result.getSensitive());
      System.out.println(result.getShareAccess());
      System.out.println(result.getStatus());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#getByPath");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Content> response = client
              .content
              .getByPath(orgId, path)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#getByPath");
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
| **path** | **String**| Path | |

### Return type

[**Content**](Content.md)

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

<a name="getPaginated"></a>
# **getPaginated**
> ResultsContent getPaginated(orgId).from(from).limit(limit).returnAccess(returnAccess).execute();

Return all content in the organization paginated



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String from = "from_example"; // Content id to start paginating from
    Integer limit = 56; // Number of results to return
    String returnAccess = "returnAccess_example"; // Return access information -- pass a list of actions to check, for example: create,update,delete
    try {
      ResultsContent result = client
              .content
              .getPaginated(orgId)
              .from(from)
              .limit(limit)
              .returnAccess(returnAccess)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#getPaginated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsContent> response = client
              .content
              .getPaginated(orgId)
              .from(from)
              .limit(limit)
              .returnAccess(returnAccess)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#getPaginated");
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
| **from** | **String**| Content id to start paginating from | [optional] |
| **limit** | **Integer**| Number of results to return | [optional] |
| **returnAccess** | **String**| Return access information -- pass a list of actions to check, for example: create,update,delete | [optional] |

### Return type

[**ResultsContent**](ResultsContent.md)

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
> removeById(orgId, contentId).execute();

Delete a content



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String contentId = "contentId_example"; // Content id
    try {
      client
              .content
              .removeById(orgId, contentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .content
              .removeById(orgId, contentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#removeById");
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
| **contentId** | **String**| Content id | |

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

<a name="renderByPath"></a>
# **renderByPath**
> ContentRender renderByPath(orgId, path).execute();

Return a particular content by path, and render its contents



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String path = "path_example"; // Path
    try {
      ContentRender result = client
              .content
              .renderByPath(orgId, path)
              .execute();
      System.out.println(result);
      System.out.println(result.getBlocks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#renderByPath");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContentRender> response = client
              .content
              .renderByPath(orgId, path)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#renderByPath");
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
| **path** | **String**| Path | |

### Return type

[**ContentRender**](ContentRender.md)

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

<a name="renderHomepageContents"></a>
# **renderHomepageContents**
> HomepageContentRender renderHomepageContents(orgId).execute();

Render the contents of the homepage



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
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
      HomepageContentRender result = client
              .content
              .renderHomepageContents(orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getContent());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#renderHomepageContents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomepageContentRender> response = client
              .content
              .renderHomepageContents(orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#renderHomepageContents");
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

[**HomepageContentRender**](HomepageContentRender.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateHomepageContent"></a>
# **updateHomepageContent**
> updateHomepageContent(orgId).updateContent(updateContent).execute();

Update the homepage content



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String title = "title_example"; // title of the content page
    String parentContentId = "parentContentId_example"; // parent content id in the hierarchy
    String path = "path_example"; // full path to the content, if not set, defaults to an id/slug generated URL
    List<ContentBlock> blocks = Arrays.asList(); // content blocks
    String imagePath = "imagePath_example"; // path to the image for the page
    String emoji = "emoji_example"; // emoji, if an emoji is used to represent the page
    String coverImagePath = "coverImagePath_example"; // path to the cover image for the content page
    String sensitive = "GLOBAL"; // sensitivity level (ORG public, HIGHly sensitive, or PRIVATE)
    List<ShareAccess> shareAccess = Arrays.asList(); // list of users and groups who have the content shared with them
    String status = "DRAFT"; // current status of the content page
    try {
      client
              .content
              .updateHomepageContent(orgId)
              .title(title)
              .parentContentId(parentContentId)
              .path(path)
              .blocks(blocks)
              .imagePath(imagePath)
              .emoji(emoji)
              .coverImagePath(coverImagePath)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#updateHomepageContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .content
              .updateHomepageContent(orgId)
              .title(title)
              .parentContentId(parentContentId)
              .path(path)
              .blocks(blocks)
              .imagePath(imagePath)
              .emoji(emoji)
              .coverImagePath(coverImagePath)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .status(status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#updateHomepageContent");
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
| **updateContent** | [**UpdateContent**](UpdateContent.md)|  | [optional] |

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
| **0** | successful operation |  -  |

<a name="updatePieceById"></a>
# **updatePieceById**
> updatePieceById(orgId, contentId).updateContent(updateContent).execute();

Update an existing piece of content



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String contentId = "contentId_example"; // Content id
    String title = "title_example"; // title of the content page
    String parentContentId = "parentContentId_example"; // parent content id in the hierarchy
    String path = "path_example"; // full path to the content, if not set, defaults to an id/slug generated URL
    List<ContentBlock> blocks = Arrays.asList(); // content blocks
    String imagePath = "imagePath_example"; // path to the image for the page
    String emoji = "emoji_example"; // emoji, if an emoji is used to represent the page
    String coverImagePath = "coverImagePath_example"; // path to the cover image for the content page
    String sensitive = "GLOBAL"; // sensitivity level (ORG public, HIGHly sensitive, or PRIVATE)
    List<ShareAccess> shareAccess = Arrays.asList(); // list of users and groups who have the content shared with them
    String status = "DRAFT"; // current status of the content page
    try {
      client
              .content
              .updatePieceById(orgId, contentId)
              .title(title)
              .parentContentId(parentContentId)
              .path(path)
              .blocks(blocks)
              .imagePath(imagePath)
              .emoji(emoji)
              .coverImagePath(coverImagePath)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#updatePieceById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .content
              .updatePieceById(orgId, contentId)
              .title(title)
              .parentContentId(parentContentId)
              .path(path)
              .blocks(blocks)
              .imagePath(imagePath)
              .emoji(emoji)
              .coverImagePath(coverImagePath)
              .sensitive(sensitive)
              .shareAccess(shareAccess)
              .status(status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentApi#updatePieceById");
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
| **contentId** | **String**| Content id | |
| **updateContent** | [**UpdateContent**](UpdateContent.md)| Content data to update | [optional] |

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

