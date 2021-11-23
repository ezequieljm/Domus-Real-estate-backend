package com.domusinmobiliaria.domus.repository;

import com.domusinmobiliaria.domus.model.ClientModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
    
}
