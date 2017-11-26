package com.byedbl.springcloud.dao;

import com.byedbl.springcloud.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by y430p on 2017/11/26.
 */
@Mapper
public interface IDeptDAO {
    boolean doCreate(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
