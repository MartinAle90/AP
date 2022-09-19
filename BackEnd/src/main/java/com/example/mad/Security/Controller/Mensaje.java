package com.example.mad.Security.Controller;


public class Mensaje {
    private String mensaje;
    
    //Vamos agregar constructores vacios y llenos

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //Getter & Setter

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
