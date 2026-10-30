package com.seduc2.acai.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Acai {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeCliente;
    private String tipo;
    private String sabor;
    private String categoria;
    private LocalDate dataFabricacao;
    private double pesoGramas;
    private double preco;
    private String observacoes;

    public Acai (){}

    public Acai(long id, String nomeCliente, String tipo, String sabor, String categoria, LocalDate dataFabricacao, double pesoGramas, double preco, String observacoes) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.tipo = tipo;
        this.sabor = sabor;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.pesoGramas = pesoGramas;
        this.preco = preco;
        this.observacoes = observacoes;
    }

    public Acai(String nomeCliente, String tipo, String sabor, String categoria, LocalDate dataFabricacao, double pesoGramas, double preco, String observacoes) {
        this.nomeCliente = nomeCliente;
        this.tipo = tipo;
        this.sabor = sabor;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.pesoGramas = pesoGramas;
        this.preco = preco;
        this.observacoes = observacoes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public double getPesoGramas() {
        return pesoGramas;
    }

    public void setPesoGramas(double pesoGramas) {
        this.pesoGramas = pesoGramas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
