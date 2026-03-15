package com.example.demo.modules.user.dto;

import com.example.demo.common.PageParam;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 基于SpringMVC框架开发web应用--用户类
 *
 * @author zhuhuix
 * @date 2020-07-03
 * @date 2020-07-07 添加JPA映射注解
 */
public class UserDTO extends PageParam implements Serializable {
    // 用户id
    private Long id;
    // 用户名

    private String name;
    // 邮箱

    private String email;

    // 创建时间
    private Timestamp createTime;

    // 更新时间
    private Timestamp updateTime;

    public UserDTO(){}

    public UserDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
