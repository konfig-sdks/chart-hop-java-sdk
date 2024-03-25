

# ExchangeRate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | globally unique id |  |
|**orgId** | **String** | org id, if an org-specific exchange rate is in use |  [optional] |
|**date** | **LocalDate** | date |  |
|**currency** | **String** | base currency |  |
|**rates** | **Map&lt;String, Double&gt;** | exchange rates, per currency - the multiplier to convert the base currency into the foreign currency |  |
|**updateAt** | **String** | updated timestamp |  [optional] |



