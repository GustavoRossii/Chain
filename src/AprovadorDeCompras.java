public class AprovadorDeCompras {
    private absHandler primeiroHandler;
    
    /**
     * Construtor privado
     */
    private AprovadorDeCompras() {
        construirCadeia();
    }
    
    /**
     * Método estático factory para criar a instância
     */
    public static AprovadorDeCompras criar() {
        return new AprovadorDeCompras();
    }
    
    /**
     * Constrói a cadeia de responsabilidade internamente
     * O cliente não precisa saber desta lógica
     */
    private void construirCadeia() {
        absHandler comprador = new compradorHandler();
        absHandler gerente = new gerenteHandler();
        absHandler diretor = new diretorHandler();
        
        // Monta a cadeia
        comprador.setNextHandle(gerente);
        gerente.setNextHandle(diretor);
        
        this.primeiroHandler = comprador;
    }
    
    /**
     * Método público para processar uma solicitação de compra
     * Esta é a ÚNICA interface que o cliente precisa conhecer
     */
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