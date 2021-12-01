package com.farmaTic.InventarioMS.repositories;
import com.farmaTic.InventarioMS.models.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface PedidoRepository extends MongoRepository<Pedido, String> {

}