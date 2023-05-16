package april;

import java.util.Objects;

public class Smartphone {
	
	String model_name;
	int price;
	
	public Smartphone(String model_name,int price) {
	
		this.model_name=model_name;
		this.price=price;
			}
	
	public String toString() {
		return model_name+""+price;
	}
	
	public int hashCode() {
		return Objects.hash(model_name,price);
		
	}
	
	
	
	
	

}
