public class PolimorfismoCorriente extends PolimorfismoCuenta{
    private String oficial_credito;
    public PolimorfismoCorriente(){}
    public PolimorfismoCorriente(int numero, String titular, float saldo_actual, char estado, String oficial_credito) {
        super(numero, titular, saldo_actual, estado);
        this.oficial_credito = oficial_credito;
    }
    public String getOficial_credito() {
        return oficial_credito;
    }
    public void setOficial_credito(String oficial_credito) {
        this.oficial_credito = oficial_credito;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("OFICIAL CREDITO: " + this.getOficial_credito());
    }
    public float generarInteres() {
        float valor_interes;
        valor_interes = this.getSaldo_actual() * 0.08f/100;
        return valor_interes;
    }
    public char cuentaActiva(){
        return 'A';
    }
    public char cuentaInactiva(){
        return 'I';
    }
    @Override
    public float getAhorro_meta() {
        // TODO Auto-generated method stub
        return 0;
    }
}