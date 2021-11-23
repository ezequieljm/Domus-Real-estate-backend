package com.domusinmobiliaria.domus.repository;

import com.domusinmobiliaria.domus.model.AppointmentModel;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AppointmentRepository
 */
public interface AppointmentRepository extends JpaRepository<AppointmentModel, Long>
{

}
