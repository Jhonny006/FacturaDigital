package com.groupomar.facturadigital.models.service;

import com.groupomar.facturadigital.models.entity.Cliente;
import com.groupomar.facturadigital.models.entity.Factura;
import com.groupomar.facturadigital.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public void save(Cliente cliente);
    public Cliente findOne(Long id);
    public void delete(Long id);

    public List<Producto> findByNombre(String term);
    public void saveFactura(Factura factura);
    public Producto findProductById(Long id);
    public Factura findFacturaById(Long id);

    public void deleteFactura(Long id);

    Producto findProductoById(Long aLong);
}
