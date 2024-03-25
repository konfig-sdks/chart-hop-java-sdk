

# UpdatePerson


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**Name**](Name.md) |  |  [optional] |
|**contacts** | [**List&lt;Contact&gt;**](Contact.md) | contacts (emails, phones, external ids) |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**remoteWorkAddress** | [**Address**](Address.md) |  |  [optional] |
|**birthDate** | **String** | birthdate |  [optional] |
|**startDate** | **String** | start date of most recent hire |  [optional] |
|**endDate** | **String** | end date of most recent hire |  [optional] |
|**imagePath** | **String** | path to full-sized profile image in storage |  [optional] |
|**nameAudioPath** | **String** | path to pronunciation of the person&#39;s name |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) | self-reported gender |  [optional] |
|**ethnicity** | [**EthnicityEnum**](#EthnicityEnum) | self-reported ethnicity |  [optional] |
|**fields** | **Map&lt;String, Object&gt;** | fields containing custom data |  [optional] |
|**sensitiveFields** | **Object** | personal sensitivity preferences around specific fields |  [optional] |
|**inviteOptions** | [**OrgAccess**](OrgAccess.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | current status within the organization |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;MALE&quot; |
| FEMALE | &quot;FEMALE&quot; |
| NONBINARY | &quot;NONBINARY&quot; |
| PREFER_NOT | &quot;PREFER_NOT&quot; |



## Enum: EthnicityEnum

| Name | Value |
|---- | -----|
| HISPANIC | &quot;HISPANIC&quot; |
| WHITE | &quot;WHITE&quot; |
| BLACK | &quot;BLACK&quot; |
| PACIFIC | &quot;PACIFIC&quot; |
| ASIAN | &quot;ASIAN&quot; |
| NATIVE | &quot;NATIVE&quot; |
| TWO | &quot;TWO&quot; |
| PREFER_NOT | &quot;PREFER_NOT&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;PRIMARY&quot; |
| SCENARIO | &quot;SCENARIO&quot; |
| PENDING | &quot;PENDING&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



