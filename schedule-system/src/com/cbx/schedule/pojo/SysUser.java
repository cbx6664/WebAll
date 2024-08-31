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
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equals(uid, sysUser.uid) && Objects.equals(username, sysUser.username) && Objects.equals(userPwd, sysUser.userPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, userPwd);
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public SysUser() {
    }

    public SysUser(Integer uid, String username, String userPwd) {
        this.uid = uid;
        this.username = username;
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
