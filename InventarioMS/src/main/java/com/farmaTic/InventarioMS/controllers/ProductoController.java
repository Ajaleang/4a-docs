package com.farmaTic.InventarioMS.controllers;
import java.util.List;
import java.util.Optional;

import com.farmaTic.InventarioMS.exceptions.ProductoNotFoundException;
import com.farmaTic.InventarioMS.models.Producto;
import com.farmaTic.InventarioMS.repositories.ProductoRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductoController {
    private ProductoRepository ProductoRepository;
    
    public ProductoController(ProductoRepository ProductoRepository) {
        this.ProductoRepository = ProductoRepository;
    }
    @GetMapping("/producto/{id}")
    public Producto getProducto(@PathVariable String id) {
        return ProductoRepository.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException(id));
    }
    


    
    @GetMapping("/productos/{nombreMedicamento}")
    public List <Producto> getProductos(@PathVariable String nombreMedicamento) {
        List <Producto> list = ProductoRepository.findAllByNombreMedicamento(nombreMedicamento);
        if (list.isEmpty()) {
            throw new ProductoNotFoundException(nombreMedicamento);
        }
        return list;
       
        
    }
    
    @PostMapping("/producto")
    Producto nuevoProducto(@RequestBody Producto producto) {
        return ProductoRepository.save(producto);
    }

    @DeleteMapping("/producto/{id}")
    String deleteProducto(@PathVariable String id) {
        ProductoRepository.deleteById(id);
        return "Producto eliminado";
    }

    @PutMapping("/producto/{id}")
    public ResponseEntity <Producto> updateProducto( @PathVariable String id, @RequestBody Producto producto) {
        Optional <Producto> ProductoData = ProductoRepository.findById(id);

        if (ProductoData.isPresent()) {
            Producto _Producto = ProductoData.get();
           _Producto.setConcentracion(producto.getConcentracion());
           _Producto.setPresentacion(producto.getPresentacion());
           _Producto.setCantidad(producto.getCantidad());
           _Producto.setPrecioCosto(producto.getPrecioCosto());
           _Producto.setPrecioVenta(producto.getPrecioVenta());         
            return new ResponseEntity <Producto>(ProductoRepository.save(_Producto), HttpStatus.OK);
        } else {
            return new ResponseEntity <Producto>(HttpStatus.NOT_FOUND);
        }
               
           
               
               
    }
    
}
