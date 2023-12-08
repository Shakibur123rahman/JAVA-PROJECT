package classes;
public class Sandwich extends fooditem{
	

	
	    public  Sandwich () {
		
	}	
	
	public  Sandwich (String name , double price ) {
		
		this.name= name;
		this.price= price;
		
		
	}

	public void showdetails(int f){
		System.out.println("Dish name:"+name);
		
	    System.out.println("Dish price:"+price);
	 
	    
	}
	}