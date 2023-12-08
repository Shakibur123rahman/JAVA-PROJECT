package classes;
public class burger extends fooditem{
	
	int numberofpatties ;
	
	    public  burger () {
		
	}	
	
	public  burger (String name ,int  numberofpatties, double price ) {
		this.numberofpatties=numberofpatties;
		
		this.name= name;
		this.price= price;
		
		
	}
		public void setnumberofpatties (int numberofpatties){
		
		numberofpatties= numberofpatties;
	}
	public int getnumberofpatties (){
		
		return numberofpatties;
	}
	//method overloading
	public void showdetails(String b){
		System.out.println("Dish name:"+name);
		System.out.println("numberofpatties:"+numberofpatties);
	    System.out.println("Dish price:"+price);
	 
	    
	}
	}
