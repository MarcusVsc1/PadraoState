package model;

public class PedidoEstadoPendentePagamento extends PedidoEstado {

    private PedidoEstadoPendentePagamento() {}
    private static PedidoEstadoPendentePagamento instance = new PedidoEstadoPendentePagamento();
    public static PedidoEstadoPendentePagamento getInstance() {return instance;}

    public String getEstado() {
        return "Pendente Pagamento";
    }

    public Boolean cancelar(Pedido pedido){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public Boolean confirmarPagamento(Pedido pedido){
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        return true;
    }
    

}
