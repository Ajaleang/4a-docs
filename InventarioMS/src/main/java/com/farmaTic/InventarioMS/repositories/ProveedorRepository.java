package com.farmaTic.InventarioMS.repositories;
import com.farmaTic.InventarioMS.models.Proveedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface ProveedorRepository extends MongoRepository<Proveedor, String> {
   @Query("{'nombreMedicamento': ?0}")
    Proveedor findByNombreMedicamento(String nombreMedicamento);
}
