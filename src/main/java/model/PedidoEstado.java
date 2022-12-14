package model;

public abstract class PedidoEstado {

    public abstract String getEstado();

    public Boolean pagarComCartaoCreditoOuPix(Pedido pedido){
        return false;
    }

    public Boolean confirmarPagamento(Pedido pedido){
        return false;
    }

    public Boolean cancelar(Pedido pedido){
        return false;
    }

}
