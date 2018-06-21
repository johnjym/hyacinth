/*
 *
 *  * Copyright (c) 2018. For DMSoft Group.
 *
 */

package com.dmsoft.hyacinth.server.dao;

import com.dmsoft.hyacinth.server.entity.Staff;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Peter on 2016/7/11.
 */
public interface StaffDao extends PagingAndSortingRepository<Staff, Long>, JpaSpecificationExecutor<Staff> {

    Staff findById(Long id);

    Staff findByCode(String code);

    Staff findByIdCard(String idCard);

}
