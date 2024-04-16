package com.hwjl.iBarBook.models.composite_keys;


import com.hwjl.iBarBook.models.composite_keys.CK_id.User_roleId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(User_roleId.class)
public class User_role {
    @Id
    private Long user_id;

    @Id
    private Long role_id;
}
