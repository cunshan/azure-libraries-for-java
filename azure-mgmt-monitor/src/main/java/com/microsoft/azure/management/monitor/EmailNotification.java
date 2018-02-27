/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.monitor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Email notification of an autoscale event.
 */
public class EmailNotification {
    /**
     * a value indicating whether to send email to subscription administrator.
     */
    @JsonProperty(value = "sendToSubscriptionAdministrator")
    private Boolean sendToSubscriptionAdministrator;

    /**
     * a value indicating whether to send email to subscription
     * co-administrators.
     */
    @JsonProperty(value = "sendToSubscriptionCoAdministrators")
    private Boolean sendToSubscriptionCoAdministrators;

    /**
     * the custom e-mails list. This value can be null or empty, in which case
     * this attribute will be ignored.
     */
    @JsonProperty(value = "customEmails")
    private List<String> customEmails;

    /**
     * Get the sendToSubscriptionAdministrator value.
     *
     * @return the sendToSubscriptionAdministrator value
     */
    public Boolean sendToSubscriptionAdministrator() {
        return this.sendToSubscriptionAdministrator;
    }

    /**
     * Set the sendToSubscriptionAdministrator value.
     *
     * @param sendToSubscriptionAdministrator the sendToSubscriptionAdministrator value to set
     * @return the EmailNotification object itself.
     */
    public EmailNotification withSendToSubscriptionAdministrator(Boolean sendToSubscriptionAdministrator) {
        this.sendToSubscriptionAdministrator = sendToSubscriptionAdministrator;
        return this;
    }

    /**
     * Get the sendToSubscriptionCoAdministrators value.
     *
     * @return the sendToSubscriptionCoAdministrators value
     */
    public Boolean sendToSubscriptionCoAdministrators() {
        return this.sendToSubscriptionCoAdministrators;
    }

    /**
     * Set the sendToSubscriptionCoAdministrators value.
     *
     * @param sendToSubscriptionCoAdministrators the sendToSubscriptionCoAdministrators value to set
     * @return the EmailNotification object itself.
     */
    public EmailNotification withSendToSubscriptionCoAdministrators(Boolean sendToSubscriptionCoAdministrators) {
        this.sendToSubscriptionCoAdministrators = sendToSubscriptionCoAdministrators;
        return this;
    }

    /**
     * Get the customEmails value.
     *
     * @return the customEmails value
     */
    public List<String> customEmails() {
        return this.customEmails;
    }

    /**
     * Set the customEmails value.
     *
     * @param customEmails the customEmails value to set
     * @return the EmailNotification object itself.
     */
    public EmailNotification withCustomEmails(List<String> customEmails) {
        this.customEmails = customEmails;
        return this;
    }

}