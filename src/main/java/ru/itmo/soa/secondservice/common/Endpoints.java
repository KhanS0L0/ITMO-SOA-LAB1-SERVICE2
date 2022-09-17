package ru.itmo.soa.secondservice.common;

public interface Endpoints {

    // create or update organization
    String ORGANIZATIONS = "/organizations";

    // get or delete specified organization by id
    String ORGANIZATION_BY_ID = "/organizations/{organizationId}";

    // filter organizations by all fields
    String FILTER_ORGANIZATIONS = "/organizations/filter";

    // clear all objects whose officialAddress field value is equivalent to the specified one
    String CLEAR_ORGANIZATIONS_BY_ADDRESS = "/organizations/clear/{officialAddress}";

    // delete specified organization by officialAddress
    String DELETE_ORGANIZATION_BY_ADDRESS = "/organizations/delete/{officialAddress}";

    // get specified organization with max officialAddress
    String SEARCH_ORGANIZATION_BY_MAX_ADDRESS = "/organizations/search";

    // merge two organizations into new one
    String MERGE_ORGANIZATIONS = "/merge/{id1}/{id2}/new-name/new-address";

    // hire new employee into organization by id
    String HIRE_EMPLOYEE_TO_ORGANIZATION = "/hire/{organizationId}";

}