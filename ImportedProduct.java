package entities.heranca;

public class ImportedProduct extends Product {

    private Double customsFee; // Taxa alfandegária

    // Construtor que inicializa o nome, preço e taxa alfandegária do produto importado
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price); // Chama o construtor da classe pai (Product) e passa o nome e o preço
        this.customsFee = customsFee; // Inicializa a taxa alfandegária
    }

    // Método para obter a taxa alfandegária
    public Double getCustomsFee() {
        return customsFee;
    }

    // Método para definir a taxa alfandegária
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    // Método para calcular o preço total (preço + taxa alfandegária)
    public Double totalPrice() {
        return getPrice() + customsFee;
    }
    
    // Método para obter a tag de preço do produto importado
    @Override
    public String priceTag() {
        return getName() 
                + " $ " 
                + String.format("%.2f", totalPrice()) // Formata o preço total
                + " (Customs fee: $ " 
                + String.format("%.2f", customsFee) // Formata a taxa alfandegária
                + ")";
    }
}