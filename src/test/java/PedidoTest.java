import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp () {
        pedido = new Pedido();
    }

    @Test
    public void pedidoNovoPagarCartaoDeCreditoOuPixTest() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertTrue(pedido.pagarComCartaoDeCreditoOuPix());
        assertEquals(PedidoEstadoPendentePagamento.getInstance(),pedido.getEstado());
    }

    @Test
    public void pedidoNovoConfirmarPagamentoTest() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertTrue(pedido.confirmarPagamento());
        assertEquals(PedidoEstadoConfirmado.getInstance(),pedido.getEstado());
    }

    @Test
    public void pedidoNovoCancelarTest() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void pedidoNovoEntregarTest() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void pedidoNovoConcluirTest() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void pedidoCanceladoConcluir() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void pedidoCanceladoConfirmarPagamento() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.confirmarPagamento());
    }

    @Test
    public void pedidoCanceladoCancelar() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void pedidoCanceladoEntregar() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void pedidoCanceladoPagarComCartaoDeCreditoOuPix() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.pagarComCartaoDeCreditoOuPix());
    }

    @Test
    public void pedidoConcluidoEntregar() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void pedidoConcluidoPagarComCartaoDeCreditoOuPix() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.pagarComCartaoDeCreditoOuPix());
    }

    @Test
    public void pedidoConcluidoConcluir() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void pedidoConcluidoConfirmarPagamento() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.confirmarPagamento());
    }

    @Test
    public void pedidoConcluidoCancelar() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void pedidoEmEntregaEntregar() {
        pedido.setEstado(PedidoEstadoEmEntrega.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void pedidoEmEntregaPagarComCartaoDeCreditoOuPix() {
        pedido.setEstado(PedidoEstadoEmEntrega.getInstance());
        assertFalse(pedido.pagarComCartaoDeCreditoOuPix());
    }

    @Test
    public void pedidoEmEntregaConcluir() {
        pedido.setEstado(PedidoEstadoEmEntrega.getInstance());
        assertTrue(pedido.concluir());
        assertEquals(PedidoEstadoConcluido.getInstance(),pedido.getEstado());
    }

    @Test
    public void pedidoEmEntregaConfirmarPagamento() {
        pedido.setEstado(PedidoEstadoEmEntrega.getInstance());
        assertFalse(pedido.confirmarPagamento());
    }

    @Test
    public void pedidoEmEntregaCancelar() {
        pedido.setEstado(PedidoEstadoEmEntrega.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void pedidoPendentePagamentoEntregar() {
        pedido.setEstado(PedidoEstadoPendentePagamento.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void pedidoPendentePagamentoPagarComCartaoDeCreditoOuPix() {
        pedido.setEstado(PedidoEstadoPendentePagamento.getInstance());
        assertFalse(pedido.pagarComCartaoDeCreditoOuPix());
    }

    @Test
    public void pedidoPendentePagamentoConcluir() {
        pedido.setEstado(PedidoEstadoPendentePagamento.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void pedidoPendentePagamentoConfirmarPagamento() {
        pedido.setEstado(PedidoEstadoPendentePagamento.getInstance());
        assertTrue(pedido.confirmarPagamento());
        assertEquals(PedidoEstadoConfirmado.getInstance(),pedido.getEstado());
    }

    @Test
    public void pedidoPendentePagamentoCancelar() {
        pedido.setEstado(PedidoEstadoPendentePagamento.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(),pedido.getEstado());
    }

    @Test
    public void pedidoConfirmadoEntregar() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEmEntrega.getInstance(),pedido.getEstado());
    }

    @Test
    public void pedidoConfirmadoPagarComCartaoDeCreditoOuPix() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.pagarComCartaoDeCreditoOuPix());
    }

    @Test
    public void pedidoConfirmadoConcluir() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void pedidoConfirmadoConfirmarPagamento() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.confirmarPagamento());
    }

    @Test
    public void pedidoConfirmadoCancelar() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(),pedido.getEstado());
    }

}
