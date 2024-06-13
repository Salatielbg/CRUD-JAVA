/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Salatiel
 */
public class ReservaDTO extends ClientesDTO {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(String idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(String dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public String getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(String dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String id;
    private String idQuarto;
    private String dataCheckin;
    private String dataCheckout;
    private String status;

}
