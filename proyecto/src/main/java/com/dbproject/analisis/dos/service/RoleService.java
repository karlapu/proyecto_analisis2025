package com.dbproject.analisis.dos.service;

import java.util.List;

import com.dbproject.analisis.dos.model.entity.Role;


public interface RoleService {

    List<Role> findAll();

    Role findById(Integer id);

    Role create(Role r);

    Role update(Integer id, Role r);

    void delete(Integer id);

}
