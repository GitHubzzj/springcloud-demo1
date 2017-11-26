package com.byedbl.springcloud.service;

import com.byedbl.springcloud.model.Dept;

import java.util.List;

/**
 * Created by y430p on 2017/11/26.
 */
public interface IDeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
