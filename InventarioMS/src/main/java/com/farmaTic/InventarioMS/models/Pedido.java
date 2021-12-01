package com.farmaTic.InventarioMS.models;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Pedido {
    @Id
    private String id;
    private String ProveedorOrigen;
    private String ProductoDestino;
    private Integer Cantidad;
    private Integer Precio; 
    private Date Fecha;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProveedorOrigen() {
        return ProveedorOrigen;
    }

    public void setProveedorOrigen(String ProveedorOrigen) {
        this.ProveedorOrigen = ProveedorOrigen;
    }

    public String getProductoDestino() {
        return ProductoDestino;
    }

    public void setProductoDestino(String ProductoDestino) {
        this.ProductoDestino = ProductoDestino;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
}
