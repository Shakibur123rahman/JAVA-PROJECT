package classes;
public class fooditem{
	//instance variable
	public double price ;
	
	public  String name;
	//  constructor
	public fooditem (){
	}
	
	public fooditem (double price , String name){
		
		this.price= price;
		
		this.name= name;
		
	}
	//setter method
	public void setprice (double price){
		
		 price=price;
	}
	
	public void setname (String name){
		
		 name = name;
	}
	
	//getter method
	public double getprice(){
		
		return price;
	}
		public String getname(){
		
		return name;
	}
	//showmethod
	public void showdetails(){
		
	 System.out.println("Price:"+price);
	 
	 System.out.println("Dish name:"+name);
	}
}