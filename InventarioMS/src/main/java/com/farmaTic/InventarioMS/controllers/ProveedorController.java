package com.farmaTic.InventarioMS.controllers;
import java.util.List;

import com.farmaTic.InventarioMS.exceptions.ProveedorNotFoundException;
import com.farmaTic.InventarioMS.models.Proveedor;
import com.farmaTic.InventarioMS.repositories.ProveedorRepository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    @GetMapping("/proveedores")
    public List <Proveedor> getProveedores() {
        return proveedorRepository.findAll();
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
    @DeleteMapping("/proveedores/{id}")
    String deleteProveedor(@PathVariable String id) {
        proveedorRepository.deleteById(id);
        return "Proveedor eliminado";
    }
    @PutMapping("/proveedores/{id}")
    public Proveedor updateProveedor(@RequestBody Proveedor proveedor, @PathVariable String id) {
        return proveedorRepository.findById(id)
                .map(Proveedor -> {
                    Proveedor.setNombreDeContacto(proveedor.getNombreDeContacto());
                    Proveedor.setDireccion(proveedor.getDireccion());
                    Proveedor.setTelefono(proveedor.getTelefono());
                    return proveedorRepository.save(Proveedor);
                })
                .orElseGet(() -> {
                    proveedor.setLaboratorio(id);
                    return proveedorRepository.save(proveedor);
                });
    }
    
}

    
  
    

