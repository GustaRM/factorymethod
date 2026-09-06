import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoSacarTest {

    @Test
    void deveExecutarSacar() {
        IServico servico = ServicoFactory.obterServico("Sacar");
        assertEquals("Saque efetivado", servico.executar());
    }

    @Test
    void deveCancelarSacar() {
        IServico servico = ServicoFactory.obterServico("Sacar");
        assertEquals("Saque cancelado", servico.cancelar());
    }

}