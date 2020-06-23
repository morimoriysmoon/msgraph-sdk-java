// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Compliance Management Partner Collection Request.
 */
public class ComplianceManagementPartnerCollectionRequest extends BaseCollectionRequest<ComplianceManagementPartnerCollectionResponse, IComplianceManagementPartnerCollectionPage> implements IComplianceManagementPartnerCollectionRequest {

    /**
     * The request builder for this collection of ComplianceManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ComplianceManagementPartnerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ComplianceManagementPartnerCollectionResponse.class, IComplianceManagementPartnerCollectionPage.class);
    }

    public void get(final ICallback<IComplianceManagementPartnerCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IComplianceManagementPartnerCollectionPage get() throws ClientException {
        final ComplianceManagementPartnerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ComplianceManagementPartner newComplianceManagementPartner, final ICallback<ComplianceManagementPartner> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ComplianceManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newComplianceManagementPartner, callback);
    }

    public ComplianceManagementPartner post(final ComplianceManagementPartner newComplianceManagementPartner) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ComplianceManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newComplianceManagementPartner);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IComplianceManagementPartnerCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ComplianceManagementPartnerCollectionRequest)this;
    }

    public IComplianceManagementPartnerCollectionPage buildFromResponse(final ComplianceManagementPartnerCollectionResponse response) {
        final IComplianceManagementPartnerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ComplianceManagementPartnerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ComplianceManagementPartnerCollectionPage page = new ComplianceManagementPartnerCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
