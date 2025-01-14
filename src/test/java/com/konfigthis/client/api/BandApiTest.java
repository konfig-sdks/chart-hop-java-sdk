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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CreateCompBand;
import com.konfigthis.client.model.EnumValue;
import com.konfigthis.client.model.JobTierField;
import java.time.LocalDate;
import com.konfigthis.client.model.Money;
import com.konfigthis.client.model.Process;
import com.konfigthis.client.model.ResultsData;
import com.konfigthis.client.model.UpdateCompBand;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BandApi
 */
@Disabled
public class BandApiTest {

    private static BandApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BandApi(apiClient);
    }

    /**
     * Create a comp band
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCompBandTest() throws ApiException {
        String label = null;
        String color = null;
        EnumValue baseInterval = null;
        String jobLevel = null;
        String orgId = null;
        Money baseCompMax = null;
        Money baseCompMid = null;
        Money baseCompMin = null;
        Double baseSpread = null;
        Money baseTargetPay = null;
        Double baseTargetPayPercentile = null;
        Double equityTargetShares = null;
        Double equityTargetPercentOfBase = null;
        Double equityTargetValue = null;
        Money variableValue = null;
        Double variablePercentOfBase = null;
        String jobTierOneField = null;
        String jobTierTwoField = null;
        String jobTierThreeField = null;
        LocalDate date = null;
        api.createCompBand(label, color, baseInterval, jobLevel, orgId)
                .baseCompMax(baseCompMax)
                .baseCompMid(baseCompMid)
                .baseCompMin(baseCompMin)
                .baseSpread(baseSpread)
                .baseTargetPay(baseTargetPay)
                .baseTargetPayPercentile(baseTargetPayPercentile)
                .equityTargetShares(equityTargetShares)
                .equityTargetPercentOfBase(equityTargetPercentOfBase)
                .equityTargetValue(equityTargetValue)
                .variableValue(variableValue)
                .variablePercentOfBase(variablePercentOfBase)
                .jobTierOneField(jobTierOneField)
                .jobTierTwoField(jobTierTwoField)
                .jobTierThreeField(jobTierThreeField)
                .date(date)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete all comp bands on a date
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCompBandsOnDateTest() throws ApiException {
        String orgId = null;
        LocalDate date = null;
        Process response = api.deleteCompBandsOnDate(orgId)
                .date(date)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete all comp band data on a date
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCompBandsOnDate_0Test() throws ApiException {
        String orgId = null;
        LocalDate date = null;
        Process response = api.deleteCompBandsOnDate_0(orgId)
                .date(date)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular comp band by id on an effective date
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findCompBandsInOrgTest() throws ApiException {
        String orgId = null;
        String bandId = null;
        LocalDate date = null;
        ResultsData response = api.findCompBandsInOrg(orgId, bandId)
                .date(date)
                .execute();
        // TODO: test validations
    }

    /**
     * Find comp bands in the organization
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findCompBandsInOrg_0Test() throws ApiException {
        String orgId = null;
        LocalDate date = null;
        String from = null;
        Integer limit = null;
        Boolean includeDeleted = null;
        String returnAccess = null;
        ResultsData response = api.findCompBandsInOrg_0(orgId)
                .date(date)
                .from(from)
                .limit(limit)
                .includeDeleted(includeDeleted)
                .returnAccess(returnAccess)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a comp band
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCompBandTest() throws ApiException {
        String orgId = null;
        String bandId = null;
        LocalDate date = null;
        api.removeCompBand(orgId, bandId)
                .date(date)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a comp band
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCompBandByIdTest() throws ApiException {
        String orgId = null;
        String bandId = null;
        String label = null;
        String color = null;
        Money baseCompMax = null;
        Money baseCompMid = null;
        Money baseCompMin = null;
        Double baseSpread = null;
        EnumValue baseInterval = null;
        Money baseTargetPay = null;
        Double baseTargetPayPercentile = null;
        Double equityTargetShares = null;
        Double equityTargetPercentOfBase = null;
        Double equityTargetValue = null;
        Money variableValue = null;
        Double variablePercentOfBase = null;
        JobTierField jobTierOneField = null;
        JobTierField jobTierTwoField = null;
        JobTierField jobTierThreeField = null;
        String jobLevel = null;
        LocalDate date = null;
        api.updateCompBandById(orgId, bandId)
                .label(label)
                .color(color)
                .baseCompMax(baseCompMax)
                .baseCompMid(baseCompMid)
                .baseCompMin(baseCompMin)
                .baseSpread(baseSpread)
                .baseInterval(baseInterval)
                .baseTargetPay(baseTargetPay)
                .baseTargetPayPercentile(baseTargetPayPercentile)
                .equityTargetShares(equityTargetShares)
                .equityTargetPercentOfBase(equityTargetPercentOfBase)
                .equityTargetValue(equityTargetValue)
                .variableValue(variableValue)
                .variablePercentOfBase(variablePercentOfBase)
                .jobTierOneField(jobTierOneField)
                .jobTierTwoField(jobTierTwoField)
                .jobTierThreeField(jobTierThreeField)
                .jobLevel(jobLevel)
                .date(date)
                .execute();
        // TODO: test validations
    }

}
