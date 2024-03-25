

# Plan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique Stripe identifier for this plan |  |
|**name** | **String** | human-readable nickname for this plan |  |
|**interval** | [**IntervalEnum**](#IntervalEnum) | interval for billing on this plan |  |
|**intervalCount** | **Integer** | number of intervals, for example 3 for quarterly billing |  |
|**tiers** | [**List&lt;PlanTier&gt;**](PlanTier.md) | pricing tiers, per employee per interval |  |
|**stripeProductId** | **String** | stripe product id that this plan belongs to |  |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| YEAR | &quot;YEAR&quot; |



