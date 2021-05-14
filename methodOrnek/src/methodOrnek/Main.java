package methodOrnek;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Engin","Java",15000);
		Product product2 = new Product(2,"Ahmet","C#",1000);
		
		Product[] product = {product1,product2};
		
		for (Product value : product) {
			System.out.println(value.toString());
			
		}
			
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product1);
		productManager.remove(product);
		
	}
		

}
