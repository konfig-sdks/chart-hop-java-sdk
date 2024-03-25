

# CompReviewCollaborators


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collaborationType** | [**CollaborationTypeEnum**](#CollaborationTypeEnum) | What type of HRBP collaboration the comp review uses |  |
|**collaboratorAccess** | [**CollaboratorAccessEnum**](#CollaboratorAccessEnum) | What level of access collaborators should have |  |
|**collaboratorJobIds** | **Set&lt;String&gt;** | A list of collaborators for all reviewers, used when collaborationType is STATIC |  [optional] |
|**collaboratorMatrix** | [**CollaboratorMatrix**](CollaboratorMatrix.md) |  |  [optional] |
|**jobToCollaboratorsMap** | **Map&lt;String, Set&lt;String&gt;&gt;** | A map of reviewer job ID to a set of collaborator job IDs indicating which collaborators are collaborating with a given reviewer |  |



## Enum: CollaborationTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| STATIC | &quot;STATIC&quot; |
| DYNAMIC | &quot;DYNAMIC&quot; |



## Enum: CollaboratorAccessEnum

| Name | Value |
|---- | -----|
| READ | &quot;READ&quot; |
| EDIT | &quot;EDIT&quot; |
| SUBMIT | &quot;SUBMIT&quot; |



