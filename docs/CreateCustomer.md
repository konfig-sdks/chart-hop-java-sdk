

# CreateCustomer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name of customer |  |
|**email** | **String** | email address for billing purposes |  |
|**billAddress** | [**Address**](Address.md) |  |  [optional] |
|**industry** | **String** | industry that customer is in |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | source of customer signup |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | current status |  [optional] |
|**salesforceAccountId** | **String** | salesforce account id |  [optional] |
|**products** | [**List&lt;ProductItem&gt;**](ProductItem.md) | products that this customer has purchased |  [optional] |
|**startDate** | **LocalDate** | initial date of billing |  |
|**endDate** | **LocalDate** | end of service date for churning customers -- on or after this date, service should be disabled |  [optional] |
|**nextInvoiceDate** | **LocalDate** | date of next invoice |  [optional] |
|**primaryHeadCountFilter** | **String** | primary headcount filter - used for billing purposes |  [optional] |
|**secondaryHeadCountFilter** | **String** | secondary headcount filter - used for billing purposes |  [optional] |
|**arr** | **Double** | current ARR of the customer based on most recent invoice |  [optional] |
|**projectedArr** | **Double** | projected ARR of the customer for upcoming invoice, based on plan and headcount |  [optional] |
|**trialStartDate** | **LocalDate** | date this customer begins their trial period |  [optional] |
|**trialEndDate** | **LocalDate** | date this customer ends their trial period |  [optional] |
|**stripeSubscriptionSync** | [**StripeSubscriptionSyncEnum**](#StripeSubscriptionSyncEnum) | Stripe subscription settings |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| ADP_MARKETPLACE | &quot;ADP_MARKETPLACE&quot; |
| SELF_SERVE | &quot;SELF_SERVE&quot; |
| SELF_SERVE_TEST | &quot;SELF_SERVE_TEST&quot; |
| SEQUOIA_ONE | &quot;SEQUOIA_ONE&quot; |
| CONNECT | &quot;CONNECT&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| TRIAL | &quot;TRIAL&quot; |
| CHURN | &quot;CHURN&quot; |
| PAYMENT_ERROR | &quot;PAYMENT_ERROR&quot; |



## Enum: StripeSubscriptionSyncEnum

| Name | Value |
|---- | -----|
| SYNC | &quot;SYNC&quot; |
| DELETE | &quot;DELETE&quot; |



