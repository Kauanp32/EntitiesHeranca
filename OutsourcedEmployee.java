package entities.heranca;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge; // Carga adicional para funcionário terceirizado

    // Construtor padrão
    public OutsourcedEmployee() {
        super(); // Chama o construtor da classe pai (Employee)
    }
    
    // Construtor com parâmetros
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour); // Chama o construtor da classe pai (Employee) e passa os parâmetros necessários
        this.additionalCharge = additionalCharge; // Inicializa a carga adicional
    }

    // Método para obter a carga adicional
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    // Método para definir a carga adicional
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    // Método para calcular o pagamento do funcionário terceirizado
    @Override
    public double payment() {
        // Retorna o pagamento base (calculado na classe Employee) mais 10% da carga adicional
        return super.payment() + additionalCharge * 1.1;
    }
}