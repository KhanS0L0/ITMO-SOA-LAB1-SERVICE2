package ru.itmo.soa.secondservice.controller;

import com.github.lkqm.spring.api.version.ApiVersion;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itmo.soa.secondservice.common.Endpoints;
import ru.itmo.soa.secondservice.model.EmployeeDto;
import ru.itmo.soa.secondservice.model.FilteredRequestDto;
import ru.itmo.soa.secondservice.model.MergeOrganizationsDto;
import ru.itmo.soa.secondservice.model.OrganizationDto;
import ru.itmo.soa.secondservice.model.Page;

@Api(tags = "API Фасада организаций")
@ApiVersion("1")
@RestController
public class OrganizationController {

    @PostMapping(Endpoints.ORGANIZATIONS)
    public void createOrganization(@RequestBody OrganizationDto organizationDto){

    }

    @GetMapping(Endpoints.ORGANIZATION_BY_ID)
    public OrganizationDto getOrganizationById(@PathVariable Long organizationId){
        return null;
    }

    @PutMapping(Endpoints.ORGANIZATIONS)
    public void updateOrganization(@RequestBody OrganizationDto organizationDto){

    }

    @DeleteMapping(Endpoints.ORGANIZATION_BY_ID)
    public void deleteOrganization(@PathVariable Long organizationId){

    }

    @GetMapping(Endpoints.FILTER_ORGANIZATIONS)
    public Page<OrganizationDto> getAllOrganizations(@RequestBody FilteredRequestDto filters){
        return null;
    }

    @DeleteMapping(Endpoints.CLEAR_ORGANIZATIONS_BY_ADDRESS)
    public void clearAllOrganizationsByAddress(@PathVariable String officialAddress){

    }

    @DeleteMapping(Endpoints.DELETE_ORGANIZATION_BY_ADDRESS)
    public void deleteOrganizationByAddress(@PathVariable String officialAddress){

    }

    @GetMapping(Endpoints.SEARCH_ORGANIZATION_BY_MAX_ADDRESS)
    public OrganizationDto getOrganizationByMaxAddress(){
        return null;
    }

    @PutMapping(Endpoints.MERGE_ORGANIZATIONS)
    public OrganizationDto mergeOrganizations(
            @PathVariable(value = "id1") Long firstId,
            @PathVariable(value = "id2") Long secondId,
            @RequestBody MergeOrganizationsDto dto
    ){
        return null;
    }

    @PostMapping(Endpoints.HIRE_EMPLOYEE_TO_ORGANIZATION)
    public void hireEmployee(@PathVariable Long organizationId, @RequestBody EmployeeDto employeeDto){

    }

}