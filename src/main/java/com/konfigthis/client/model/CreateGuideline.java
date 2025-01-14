/*
 * ChartHop API
 * REST API for ChartHop
 *
 * The version of the OpenAPI document: V1.0.0
 * Contact: support@charthop.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.BasisFieldMatrix;
import com.konfigthis.client.model.MoneyRange;
import com.konfigthis.client.model.ValueRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * CreateGuideline
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateGuideline {
  public static final String SERIALIZED_NAME_COMP_REVIEW_ID = "compReviewId";
  @SerializedName(SERIALIZED_NAME_COMP_REVIEW_ID)
  private String compReviewId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_BUDGET_POOL_ID = "budgetPoolId";
  @SerializedName(SERIALIZED_NAME_BUDGET_POOL_ID)
  private String budgetPoolId;

  public static final String SERIALIZED_NAME_PARTICIPANTS_EXPR = "participantsExpr";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS_EXPR)
  private String participantsExpr;

  public static final String SERIALIZED_NAME_APPLIED_FIELD = "appliedField";
  @SerializedName(SERIALIZED_NAME_APPLIED_FIELD)
  private String appliedField;

  public static final String SERIALIZED_NAME_SOURCE_FIELD = "sourceField";
  @SerializedName(SERIALIZED_NAME_SOURCE_FIELD)
  private String sourceField;

  /**
   * how does the guideline calculate the target value? e.g. is there a range (min/max) or only a target
   */
  @JsonAdapter(CalculationTypeEnum.Adapter.class)
 public enum CalculationTypeEnum {
    RANGE("RANGE"),
    
    TARGET("TARGET");

    private String value;

    CalculationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CalculationTypeEnum fromValue(String value) {
      for (CalculationTypeEnum b : CalculationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CalculationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CalculationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CalculationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CalculationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CALCULATION_TYPE = "calculationType";
  @SerializedName(SERIALIZED_NAME_CALCULATION_TYPE)
  private CalculationTypeEnum calculationType;

  /**
   * how does the guideline indicate deviations from the target amount
   */
  @JsonAdapter(FlagModeEnum.Adapter.class)
 public enum FlagModeEnum {
    DEVIATION_THRESHOLD("DEVIATION_THRESHOLD"),
    
    NONE("NONE");

    private String value;

    FlagModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlagModeEnum fromValue(String value) {
      for (FlagModeEnum b : FlagModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FlagModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlagModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlagModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FlagModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FLAG_MODE = "flagMode";
  @SerializedName(SERIALIZED_NAME_FLAG_MODE)
  private FlagModeEnum flagMode;

  public static final String SERIALIZED_NAME_FLAG_DEVIATION_THRESHOLD = "flagDeviationThreshold";
  @SerializedName(SERIALIZED_NAME_FLAG_DEVIATION_THRESHOLD)
  private Double flagDeviationThreshold;

  public static final String SERIALIZED_NAME_ENABLE_POPULATE_VALUE = "enablePopulateValue";
  @SerializedName(SERIALIZED_NAME_ENABLE_POPULATE_VALUE)
  private Boolean enablePopulateValue;

  /**
   * how an individual guideline value itself is calculated, e.g. percentage of the appliedField, fixed amount, or custom CQL
   */
  @JsonAdapter(BasisTypeEnum.Adapter.class)
 public enum BasisTypeEnum {
    CUSTOM("CUSTOM"),
    
    FIXED("FIXED"),
    
    CUSTOM_FIXED("CUSTOM_FIXED"),
    
    PERCENTAGE("PERCENTAGE"),
    
    CUSTOM_PERCENTAGE("CUSTOM_PERCENTAGE");

    private String value;

    BasisTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BasisTypeEnum fromValue(String value) {
      for (BasisTypeEnum b : BasisTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BasisTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BasisTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BasisTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BasisTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BASIS_TYPE = "basisType";
  @SerializedName(SERIALIZED_NAME_BASIS_TYPE)
  private BasisTypeEnum basisType;

  public static final String SERIALIZED_NAME_BASIS_EXPR = "basisExpr";
  @SerializedName(SERIALIZED_NAME_BASIS_EXPR)
  private String basisExpr;

  public static final String SERIALIZED_NAME_BASIS_FIELD_MATRIX = "basisFieldMatrix";
  @SerializedName(SERIALIZED_NAME_BASIS_FIELD_MATRIX)
  private BasisFieldMatrix basisFieldMatrix;

  public static final String SERIALIZED_NAME_FIXED_AMOUNT_RANGE = "fixedAmountRange";
  @SerializedName(SERIALIZED_NAME_FIXED_AMOUNT_RANGE)
  private MoneyRange fixedAmountRange;

  public static final String SERIALIZED_NAME_FIXED_VALUE_RANGE = "fixedValueRange";
  @SerializedName(SERIALIZED_NAME_FIXED_VALUE_RANGE)
  private ValueRange fixedValueRange;

  public CreateGuideline() {
  }

  public CreateGuideline compReviewId(String compReviewId) {
    
    
    
    
    this.compReviewId = compReviewId;
    return this;
  }

   /**
   * comp review id
   * @return compReviewId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", required = true, value = "comp review id")

  public String getCompReviewId() {
    return compReviewId;
  }


  public void setCompReviewId(String compReviewId) {
    
    
    
    this.compReviewId = compReviewId;
  }


  public CreateGuideline label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * guideline name
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Merit Guideline", required = true, value = "guideline name")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public CreateGuideline budgetPoolId(String budgetPoolId) {
    
    
    
    
    this.budgetPoolId = budgetPoolId;
    return this;
  }

   /**
   * the budget pool the guideline is allocated from
   * @return budgetPoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "588f7ee98f138b19220041a7", value = "the budget pool the guideline is allocated from")

  public String getBudgetPoolId() {
    return budgetPoolId;
  }


  public void setBudgetPoolId(String budgetPoolId) {
    
    
    
    this.budgetPoolId = budgetPoolId;
  }


  public CreateGuideline participantsExpr(String participantsExpr) {
    
    
    
    
    this.participantsExpr = participantsExpr;
    return this;
  }

   /**
   * CQL filter to determine which employees the guideline applies to
   * @return participantsExpr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "is:person and tenure>=12", value = "CQL filter to determine which employees the guideline applies to")

  public String getParticipantsExpr() {
    return participantsExpr;
  }


  public void setParticipantsExpr(String participantsExpr) {
    
    
    
    this.participantsExpr = participantsExpr;
  }


  public CreateGuideline appliedField(String appliedField) {
    
    
    
    
    this.appliedField = appliedField;
    return this;
  }

   /**
   * the field the guideline applies to
   * @return appliedField
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "'base' or 'grantShares'", required = true, value = "the field the guideline applies to")

  public String getAppliedField() {
    return appliedField;
  }


  public void setAppliedField(String appliedField) {
    
    
    
    this.appliedField = appliedField;
  }


  public CreateGuideline sourceField(String sourceField) {
    
    
    
    
    this.sourceField = sourceField;
    return this;
  }

   /**
   * the field the guideline is calculated from
   * @return sourceField
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "'base' or 'grantShares'", required = true, value = "the field the guideline is calculated from")

  public String getSourceField() {
    return sourceField;
  }


  public void setSourceField(String sourceField) {
    
    
    
    this.sourceField = sourceField;
  }


  public CreateGuideline calculationType(CalculationTypeEnum calculationType) {
    
    
    
    
    this.calculationType = calculationType;
    return this;
  }

   /**
   * how does the guideline calculate the target value? e.g. is there a range (min/max) or only a target
   * @return calculationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TARGET", required = true, value = "how does the guideline calculate the target value? e.g. is there a range (min/max) or only a target")

  public CalculationTypeEnum getCalculationType() {
    return calculationType;
  }


  public void setCalculationType(CalculationTypeEnum calculationType) {
    
    
    
    this.calculationType = calculationType;
  }


  public CreateGuideline flagMode(FlagModeEnum flagMode) {
    
    
    
    
    this.flagMode = flagMode;
    return this;
  }

   /**
   * how does the guideline indicate deviations from the target amount
   * @return flagMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "NONE", required = true, value = "how does the guideline indicate deviations from the target amount")

  public FlagModeEnum getFlagMode() {
    return flagMode;
  }


  public void setFlagMode(FlagModeEnum flagMode) {
    
    
    
    this.flagMode = flagMode;
  }


  public CreateGuideline flagDeviationThreshold(Double flagDeviationThreshold) {
    
    
    
    
    this.flagDeviationThreshold = flagDeviationThreshold;
    return this;
  }

  public CreateGuideline flagDeviationThreshold(Integer flagDeviationThreshold) {
    
    
    
    
    this.flagDeviationThreshold = flagDeviationThreshold.doubleValue();
    return this;
  }

   /**
   * the threshold (percent) against which deviations from the guideline are flagged
   * @return flagDeviationThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.75", value = "the threshold (percent) against which deviations from the guideline are flagged")

  public Double getFlagDeviationThreshold() {
    return flagDeviationThreshold;
  }


  public void setFlagDeviationThreshold(Double flagDeviationThreshold) {
    
    
    
    this.flagDeviationThreshold = flagDeviationThreshold;
  }


  public CreateGuideline enablePopulateValue(Boolean enablePopulateValue) {
    
    
    
    
    this.enablePopulateValue = enablePopulateValue;
    return this;
  }

   /**
   * whether or not the target values from the guidelines are pre-populated in the given columns
   * @return enablePopulateValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "whether or not the target values from the guidelines are pre-populated in the given columns")

  public Boolean getEnablePopulateValue() {
    return enablePopulateValue;
  }


  public void setEnablePopulateValue(Boolean enablePopulateValue) {
    
    
    
    this.enablePopulateValue = enablePopulateValue;
  }


  public CreateGuideline basisType(BasisTypeEnum basisType) {
    
    
    
    
    this.basisType = basisType;
    return this;
  }

   /**
   * how an individual guideline value itself is calculated, e.g. percentage of the appliedField, fixed amount, or custom CQL
   * @return basisType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CUSTOM", required = true, value = "how an individual guideline value itself is calculated, e.g. percentage of the appliedField, fixed amount, or custom CQL")

  public BasisTypeEnum getBasisType() {
    return basisType;
  }


  public void setBasisType(BasisTypeEnum basisType) {
    
    
    
    this.basisType = basisType;
  }


  public CreateGuideline basisExpr(String basisExpr) {
    
    
    
    
    this.basisExpr = basisExpr;
    return this;
  }

   /**
   * if basisType.CUSTOM, the custom CQL expression used to generate the guideline value
   * @return basisExpr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tenure>12 ? (base * 0.04) : (base * 0.02)", value = "if basisType.CUSTOM, the custom CQL expression used to generate the guideline value")

  public String getBasisExpr() {
    return basisExpr;
  }


  public void setBasisExpr(String basisExpr) {
    
    
    
    this.basisExpr = basisExpr;
  }


  public CreateGuideline basisFieldMatrix(BasisFieldMatrix basisFieldMatrix) {
    
    
    
    
    this.basisFieldMatrix = basisFieldMatrix;
    return this;
  }

   /**
   * Get basisFieldMatrix
   * @return basisFieldMatrix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BasisFieldMatrix getBasisFieldMatrix() {
    return basisFieldMatrix;
  }


  public void setBasisFieldMatrix(BasisFieldMatrix basisFieldMatrix) {
    
    
    
    this.basisFieldMatrix = basisFieldMatrix;
  }


  public CreateGuideline fixedAmountRange(MoneyRange fixedAmountRange) {
    
    
    
    
    this.fixedAmountRange = fixedAmountRange;
    return this;
  }

   /**
   * Get fixedAmountRange
   * @return fixedAmountRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MoneyRange getFixedAmountRange() {
    return fixedAmountRange;
  }


  public void setFixedAmountRange(MoneyRange fixedAmountRange) {
    
    
    
    this.fixedAmountRange = fixedAmountRange;
  }


  public CreateGuideline fixedValueRange(ValueRange fixedValueRange) {
    
    
    
    
    this.fixedValueRange = fixedValueRange;
    return this;
  }

   /**
   * Get fixedValueRange
   * @return fixedValueRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ValueRange getFixedValueRange() {
    return fixedValueRange;
  }


  public void setFixedValueRange(ValueRange fixedValueRange) {
    
    
    
    this.fixedValueRange = fixedValueRange;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateGuideline instance itself
   */
  public CreateGuideline putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGuideline createGuideline = (CreateGuideline) o;
    return Objects.equals(this.compReviewId, createGuideline.compReviewId) &&
        Objects.equals(this.label, createGuideline.label) &&
        Objects.equals(this.budgetPoolId, createGuideline.budgetPoolId) &&
        Objects.equals(this.participantsExpr, createGuideline.participantsExpr) &&
        Objects.equals(this.appliedField, createGuideline.appliedField) &&
        Objects.equals(this.sourceField, createGuideline.sourceField) &&
        Objects.equals(this.calculationType, createGuideline.calculationType) &&
        Objects.equals(this.flagMode, createGuideline.flagMode) &&
        Objects.equals(this.flagDeviationThreshold, createGuideline.flagDeviationThreshold) &&
        Objects.equals(this.enablePopulateValue, createGuideline.enablePopulateValue) &&
        Objects.equals(this.basisType, createGuideline.basisType) &&
        Objects.equals(this.basisExpr, createGuideline.basisExpr) &&
        Objects.equals(this.basisFieldMatrix, createGuideline.basisFieldMatrix) &&
        Objects.equals(this.fixedAmountRange, createGuideline.fixedAmountRange) &&
        Objects.equals(this.fixedValueRange, createGuideline.fixedValueRange)&&
        Objects.equals(this.additionalProperties, createGuideline.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compReviewId, label, budgetPoolId, participantsExpr, appliedField, sourceField, calculationType, flagMode, flagDeviationThreshold, enablePopulateValue, basisType, basisExpr, basisFieldMatrix, fixedAmountRange, fixedValueRange, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGuideline {\n");
    sb.append("    compReviewId: ").append(toIndentedString(compReviewId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    budgetPoolId: ").append(toIndentedString(budgetPoolId)).append("\n");
    sb.append("    participantsExpr: ").append(toIndentedString(participantsExpr)).append("\n");
    sb.append("    appliedField: ").append(toIndentedString(appliedField)).append("\n");
    sb.append("    sourceField: ").append(toIndentedString(sourceField)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    flagMode: ").append(toIndentedString(flagMode)).append("\n");
    sb.append("    flagDeviationThreshold: ").append(toIndentedString(flagDeviationThreshold)).append("\n");
    sb.append("    enablePopulateValue: ").append(toIndentedString(enablePopulateValue)).append("\n");
    sb.append("    basisType: ").append(toIndentedString(basisType)).append("\n");
    sb.append("    basisExpr: ").append(toIndentedString(basisExpr)).append("\n");
    sb.append("    basisFieldMatrix: ").append(toIndentedString(basisFieldMatrix)).append("\n");
    sb.append("    fixedAmountRange: ").append(toIndentedString(fixedAmountRange)).append("\n");
    sb.append("    fixedValueRange: ").append(toIndentedString(fixedValueRange)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("compReviewId");
    openapiFields.add("label");
    openapiFields.add("budgetPoolId");
    openapiFields.add("participantsExpr");
    openapiFields.add("appliedField");
    openapiFields.add("sourceField");
    openapiFields.add("calculationType");
    openapiFields.add("flagMode");
    openapiFields.add("flagDeviationThreshold");
    openapiFields.add("enablePopulateValue");
    openapiFields.add("basisType");
    openapiFields.add("basisExpr");
    openapiFields.add("basisFieldMatrix");
    openapiFields.add("fixedAmountRange");
    openapiFields.add("fixedValueRange");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("compReviewId");
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("appliedField");
    openapiRequiredFields.add("sourceField");
    openapiRequiredFields.add("calculationType");
    openapiRequiredFields.add("flagMode");
    openapiRequiredFields.add("enablePopulateValue");
    openapiRequiredFields.add("basisType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateGuideline
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateGuideline.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGuideline is not found in the empty JSON string", CreateGuideline.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGuideline.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("compReviewId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compReviewId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compReviewId").toString()));
      }
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("budgetPoolId") != null && !jsonObj.get("budgetPoolId").isJsonNull()) && !jsonObj.get("budgetPoolId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budgetPoolId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budgetPoolId").toString()));
      }
      if ((jsonObj.get("participantsExpr") != null && !jsonObj.get("participantsExpr").isJsonNull()) && !jsonObj.get("participantsExpr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `participantsExpr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("participantsExpr").toString()));
      }
      if (!jsonObj.get("appliedField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appliedField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appliedField").toString()));
      }
      if (!jsonObj.get("sourceField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceField").toString()));
      }
      if (!jsonObj.get("calculationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculationType").toString()));
      }
      if (!jsonObj.get("flagMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flagMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flagMode").toString()));
      }
      if (!jsonObj.get("basisType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `basisType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("basisType").toString()));
      }
      if ((jsonObj.get("basisExpr") != null && !jsonObj.get("basisExpr").isJsonNull()) && !jsonObj.get("basisExpr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `basisExpr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("basisExpr").toString()));
      }
      // validate the optional field `basisFieldMatrix`
      if (jsonObj.get("basisFieldMatrix") != null && !jsonObj.get("basisFieldMatrix").isJsonNull()) {
        BasisFieldMatrix.validateJsonObject(jsonObj.getAsJsonObject("basisFieldMatrix"));
      }
      // validate the optional field `fixedAmountRange`
      if (jsonObj.get("fixedAmountRange") != null && !jsonObj.get("fixedAmountRange").isJsonNull()) {
        MoneyRange.validateJsonObject(jsonObj.getAsJsonObject("fixedAmountRange"));
      }
      // validate the optional field `fixedValueRange`
      if (jsonObj.get("fixedValueRange") != null && !jsonObj.get("fixedValueRange").isJsonNull()) {
        ValueRange.validateJsonObject(jsonObj.getAsJsonObject("fixedValueRange"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGuideline.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGuideline' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGuideline> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGuideline.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGuideline>() {
           @Override
           public void write(JsonWriter out, CreateGuideline value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGuideline read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateGuideline instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateGuideline given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateGuideline
  * @throws IOException if the JSON string is invalid with respect to CreateGuideline
  */
  public static CreateGuideline fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGuideline.class);
  }

 /**
  * Convert an instance of CreateGuideline to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

