package com.byedbl.springcloud.service.impl;

import com.byedbl.springcloud.Dept_8001_StartSpringCloudApplication;
import com.byedbl.springcloud.model.Dept;
import com.byedbl.springcloud.service.IDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by y430p on 2017/11/26.
 */
@SpringBootTest(classes = Dept_8001_StartSpringCloudApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DeptServiceImplTest {
    @Autowired
    private IDeptService deptService;
    @Test
    public void testAdd() throws Exception {
        Dept dept = new Dept();
        dept.setdName("测试1"+System.currentTimeMillis());
        deptService.add(dept);
    }

    @Test
    public void testGet() throws Exception {
        System.out.println(deptService.get(1L));
    }

    @Test
    public void testList() throws Exception {
        List<Dept> depts=deptService.list();
        for (Dept dept:
             depts) {
            System.out.println(dept.toString());
        }
    }
}