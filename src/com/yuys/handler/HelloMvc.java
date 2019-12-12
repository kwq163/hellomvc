package com.yuys.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author king
 * @date 2019/12/11 - 11:21
 */

@Controller
@RequestMapping(value="/testMvc")
public class HelloMvc {
    @RequestMapping("/hi")
    public String hello(){
        System.out.println("hello");
        return "/WEB-INF/jsp/success.jsp";
    }

    @RequestMapping(value="/testGet/{id}",method = {RequestMethod.GET})
    public String testGet(@PathVariable Integer id){
        System.out.println("get id = " + id);
        return "/WEB-INF/jsp/success.jsp";
    }

    @RequestMapping(value="/testGet/{id}",method = {RequestMethod.POST})
    public String testPost(){
        System.out.println("post");
        return "/WEB-INF/jsp/success.jsp";
    }
    @RequestMapping(value="/testGet/{id}",method = {RequestMethod.PUT})
    public String testPut(@PathVariable Integer id){
        System.out.println("put id = " + id);
        return "/WEB-INF/jsp/success.jsp";
    }
    @RequestMapping(value="/testGet/{id}",method = {RequestMethod.DELETE})
    public String testDelte(@PathVariable Integer id){
        System.out.println("del id = " + id);
        return "/WEB-INF/jsp/success.jsp";
    }
}
