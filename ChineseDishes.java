package classes;
public class ChineseDishes  extends  Pasta{
	

	
	public  ChineseDishes () {
		
	}	
	
	public  ChineseDishes (String name ,double  fullplate, double  halfplate) {
    this.name= name;
	
	this.fullplate=fullplate;
	
	this.halfplate=halfplate;
		
	}
	
	
	    public void showdetails(int i){
		System.out.println("Dish name:"+name);
		
		System.out.println("full plate:  "+price );
		
		System.out.println("halfplate:  "+price  );
  
	}
	}