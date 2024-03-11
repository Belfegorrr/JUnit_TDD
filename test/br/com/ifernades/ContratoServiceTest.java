package br.com.ifernades;
import org.junit.Assert;
import org.junit.Test;

import br.com.ifernades.dao.ContratoDao;
import br.com.ifernades.dao.IContratoDao;
import br.com.ifernades.dao.mocks.ContratoDaoMock;
import br.com.ifernades.service.ContratoService;
import br.com.ifernades.service.IContratoService;

/**
 * 
 */
public class ContratoServiceTest {

    @Test
    public void salvarContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    
    @Test
    public void AtualizarContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void DeleteContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.deletar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoDeletarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void BuscarContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
