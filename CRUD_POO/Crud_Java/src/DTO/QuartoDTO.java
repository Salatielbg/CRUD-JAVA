/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Salatiel
 */
public class QuartoDTO {

    String id_quarto;
    String numero;
    String tipo;
    double preco_diaria;
    String Status;

    public String getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(String id_quarto) {
        this.id_quarto = id_quarto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco_diaria() {
        return preco_diaria;
    }

    public void setPreco_diaria(double preco_diaria) {
        this.preco_diaria = preco_diaria;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}
