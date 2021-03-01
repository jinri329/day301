package com.zyy.day301.controller;

import com.zyy.day301.bean.User;
import com.zyy.day301.vo.UserResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
//这是restful风格的
@RestController
public class UserController {
    @RequestMapping("/user")
    //注解Valid 是开启校验
    public Object checkUser(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            //如果有错就走这里
            Map<String ,String > map = new HashMap<>();
            result.getFieldErrors().forEach((item)->{
                //错误信息
                String message = item.getDefaultMessage();
                //错误的字段
                String field = item.getField();
                map.put(field,message);
            });
            return map;
        }
        return "ok";
    }

    /**
     * 结合这个接口来使用postman 可以前后端分离
     * 可以通过修改这个mapping注解前面的Get或者是Post来限定访问格式
     */
    @GetMapping("/user/check/{param}")
    public UserResult checkUser(@PathVariable("param") String param){
        if("zyy".equals(param)){
            return new UserResult(200,"ok",true);
        }
        return new UserResult(500,"no",false);
    }
}
