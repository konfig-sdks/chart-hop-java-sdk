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
import com.konfigthis.client.model.ChangePasswordRequest;
import com.konfigthis.client.model.CreateUser;
import com.konfigthis.client.model.EmailRequest;
import com.konfigthis.client.model.Name;
import com.konfigthis.client.model.OrgAccess;
import com.konfigthis.client.model.ResultsUser;
import com.konfigthis.client.model.UpdateUser;
import com.konfigthis.client.model.User;
import com.konfigthis.client.model.UserEmailSetting;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private static UserApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UserApi(apiClient);
    }

    /**
     * Assign or remove multiple users a role within an org
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignRoleToMultipleTest() throws ApiException {
        api.assignRoleToMultiple()
                .execute();
        // TODO: test validations
    }

    /**
     * Change a user&#39;s password, or switch a user to SSO
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changePasswordTest() throws ApiException {
        String newPassword = null;
        String userId = null;
        String oldPassword = null;
        api.changePassword(newPassword, userId)
                .oldPassword(oldPassword)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a new user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewUserTest() throws ApiException {
        Set<OrgAccess> orgs = null;
        String appId = null;
        Name name = null;
        String email = null;
        String imagePath = null;
        String status = null;
        Object options = null;
        Object internalOptions = null;
        Object secrets = null;
        List<UserEmailSetting> emailSettings = null;
        User response = api.createNewUser(orgs)
                .appId(appId)
                .name(name)
                .email(email)
                .imagePath(imagePath)
                .status(status)
                .options(options)
                .internalOptions(internalOptions)
                .secrets(secrets)
                .emailSettings(emailSettings)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all users within an org or across orgs
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllUsersWithinOrgsTest() throws ApiException {
        String orgId = null;
        String from = null;
        Integer limit = null;
        String sort = null;
        ResultsUser response = api.getAllUsersWithinOrgs()
                .orgId(orgId)
                .from(from)
                .limit(limit)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Return the currently logged in user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserTest() throws ApiException {
        User response = api.getCurrentUser()
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular user by email
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByEmailTest() throws ApiException {
        String email = null;
        User response = api.getUserByEmail(email)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular user by id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByIdTest() throws ApiException {
        String userId = null;
        User response = api.getUserById(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create/invite multiple new users
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void inviteMultipleNewUsersTest() throws ApiException {
        List<Object> response = api.inviteMultipleNewUsers()
                .execute();
        // TODO: test validations
    }

    /**
     * Return a particular user by its corresponding person id
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void returnUserByPersonIdTest() throws ApiException {
        String personId = null;
        String orgId = null;
        User response = api.returnUserByPersonId(personId, orgId)
                .execute();
        // TODO: test validations
    }

    /**
     * Revoke a user&#39;s access token
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeAccessTokenTest() throws ApiException {
        String userId = null;
        api.revokeAccessToken(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Revoke multiple user&#39;s access tokens
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeAccessTokensTest() throws ApiException {
        api.revokeAccessTokens()
                .execute();
        // TODO: test validations
    }

    /**
     * Send a password reset email
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendPasswordResetEmailTest() throws ApiException {
        String email = null;
        api.sendPasswordResetEmail(email)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExistingUserTest() throws ApiException {
        String userId = null;
        String appId = null;
        Name name = null;
        String email = null;
        Set<OrgAccess> orgs = null;
        String imagePath = null;
        String status = null;
        Object options = null;
        Object internalOptions = null;
        Object secrets = null;
        List<UserEmailSetting> emailSettings = null;
        api.updateExistingUser(userId)
                .appId(appId)
                .name(name)
                .email(email)
                .orgs(orgs)
                .imagePath(imagePath)
                .status(status)
                .options(options)
                .internalOptions(internalOptions)
                .secrets(secrets)
                .emailSettings(emailSettings)
                .execute();
        // TODO: test validations
    }

    /**
     * Return the user the user is currently viewing as
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewedUserDetailsTest() throws ApiException {
        User response = api.viewedUserDetails()
                .execute();
        // TODO: test validations
    }

}
