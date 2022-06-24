package entities;

public class ProductConstrutor {

	private String name;
	private double price;
	private int quantity;
	
	public ProductConstrutor() {
		
	}
	
	//construtor
	public ProductConstrutor(String name, double price, int quantity) {
		this.name = name; //this -- referencia ao atributo do objeto e diferenciar do parametro do metodo
		this.price = price;
		this.quantity = quantity;
	}
	
	//sobrecarga -- construtores com o mesmo nome mas parametros diferentes
	public ProductConstrutor(String name, double price) {
		this.name = name; //this -- referencia ao atributo do objeto e diferenciar do parametro do metodo
		this.price = price;
		
	}
	
	//encapsulamento
	
	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void SetPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity2) {
		this.quantity += quantity2;
	}

	public void removeProducts(int quantity2) {
		this.quantity -= quantity2;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
