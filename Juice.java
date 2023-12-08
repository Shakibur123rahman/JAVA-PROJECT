package classes;
public class Juice extends fooditem{
	

	
	    public  Juice () {
		
	}	
	
	public  Juice (String name , double price ) {
		
		this.name= name;
		this.price= price;
		
		
	}

	public void showdetails(int m){
		System.out.println("Dish name:"+name);
		
	    System.out.println("Dish price:"+price);
	 
	    
	}
	}