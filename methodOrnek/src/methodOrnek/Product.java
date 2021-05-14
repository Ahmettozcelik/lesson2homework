package methodOrnek;

public class Product {
	
	int id;
	String name;
	String lesson;
	double price;
	
	public Product() {
		System.out.println("Ders Ýzlendi.");
	}

	public Product(int id, String name, String lesson, double price) {
		super();
		this.id = id;
		this.name = name;
		this.lesson = lesson;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + id + "," + name + "," + lesson + "," + price + "]";
	}
	
	
	
	
	
	
}
