package model;

public abstract class PedidoEstado {

    public abstract String getEstado();

    public Boolean pagarComCartaoDeCreditoOuPix(Pedido pedido){
        return false;
    }

    public Boolean confirmarPagamento(Pedido pedido){
        return false;
    }

    public Boolean cancelar(Pedido pedido){
        return false;
    }

    public Boolean entregar(Pedido pedido){
        return false;
    }

    public Boolean concluir(Pedido pedido){
        return false;
    }

}
