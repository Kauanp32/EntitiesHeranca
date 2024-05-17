package entities.heranca;

// Declaração do pacote onde a classe TaxPayer está localizada

public abstract class TaxPayer {
    // Declaração da classe TaxPayer como abstrata

    private String name;
    private Double anualIncome;
    // Declaração de variáveis de instância privadas para armazenar o nome e a renda anual do contribuinte

    // Construtor da classe TaxPayer que recebe o nome e a renda anual como parâmetros
    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
        // Inicializa as variáveis de instância com os valores fornecidos como argumentos
    }

    // Método getter para obter o nome do contribuinte
    public String getName() {
        return name;
    }

    // Método setter para definir o nome do contribuinte
    public void setName(String name) {
        this.name = name;
    }

    // Método getter para obter a renda anual do contribuinte
    public Double getAnualIncome() {
        return anualIncome;
    }

    // Método setter para definir a renda anual do contribuinte
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    // Método abstrato tax() que será implementado nas classes filhas para calcular o imposto
    public abstract Double tax();
    // Não há implementação neste método aqui, pois ele é abstrato e será implementado nas subclasses.
}