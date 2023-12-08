package classes;
public class Setmenu extends fooditem{
	

	
	    public  Setmenu () {
		
	}	
	
	public  Setmenu (String name , double price ) {
		
		this.name= name;
		this.price= price;
		
		
	}

	public void showdetails(int k){
	System.out.println("Dish name:"+name);
		
	System.out.println("Dish price:"+price);
	 
	    
	}
	}