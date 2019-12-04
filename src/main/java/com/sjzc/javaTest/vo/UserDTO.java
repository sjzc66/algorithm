package com.sjzc.javaTest.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    //private Integer userId;
    private String userName;
    //private String email;
    //private String phone;
    //private String gender;
    //private Integer staffStatus;
    //private Integer entryDate;
    //private String avatarUrl;
    //private Integer isAgent;
    //private Integer agentId;
    //private Integer userType;
    private List<RoleDTO> roleList;
}