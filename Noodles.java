package classes;
public class Noodles extends  Pasta{
	

	
	public  Noodles () {
		
	}	
	
	public  Noodles (String name ,double  fullplate, double  halfplate) {
    this.name= name;
	
	this.fullplate=fullplate;
	
	this.halfplate=halfplate;
		
	}

	
	    public void showdetails(int h){
		System.out.println("Dish name:"+name);
		System.out.println("full plate:  "+fullplate );
	    System.out.println("half plate:  "+halfplate );
	 
	    
	}
	}