package classes;
public class Kebab extends fooditem{
	
	public String numberofsticks ;

    public  Kebab () {
		
	}	
	
	public  Kebab (String name,String numberofsticks,double price ) {
		
		this.name= name;
		
		this.numberofsticks=numberofsticks;
		
		this.price= price;
		
		
	}
	
	public void setnumberofsticks (String numberofsticks){
		
		numberofsticks= numberofsticks;
	}
	public String getnumberofsticks (){
		
		return numberofsticks;
	}
	
	public void showdetails(int d){
	System.out.println("Dish name:"+name);
	System.out.println("Dish numberofsticks:"+numberofsticks);
	System.out.println("Dish price:"+price);
	 
	 
	}
}