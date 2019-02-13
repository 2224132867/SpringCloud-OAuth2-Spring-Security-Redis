package com.curise.eshop.auth.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * 〈角色实体〉
 *
 * @author Curise
 * @create 2018/12/13
 * @since 1.0.0
 */
//@Data
public class Role {

    private int id;
    private String roleName;
    private short valid;
    private Date createTime;
    private Date updateTime;
    private Set<Permission> permissions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public short getValid() {
        return valid;
    }

    public void setValid(short valid) {
        this.valid = valid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
