package exercises8;

public class Stocks implements Valuable {
	//Mistake, real name should be Stonks
	
	private final String name;
	private final String owner;
	private int shares, price;

	public Stocks(String name, String owner, int shares, int price) {
		super();
		this.name = name;
		this.owner = owner;
		this.shares = shares;
		this.price = price;
	}
	
	
	//Getters and Setters
	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public int getLiquidValue() {
		
		return getPrice()*getShares();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + price;
		result = prime * result + shares;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stocks other = (Stocks) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (price != other.price)
			return false;
		if (shares != other.shares)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Stocks [name=" + name + ", owner=" + owner + ", shares=" + shares + ", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}

}
