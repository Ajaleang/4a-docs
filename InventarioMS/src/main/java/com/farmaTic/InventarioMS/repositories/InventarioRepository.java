package com.farmaTic.InventarioMS.repositories;

import com.farmaTic.InventarioMS.models.Inventario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventarioRepository extends MongoRepository<Inventario, String> {

}
