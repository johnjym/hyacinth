/*
 *
 *  * Copyright (c) 2018. For DMSoft Group.
 *
 */

package com.dmsoft.hyacinth.server.entity;

import com.dmsoft.bamboo.common.persistence.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  Created by Peter on 2016/7/11.
 */
@Entity
@Table(name = "t_role")
public class Role extends BaseEntity {

    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
