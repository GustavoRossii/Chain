public class consumidor {
    public static void main(String[] args) {
        AprovadorDeCompras aprovador = AprovadorDeCompras.criar();

        aprovador.processarSolicitacao(500);      // Comprador
        aprovador.processarSolicitacao(5000);     // Gerente
        aprovador.processarSolicitacao(75000);    // Diretor
        aprovador.processarSolicitacao(999);      // Comprador
        aprovador.processarSolicitacao(50000);    // Gerente
        aprovador.processarSolicitacao(150000);   // Diretor
        
        aprovador.processarSolicitacao(-100);
    }
}
