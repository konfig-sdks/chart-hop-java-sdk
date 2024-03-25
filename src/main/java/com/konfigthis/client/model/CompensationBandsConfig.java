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
import com.konfigthis.client.model.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * CompensationBandsConfig
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CompensationBandsConfig {
  public static final String SERIALIZED_NAME_ANNUALIZED_SALARIES = "annualizedSalaries";
  @SerializedName(SERIALIZED_NAME_ANNUALIZED_SALARIES)
  private Boolean annualizedSalaries;

  public static final String SERIALIZED_NAME_ANNUALIZED_SALARIES_TYPE = "annualizedSalariesType";
  @SerializedName(SERIALIZED_NAME_ANNUALIZED_SALARIES_TYPE)
  private String annualizedSalariesType;

  public static final String SERIALIZED_NAME_HOURLY_SALARIES = "hourlySalaries";
  @SerializedName(SERIALIZED_NAME_HOURLY_SALARIES)
  private Boolean hourlySalaries;

  public static final String SERIALIZED_NAME_HOURLY_SALARIES_TYPE = "hourlySalariesType";
  @SerializedName(SERIALIZED_NAME_HOURLY_SALARIES_TYPE)
  private String hourlySalariesType;

  public static final String SERIALIZED_NAME_HOURS_PER_WEEK = "hoursPerWeek";
  @SerializedName(SERIALIZED_NAME_HOURS_PER_WEEK)
  private Double hoursPerWeek;

  public static final String SERIALIZED_NAME_WEEKS_PER_YEAR = "weeksPerYear";
  @SerializedName(SERIALIZED_NAME_WEEKS_PER_YEAR)
  private Double weeksPerYear;

  public static final String SERIALIZED_NAME_HAS_TARGET_SALARY = "hasTargetSalary";
  @SerializedName(SERIALIZED_NAME_HAS_TARGET_SALARY)
  private Boolean hasTargetSalary;

  public static final String SERIALIZED_NAME_TARGET_SALARY_TYPE = "targetSalaryType";
  @SerializedName(SERIALIZED_NAME_TARGET_SALARY_TYPE)
  private String targetSalaryType;

  public static final String SERIALIZED_NAME_EQUITY_FORMAT = "equityFormat";
  @SerializedName(SERIALIZED_NAME_EQUITY_FORMAT)
  private String equityFormat;

  public static final String SERIALIZED_NAME_VARIABLE_BONUS_FORMAT = "variableBonusFormat";
  @SerializedName(SERIALIZED_NAME_VARIABLE_BONUS_FORMAT)
  private String variableBonusFormat;

  public static final String SERIALIZED_NAME_TIERS_NOT_MAPPED_TO_CODES = "tiersNotMappedToCodes";
  @SerializedName(SERIALIZED_NAME_TIERS_NOT_MAPPED_TO_CODES)
  private Boolean tiersNotMappedToCodes;

  public static final String SERIALIZED_NAME_FIRST_TIER = "firstTier";
  @SerializedName(SERIALIZED_NAME_FIRST_TIER)
  private String firstTier;

  public static final String SERIALIZED_NAME_SECOND_TIER = "secondTier";
  @SerializedName(SERIALIZED_NAME_SECOND_TIER)
  private String secondTier;

  public static final String SERIALIZED_NAME_THIRD_TIER = "thirdTier";
  @SerializedName(SERIALIZED_NAME_THIRD_TIER)
  private String thirdTier;

  public static final String SERIALIZED_NAME_HAS_LOCATION_MULTIPLIER = "hasLocationMultiplier";
  @SerializedName(SERIALIZED_NAME_HAS_LOCATION_MULTIPLIER)
  private Boolean hasLocationMultiplier;

  public static final String SERIALIZED_NAME_JOB_LEVEL_SOURCE = "jobLevelSource";
  @SerializedName(SERIALIZED_NAME_JOB_LEVEL_SOURCE)
  private String jobLevelSource;

  public static final String SERIALIZED_NAME_MARKET_JOB_LEVEL_SYSTEM = "marketJobLevelSystem";
  @SerializedName(SERIALIZED_NAME_MARKET_JOB_LEVEL_SYSTEM)
  private String marketJobLevelSystem;

  public static final String SERIALIZED_NAME_CURRENCY_ROUNDING = "currencyRounding";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ROUNDING)
  private Set<Money> currencyRounding = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_HAS_MIGRATED_BANDS = "hasMigratedBands";
  @SerializedName(SERIALIZED_NAME_HAS_MIGRATED_BANDS)
  private Boolean hasMigratedBands;

  public CompensationBandsConfig() {
  }

  public CompensationBandsConfig annualizedSalaries(Boolean annualizedSalaries) {
    
    
    
    
    this.annualizedSalaries = annualizedSalaries;
    return this;
  }

   /**
   * whether annualized salaries are used
   * @return annualizedSalaries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "whether annualized salaries are used")

  public Boolean getAnnualizedSalaries() {
    return annualizedSalaries;
  }


  public void setAnnualizedSalaries(Boolean annualizedSalaries) {
    
    
    
    this.annualizedSalaries = annualizedSalaries;
  }


  public CompensationBandsConfig annualizedSalariesType(String annualizedSalariesType) {
    
    
    
    
    this.annualizedSalariesType = annualizedSalariesType;
    return this;
  }

   /**
   * how annualized salaries are represented
   * @return annualizedSalariesType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "how annualized salaries are represented")

  public String getAnnualizedSalariesType() {
    return annualizedSalariesType;
  }


  public void setAnnualizedSalariesType(String annualizedSalariesType) {
    
    
    
    this.annualizedSalariesType = annualizedSalariesType;
  }


  public CompensationBandsConfig hourlySalaries(Boolean hourlySalaries) {
    
    
    
    
    this.hourlySalaries = hourlySalaries;
    return this;
  }

   /**
   * whether hourly salaries are used
   * @return hourlySalaries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "whether hourly salaries are used")

  public Boolean getHourlySalaries() {
    return hourlySalaries;
  }


  public void setHourlySalaries(Boolean hourlySalaries) {
    
    
    
    this.hourlySalaries = hourlySalaries;
  }


  public CompensationBandsConfig hourlySalariesType(String hourlySalariesType) {
    
    
    
    
    this.hourlySalariesType = hourlySalariesType;
    return this;
  }

   /**
   * how hourly salaries are represented
   * @return hourlySalariesType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "how hourly salaries are represented")

  public String getHourlySalariesType() {
    return hourlySalariesType;
  }


  public void setHourlySalariesType(String hourlySalariesType) {
    
    
    
    this.hourlySalariesType = hourlySalariesType;
  }


  public CompensationBandsConfig hoursPerWeek(Double hoursPerWeek) {
    
    
    
    
    this.hoursPerWeek = hoursPerWeek;
    return this;
  }

  public CompensationBandsConfig hoursPerWeek(Integer hoursPerWeek) {
    
    
    
    
    this.hoursPerWeek = hoursPerWeek.doubleValue();
    return this;
  }

   /**
   * how many hours per week to use when calculating comp bands
   * @return hoursPerWeek
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "how many hours per week to use when calculating comp bands")

  public Double getHoursPerWeek() {
    return hoursPerWeek;
  }


  public void setHoursPerWeek(Double hoursPerWeek) {
    
    
    
    this.hoursPerWeek = hoursPerWeek;
  }


  public CompensationBandsConfig weeksPerYear(Double weeksPerYear) {
    
    
    
    
    this.weeksPerYear = weeksPerYear;
    return this;
  }

  public CompensationBandsConfig weeksPerYear(Integer weeksPerYear) {
    
    
    
    
    this.weeksPerYear = weeksPerYear.doubleValue();
    return this;
  }

   /**
   * how many weeks per year to use when calculating comp bands
   * @return weeksPerYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "how many weeks per year to use when calculating comp bands")

  public Double getWeeksPerYear() {
    return weeksPerYear;
  }


  public void setWeeksPerYear(Double weeksPerYear) {
    
    
    
    this.weeksPerYear = weeksPerYear;
  }


  public CompensationBandsConfig hasTargetSalary(Boolean hasTargetSalary) {
    
    
    
    
    this.hasTargetSalary = hasTargetSalary;
    return this;
  }

   /**
   * target salary within a comp band
   * @return hasTargetSalary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "target salary within a comp band")

  public Boolean getHasTargetSalary() {
    return hasTargetSalary;
  }


  public void setHasTargetSalary(Boolean hasTargetSalary) {
    
    
    
    this.hasTargetSalary = hasTargetSalary;
  }


  public CompensationBandsConfig targetSalaryType(String targetSalaryType) {
    
    
    
    
    this.targetSalaryType = targetSalaryType;
    return this;
  }

   /**
   * how target salaries are represented
   * @return targetSalaryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "how target salaries are represented")

  public String getTargetSalaryType() {
    return targetSalaryType;
  }


  public void setTargetSalaryType(String targetSalaryType) {
    
    
    
    this.targetSalaryType = targetSalaryType;
  }


  public CompensationBandsConfig equityFormat(String equityFormat) {
    
    
    
    
    this.equityFormat = equityFormat;
    return this;
  }

   /**
   * equity format
   * @return equityFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "equity format")

  public String getEquityFormat() {
    return equityFormat;
  }


  public void setEquityFormat(String equityFormat) {
    
    
    
    this.equityFormat = equityFormat;
  }


  public CompensationBandsConfig variableBonusFormat(String variableBonusFormat) {
    
    
    
    
    this.variableBonusFormat = variableBonusFormat;
    return this;
  }

   /**
   * variable bonus format
   * @return variableBonusFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "variable bonus format")

  public String getVariableBonusFormat() {
    return variableBonusFormat;
  }


  public void setVariableBonusFormat(String variableBonusFormat) {
    
    
    
    this.variableBonusFormat = variableBonusFormat;
  }


  public CompensationBandsConfig tiersNotMappedToCodes(Boolean tiersNotMappedToCodes) {
    
    
    
    
    this.tiersNotMappedToCodes = tiersNotMappedToCodes;
    return this;
  }

   /**
   * whether or not the tiers are mapped to fields. after we migrate all the tiers to be mapped, this flag can be removed
   * @return tiersNotMappedToCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the tiers are mapped to fields. after we migrate all the tiers to be mapped, this flag can be removed")

  public Boolean getTiersNotMappedToCodes() {
    return tiersNotMappedToCodes;
  }


  public void setTiersNotMappedToCodes(Boolean tiersNotMappedToCodes) {
    
    
    
    this.tiersNotMappedToCodes = tiersNotMappedToCodes;
  }


  public CompensationBandsConfig firstTier(String firstTier) {
    
    
    
    
    this.firstTier = firstTier;
    return this;
  }

   /**
   * the org&#39;s first tier for their comp bands
   * @return firstTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the org's first tier for their comp bands")

  public String getFirstTier() {
    return firstTier;
  }


  public void setFirstTier(String firstTier) {
    
    
    
    this.firstTier = firstTier;
  }


  public CompensationBandsConfig secondTier(String secondTier) {
    
    
    
    
    this.secondTier = secondTier;
    return this;
  }

   /**
   * the org&#39;s second tier for their comp bands
   * @return secondTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the org's second tier for their comp bands")

  public String getSecondTier() {
    return secondTier;
  }


  public void setSecondTier(String secondTier) {
    
    
    
    this.secondTier = secondTier;
  }


  public CompensationBandsConfig thirdTier(String thirdTier) {
    
    
    
    
    this.thirdTier = thirdTier;
    return this;
  }

   /**
   * the org&#39;s third tier for their comp bands
   * @return thirdTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the org's third tier for their comp bands")

  public String getThirdTier() {
    return thirdTier;
  }


  public void setThirdTier(String thirdTier) {
    
    
    
    this.thirdTier = thirdTier;
  }


  public CompensationBandsConfig hasLocationMultiplier(Boolean hasLocationMultiplier) {
    
    
    
    
    this.hasLocationMultiplier = hasLocationMultiplier;
    return this;
  }

   /**
   * whether the org&#39;s location data is used as multipliers
   * @return hasLocationMultiplier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "whether the org's location data is used as multipliers")

  public Boolean getHasLocationMultiplier() {
    return hasLocationMultiplier;
  }


  public void setHasLocationMultiplier(Boolean hasLocationMultiplier) {
    
    
    
    this.hasLocationMultiplier = hasLocationMultiplier;
  }


  public CompensationBandsConfig jobLevelSource(String jobLevelSource) {
    
    
    
    
    this.jobLevelSource = jobLevelSource;
    return this;
  }

   /**
   * the source for the band job levels
   * @return jobLevelSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the source for the band job levels")

  public String getJobLevelSource() {
    return jobLevelSource;
  }


  public void setJobLevelSource(String jobLevelSource) {
    
    
    
    this.jobLevelSource = jobLevelSource;
  }


  public CompensationBandsConfig marketJobLevelSystem(String marketJobLevelSystem) {
    
    
    
    
    this.marketJobLevelSystem = marketJobLevelSystem;
    return this;
  }

   /**
   * comparable market job level system
   * @return marketJobLevelSystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "comparable market job level system")

  public String getMarketJobLevelSystem() {
    return marketJobLevelSystem;
  }


  public void setMarketJobLevelSystem(String marketJobLevelSystem) {
    
    
    
    this.marketJobLevelSystem = marketJobLevelSystem;
  }


  public CompensationBandsConfig currencyRounding(Set<Money> currencyRounding) {
    
    
    
    
    this.currencyRounding = currencyRounding;
    return this;
  }

  public CompensationBandsConfig addCurrencyRoundingItem(Money currencyRoundingItem) {
    this.currencyRounding.add(currencyRoundingItem);
    return this;
  }

   /**
   * currency rounding settings in the UI
   * @return currencyRounding
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "currency rounding settings in the UI")

  public Set<Money> getCurrencyRounding() {
    return currencyRounding;
  }


  public void setCurrencyRounding(Set<Money> currencyRounding) {
    
    
    
    this.currencyRounding = currencyRounding;
  }


  public CompensationBandsConfig hasMigratedBands(Boolean hasMigratedBands) {
    
    
    
    
    this.hasMigratedBands = hasMigratedBands;
    return this;
  }

   /**
   * has migrated V1 bands
   * @return hasMigratedBands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "has migrated V1 bands")

  public Boolean getHasMigratedBands() {
    return hasMigratedBands;
  }


  public void setHasMigratedBands(Boolean hasMigratedBands) {
    
    
    
    this.hasMigratedBands = hasMigratedBands;
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
   * @return the CompensationBandsConfig instance itself
   */
  public CompensationBandsConfig putAdditionalProperty(String key, Object value) {
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
    CompensationBandsConfig compensationBandsConfig = (CompensationBandsConfig) o;
    return Objects.equals(this.annualizedSalaries, compensationBandsConfig.annualizedSalaries) &&
        Objects.equals(this.annualizedSalariesType, compensationBandsConfig.annualizedSalariesType) &&
        Objects.equals(this.hourlySalaries, compensationBandsConfig.hourlySalaries) &&
        Objects.equals(this.hourlySalariesType, compensationBandsConfig.hourlySalariesType) &&
        Objects.equals(this.hoursPerWeek, compensationBandsConfig.hoursPerWeek) &&
        Objects.equals(this.weeksPerYear, compensationBandsConfig.weeksPerYear) &&
        Objects.equals(this.hasTargetSalary, compensationBandsConfig.hasTargetSalary) &&
        Objects.equals(this.targetSalaryType, compensationBandsConfig.targetSalaryType) &&
        Objects.equals(this.equityFormat, compensationBandsConfig.equityFormat) &&
        Objects.equals(this.variableBonusFormat, compensationBandsConfig.variableBonusFormat) &&
        Objects.equals(this.tiersNotMappedToCodes, compensationBandsConfig.tiersNotMappedToCodes) &&
        Objects.equals(this.firstTier, compensationBandsConfig.firstTier) &&
        Objects.equals(this.secondTier, compensationBandsConfig.secondTier) &&
        Objects.equals(this.thirdTier, compensationBandsConfig.thirdTier) &&
        Objects.equals(this.hasLocationMultiplier, compensationBandsConfig.hasLocationMultiplier) &&
        Objects.equals(this.jobLevelSource, compensationBandsConfig.jobLevelSource) &&
        Objects.equals(this.marketJobLevelSystem, compensationBandsConfig.marketJobLevelSystem) &&
        Objects.equals(this.currencyRounding, compensationBandsConfig.currencyRounding) &&
        Objects.equals(this.hasMigratedBands, compensationBandsConfig.hasMigratedBands)&&
        Objects.equals(this.additionalProperties, compensationBandsConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualizedSalaries, annualizedSalariesType, hourlySalaries, hourlySalariesType, hoursPerWeek, weeksPerYear, hasTargetSalary, targetSalaryType, equityFormat, variableBonusFormat, tiersNotMappedToCodes, firstTier, secondTier, thirdTier, hasLocationMultiplier, jobLevelSource, marketJobLevelSystem, currencyRounding, hasMigratedBands, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompensationBandsConfig {\n");
    sb.append("    annualizedSalaries: ").append(toIndentedString(annualizedSalaries)).append("\n");
    sb.append("    annualizedSalariesType: ").append(toIndentedString(annualizedSalariesType)).append("\n");
    sb.append("    hourlySalaries: ").append(toIndentedString(hourlySalaries)).append("\n");
    sb.append("    hourlySalariesType: ").append(toIndentedString(hourlySalariesType)).append("\n");
    sb.append("    hoursPerWeek: ").append(toIndentedString(hoursPerWeek)).append("\n");
    sb.append("    weeksPerYear: ").append(toIndentedString(weeksPerYear)).append("\n");
    sb.append("    hasTargetSalary: ").append(toIndentedString(hasTargetSalary)).append("\n");
    sb.append("    targetSalaryType: ").append(toIndentedString(targetSalaryType)).append("\n");
    sb.append("    equityFormat: ").append(toIndentedString(equityFormat)).append("\n");
    sb.append("    variableBonusFormat: ").append(toIndentedString(variableBonusFormat)).append("\n");
    sb.append("    tiersNotMappedToCodes: ").append(toIndentedString(tiersNotMappedToCodes)).append("\n");
    sb.append("    firstTier: ").append(toIndentedString(firstTier)).append("\n");
    sb.append("    secondTier: ").append(toIndentedString(secondTier)).append("\n");
    sb.append("    thirdTier: ").append(toIndentedString(thirdTier)).append("\n");
    sb.append("    hasLocationMultiplier: ").append(toIndentedString(hasLocationMultiplier)).append("\n");
    sb.append("    jobLevelSource: ").append(toIndentedString(jobLevelSource)).append("\n");
    sb.append("    marketJobLevelSystem: ").append(toIndentedString(marketJobLevelSystem)).append("\n");
    sb.append("    currencyRounding: ").append(toIndentedString(currencyRounding)).append("\n");
    sb.append("    hasMigratedBands: ").append(toIndentedString(hasMigratedBands)).append("\n");
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
    openapiFields.add("annualizedSalaries");
    openapiFields.add("annualizedSalariesType");
    openapiFields.add("hourlySalaries");
    openapiFields.add("hourlySalariesType");
    openapiFields.add("hoursPerWeek");
    openapiFields.add("weeksPerYear");
    openapiFields.add("hasTargetSalary");
    openapiFields.add("targetSalaryType");
    openapiFields.add("equityFormat");
    openapiFields.add("variableBonusFormat");
    openapiFields.add("tiersNotMappedToCodes");
    openapiFields.add("firstTier");
    openapiFields.add("secondTier");
    openapiFields.add("thirdTier");
    openapiFields.add("hasLocationMultiplier");
    openapiFields.add("jobLevelSource");
    openapiFields.add("marketJobLevelSystem");
    openapiFields.add("currencyRounding");
    openapiFields.add("hasMigratedBands");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("annualizedSalaries");
    openapiRequiredFields.add("hourlySalaries");
    openapiRequiredFields.add("hoursPerWeek");
    openapiRequiredFields.add("weeksPerYear");
    openapiRequiredFields.add("hasTargetSalary");
    openapiRequiredFields.add("hasLocationMultiplier");
    openapiRequiredFields.add("currencyRounding");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompensationBandsConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompensationBandsConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompensationBandsConfig is not found in the empty JSON string", CompensationBandsConfig.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompensationBandsConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("annualizedSalariesType") != null && !jsonObj.get("annualizedSalariesType").isJsonNull()) && !jsonObj.get("annualizedSalariesType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `annualizedSalariesType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("annualizedSalariesType").toString()));
      }
      if ((jsonObj.get("hourlySalariesType") != null && !jsonObj.get("hourlySalariesType").isJsonNull()) && !jsonObj.get("hourlySalariesType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourlySalariesType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourlySalariesType").toString()));
      }
      if ((jsonObj.get("targetSalaryType") != null && !jsonObj.get("targetSalaryType").isJsonNull()) && !jsonObj.get("targetSalaryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetSalaryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetSalaryType").toString()));
      }
      if ((jsonObj.get("equityFormat") != null && !jsonObj.get("equityFormat").isJsonNull()) && !jsonObj.get("equityFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equityFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equityFormat").toString()));
      }
      if ((jsonObj.get("variableBonusFormat") != null && !jsonObj.get("variableBonusFormat").isJsonNull()) && !jsonObj.get("variableBonusFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variableBonusFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variableBonusFormat").toString()));
      }
      if ((jsonObj.get("firstTier") != null && !jsonObj.get("firstTier").isJsonNull()) && !jsonObj.get("firstTier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstTier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstTier").toString()));
      }
      if ((jsonObj.get("secondTier") != null && !jsonObj.get("secondTier").isJsonNull()) && !jsonObj.get("secondTier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondTier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondTier").toString()));
      }
      if ((jsonObj.get("thirdTier") != null && !jsonObj.get("thirdTier").isJsonNull()) && !jsonObj.get("thirdTier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thirdTier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thirdTier").toString()));
      }
      if ((jsonObj.get("jobLevelSource") != null && !jsonObj.get("jobLevelSource").isJsonNull()) && !jsonObj.get("jobLevelSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobLevelSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobLevelSource").toString()));
      }
      if ((jsonObj.get("marketJobLevelSystem") != null && !jsonObj.get("marketJobLevelSystem").isJsonNull()) && !jsonObj.get("marketJobLevelSystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketJobLevelSystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketJobLevelSystem").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("currencyRounding").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyRounding` to be an array in the JSON string but got `%s`", jsonObj.get("currencyRounding").toString()));
      }

      JsonArray jsonArraycurrencyRounding = jsonObj.getAsJsonArray("currencyRounding");
      // validate the required field `currencyRounding` (array)
      for (int i = 0; i < jsonArraycurrencyRounding.size(); i++) {
        Money.validateJsonObject(jsonArraycurrencyRounding.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompensationBandsConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompensationBandsConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompensationBandsConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompensationBandsConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CompensationBandsConfig>() {
           @Override
           public void write(JsonWriter out, CompensationBandsConfig value) throws IOException {
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
           public CompensationBandsConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CompensationBandsConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CompensationBandsConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompensationBandsConfig
  * @throws IOException if the JSON string is invalid with respect to CompensationBandsConfig
  */
  public static CompensationBandsConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompensationBandsConfig.class);
  }

 /**
  * Convert an instance of CompensationBandsConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

