package Tienda1;

public class Tienda1 {
	public static void main(String[] args) {
		  Composite combo = new Composite("Combo");
		  Leaf Entradas = new Leaf("Entradas");
		  Composite Comida = new Composite("Comida");
		  
		  
		  Leaf Palomitas = new Leaf("Palomitas");
		  Leaf Gaseosa = new Leaf("Gaseosa");
		  Leaf Nachos = new Leaf("Nachos");
	  
		  Comida.childrens.add(Palomitas);
		  Comida.childrens.add(Nachos);
		  Comida.childrens.add(Gaseosa);

	  
		  combo.childrens.add(Entradas);
		  combo.childrens.add(Comida);
		  combo.printName(" ");
	}
}
