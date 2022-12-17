package com.co.proyecto.proyectoback.Repository;

import com.co.proyecto.proyectoback.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <UserModel , String> {
}
