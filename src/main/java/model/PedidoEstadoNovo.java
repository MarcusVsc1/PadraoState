package model;

public class PedidoEstadoNovo extends PedidoEstado {

    private PedidoEstadoNovo() {}
    private static PedidoEstadoNovo instance = new PedidoEstadoNovo();
    public static PedidoEstadoNovo getInstance() {return instance;}

    public String getEstado() {
        return "Novo";
    }

    public Boolean pagarComCartaoDeCreditoOuPix(Pedido pedido){
        pedido.setEstado(PedidoEstadoPendentePagamento.getInstance());
        return true;
    }

    public Boolean confirmarPagamento(Pedido pedido){
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        return true;
    }

}
