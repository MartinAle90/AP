package com.example.mad.Security.Repository;

import com.example.mad.Security.Entity.Rol;
import com.example.mad.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository <Rol, Integer>{
    Optional<Rol> findByNombre(RolNombre rolNombre);

    public Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
