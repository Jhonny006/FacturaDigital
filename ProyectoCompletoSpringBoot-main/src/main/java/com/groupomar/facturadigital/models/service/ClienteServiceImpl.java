package com.groupomar.facturadigital.models.service;

import com.groupomar.facturadigital.models.dao.IClienteDao;
import com.groupomar.facturadigital.models.entity.Cliente;
import com.groupomar.facturadigital.models.entity.Factura;
import com.groupomar.facturadigital.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.PublicKey;
import java.text.Normalizer;
import java.util.List;
@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteDao clienteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto>findByNombre(String term){
    return productoDao.findByNombreLikeIgnoreCase(term: "%" + term + "%");
    }
}
    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteDao.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public Producto findProductoById(long id) {
        //TODO AUTO-generated method stuD
        return productoDao.findById(id.orElse(other: null);

    }

    @Override
    @Transactional(readOnly = true)
    public Factura findProductoById(long id) {
        //TODO AUTO-generated method stuD
        return facturaDao.findById(id.orElse(other: null);

}
}
