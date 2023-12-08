package classes;
public class Dessertandicecream extends fooditem{
	
	String numberofscoop;
	
	public  Dessertandicecream () {
		
	}	
	
	public  Dessertandicecream (String name , String numberofscoop , double price ) {
	
	this.name= name;
	
	this.numberofscoop=numberofscoop;
	
	this.price= price;}
		

	
	public void showdetails(int l){
		System.out.println("Dish name:"+name);
		
		System.out.println("Dish numberofscoop:"+numberofscoop);
		
	    System.out.println("Dish price:"+price);
    
	}
}
