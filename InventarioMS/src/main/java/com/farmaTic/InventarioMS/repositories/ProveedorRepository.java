package com.farmaTic.InventarioMS.repositories;
import com.farmaTic.InventarioMS.models.Proveedor;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProveedorRepository extends MongoRepository<Proveedor, String> {

}
