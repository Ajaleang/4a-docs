package com.farmaTic.InventarioMS.controllers;
import com.farmaTic.InventarioMS.exceptions.ProveedorNotFoundException;
import com.farmaTic.InventarioMS.models.Proveedor;
import com.farmaTic.InventarioMS.repositories.ProveedorRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProveedorController {
    private ProveedorRepository proveedorRepository;

    public ProveedorController(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @GetMapping("/proveedores/{id}")
    public Proveedor getProveedor(@PathVariable String id) {
        return proveedorRepository.findById(id)
                .orElseThrow(() -> new ProveedorNotFoundException(id));
    }

    @PostMapping("/proveedores")
    public Proveedor addProveedor(@RequestBody Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
}

    
  
    

