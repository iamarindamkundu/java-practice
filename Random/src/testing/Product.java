package testing;

public class Product 
{
	private int id;
	private String name;
	private float price;
	
	public Product() {
		super();
	}

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Product other = (Product) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
	
	@Override
	public boolean equals(Object obj) {
		
		Product p = (Product)obj;
		
		return id == p.getId();
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
	
//	@Override
//	protected void finalize() throws Throwable 
//	{
//		System.out.println("Cleanup Code");
//		id = 0;
//		name = null;
//		price = 0;
//	}
}
