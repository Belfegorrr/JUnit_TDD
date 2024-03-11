package br.com.ifernades;
import org.junit.Assert;
import org.junit.Test;

import br.com.ifernades.service.ContratoService;
import br.com.ifernades.service.IContratoService;

/**
 * 
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoService service = new ContratoService();

        String retorno = service.salvar();
        Assert.assertEquals(null, retorno);
    }
}
