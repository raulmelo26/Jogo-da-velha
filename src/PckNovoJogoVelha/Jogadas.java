/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PckNovoJogoVelha;

import java.io.Serializable;

/**
 *
 * @author guest-7wnPFl
 */
public class Jogadas implements Serializable {
    private String nomeVencedor;
    private String cor;
    private String data;
    private String horaInicio;
    private float duracao;

    public Jogadas(String nomeVencedor, String cor, String data, String horaInicio, float duracao) {
        this.nomeVencedor = nomeVencedor;
        this.cor = cor;
        this.data = data;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
    }

     public Jogadas(String nomeVencedor, String data, String horaInicio, float duracao) {
        this.nomeVencedor = nomeVencedor;
        this.data = data;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
      
    }
    
    public String getNomeVencedor() {
        return nomeVencedor;
    }

    public void setNomeVencedor(String nomeVencedor) {
        this.nomeVencedor = nomeVencedor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return nomeVencedor + " " + cor + " " + data + " " + horaInicio + " " + duracao; 
      
    }
    
    
    
}
