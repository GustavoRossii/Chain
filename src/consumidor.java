public class consumidor {
    public static void main(String[] args) {
        // Cliente só precisa conhecer a classe AprovadorDeCompras
        AprovadorDeCompras aprovador = AprovadorDeCompras.criar();
        
        // Testes com diferentes valores
        aprovador.processarSolicitacao(500);      // Comprador
        aprovador.processarSolicitacao(5000);     // Gerente
        aprovador.processarSolicitacao(75000);    // Diretor
        aprovador.processarSolicitacao(999);      // Comprador
        aprovador.processarSolicitacao(50000);    // Gerente
        aprovador.processarSolicitacao(150000);   // Diretor
        
        // Teste de valor inválido
        aprovador.processarSolicitacao(-100);
    }
}