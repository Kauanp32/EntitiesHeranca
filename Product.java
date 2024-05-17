package entities.heranca;

public class Product {

    private String name; // Nome do produto
    private Double price; // Preço do produto

    // Construtor que inicializa o nome e o preço do produto
    public Product(String name, Double price) {
        this.name = name; // Inicializa o nome
        this.price = price; // Inicializa o preço
    }

    // Método para obter o nome do produto
    public String getName() {
        return name;
    }

    // Método para definir o nome do produto
    public void setName(String name) {
        this.name = name;
    }

    // Método para obter o preço do produto
    public Double getPrice() {
        return price;
    }

    // Método para definir o preço do produto
    public void setPrice(Double price) {
        this.price = price;
    }

    // Método para retornar uma representação formatada do preço do produto
    public String priceTag() {
        return name + " $ " + String.format("%.2f", price); // Retorna o nome e o preço formatado
    }
}