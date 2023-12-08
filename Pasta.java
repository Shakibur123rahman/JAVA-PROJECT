package classes;
public class Pasta extends fooditem{
	
	double fullplate  ;
	
	double halfplate  ;
	
	public  Pasta () {
		
	}	
	
	public  Pasta (String name ,double  fullplate, double  halfplate) {
    this.name= name;
	
	this.fullplate=fullplate;
	
	this.halfplate=halfplate;
		
	}
		public void setfullplate (double  fullplate){
		
		fullplate= fullplate;
	}
	public double getfullplate (){
		
		return fullplate;
	}
	public void sethalfplate (double  halfplate){
		
		halfplate= halfplate;
	}
	public double gethalfplate (){
		
		return halfplate;
	}
	

	
	public void showdetails(int g){
		System.out.println("Dish name:"+name);
		System.out.println("full plate:  "+fullplate );
	    System.out.println("half plate:  "+halfplate );
	 
	    
	}
	}
	
	
	
	
	