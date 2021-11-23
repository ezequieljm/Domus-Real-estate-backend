package com.domusinmobiliaria.domus.service;

import java.util.List;
import java.util.Optional;

import com.domusinmobiliaria.domus.model.AppointmentModel;
import com.domusinmobiliaria.domus.repository.AppointmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService implements AppointmentRepository
{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private ClientService clientService;

    /**
     * READ ALL RECORDS
     */
    @Override
    public List<AppointmentModel> findAll()
    {
        return appointmentRepository.findAll();
    }

    /**
     * READ BY IDENTIFIER
     */
    @Override
    public Optional<AppointmentModel> findById(Long id)
    {
        return appointmentRepository.findById(id);
    }

    /**
     * UPDATE RECORD BY IDENTIFIER
     */
    @Override
    public <T extends AppointmentModel> T save(T appointmentEdited)
    {
        clientService.save(appointmentEdited.getClient());
        return appointmentRepository.save(appointmentEdited);
    }

    /**
     * Methods not implemented
     */
    @Override
    public List<AppointmentModel> findAll(Sort sort)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AppointmentModel> findAllById(Iterable<Long> ids)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends AppointmentModel> List<S> saveAll(Iterable<S> entities)
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
    public <S extends AppointmentModel> S saveAndFlush(S entity)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends AppointmentModel> List<S> saveAllAndFlush(Iterable<S> entities)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<AppointmentModel> entities)
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
    public AppointmentModel getOne(Long id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AppointmentModel getById(Long id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends AppointmentModel> List<S> findAll(Example<S> example)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends AppointmentModel> List<S> findAll(Example<S> example, Sort sort)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<AppointmentModel> findAll(Pageable pageable)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(AppointmentModel entity)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll(Iterable<? extends AppointmentModel> entities)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(Long id)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean existsById(Long id)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends AppointmentModel> long count(Example<S> example)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends AppointmentModel> boolean exists(Example<S> example)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends AppointmentModel> Page<S> findAll(Example<S> example, Pageable pageable)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends AppointmentModel> Optional<S> findOne(Example<S> example)
    {
        // TODO Auto-generated method stub
        return null;
    }
}
