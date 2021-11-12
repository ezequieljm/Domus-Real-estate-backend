package com.domusinmobiliaria.domus.controllers;

import java.util.List;
import java.util.Optional;

import com.domusinmobiliaria.domus.model.Appointment;
import com.domusinmobiliaria.domus.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = SecretaryController.BASIS)
public class SecretaryController
{
    public static final String BASIS = "/secretary";
    public static final String ID_ID = "/{id}";

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public String homeSecretary()
    {
        return "Secretary Workspace";
    }

    @GetMapping(value = "/schedule")
    public String shedule()
    {
        return "Shedule";
    }

    @GetMapping(value = "/schedule/appointments")
    public ResponseEntity<List<Appointment>> appointmentsResourse()
    {
        return ResponseEntity.ok(appointmentService.findAll());
    }

    @GetMapping(value = "/schedule/appointments/" + ID_ID)
    public ResponseEntity<Optional<Appointment>> anAppointment(@PathVariable(value = "id") Long id)
    {
        return ResponseEntity.ok(appointmentService.findById(id));
    }
}