package classes;
public class Directory {
	
     fooditem fooditems[];
	 
	 
	 public Directory (){}
	 
	  public Directory (int sizeOfDirectory){
		  
		  this.fooditems=new fooditem[100];
		  
	  }
	 //addfooditem method
  
	public void insertfooditem(fooditem f){
		for(int i=0;i<fooditems.length;i++){

			if(fooditems[i] == null)
			{

				fooditems[i] = f;
				
				System.out.println ("fooditem inserted");

				break;
			}
		}
	}
	//removefooditem method
	
		public void removefooditem(fooditem f){
		
		for(int i=0;i<fooditems.length;i++){
			if(fooditems[i] == f)
			{
				fooditems[i] = null;
				
				System.out.println ("fooditem  removed");
				
				break;
			}
		}
		
	}
    
		public void showAllfooditems()
	{
		
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] != null)
			{
				System.out.println("-----------------------");
				fooditems[i].showdetails();
				System.out.println();
			}
		}
	}
	
	
	
}
