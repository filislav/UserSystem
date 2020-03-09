/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.dao;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
import system.model.User;

/**
 *
 * @author slava
 */
@Repository
public class UserDAO {
    private List<User>users = Arrays.asList(new User("admin","admin"),
            new User("user1","user1"));
    public List<User> getAllUsers(){
        return users;
    }
}
