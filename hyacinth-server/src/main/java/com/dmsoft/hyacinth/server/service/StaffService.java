/*
 *
 *  * Copyright (c) 2018. For DMSoft Group.
 *
 */

package com.dmsoft.hyacinth.server.service;

import com.dmsoft.hyacinth.server.dto.StaffDto;

import java.util.List;

public interface StaffService {

    StaffDto findById(Long id);

    StaffDto findByCode(String code);

    List<StaffDto> findAll();
}
