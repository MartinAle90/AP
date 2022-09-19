package com.example.mad.Interface;

import com.example.mad.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> GetPersona();
    
    //Guardar una objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Elimniar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
