# ProductApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewProduct**](ProductApi.md#createNewProduct) | **POST** /v1/product | Create a new product |
| [**getById**](ProductApi.md#getById) | **GET** /v1/product/{productId} | Return a particular product by id |
| [**listAllProducts**](ProductApi.md#listAllProducts) | **GET** /v1/product | Return all products |
| [**updateExistingProduct**](ProductApi.md#updateExistingProduct) | **PATCH** /v1/product/{productId} | Update an existing product |


<a name="createNewProduct"></a>
# **createNewProduct**
> Product createNewProduct().createProduct(createProduct).execute();

Create a new product



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String name = "name_example"; // name of product
    String salesforceProductId = "salesforceProductId_example"; // corresponding product id in salesforce
    String stripeProductId = "stripeProductId_example"; // corresponding product id in stripe
    Set<String> features = Arrays.asList(); // set of features this product has access to
    String sku = "sku_example"; // unique sku of product
    Map<String, List<FeatureAccessOption>> featureOptions = new HashMap(); // map of options for the feature
    try {
      Product result = client
              .product
              .createNewProduct(name, salesforceProductId, stripeProductId, features)
              .sku(sku)
              .featureOptions(featureOptions)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSku());
      System.out.println(result.getSalesforceProductId());
      System.out.println(result.getStripeProductId());
      System.out.println(result.getFeatures());
      System.out.println(result.getFeatureOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createNewProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Product> response = client
              .product
              .createNewProduct(name, salesforceProductId, stripeProductId, features)
              .sku(sku)
              .featureOptions(featureOptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createNewProduct");
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
| **createProduct** | [**CreateProduct**](CreateProduct.md)| Product data to create | [optional] |

### Return type

[**Product**](Product.md)

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

<a name="getById"></a>
# **getById**
> Product getById(productId).execute();

Return a particular product by id



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String productId = "productId_example"; // Product id
    try {
      Product result = client
              .product
              .getById(productId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSku());
      System.out.println(result.getSalesforceProductId());
      System.out.println(result.getStripeProductId());
      System.out.println(result.getFeatures());
      System.out.println(result.getFeatureOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Product> response = client
              .product
              .getById(productId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getById");
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
| **productId** | **String**| Product id | |

### Return type

[**Product**](Product.md)

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

<a name="listAllProducts"></a>
# **listAllProducts**
> ResultsProduct listAllProducts().execute();

Return all products



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    try {
      ResultsProduct result = client
              .product
              .listAllProducts()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listAllProducts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsProduct> response = client
              .product
              .listAllProducts()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listAllProducts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultsProduct**](ResultsProduct.md)

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

<a name="updateExistingProduct"></a>
# **updateExistingProduct**
> updateExistingProduct(productId).updateProduct(updateProduct).execute();

Update an existing product



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String productId = "productId_example"; // Product id
    String name = "name_example"; // name of product
    String sku = "sku_example"; // unique sku of product
    String salesforceProductId = "salesforceProductId_example"; // corresponding product id in salesforce
    String stripeProductId = "stripeProductId_example"; // corresponding product id in stripe
    Set<String> features = Arrays.asList(); // set of features this product has access to
    Map<String, List<FeatureAccessOption>> featureOptions = new HashMap(); // map of options for the feature
    try {
      client
              .product
              .updateExistingProduct(productId)
              .name(name)
              .sku(sku)
              .salesforceProductId(salesforceProductId)
              .stripeProductId(stripeProductId)
              .features(features)
              .featureOptions(featureOptions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateExistingProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .product
              .updateExistingProduct(productId)
              .name(name)
              .sku(sku)
              .salesforceProductId(salesforceProductId)
              .stripeProductId(stripeProductId)
              .features(features)
              .featureOptions(featureOptions)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateExistingProduct");
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
| **productId** | **String**| Product id | |
| **updateProduct** | [**UpdateProduct**](UpdateProduct.md)| Product data to update | [optional] |

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

