package model;

public class Pedido {

    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoNovo.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public Boolean pagarComCartaoDeCreditoOuPix(){
        return estado.pagarComCartaoDeCreditoOuPix(this);
    }

    public Boolean confirmarPagamento(){
        return estado.confirmarPagamento(this);
    }

    public Boolean cancelar(){
        return estado.cancelar(this);
    }

    public Boolean entregar(){
        return estado.entregar(this);
    }

    public Boolean concluir(){
        return estado.concluir(this);
    }
}
