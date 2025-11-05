public class diretorHandler extends absHandler {
    
    @Override
    public void handleRequest(double valor) {
        if(this.canHandle(valor)) {
            System.out.println("Compra autorizada pelo DIRETOR (Valor: R$ " + valor + ")");
        }
    }

    @Override
    protected boolean canHandle(double valor) {
        return true;
    }
}
