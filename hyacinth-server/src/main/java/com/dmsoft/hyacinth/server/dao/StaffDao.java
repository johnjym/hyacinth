/*
 *
 *  * Copyright (c) 2018. For DMSoft Group.
 *
 */

package com.dmsoft.hyacinth.server.dao;

import com.dmsoft.hyacinth.server.entity.Staff;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Peter on 2016/7/11.
 */
public interface StaffDao extends PagingAndSortingRepository<Staff, Long>, JpaSpecificationExecutor<Staff> {

    Staff findById(Long id);

    //@Query("select p from t_staff p where p.code= :code")
    Staff findByCode(String code);

    Staff findByIdCard(String idCard);



}
