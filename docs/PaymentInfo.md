

# PaymentInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | indicates how the customer has decided to pay; one of CREDIT_CARD, INVOICE |  |
|**creditCardEndDigits** | **String** | if the customer has indicated they wish to pay by credit card, the last four digits of the credit card they are paying with. Null if the customer is paying by invoice. |  [optional] |
|**brand** | **String** | if the customer has indicated they wish to pay by credit card, the brand of the credit card they are paying with. Null if the customer is paying by invoice. |  [optional] |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| CREDIT_CARD | &quot;CREDIT_CARD&quot; |
| INVOICE | &quot;INVOICE&quot; |



