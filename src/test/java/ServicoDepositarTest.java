import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoDepositarTest {

    @Test
    void deveExecutarDeposito() {
        IServico servico = ServicoFactory.obterServico("Depositar");
        assertEquals("Deposito efetivado", servico.executar());
    }

    @Test
    void deveCancelarDeposito() {
        IServico servico = ServicoFactory.obterServico("Depositar");
        assertEquals("Deposito cancelado", servico.cancelar());
    }

}