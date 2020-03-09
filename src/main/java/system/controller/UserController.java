/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import system.model.User;
import system.service.UserService;

/**
 *
 * @author slava
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userSevice; 
    public @ResponseBody List<User> getAllUsers(){
        return userSevice.getAllUsers();
    }
}
