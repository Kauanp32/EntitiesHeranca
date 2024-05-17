package entities.heranca;

public class Company extends TaxPayer {

    private Integer numberOfEmployees; // Número de funcionários da empresa

    // Construtor que inicializa o nome, renda anual e número de funcionários da empresa
    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome); // Chama o construtor da classe pai (TaxPayer) e passa o nome e a renda anual
        this.numberOfEmployees = numberOfEmployees; // Inicializa o número de funcionários
    }

    // Método para obter o número de funcionários
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    // Método para definir o número de funcionários
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    // Método para calcular o imposto a ser pago pela empresa
    @Override
    public Double tax() {
        // Calcula o imposto com base na renda anual e no número de funcionários
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14; // Imposto de 14% se a empresa tiver mais de 10 funcionários
        } else {
            return getAnualIncome() * 0.16; // Imposto de 16% se a empresa tiver 10 ou menos funcionários
        }
    }
}