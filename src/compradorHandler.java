public class compradorHandler extends absHandler {
    
    @Override
    public void handleRequest(double valor) {
        if(this.canHandle(valor)) {
            System.out.println("Compra autorizada pelo COMPRADOR (Valor: R$ " + valor + ")");
        } else {
            nextHandler.handleRequest(valor);
        }
    }

    @Override
    protected boolean canHandle(double valor) {
        return (valor <= 1000);
    }
}