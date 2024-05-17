package entities.heranca;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

// Importa classes necessárias do pacote java.time para lidar com datas e formatação de datas

public class UsedProduct extends Product {
    // Declaração da classe UsedProduct que estende a classe Product
    
    private LocalDate manufactureDate;
    // Declaração de uma variável de instância privada para armazenar a data de fabricação do produto

    // Construtor da classe UsedProduct que recebe nome, preço e data de fabricação como parâmetros
    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price); // Chama o construtor da classe pai (Product) passando nome e preço
        this.manufactureDate = manufactureDate; // Inicializa a variável de instância manufactureDate com a data de fabricação fornecida
    }

    // Método getter para obter a data de fabricação do produto
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    // Método setter para definir a data de fabricação do produto
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    // Sobrescreve o método priceTag da classe pai (Product) para incluir informações adicionais sobre o produto usado
    @Override
    public String priceTag() {
        // Retorna uma string formatada contendo o nome, preço, e data de fabricação do produto usado
        return getName() 
                + " (used) $ " 
                + String.format("%.2f", getPrice()) // Formata o preço com duas casas decimais
                + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) // Formata a data de fabricação no formato "dd/MM/yyyy"
                + ")";
    }
}