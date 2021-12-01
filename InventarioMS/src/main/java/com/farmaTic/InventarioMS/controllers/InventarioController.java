package com.farmaTic.InventarioMS.controllers;
import com.farmaTic.InventarioMS.exceptions.InventarioNotFoundException;
import com.farmaTic.InventarioMS.models.Inventario;
import com.farmaTic.InventarioMS.repositories.InventarioRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class InventarioController {
    private InventarioRepository inventarioRepository;
    
    public InventarioController(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    @GetMapping("/inventarios/{producto}")
    Inventario getInventario(@PathVariable String producto) {
        return inventarioRepository.findById(producto)
                .orElseThrow(() -> new InventarioNotFoundException(producto));
    }
    
    @PostMapping("/inventarios")
    Inventario nuevoInventario(@RequestBody Inventario inventario) {
        return inventarioRepository.save(inventario);
    }
  
    
}
