package classes;
public class Biryani  extends fooditem{
	
	public String size ;

    public  Biryani() {
		
	}	
	
	public  Biryani (String name,String size,double price ) {
		
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
	
	public void showdetails(int e){
	System.out.println("Dish name:"+name);
	System.out.println("Dish size:"+size);
	System.out.println("Dish price:"+price);
	 
	 
	}
}