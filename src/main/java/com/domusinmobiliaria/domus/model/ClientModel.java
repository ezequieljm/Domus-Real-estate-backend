package com.domusinmobiliaria.domus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class ClientModel {


    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client")
    private Long idClient;

    private String fullname;

    private int cellphone;

    private String email;

    public ClientModel() { }

    public Long getIdClient()
    {
        return idClient;
    }

    public void setIdClient(Long idClient)
    {
        this.idClient = idClient;
    }

    public String getFullname()
    {
        return fullname;
    }

    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    public int getCellphone()
    {
        return cellphone;
    }

    public void setCellphone(int cellphone)
    {
        this.cellphone = cellphone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
