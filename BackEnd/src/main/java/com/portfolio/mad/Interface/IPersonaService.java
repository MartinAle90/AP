package com.portfolio.mad.Interface;

import com.portfolio.mad.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo busca
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
