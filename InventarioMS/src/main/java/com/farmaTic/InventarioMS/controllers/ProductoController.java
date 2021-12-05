package com.farmaTic.InventarioMS.controllers;
import com.farmaTic.InventarioMS.exceptions.ProductoNotFoundException;
import com.farmaTic.InventarioMS.models.Producto;
import com.farmaTic.InventarioMS.repositories.ProductoRepository;

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
    Producto getProducto(@PathVariable String id) {
        return ProductoRepository.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException(id));
    }
    
    @PostMapping("/productos")
    Producto nuevoProducto(@RequestBody Producto producto) {
        return ProductoRepository.save(producto);
    }
  
    
}
