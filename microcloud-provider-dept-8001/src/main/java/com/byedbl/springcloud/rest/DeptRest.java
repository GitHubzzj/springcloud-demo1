package com.byedbl.springcloud.rest;

import com.byedbl.springcloud.model.Dept;
import com.byedbl.springcloud.service.IDeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by y430p on 2017/11/26.
 */
@RestController
public class DeptRest {
    @Resource
    private IDeptService deptService;

    @RequestMapping(value="/dept/get/{id}" ,method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return   deptService.get(id);
    }

    @RequestMapping(value="/dept/list" ,method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    @RequestMapping(value="/dept/add" ,method = RequestMethod.POST)
    public Boolean add(@RequestBody  Dept dept) {
        return deptService.add(dept);
    }


    @RequestMapping(value="/dept/sessionId",method = RequestMethod.GET)
    public String sessionId(HttpServletRequest request) {
        return request.getSession().getId();
    }
}
