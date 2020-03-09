/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDAO;

/**
 *
 * @author slava
 */
@Service
public class UserService {
    
    @Autowired //подтягивается автоматически springom
    private UserDAO userDAO;
    public List getAllUsers(){
        return userDAO.getAllUsers();
    }
}
