package com.chenqian.cityLifeend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author:chenqian
 * @Description:用户控制层
 * @Date: created in 11:02 2017/11/5
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 通过spring data jpa 调用方法
     * api :localhost:8099/users/byname?username=xxx
     * @param request
     * @return
     */
    @RequestMapping(value = "/byname", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> getUser(HttpServletRequest request) {
        String username = request.getParameter("username");
        System.out.println("用户名:"+username);
        return new ResponseEntity<>(userService.getUserByName(username), HttpStatus.OK);
    }

}
