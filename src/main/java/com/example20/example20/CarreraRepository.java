package com.example20.example20;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "carreras", path = "carreras")
public interface CarreraRepository extends PagingAndSortingRepository<Carrera, Integer>, CrudRepository<Carrera, Integer> {
    
    List<Curso> findByNombre(@Param("nombre") String nombre);

}
