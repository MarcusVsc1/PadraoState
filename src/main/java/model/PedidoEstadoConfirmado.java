package model;

public class PedidoEstadoConfirmado extends PedidoEstado {

    private PedidoEstadoConfirmado() {}
    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();
    public static PedidoEstadoConfirmado getInstance() {return instance;}

    public String getEstado() {
        return "Confirmado";
    }

    public Boolean cancelar(Pedido pedido){
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public Boolean entregar(Pedido pedido){
        pedido.setEstado(PedidoEstadoEmEntrega.getInstance());
        return true;
    }


}
