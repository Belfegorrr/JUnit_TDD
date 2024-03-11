package br.com.ifernades.service;

import br.com.ifernades.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }
    @Override
    public String salvar() { 
        contratoDao.salvar();      
        return "Sucesso";
    }
    @Override
    public String buscar() {
        contratoDao.buscar();      
        return "Sucesso";
    }
    @Override
    public String deletar() {
        contratoDao.deletar();      
        return "Sucesso";
    }
    @Override
    public String atualizar() {
        contratoDao.atualizar();      
        return "Sucesso";
    }
}
