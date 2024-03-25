

# StockGrant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | human-readable description of vesting schedule |  [optional] |
|**id** | **String** | unique identifier of grant |  |
|**stock** | **String** | ticker symbol of this stock |  |
|**date** | **LocalDate** | date of grant |  |
|**vestStartDate** | **LocalDate** | vesting start date of grant |  [optional] |
|**expireDate** | **LocalDate** | expiration date of grant |  [optional] |
|**shares** | **Double** | number of shares granted |  |
|**price** | **Double** | per share strike price |  |
|**type** | [**TypeEnum**](#TypeEnum) | type of grant |  |
|**vestSchedule** | **String** | vesting schedule |  |
|**originalPrice** | **Double** | original per share value of stock (grant price at time of issue) |  [optional] |
|**currentPrice** | **Double** | current per share value of stock |  [optional] |
|**vestedShares** | **Double** | current number of shares vested |  [optional] |
|**vestedSharesNextYear** | **Double** | number of shares vested one year from today |  [optional] |
|**vestedSharesByDate** | **Map&lt;String, Double&gt;** | number of shares vested, by future date |  [optional] |
|**vestEndDate** | **LocalDate** | vesting end date |  [optional] |
|**cancelDate** | **LocalDate** | cancellation date |  [optional] |
|**details** | **String** | details of the grant (arbitrary text) |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ISO | &quot;ISO&quot; |
| NSO | &quot;NSO&quot; |
| RSU | &quot;RSU&quot; |
| SAR | &quot;SAR&quot; |
| PERFORMANCE_SHARES | &quot;PERFORMANCE_SHARES&quot; |
| PHANTOM_STOCK | &quot;PHANTOM_STOCK&quot; |
| RSA | &quot;RSA&quot; |



