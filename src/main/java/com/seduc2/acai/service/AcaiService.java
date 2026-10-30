package com.seduc2.acai.service;

import com.seduc2.acai.Repository.AcaiRepository;
import com.seduc2.acai.entity.Acai;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AcaiService  {

    private final AcaiRepository repository;
    public AcaiService(AcaiRepository repository) {
        this.repository = repository;
    }

    public List<Acai> mostrarAcai(){
        List<Acai> acaiList = new ArrayList<>();
        acaiList = repository.findAll();
        return acaiList;
    }
    public void cadastrarAcai (Acai a){
        Acai acai = new Acai();
        acai.setNomeCliente (a.getNomeCliente());
        acai.setTipo(a.getTipo());
        acai.setSabor(a.getSabor());
        acai.setCategoria(a.getCategoria());
        acai.setDataFabricacao(a.getDataFabricacao());
        acai.setPesoGramas(a.getPesoGramas());
        acai.setPreco(a.getPreco());
        acai.setObservacoes(a.getObservacoes());
        repository.save(acai);
    }
}
