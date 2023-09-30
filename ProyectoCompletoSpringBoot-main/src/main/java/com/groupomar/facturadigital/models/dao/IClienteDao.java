package com.groupomar.facturadigital.models.dao;

import com.groupomar.facturadigital.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface IClienteDao extends CrudRepository<Cliente, Long> ,PagingAndSortingRepository<Cliente, Long> {
}
