package com.farmaTic.InventarioMS.repositories;

import java.util.List;

import com.farmaTic.InventarioMS.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductoRepository extends MongoRepository<Producto, String> {
@Query("{'nombreMedicamento':?0}")
Producto findByNombreMedicamento(String nombreMedicamento);

//get all documents from collection with the same nombreMedicamento
@Query("{'nombreMedicamento':?0}")
List<Producto> findAllByNombreMedicamento(String nombreMedicamento);


    public long count();
}
