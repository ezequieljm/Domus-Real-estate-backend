package com.domusinmobiliaria.domus.controllers;

import java.util.List;
import java.util.Optional;

import com.domusinmobiliaria.domus.model.AppointmentModel;
import com.domusinmobiliaria.domus.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<List<AppointmentModel>> appointmentsResourse()
    {
        return ResponseEntity.ok(appointmentService.findAll());
    }

    @GetMapping(value = "/schedule/appointments/" + ID_ID)
    public ResponseEntity<Optional<AppointmentModel>> anAppointment(@PathVariable(value = "id") Long id)
    {
        return ResponseEntity.ok(appointmentService.findById(id));
    }

    @PutMapping(value = "/schedule/appointments/modify" + ID_ID)
    public ResponseEntity<AppointmentModel> changeAnAppointment(
        @RequestBody AppointmentModel appointment,
        @PathVariable int id
    ) 
    { 
        AppointmentModel appointmentEdited = new AppointmentModel();
/*         ClientModel clientModelEdited = new ClientModel();

        ClientModel client = appointment.getClient();

        clientModelEdited.setIdClient(client.getIdClient());
        clientModelEdited.setFullname(client.getFullname());
        clientModelEdited.setCellphone(client.getCellphone());
        clientModelEdited.setEmail(client.getEmail()); */

        appointmentEdited.setId(appointment.getId());
        appointmentEdited.setTitle(appointment.getTitle());
        appointmentEdited.setShortDescription(appointment.getShortDescription());
        appointmentEdited.setDateAppointment(appointment.getDateAppointment());
        appointmentEdited.setHour(appointment.getHour());
        appointmentEdited.setAgent(appointment.getAgent());
        appointmentEdited.setPropertie(appointment.getPropertie());
        appointmentEdited.setStateAppointment(appointment.getStateAppointment());
        appointmentEdited.setClient(appointment.getClient());

        return ResponseEntity.ok(appointmentService.save(appointmentEdited));
    }

    @PostMapping(value = "/schedule/appointments/create")
    public ResponseEntity<AppointmentModel> saveAnAppointment(@RequestBody AppointmentModel appointment)
    {
        return ResponseEntity.ok(appointmentService.save(appointment));
    }

}