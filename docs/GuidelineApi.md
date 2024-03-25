# GuidelineApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allForCompReview**](GuidelineApi.md#allForCompReview) | **GET** /v1/org/{orgId}/guideline | Get all guidelines for a given comp review |
| [**calculateMatrixValuesForSpecificGuideline**](GuidelineApi.md#calculateMatrixValuesForSpecificGuideline) | **GET** /v1/org/{orgId}/guideline/{id}/calculate | Calculate the matrix values for a specific guideline (which may apply to multiple scenarios in the comp review) |
| [**createNewGuideline**](GuidelineApi.md#createNewGuideline) | **POST** /v1/org/{orgId}/guideline | Create a new guideline |
| [**getSpecificGuideline**](GuidelineApi.md#getSpecificGuideline) | **GET** /v1/org/{orgId}/guideline/{id} | Get a specific guideline |
| [**removeById**](GuidelineApi.md#removeById) | **DELETE** /v1/org/{orgId}/guideline/{id} | Delete a guideline |
| [**updateGuideline**](GuidelineApi.md#updateGuideline) | **PATCH** /v1/org/{orgId}/guideline/{id} | Update a guideline |


<a name="allForCompReview"></a>
# **allForCompReview**
> ResultsGuideline allForCompReview(orgId).compReviewId(compReviewId).includeDeleted(includeDeleted).execute();

Get all guidelines for a given comp review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuidelineApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String compReviewId = "compReviewId_example"; // comp review id
    Boolean includeDeleted = true; // include deleted guidelines
    try {
      ResultsGuideline result = client
              .guideline
              .allForCompReview(orgId)
              .compReviewId(compReviewId)
              .includeDeleted(includeDeleted)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#allForCompReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsGuideline> response = client
              .guideline
              .allForCompReview(orgId)
              .compReviewId(compReviewId)
              .includeDeleted(includeDeleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#allForCompReview");
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
| **compReviewId** | **String**| comp review id | [optional] |
| **includeDeleted** | **Boolean**| include deleted guidelines | [optional] |

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

<a name="calculateMatrixValuesForSpecificGuideline"></a>
# **calculateMatrixValuesForSpecificGuideline**
> ResultsGuidelineCalculation calculateMatrixValuesForSpecificGuideline(orgId, id).execute();

Calculate the matrix values for a specific guideline (which may apply to multiple scenarios in the comp review)



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuidelineApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String id = "id_example"; // ID of the desired guideline
    try {
      ResultsGuidelineCalculation result = client
              .guideline
              .calculateMatrixValuesForSpecificGuideline(orgId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNext());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#calculateMatrixValuesForSpecificGuideline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultsGuidelineCalculation> response = client
              .guideline
              .calculateMatrixValuesForSpecificGuideline(orgId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#calculateMatrixValuesForSpecificGuideline");
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
| **id** | **String**| ID of the desired guideline | |

### Return type

[**ResultsGuidelineCalculation**](ResultsGuidelineCalculation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="createNewGuideline"></a>
# **createNewGuideline**
> createNewGuideline(orgId).createGuideline(createGuideline).execute();

Create a new guideline



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuidelineApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String compReviewId = "compReviewId_example"; // comp review id
    String label = "label_example"; // guideline name
    String appliedField = "appliedField_example"; // the field the guideline applies to
    String sourceField = "sourceField_example"; // the field the guideline is calculated from
    String calculationType = "RANGE"; // how does the guideline calculate the target value? e.g. is there a range (min/max) or only a target
    String flagMode = "DEVIATION_THRESHOLD"; // how does the guideline indicate deviations from the target amount
    Boolean enablePopulateValue = true; // whether or not the target values from the guidelines are pre-populated in the given columns
    String basisType = "CUSTOM"; // how an individual guideline value itself is calculated, e.g. percentage of the appliedField, fixed amount, or custom CQL
    String orgId = "orgId_example";
    String budgetPoolId = "budgetPoolId_example"; // the budget pool the guideline is allocated from
    String participantsExpr = "participantsExpr_example"; // CQL filter to determine which employees the guideline applies to
    Double flagDeviationThreshold = 3.4D; // the threshold (percent) against which deviations from the guideline are flagged
    String basisExpr = "basisExpr_example"; // if basisType.CUSTOM, the custom CQL expression used to generate the guideline value
    BasisFieldMatrix basisFieldMatrix = new BasisFieldMatrix();
    MoneyRange fixedAmountRange = new MoneyRange();
    ValueRange fixedValueRange = new ValueRange();
    try {
      client
              .guideline
              .createNewGuideline(compReviewId, label, appliedField, sourceField, calculationType, flagMode, enablePopulateValue, basisType, orgId)
              .budgetPoolId(budgetPoolId)
              .participantsExpr(participantsExpr)
              .flagDeviationThreshold(flagDeviationThreshold)
              .basisExpr(basisExpr)
              .basisFieldMatrix(basisFieldMatrix)
              .fixedAmountRange(fixedAmountRange)
              .fixedValueRange(fixedValueRange)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#createNewGuideline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .guideline
              .createNewGuideline(compReviewId, label, appliedField, sourceField, calculationType, flagMode, enablePopulateValue, basisType, orgId)
              .budgetPoolId(budgetPoolId)
              .participantsExpr(participantsExpr)
              .flagDeviationThreshold(flagDeviationThreshold)
              .basisExpr(basisExpr)
              .basisFieldMatrix(basisFieldMatrix)
              .fixedAmountRange(fixedAmountRange)
              .fixedValueRange(fixedValueRange)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#createNewGuideline");
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
| **orgId** | **String**|  | |
| **createGuideline** | [**CreateGuideline**](CreateGuideline.md)|  | [optional] |

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

<a name="getSpecificGuideline"></a>
# **getSpecificGuideline**
> Guideline getSpecificGuideline(orgId, id).execute();

Get a specific guideline



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuidelineApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example"; // Org identifier (either id or slug)
    String id = "id_example"; // ID of the desired guideline
    try {
      Guideline result = client
              .guideline
              .getSpecificGuideline(orgId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOrgId());
      System.out.println(result.getCompReviewId());
      System.out.println(result.getLabel());
      System.out.println(result.getBudgetPoolId());
      System.out.println(result.getParticipantsExpr());
      System.out.println(result.getAppliedField());
      System.out.println(result.getSourceField());
      System.out.println(result.getCalculationType());
      System.out.println(result.getFlagMode());
      System.out.println(result.getFlagDeviationThreshold());
      System.out.println(result.getEnablePopulateValue());
      System.out.println(result.getBasisType());
      System.out.println(result.getBasisExpr());
      System.out.println(result.getBasisFieldMatrix());
      System.out.println(result.getFixedAmountRange());
      System.out.println(result.getFixedValueRange());
      System.out.println(result.getCreateId());
      System.out.println(result.getCreateAt());
      System.out.println(result.getUpdateId());
      System.out.println(result.getUpdateAt());
      System.out.println(result.getDeleteId());
      System.out.println(result.getDeleteAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#getSpecificGuideline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Guideline> response = client
              .guideline
              .getSpecificGuideline(orgId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#getSpecificGuideline");
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
| **id** | **String**| ID of the desired guideline | |

### Return type

[**Guideline**](Guideline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(orgId, id).execute();

Delete a guideline



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuidelineApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example";
    String id = "id_example";
    try {
      client
              .guideline
              .removeById(orgId, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .guideline
              .removeById(orgId, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#removeById");
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
| **orgId** | **String**|  | |
| **id** | **String**|  | |

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
| **0** | successful operation |  -  |

<a name="updateGuideline"></a>
# **updateGuideline**
> updateGuideline(orgId, id).updateGuideline(updateGuideline).execute();

Update a guideline



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuidelineApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String orgId = "orgId_example";
    String id = "id_example";
    String label = "label_example"; // guideline name
    String budgetPoolId = "budgetPoolId_example"; // the budget pool the guideline is allocated from
    String participantsExpr = "participantsExpr_example"; // CQL filter to determine which employees the guideline applies to
    String appliedField = "appliedField_example"; // the field the guideline applies to
    String sourceField = "sourceField_example"; // the field the guideline is calculated from
    String calculationType = "RANGE"; // how does the guideline calculate the target value? e.g. is there a range (min/max) or only a target
    String flagMode = "DEVIATION_THRESHOLD"; // how does the guideline indicate deviations from the target amount
    Double flagDeviationThreshold = 3.4D; // the threshold (percent) against which deviations from the guideline are flagged
    Boolean enablePopulateValue = true; // whether or not the target values from the guidelines are pre-populated in the given columns
    String basisType = "CUSTOM"; // how an individual guideline value itself is calculated, e.g. percentage of the appliedField, fixed amount, or custom CQL
    String basisExpr = "basisExpr_example"; // if basisType.CUSTOM, the custom CQL expression used to generate the guideline value
    BasisFieldMatrix basisFieldMatrix = new BasisFieldMatrix();
    MoneyRange fixedAmountRange = new MoneyRange();
    ValueRange fixedValueRange = new ValueRange();
    try {
      client
              .guideline
              .updateGuideline(orgId, id)
              .label(label)
              .budgetPoolId(budgetPoolId)
              .participantsExpr(participantsExpr)
              .appliedField(appliedField)
              .sourceField(sourceField)
              .calculationType(calculationType)
              .flagMode(flagMode)
              .flagDeviationThreshold(flagDeviationThreshold)
              .enablePopulateValue(enablePopulateValue)
              .basisType(basisType)
              .basisExpr(basisExpr)
              .basisFieldMatrix(basisFieldMatrix)
              .fixedAmountRange(fixedAmountRange)
              .fixedValueRange(fixedValueRange)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#updateGuideline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .guideline
              .updateGuideline(orgId, id)
              .label(label)
              .budgetPoolId(budgetPoolId)
              .participantsExpr(participantsExpr)
              .appliedField(appliedField)
              .sourceField(sourceField)
              .calculationType(calculationType)
              .flagMode(flagMode)
              .flagDeviationThreshold(flagDeviationThreshold)
              .enablePopulateValue(enablePopulateValue)
              .basisType(basisType)
              .basisExpr(basisExpr)
              .basisFieldMatrix(basisFieldMatrix)
              .fixedAmountRange(fixedAmountRange)
              .fixedValueRange(fixedValueRange)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GuidelineApi#updateGuideline");
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
| **orgId** | **String**|  | |
| **id** | **String**|  | |
| **updateGuideline** | [**UpdateGuideline**](UpdateGuideline.md)|  | [optional] |

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

