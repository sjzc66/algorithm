package com.sjzc.javaTest.vo;

import lombok.Data;

@Data
public class RoleDTO {
    private String roleCode;
    private String roleName;

    public RoleDTO(String roleCode, String roleName) {
        this.roleCode = roleCode;
        this.roleName = roleName;
    }
}