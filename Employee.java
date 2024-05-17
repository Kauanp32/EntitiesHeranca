package entities.heranca;

public class Employee {

	private String name; // Nome do empregado
	private Integer hours; // Horas trabalhadas
	private Double valuePerHour; // Valor por hora

	// Construtor padrão
	public Employee() {
	}

	// Construtor com parâmetros
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name; // Inicializa o nome
		this.hours = hours; // Inicializa as horas trabalhadas
		this.valuePerHour = valuePerHour; // Inicializa o valor por hora
	}

	// Método para obter o nome do empregado
	public String getName() {
		return name;
	}

	// Método para definir o nome do empregado
	public void setName(String name) {
		this.name = name;
	}

	// Método para obter as horas trabalhadas
	public Integer getHours() {
		return hours;
	}

	// Método para definir as horas trabalhadas
	public void setHours(Integer hours) {
		this.hours = hours;
	}

	// Método para obter o valor por hora
	public Double getValuePerHour() {
		return valuePerHour;
	}

	// Método para definir o valor por hora
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	// Método para calcular o pagamento do empregado
	public double payment() {
		return hours * valuePerHour; // Calcula o pagamento multiplicando as horas trabalhadas pelo valor por hora
	}
}