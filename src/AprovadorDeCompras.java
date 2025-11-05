public class AprovadorDeCompras {
    private absHandler primeiroHandler;

    private AprovadorDeCompras() {
        construirCadeia();
    }

    public static AprovadorDeCompras criar() {
        return new AprovadorDeCompras();
    }

    private void construirCadeia() {
        absHandler comprador = new compradorHandler();
        absHandler gerente = new gerenteHandler();
        absHandler diretor = new diretorHandler();
        
        comprador.setNextHandle(gerente);
        gerente.setNextHandle(diretor);
        
        this.primeiroHandler = comprador;
    }

    public void processarSolicitacao(double valor) {
        if (valor <= 0) {
            System.out.println("ERRO: Valor inválido para compra!");
            return;
        }
        
        System.out.println("\n--- Processando solicitação de compra ---");
        primeiroHandler.handleRequest(valor);
        System.out.println("--- Fim do processamento ---\n");
    }
}
