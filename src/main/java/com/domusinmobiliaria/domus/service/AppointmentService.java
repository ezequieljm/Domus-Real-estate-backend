package com.domusinmobiliaria.domus.service;

import java.util.List;
import java.util.Optional;

import com.domusinmobiliaria.domus.model.Appointment;
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

    @Override
    public List<Appointment> findAll()
    {
        return appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> findAll(Sort sort)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Appointment> findAllById(Iterable<Long> ids)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Appointment> List<S> saveAll(Iterable<S> entities)
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
    public <S extends Appointment> S saveAndFlush(S entity)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Appointment> List<S> saveAllAndFlush(Iterable<S> entities)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Appointment> entities)
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
    public Appointment getOne(Long id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Appointment getById(Long id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Appointment> List<S> findAll(Example<S> example)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Appointment> List<S> findAll(Example<S> example, Sort sort)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Appointment> findAll(Pageable pageable)
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
    public void delete(Appointment entity)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll(Iterable<? extends Appointment> entities)
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
    public Optional<Appointment> findById(Long id)
    {
        return appointmentRepository.findById(id);
    }

    @Override
    public <S extends Appointment> S save(S entity)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Appointment> long count(Example<S> example)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Appointment> boolean exists(Example<S> example)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Appointment> Page<S> findAll(Example<S> example, Pageable pageable)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Appointment> Optional<S> findOne(Example<S> example)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
