

# StockPrice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | org id that this stock price derives from |  [optional] |
|**stock** | **String** | ticker symbol of this stock |  |
|**date** | **LocalDate** | date |  |
|**price** | **Double** | price per share |  |
|**type** | [**TypeEnum**](#TypeEnum) | type of valuation |  |
|**total** | **Long** | total shares outstanding |  [optional] |
|**updateAt** | **String** | updated timestamp |  [optional] |
|**updateId** | **String** | updated by person |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMON_FMV | &quot;COMMON_FMV&quot; |
| FUNDRAISE | &quot;FUNDRAISE&quot; |
| GRANT | &quot;GRANT&quot; |
| PUBLIC | &quot;PUBLIC&quot; |



