package com.hwjl.iBarBook.models.composite_keys.CK_id;

import lombok.Data;

import java.io.Serializable;

@Data
public class User_roleId implements Serializable {
    private Long user_id;
    private Long role_id;
}
