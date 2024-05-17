package entities.heranca;

public class Individual extends TaxPayer {

    private Double healthExpenditures; // Gastos com saúde

    // Construtor que inicializa o nome, renda anual e gastos com saúde do contribuinte individual
    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome); // Chama o construtor da classe pai (TaxPayer) e passa o nome e a renda anual
        this.healthExpenditures = healthExpenditures; // Inicializa os gastos com saúde
    }

    // Método para obter os gastos com saúde
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    // Método para definir os gastos com saúde
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    // Método para calcular o imposto a ser pago pelo contribuinte individual
    @Override
    public Double tax() {
        // Calcula o imposto com base na renda anual e nos gastos com saúde
        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        } 
        else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}