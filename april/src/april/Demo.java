package april;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		
		HashSet<Smartphone>aa=new HashSet<Smartphone>();
		
		aa.add(new Smartphone("Iphone",400000));
		aa.add(new Smartphone("Samsung",300000));
		aa.add(new Smartphone("Lava",20000));
		aa.add(new Smartphone("Yxtel",50000));
		
		
		for(Smartphone x:aa) {
			System.out.println(x);
		}
		
		
		
		
		
		
				
			}
		
		
		

	}


