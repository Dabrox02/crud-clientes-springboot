package com.training.crudcliente.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.crudcliente.business.ClienteService;
import com.training.crudcliente.persistences.documents.ClienteDocument;
import com.training.crudcliente.persistences.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDocument> findAll() {
        return (List<ClienteDocument>) clienteRepository.findAll();
    }

    @Override
    public void save(ClienteDocument cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public ClienteDocument findOne(String id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(String id) {
        clienteRepository.deleteById(id);
    }

}