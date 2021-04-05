package goods1;

public class Goods {

	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	
	public Goods() {
		
	}

	public Goods(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price >= 0) {
			this.price = price;
		}
		
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public void setNumberOfStock(int numberOfStock) {
		if(numberOfStock >= 0) {
			this.numberOfStock = numberOfStock;
		}
		
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		if(sold >= 0) {
			this.sold = sold;
		}
		
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", numberOfStock=" + numberOfStock + ", sold=" + sold + "]";
	}
	

	
}
