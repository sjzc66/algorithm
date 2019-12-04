package com.sjzc.javaTest.stream;

import com.sjzc.javaTest.vo.RoleDTO;
import com.sjzc.javaTest.vo.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zhaochong
 * @Description
 * @create: 2019-12-04 14:47
 **/
public class Lambda {

    public static void main(String[] args) {
        List<UserDTO> userDTOList = new ArrayList<>();
        List<RoleDTO> roleDTOS = new ArrayList<>();
        List<RoleDTO> roleDTOS2 = new ArrayList<>();
        roleDTOS.add(new RoleDTO("rolecode1", "roleName1"));
        roleDTOS.add(new RoleDTO("rolecode2", "roleName2"));
        roleDTOS2.add(new RoleDTO("rolecode3", "roleName3"));
        roleDTOS2.add(new RoleDTO("rolecode4", "roleName4"));

        UserDTO u1 = new UserDTO();
        u1.setUserName("张三");
        u1.setRoleList(roleDTOS);
        userDTOList.add(u1);
        UserDTO u2 = new UserDTO();
        u2.setUserName("李四");
        u2.setRoleList(roleDTOS2);
        userDTOList.add(u2);

        System.out.println(userDTOList.toString());

        Map<Object, List<UserDTO>> collect = userDTOList.stream().collect(Collectors.groupingBy(new Function<UserDTO, Object>() {
            @Override
            public String apply(UserDTO userDTO) {
                if (userDTO.getRoleList().size() == 0) {
                    return null;
                }
                return userDTO.getRoleList().get(0).getRoleCode();
            }
        }));

        System.out.println(collect);

    }
}
