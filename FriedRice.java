package classes;
public class   FriedRice   extends Pasta{
	
	public String size ;

    public  FriedRice () {
		
	}	
	
	public  FriedRice  (String name,String size,double price ) {
		
		this.name= name;
		
		this.size=size;
		
		this.price= price;
		
		
	}
	
	public void setsize (String size){
		
		size= size;
	}
	public String getsize (){
		
		return size;
	}
	
	public void showdetails(int j){
	System.out.println("Dish name:"+name);
	System.out.println("Dish size:"+size);
	System.out.println("Dish price:"+price);
	 
	 
	}
}