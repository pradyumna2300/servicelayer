package com.conceptext.servicelayer.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Integer userId;

    private String name;

    private String email;

    private String mobile;

    private String address;
}
