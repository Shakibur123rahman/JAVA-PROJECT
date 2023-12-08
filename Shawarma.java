package classes;
public class Shawarma extends fooditem{
	
	
	
	public  Shawarma () {
		
	}	
	
	public  Shawarma (String name , double price ) {
	
	this.name= name;
	this.price= price;}
		

	
	public void showdetails(int b){
		System.out.println("Dish name:"+name);
	    System.out.println("Dish price:"+price);
    
	}
}
	