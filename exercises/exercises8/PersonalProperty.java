package exercises8;

import java.util.LinkedList;
import java.util.List;

public class PersonalProperty {
	
	private final int startValue, timeskip;
	
	final private List<Valuable> assets;
	
	
	public PersonalProperty(int startValue, int timeskip) {
		super();
		this.startValue = startValue;
		this.timeskip = timeskip;
		this.assets = new LinkedList<Valuable>();
	}


	public int getStartValue() {
		return startValue;
	}


	public void addAsset(Valuable v) {
		assets.add(v);
		return;
	}

	public int getTimeskip() {
		return timeskip;
	}




	public int depreciatedValue() {
		return (int) (startValue* Math.pow(0.8, (double)timeskip));
	}

	public int getLiquidValue() {
		int sum = 0;
		for(Valuable v : assets) {
			sum += v.getLiquidValue();
		}
			
			
		return depreciatedValue() + sum;
	}


	@Override
	public String toString() {
		return "PersonalProperty [startValue=" + startValue + ", timeskip=" + timeskip + "]";
	}
	
	public static void main(String[] args) {
		PersonalProperty kevin = new PersonalProperty(1000, 10);
		
		Stocks s = new Stocks("IBM", "kevin", 5, 50);
		kevin.assets.add(s);
		
		System.out.println(kevin.getLiquidValue());
		
		System.out.println(kevin);
		
	}
	
	
}
