# BudgetPoolApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateGuideline**](BudgetPoolApi.md#calculateGuideline) | **GET** /v1/org/{orgId}/budget-pool/{id}/calculate |  |
| [**calculateGuideline_0**](BudgetPoolApi.md#calculateGuideline_0) | **GET** /v1/org/{orgId}/budget-pool/{id}/preview | Generate tiering &amp; preview with the given budget calculated for the compensation review |
| [**createNewPool**](BudgetPoolApi.md#createNewPool) | **POST** /v1/org/{orgId}/budget-pool | Create a new budget pool |
| [**deleteBudgetPoolById**](BudgetPoolApi.md#deleteBudgetPoolById) | **DELETE** /v1/org/{orgId}/budget-pool/{id} | Delete a budget pool |
| [**getAllForOrg**](BudgetPoolApi.md#getAllForOrg) | **GET** /v1/org/{orgId}/budget-pool | Get all budget pools for an org |
| [**getGuidelinesForBudgetPool**](BudgetPoolApi.md#getGuidelinesForBudgetPool) | **GET** /v1/org/{orgId}/budget-pool/{id}/guidelines | Get the guidelines associated with a budget pool |
| [**getSpecificPool**](BudgetPoolApi.md#getSpecificPool) | **GET** /v1/org/{orgId}/budget-pool/{id} | Get a specific budget pool |
| [**updateBudgetPool**](BudgetPoolApi.md#updateBudgetPool) | **PATCH** /v1/org/{orgId}/budget-pool/{id} | Update a budget pool |


<a name="calculateGuideline"></a>
# **calculateGuideline**
> calculateGuideline(orgId, id).scenarioId(scenarioId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetPoolApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug
    String id = "id_example"; // ID of the desired budget pool
    String scenarioId = "scenarioId_example"; // ID of the scenario the budget will be calculated against
    try {
      client
              .budgetPool
              .calculateGuideline(orgId, id)
              .scenarioId(scenarioId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#calculateGuideline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .budgetPool
              .calculateGuideline(orgId, id)
              .scenarioId(scenarioId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#calculateGuideline");
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
| **orgId** | **String**| Org identifier (either id or slug | |
| **id** | **String**| ID of the desired budget pool | |
| **scenarioId** | **String**| ID of the scenario the budget will be calculated against | [optional] |

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
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="calculateGuideline_0"></a>
# **calculateGuideline_0**
> BudgetTiersResponse calculateGuideline_0(orgId, id).execute();

Generate tiering &amp; preview with the given budget calculated for the compensation review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetPoolApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug
    String id = "id_example"; // ID of the desired budget pool
    try {
      BudgetTiersResponse result = client
              .budgetPool
              .calculateGuideline_0(orgId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getReviews());
      System.out.println(result.getFinalApprovers());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#calculateGuideline_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetTiersResponse> response = client
              .budgetPool
              .calculateGuideline_0(orgId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#calculateGuideline_0");
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
| **orgId** | **String**| Org identifier (either id or slug | |
| **id** | **String**| ID of the desired budget pool | |

### Return type

[**BudgetTiersResponse**](BudgetTiersResponse.md)

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

<a name="createNewPool"></a>
# **createNewPool**
> createNewPool(orgId).createBudgetPool(createBudgetPool).execute();

Create a new budget pool



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetPoolApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String compReviewId = "compReviewId_example"; // the ID of the comp review this budget is for
    String label = "label_example"; // unique label
    String appliedField = "appliedField_example"; // the field this budget pool applies to
    String sourceField = "sourceField_example"; // the field this budget pool is calculated from
    String basisType = "CUSTOM"; // the method for calculating the amount in the budget
    String orgId = "orgId_example"; // Org identifier (either id or slug
    String participantsExpr = "participantsExpr_example"; // expression that determines if a particular job is included in this budget pool
    Money fixedAmount = new Money();
    Double fixedValue = 3.4D; // a fixed amount for the budget (used with basisType=FIXED || basisType=PERCENTAGE)
    BasisFieldMatrix basisFieldMatrix = new BasisFieldMatrix();
    Map<String, Money> fixedBudgetMap = new HashMap(); // a map of reviewer job IDs to fixed budget money amounts
    String basisExpr = "basisExpr_example"; // expression that calculates how much each job contributes to the budget (used with basisType=CUSTOM)
    String defaultCurrency = "defaultCurrency_example"; // Default currency used when calculating budget pool, falls back to org primary currency if not set
    try {
      client
              .budgetPool
              .createNewPool(compReviewId, label, appliedField, sourceField, basisType, orgId)
              .participantsExpr(participantsExpr)
              .fixedAmount(fixedAmount)
              .fixedValue(fixedValue)
              .basisFieldMatrix(basisFieldMatrix)
              .fixedBudgetMap(fixedBudgetMap)
              .basisExpr(basisExpr)
              .defaultCurrency(defaultCurrency)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#createNewPool");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .budgetPool
              .createNewPool(compReviewId, label, appliedField, sourceField, basisType, orgId)
              .participantsExpr(participantsExpr)
              .fixedAmount(fixedAmount)
              .fixedValue(fixedValue)
              .basisFieldMatrix(basisFieldMatrix)
              .fixedBudgetMap(fixedBudgetMap)
              .basisExpr(basisExpr)
              .defaultCurrency(defaultCurrency)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#createNewPool");
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
| **orgId** | **String**| Org identifier (either id or slug | |
| **createBudgetPool** | [**CreateBudgetPool**](CreateBudgetPool.md)|  | [optional] |

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
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="deleteBudgetPoolById"></a>
# **deleteBudgetPoolById**
> deleteBudgetPoolById(orgId, id).execute();

Delete a budget pool



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetPoolApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug
    String id = "id_example"; // ID of the desired budget pool
    try {
      client
              .budgetPool
              .deleteBudgetPoolById(orgId, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#deleteBudgetPoolById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .budgetPool
              .deleteBudgetPoolById(orgId, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#deleteBudgetPoolById");
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
| **orgId** | **String**| Org identifier (either id or slug | |
| **id** | **String**| ID of the desired budget pool | |

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
| **401** | not authorized |  -  |
| **404** | not found |  -  |

<a name="getAllForOrg"></a>
# **getAllForOrg**
> ResultsData getAllForOrg(orgId).compReviewId(compReviewId).execute();

Get all budget pools for an org



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetPoolApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // Comp Review Id to filter on
    try {
      ResultsData result = client
              .budgetPool
              .getAllForOrg(orgId)
              .compReviewId(compReviewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
      System.out.println(result.getAccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#getAllForOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsData> response = client
              .budgetPool
              .getAllForOrg(orgId)
              .compReviewId(compReviewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#getAllForOrg");
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
| **compReviewId** | **String**| Comp Review Id to filter on | [optional] |

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

<a name="getGuidelinesForBudgetPool"></a>
# **getGuidelinesForBudgetPool**
> ResultsGuideline getGuidelinesForBudgetPool(orgId, id).execute();

Get the guidelines associated with a budget pool



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetPoolApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String id = "id_example"; // ID of the desired budget pool
    try {
      ResultsGuideline result = client
              .budgetPool
              .getGuidelinesForBudgetPool(orgId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#getGuidelinesForBudgetPool");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsGuideline> response = client
              .budgetPool
              .getGuidelinesForBudgetPool(orgId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#getGuidelinesForBudgetPool");
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
| **id** | **String**| ID of the desired budget pool | |

### Return type

[**ResultsGuideline**](ResultsGuideline.md)

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

<a name="getSpecificPool"></a>
# **getSpecificPool**
> BudgetPool getSpecificPool(orgId, id).execute();

Get a specific budget pool



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetPoolApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String id = "id_example"; // ID of the desired budget pool
    try {
      BudgetPool result = client
              .budgetPool
              .getSpecificPool(orgId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getCompReviewId());
      System.out.println(result.getLabel());
      System.out.println(result.getParticipantsExpr());
      System.out.println(result.getAppliedField());
      System.out.println(result.getSourceField());
      System.out.println(result.getBasisType());
      System.out.println(result.getFixedAmount());
      System.out.println(result.getFixedValue());
      System.out.println(result.getBasisFieldMatrix());
      System.out.println(result.getFixedBudgetMap());
      System.out.println(result.getBasisExpr());
      System.out.println(result.getDefaultCurrency());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#getSpecificPool");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetPool> response = client
              .budgetPool
              .getSpecificPool(orgId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#getSpecificPool");
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
| **id** | **String**| ID of the desired budget pool | |

### Return type

[**BudgetPool**](BudgetPool.md)

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

<a name="updateBudgetPool"></a>
# **updateBudgetPool**
> updateBudgetPool(orgId, id).updateBudgetPool(updateBudgetPool).execute();

Update a budget pool



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetPoolApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug
    String id = "id_example"; // ID of the desired budget pool
    String label = "label_example"; // unique label
    String participantsExpr = "participantsExpr_example"; // expression that determines if a particular job is included in this budget pool
    String appliedField = "appliedField_example"; // the field this budget pool applies to
    String sourceField = "sourceField_example"; // the field this budget pool is calculated from
    String basisType = "CUSTOM"; // the method for calculating the amount in the budget
    Money fixedAmount = new Money();
    Double fixedValue = 3.4D; // a fixed amount for the budget (used with basisType=FIXED || basisType=PERCENTAGE)
    BasisFieldMatrix basisFieldMatrix = new BasisFieldMatrix();
    Map<String, Money> fixedBudgetMap = new HashMap(); // a map of reviewer job IDs to fixed budget money amounts
    String basisExpr = "basisExpr_example"; // expression that calculates how much each job contributes to the budget (used with basisType=CUSTOM)
    String defaultCurrency = "defaultCurrency_example"; // Default currency used when calculating budget pool, falls back to org primary currency if not set
    try {
      client
              .budgetPool
              .updateBudgetPool(orgId, id)
              .label(label)
              .participantsExpr(participantsExpr)
              .appliedField(appliedField)
              .sourceField(sourceField)
              .basisType(basisType)
              .fixedAmount(fixedAmount)
              .fixedValue(fixedValue)
              .basisFieldMatrix(basisFieldMatrix)
              .fixedBudgetMap(fixedBudgetMap)
              .basisExpr(basisExpr)
              .defaultCurrency(defaultCurrency)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#updateBudgetPool");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .budgetPool
              .updateBudgetPool(orgId, id)
              .label(label)
              .participantsExpr(participantsExpr)
              .appliedField(appliedField)
              .sourceField(sourceField)
              .basisType(basisType)
              .fixedAmount(fixedAmount)
              .fixedValue(fixedValue)
              .basisFieldMatrix(basisFieldMatrix)
              .fixedBudgetMap(fixedBudgetMap)
              .basisExpr(basisExpr)
              .defaultCurrency(defaultCurrency)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetPoolApi#updateBudgetPool");
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
| **orgId** | **String**| Org identifier (either id or slug | |
| **id** | **String**| ID of the desired budget pool | |
| **updateBudgetPool** | [**UpdateBudgetPool**](UpdateBudgetPool.md)|  | [optional] |

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
| **401** | not authorized |  -  |
| **404** | not found |  -  |

