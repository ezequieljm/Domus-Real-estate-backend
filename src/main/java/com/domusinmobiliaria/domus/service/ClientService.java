package com.domusinmobiliaria.domus.service;

import java.util.List;
import java.util.Optional;

import com.domusinmobiliaria.domus.model.ClientModel;
import com.domusinmobiliaria.domus.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * ClientService
 */
@Service
public class ClientService implements ClientRepository {

    @Autowired
    private ClientRepository clientRepository;

    /**
     * READ ALL RECORDS
     */
    @Override
    public List<ClientModel> findAll()
    {
        return clientRepository.findAll();
    }

    /**
     * READ UPDATE RECORD BY IDENTIFIER
     */
    @Override
    public Optional<ClientModel> findById(Long id)
    {
        return clientRepository.findById(id);
    }

    /**
     * UPDATE RECORD BY IDENTIFIER
     */
    @Override
    public <S extends ClientModel> S save(S clientEdited)
    {
        return clientRepository.save(clientEdited);
    }

    /**
     * NO Implementeds
     */
    @Override
    public List<ClientModel> findAll(Sort sort)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ClientModel> findAllById(Iterable<Long> ids)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends ClientModel> List<S> saveAll(Iterable<S> entities)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends ClientModel> S saveAndFlush(S entity)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends ClientModel> List<S> saveAllAndFlush(Iterable<S> entities)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ClientModel> entities)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ClientModel getOne(Long id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClientModel getById(Long id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends ClientModel> List<S> findAll(Example<S> example)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends ClientModel> List<S> findAll(Example<S> example, Sort sort)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<ClientModel> findAll(Pageable pageable)
    {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public boolean existsById(Long id)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public long count()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(ClientModel entity)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends ClientModel> entities)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends ClientModel> Optional<S> findOne(Example<S> example)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends ClientModel> Page<S> findAll(Example<S> example, Pageable pageable)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends ClientModel> long count(Example<S> example)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends ClientModel> boolean exists(Example<S> example)
    {
        // TODO Auto-generated method stub
        return false;
    }

    
}