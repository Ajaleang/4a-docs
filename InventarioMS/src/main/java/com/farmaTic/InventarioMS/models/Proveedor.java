package com.farmaTic.InventarioMS.models;
import org.springframework.data.annotation.Id;

public class Proveedor {
    @Id
    private String laboratorio;
    private String nombreDeContacto;
    private String email;
    private String direccion;
    private Integer telefono;
    private Integer celular;
    
    public Proveedor(String laboratorio, String nombreDeContacto, String email,String direccion, Integer telefono, Integer celular) {
        this.laboratorio = laboratorio;
        this.nombreDeContacto = nombreDeContacto;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }

   

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getNombreDeContacto() {
        return nombreDeContacto;
    }

    public void setNombreDeContacto(String nombreDeContacto) {
        this.nombreDeContacto = nombreDeContacto;
    }

    public String getEmail() {
        return email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

}
