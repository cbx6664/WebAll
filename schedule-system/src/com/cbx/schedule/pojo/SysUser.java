package com.cbx.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

/**
 * ClassName: SysUser
 * Package: com.cbx.schedule.pojo
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 15:58
 * @Version 1.0
 */
@AllArgsConstructor
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

    @Override
    public String toString() {
        return "SysUser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
