package com.co.proyecto.proyectoback.Service;

import com.co.proyecto.proyectoback.Model.UserModel;
import com.co.proyecto.proyectoback.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

public void SaveFacultad (UserModel user)
{
    userRepository.save(user);
}

public List<UserModel> GetAllFacultad()
{
     return userRepository.findAll();
}
public Optional<UserModel> GetByIdFacultad(String identificador)
{
    return userRepository.findAllById(identificador);

}
public boolean DeleteByIdFacultad(String identificador){
try {
    userRepository.deleteById(identificador);
    return true;
}catch (Exception err){
    return false;

}

}
}
