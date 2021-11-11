package com.domusinmobiliaria.domus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "appointments")
public class Appointment
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "date_appointment")
    private String dateAppointment;

    private String hour;

    private String agent;

    private String propertie;

    @Column(name = "state_appointment")
    private String stateAppointment;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public String getDateAppointment()
    {
        return dateAppointment;
    }

    public void setDateAppointment(String dateAppointment)
    {
        this.dateAppointment = dateAppointment;
    }

    public String getHour()
    {
        return hour;
    }

    public void setHour(String hour)
    {
        this.hour = hour;
    }

    public String getAgent()
    {
        return agent;
    }

    public void setAgent(String agent)
    {
        this.agent = agent;
    }

    public String getPropertie()
    {
        return propertie;
    }

    public void setPropertie(String propertie)
    {
        this.propertie = propertie;
    }

    public String getStateAppointment()
    {
        return stateAppointment;
    }

    public void setStateAppointment(String stateAppointment)
    {
        this.stateAppointment = stateAppointment;
    }

}