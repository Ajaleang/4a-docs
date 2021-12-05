package com.farmaTic.InventarioMS.controllers;
import com.farmaTic.InventarioMS.exceptions.ProductoNotFoundException;
import com.farmaTic.InventarioMS.models.Producto;
import com.farmaTic.InventarioMS.repositories.ProductoRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductoController {
    private ProductoRepository ProductoRepository;
    
    public ProductoController(ProductoRepository ProductoRepository) {
        this.ProductoRepository = ProductoRepository;
    }

    @GetMapping("/producto/{id}")
    Producto getProducto(@PathVariable String nombreMedicamento) {
        return ProductoRepository.findById(nombreMedicamento)
                .orElseThrow(() -> new ProductoNotFoundException(nombreMedicamento));
    }
    
    @PostMapping("/producto")
    Producto nuevoProducto(@RequestBody Producto producto) {
        return ProductoRepository.save(producto);
    }

    @DeleteMapping("/producto/{id}")
    void deleteProducto(@PathVariable String id) {
        ProductoRepository.deleteById(id);
    }
  
    
}
