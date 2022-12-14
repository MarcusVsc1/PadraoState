package model;

public class PedidoEstadoEmEntrega extends PedidoEstado {

    private PedidoEstadoEmEntrega() {}
    private static PedidoEstadoEmEntrega instance = new PedidoEstadoEmEntrega();
    public static PedidoEstadoEmEntrega getInstance() {return instance;}

    public String getEstado() {
        return "Confirmado";
    }

    public Boolean concluir(Pedido pedido){
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        return true;
    }

}
