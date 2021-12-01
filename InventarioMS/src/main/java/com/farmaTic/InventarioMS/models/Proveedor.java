package com.farmaTic.InventarioMS.models;
import org.springframework.data.annotation.Id;

public class Proveedor {
    @Id
    private String id;
    private String laboratorio;
    private String nombreDeContacto;
    private String email;
    private Integer telefono;
    private Integer celular;
    
    public Proveedor(String id, String laboratorio, String nombreDeContacto, String email, Integer telefono, Integer celular) {
        this.id = id;
        this.laboratorio = laboratorio;
        this.nombreDeContacto = nombreDeContacto;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
