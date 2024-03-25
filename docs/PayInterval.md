

# PayInterval


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | [**IntervalEnum**](#IntervalEnum) | Interval (annual or hourly) |  |
|**pay** | [**Money**](Money.md) |  |  |
|**hoursPerWeek** | **Integer** | working hours per week if interval&#x3D;hourly |  [optional] |
|**weeksPerYear** | **Integer** | working weeks per year if interval&#x3D;hourly |  [optional] |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| YEARLY | &quot;YEARLY&quot; |
| HOURLY | &quot;HOURLY&quot; |



