package com.farmaTic.InventarioMS.models;
import org.springframework.data.annotation.Id;


public class Inventario {
    @Id
    private String producto;
    private Integer cantidad;
    private String Proveedor;


    public Inventario(String producto, Integer cantidad, String Proveedor) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.Proveedor = Proveedor;
    }
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getProveedor() {
        return Proveedor;
    }
    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

}




