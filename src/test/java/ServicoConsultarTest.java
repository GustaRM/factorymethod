import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoConsultarTest {

    @Test
    void deveExecutarConsultar() {
        IServico servico = ServicoFactory.obterServico("Consultar");
        assertEquals("Consulta efetivada", servico.executar());
    }

    @Test
    void deveCancelarConsulta() {
        IServico servico = ServicoFactory.obterServico("Consultar");
        assertEquals("Consulta cancelada", servico.cancelar());
    }

}