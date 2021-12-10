package com.farmaTic.InventarioMS.models;
import org.springframework.data.annotation.Id;
import java.util.Date;


public class Producto{
    @Id
    private String id;
    private String nombreMedicamento;
    private String laboratorio;
    private String concentracion;
    private String presentacion;
    private Integer cantidad;
    private Date fechaVencimiento;
    private Date fechaFabricacion;
    private Integer precioCosto;
    private Integer precioVenta;

    public Producto(String id, String laboratorio,String nombreMedicamento, String concentracion, String presentacion, Integer cantidad, Date fechaVencimiento, Date fechaFabricacion, Integer precioCosto, Integer precioVenta) {
        this.id = id;
        this.laboratorio = laboratorio;
        this.nombreMedicamento = nombreMedicamento;
        this.concentracion = concentracion;
        this.presentacion = presentacion;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaFabricacion = fechaFabricacion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public Producto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
}

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Integer getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Integer precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    }
}




