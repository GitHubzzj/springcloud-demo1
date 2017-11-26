package com.byedbl.springcloud.controller;

import com.byedbl.springcloud.model.Dept;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by y430p on 2017/11/26.
 */
@RestController
public class ConsumerDeptController {
    private static final String DEPT_GET_URL = "http://dept-8001.com:8001/dept/get/";
    private static final String DEPT_LIST_URL = "http://dept-8001.com:8001/dept/list";
    private static final String DEPT_ADD_URL = "http://dept-8001.com:8001/dept/add";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders httpHeaders;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id) {
        Dept dept = this.restTemplate.exchange(DEPT_GET_URL + id, HttpMethod.GET, new HttpEntity<Object>(this.httpHeaders), Dept.class).getBody();
        //Dept dept = this.restTemplate.getForObject(DEPT_GET_URL+id, Dept.class);
        return dept;
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> listDept() {
        List<Dept> depts = this.restTemplate.exchange(DEPT_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(this.httpHeaders), List.class).getBody();
        //List<Dept> depts = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
        return depts;
    }

    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    public Boolean addDept(Dept dept) {
         return this.restTemplate.exchange(DEPT_ADD_URL, HttpMethod.POST, new HttpEntity<Object>(dept,this.httpHeaders), Boolean.class).getBody();
        //Boolean result = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
        //return result;
    }
}
