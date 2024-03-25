# BillingApi

All URIs are relative to *https://api.charthop.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSubscriptionForCustomer**](BillingApi.md#cancelSubscriptionForCustomer) | **POST** /v1/customer/{customerId}/billing/cancel | Cancel a subscription for a customer |
| [**customerBillingInfo**](BillingApi.md#customerBillingInfo) | **GET** /v1/customer/{customerId}/billing | Return billing information for a customer |
| [**upgradeSubscription**](BillingApi.md#upgradeSubscription) | **POST** /v1/customer/{customerId}/billing/checkout | Checks out customer to upgrade to pay for their subscription |


<a name="cancelSubscriptionForCustomer"></a>
# **cancelSubscriptionForCustomer**
> cancelSubscriptionForCustomer(customerId).cancelSubscriptionSurveyAnswers(cancelSubscriptionSurveyAnswers).execute();

Cancel a subscription for a customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String otherComments = "otherComments_example"; // Any additional comments about ChartHop when cancelling their subscription
    String reason = "reason_example"; // Concatenated string of reasons why the customer unsubscribed from ChartHop
    String customerId = "customerId_example"; // Customer id
    try {
      client
              .billing
              .cancelSubscriptionForCustomer(otherComments, reason, customerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#cancelSubscriptionForCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .billing
              .cancelSubscriptionForCustomer(otherComments, reason, customerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#cancelSubscriptionForCustomer");
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
| **customerId** | **String**| Customer id | |
| **cancelSubscriptionSurveyAnswers** | [**CancelSubscriptionSurveyAnswers**](CancelSubscriptionSurveyAnswers.md)| Survey response | [optional] |

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

<a name="customerBillingInfo"></a>
# **customerBillingInfo**
> Billing customerBillingInfo(customerId).execute();

Return billing information for a customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String customerId = "customerId_example"; // Customer id
    try {
      Billing result = client
              .billing
              .customerBillingInfo(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCheckout());
      System.out.println(result.getCustomer());
      System.out.println(result.getInvoices());
      System.out.println(result.getPaymentInfo());
      System.out.println(result.getPlan());
      System.out.println(result.getOrg());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#customerBillingInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Billing> response = client
              .billing
              .customerBillingInfo(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#customerBillingInfo");
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
| **customerId** | **String**| Customer id | |

### Return type

[**Billing**](Billing.md)

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
| **404** | not found |  -  |

<a name="upgradeSubscription"></a>
# **upgradeSubscription**
> upgradeSubscription(customerId).updateSubscription(updateSubscription).execute();

Checks out customer to upgrade to pay for their subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ChartHop;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.charthop.com";
    ChartHop client = new ChartHop(configuration);
    String paymentMethod = "paymentMethod_example"; // Payment method to create; 'INVOICE' to make subscription paid by invoice, or the ID of the payment method if to make the subscription automatically charge a card
    String customerId = "customerId_example"; // Customer id
    try {
      client
              .billing
              .upgradeSubscription(paymentMethod, customerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#upgradeSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .billing
              .upgradeSubscription(paymentMethod, customerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#upgradeSubscription");
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
| **customerId** | **String**| Customer id | |
| **updateSubscription** | [**UpdateSubscription**](UpdateSubscription.md)| Subscription data to create | [optional] |

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

