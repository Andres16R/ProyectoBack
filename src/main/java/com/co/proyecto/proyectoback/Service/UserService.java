package com.co.proyecto.proyectoback.Service;

import com.co.proyecto.proyectoback.Model.UserModel;
import com.co.proyecto.proyectoback.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;

    public UserModel saveUser (UserModel userModel){
        iUserRepository.save(userModel);
        return userModel;
    }

    public List<UserModel> findAllUsers (){
        List<UserModel> result = iUserRepository.findAll();
        return (result);
    }

    public String deleteUser (String identificacion){
        try {    iUserRepository.deleteById(identificacion);
            return ("200");
        }catch (Exception ex) {
            System.out.println(ex);
        return ("404");
        }

    }

}
