package entities;

public class Product {

	//atributos
	public String name;
	public double price;
	public int quantity;
	
	//metodos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) { //parametro da funcao
		this.quantity += quantity; //this palavra reservada de autoreferencia, ou seja nesse caso ta indicando q eu quero pegar o atributo quantity e n o parametro
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
		}
	
	
	
}
