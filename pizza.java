package classes;
public class pizza extends fooditem{
	
	public String size ;

    public  pizza () {
		
	}	
	
	public  pizza (String name,String size,double price ) {
		
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
	
	public void showdetails(int a){
	System.out.println("Dish name:"+name);
	System.out.println("Size:"+size);
	System.out.println("Dish price:"+price);
	 
	 
	}
}
