package com.farmaTic.InventarioMS.controllers;
import com.farmaTic.InventarioMS.models.Pedido;
import com.farmaTic.InventarioMS.repositories.PedidoRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class PedidoController {
    private final PedidoRepository pedidoRepository;
    
    public PedidoController(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }
    @GetMapping("/pedidos/{id}")
    Pedido getPedido(@PathVariable String id) {
        return pedidoRepository.findById(id).get();
    }
    @PostMapping("/pedidos")
    Pedido nuevoPedido(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    @DeleteMapping("/pedidos/{id}")
    void borrarPedido(@PathVariable String id) {
        pedidoRepository.deleteById(id);
    }
}    
