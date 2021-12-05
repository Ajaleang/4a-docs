package com.farmaTic.InventarioMS.repositories;

import com.farmaTic.InventarioMS.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {

}
