

# Invoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | a unique identifying string for invoices |  |
|**amount** | **Double** | current final amount due for the invoices |  |
|**hostedInvoiceUrl** | **String** | URL for the hosted invoice page, which allows customers to view and pay an invoice |  [optional] |
|**invoicePdf** | **String** | the link to download the PDF for the invoice |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | one of PAID, UNPAID, or VOID |  |
|**createAt** | **String** | created timestamp |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PAID | &quot;PAID&quot; |
| UNPAID | &quot;UNPAID&quot; |
| VOID | &quot;VOID&quot; |



