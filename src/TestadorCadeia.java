public class TestadorCadeia {
    
    public static void executarTestes() {
        System.out.println("========================================");
        System.out.println("INICIANDO TESTES DA CADEIA");
        System.out.println("========================================");
        
        AprovadorDeCompras aprovador = AprovadorDeCompras.criar();
        
        // Teste 1: Limite do Comprador
        System.out.println("\n[TESTE 1] Valor no limite do comprador (1000):");
        aprovador.processarSolicitacao(1000);
        
        // Teste 2: Acima do limite do Comprador
        System.out.println("\n[TESTE 2] Valor acima do limite do comprador (1001):");
        aprovador.processarSolicitacao(1001);
        
        // Teste 3: Limite do Gerente
        System.out.println("\n[TESTE 3] Valor no limite do gerente (50000):");
        aprovador.processarSolicitacao(50000);
        
        // Teste 4: Acima do limite do Gerente
        System.out.println("\n[TESTE 4] Valor acima do limite do gerente (50001):");
        aprovador.processarSolicitacao(50001);
        
        // Teste 5: Valor muito alto
        System.out.println("\n[TESTE 5] Valor muito alto (1000000):");
        aprovador.processarSolicitacao(1000000);
        
        // Teste 6: Valor zero/negativo
        System.out.println("\n[TESTE 6] Valor inválido (0):");
        aprovador.processarSolicitacao(0);
        
        System.out.println("\n========================================");
        System.out.println("TESTES CONCLUÍDOS");
        System.out.println("========================================");
    }
    
    public static void main(String[] args) {
        executarTestes();
    }
}
