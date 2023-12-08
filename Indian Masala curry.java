package classes;
public class IndianMasalacurry  extends fooditem{
	
	public String size ;

    public  Indian Masala curry() {
		
	}	
	
	public  IndianMasalacurry (String name,String size,double price ) {
		
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
	
	public void showdetails(int c){
	System.out.println(name);
	System.out.println(size);
	System.out.println(price);
	 
	 
	}
}