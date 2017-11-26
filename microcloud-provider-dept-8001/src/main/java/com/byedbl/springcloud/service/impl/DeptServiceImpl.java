package com.byedbl.springcloud.service.impl;

import com.byedbl.springcloud.dao.IDeptDAO;
import com.byedbl.springcloud.model.Dept;
import com.byedbl.springcloud.service.IDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by y430p on 2017/11/26.
 */
@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDAO deptDAO;

    @Override
    public boolean add(Dept dept) {
        return deptDAO.doCreate(dept);

    }

    @Override
    public Dept get(Long id) {
        return deptDAO.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDAO.findAll();
    }
}
