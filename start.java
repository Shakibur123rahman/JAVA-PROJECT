import classes.*;
import java.lang.*;
import java.util.Scanner;

public class start {
		public static void main (String [] args){
		//object declaration
		pizza p = new pizza ("Four season pizza","20 inch",800);
		
		pizza p1 = new pizza ("Capitano pizza","20 inch",1000);
		
		
		pizza p2 = new pizza ("American pizza","20 inch",1200);
		
		pizza p3 = new pizza ("Italiano pizza","20 inch",1500);
		
		pizza p4 = new pizza ("BBQ pizza","20 inch",1800);
		
		burger b = new burger ("Cheese burger ,fries,drinks.",5,800);
		
		burger b1 = new burger ("Beef cheese burger,fries,drinks.",5,100);
		
		burger b2 = new burger ("Beef cheese burger,fries,drinks.",5,100);
		
		burger b3 = new burger ("Double Beef cheese burger,fries,drinks.",6,1200);
		
		burger b4 = new burger ("Double Chicken cheese burger,fries,drinks.",6,1200);
		
		Shawarma s = new Shawarma("Chicken shawarma",200);
		
		Shawarma s1 = new Shawarma("Beef shawarma",250);
		
		Shawarma s2 = new Shawarma("Mix shawarma",300);
		
		IndianMasalacurry i = new  IndianMasalacurry ("Chicken tikka butter","1:3",800);
		
		IndianMasalacurry i1 = new  IndianMasalacurry ("Chicken Rashmi Butter masala","1:4",1500);
		
		IndianMasalacurry i2 = new  IndianMasalacurry ("Beef Achari Korai","1:5",2000);
		
		IndianMasalacurry i3 = new  IndianMasalacurry ("Mutton Rogan Joash","1:4",2500);
		
		
		Kebab k  = new Kebab ("Tandoori chicken","2 sticks",350);
		
		Kebab k1  = new Kebab ("Haryati Kebab","1 sticks",250);
		
		Kebab k2  = new Kebab ("Achari Chicken","3 sticks",500);
		
		Kebab k3  = new Kebab ("Chicken Tikka kebab","4 sticks",800);
		
		Kebab k4  = new Kebab ("Chicken Rashmi kebab","4 sticks",1000);
		
		Biryani bi = new Biryani("Hyderabadi biryani mutton","1:1",350);
		
		Biryani bi1 = new Biryani("Hyderabadi biryani chicken","1:3",900);
		
		Biryani bi2 = new Biryani("Dumpack biryani Beef","1:2",1000);
		
		Biryani bi3 = new Biryani("Shendi Biryani","1:2",1200);
		
		Sandwich sd = new Sandwich ("Chicken Sub Sandwich",300);

        Sandwich sd1 = new Sandwich ("Beef sub Sandwich",350);		
		
		Sandwich sd2 = new Sandwich ("Chicken Pizza Sandwich",500);
		
		Pasta pa = new Pasta ("Pasta Basta",150,300);
		
		Pasta pa1 = new Pasta ("Pasta Europa",250,500);
		
		Pasta pa2 = new Pasta ("Creamy pasta",200,400);
		
		Noodles n = new Noodles("1.Tandoori noodles",200,400);
		
		Noodles n1 = new Noodles("2.Hakka noodles",150,300);
		
		Noodles n2 = new Noodles("3.Vegetable Egg noodles",120,240);
		
		Noodles n3 = new Noodles("4.Pad Thai noodles",300,600);
		
		ChineseDishes cd = new ChineseDishes ("Chicken Masala",150,300);
		
		ChineseDishes cd1 = new ChineseDishes ("Chicken chili onion",250,500);
		
		ChineseDishes cd2 = new ChineseDishes ("Sizzling Chicken",400,800);
		
		ChineseDishes cd3 = new ChineseDishes ("Sizzling Beef",600,1200);
		
		ChineseDishes cd4 = new ChineseDishes ("Beef with oyster Sauce",700,1400);
		
		FriedRice f = new FriedRice("Tandoori fried rice","1:3",1200);
		
		FriedRice f1 = new FriedRice("Chicken fried rice","1:2",800);
		
		FriedRice f2 = new FriedRice("Prawn fried rice","1:3",1500);
		
		FriedRice f3 = new FriedRice ("Mushroom fried rice.","1:3",900);  
		
		FriedRice f4 = new FriedRice("Chicken fried rice","1:3",1200);
		
		FriedRice f5 = new FriedRice("Egg fried rice","1:3",600);
		
		
		Setmenu set = new Setmenu ("Fried rice + beef chili + masala chicken+ vegetable + fried chicken + coleslaw salad", 600);	
		
		Setmenu set1 = new Setmenu ("Fried rice + fried chicken + masala chicken+ vegetable + fried chicken + kimchi salad", 800);
		   
		Setmenu set2= new Setmenu ("Fried rice + BBQ chicken + Sauteed vegetable+ vegetable  + kimchi salad", 1000);
		
		Dessertandicecream dc = new Dessertandicecream ("Zafrani kulfi", "2 scoop",300);

        Dessertandicecream dc1 = new Dessertandicecream ("Special ice cream faluda", "2 scoop",250);
		
		Dessertandicecream dc2 = new Dessertandicecream ("Ice cream cup","1 scoop", 250);
		
		Dessertandicecream dc3 = new Dessertandicecream ("Ice cream cane","1 scoop", 280);
		
		Juice j =new Juice("Orange Juice",150);
		
		Juice j1 =new Juice("Apple Juice",150);
		
		Juice j2 =new Juice("Mango Juice",180);
		
		Juice j3 =new Juice("Grape Juice",200);
		
		//arry declare
			   String  [] food = new String [40];
		   
		   food[0]= "1.pizza";
		   
		   food[1]= "2.Burger";
		   
		   food[2]= "3.Shawarma";
		   
		   food[3]= "4.IndianMasalacurry";
		   
		   food[4]= "5.Kebab";
		   
		   food[5]= "6.Biryani";
		   
		   food[6]= "7.Sandwich";
		   
		   food[7]= "8.Pasta";
		   
		   food[8]= "9.Noodles";
		   
		   food[9]= "10.ChineseDishes";
		   
		   food[10]= "11.FriedRice";
		   
		   food[11]= "12.Setmenu";
		   
		   food[12]= "13.Dessertandicecream";
		   
		   food[13]= "14.Juice";
		     		   
		   System.out.println(food[0]);
		   System.out.println(food[1]);
		   System.out.println(food[2]);
		   System.out.println(food[3]);
		   System.out.println(food[4]);
		   System.out.println(food[5]);
		   System.out.println(food[6]);
		   System.out.println(food[7]);
		   System.out.println(food[8]);
		   System.out.println(food[9]);
		   System.out.println(food[10]);
		   System.out.println(food[12]);
		   System.out.println(food[13]);
	
	
	Scanner strSc = new Scanner(System.in);
	System.out.println ("********************************************************************** WELCOME TO HUNGRY HORSE**********************************************************************");
	System.out.println("Enter your food:");
	//scanner class
	String name = strSc.nextLine();
		
	if (name.equals("pizza"))
	{
		System.out.println("................................................................");
		System.out.println("PIZZA");
		System.out.println("................................................................");
		p.showdetails(5);
	 
	    p1.showdetails(6);
		
		p2.showdetails(7);
				
	    p3.showdetails(8);
	}
	else if (name.equals("Burger"))
	{
		System.out.println("................................................................");
		System.out.println("Burger");
		System.out.println("................................................................");
        b.showdetails("abc");
		
		b1.showdetails("cda");
		
		b2.showdetails("efg");
		
		b3.showdetails("hij");
		
		b4.showdetails("klm");
	}
	else if (name.equals("Shawarma"))
	{	
        System.out.println("................................................................");
		System.out.println("Shawarma");
		System.out.println("................................................................");
		s.showdetails(1);
	 
	    s1.showdetails(2);
		
	    s2.showdetails(3);}
		
		else if (name.equals("IndianMasalacurry"))
	{	
        System.out.println("................................................................");
		System.out.println("Indian Masala curry");
		System.out.println("................................................................");
		i.showdetails(1);
	 
	    i1.showdetails(2);
		
		i2.showdetails(3);
		
		i3.showdetails(4);}	
		
	else if (name.equals("Kebab"))
	{	
        System.out.println("................................................................");
		System.out.println("Kebab ");
		System.out.println("................................................................");
	    k.showdetails(1);
		
		k1.showdetails(2);
		
		k2.showdetails(3);
		
		k3.showdetails(4);
		
		k4.showdetails(5);}	
		
		else if (name.equals("Biryani"))
	{	
		System.out.println("................................................................");
		System.out.println("Biryani ");
		System.out.println("................................................................");
	   
		bi.showdetails(1);
		
		bi1.showdetails(2);
		
		bi2.showdetails(3);
		
		bi3.showdetails(4);}	
		
	else if (name.equals("Sandwich"))
	{	
		System.out.println("................................................................");
		System.out.println("Sandwich ");
		System.out.println("................................................................");
		
		
		sd.showdetails(1);
		
		sd1.showdetails(2);
		
		sd2.showdetails(3);}	
	else if (name.equals("Pasta"))
	{	
		System.out.println("................................................................");
		System.out.println("Pasta ");
		System.out.println("................................................................");
		pa.showdetails(1);
		
		pa1.showdetails(2);
		
	    pa2.showdetails(3);}
				
	else if (name.equals("Noodles"))
	{	
		System.out.println("................................................................");
		System.out.println("Noodles ");
		System.out.println("................................................................");
		n.showdetails(1);
		
		n1.showdetails(2);
		
		n2.showdetails(3);
		
		n3.showdetails(4);}	
		
	else if (name.equals("ChineseDishes"))
	{	
        System.out.println("................................................................");
		System.out.println("Chinese Dishes ");
		System.out.println("................................................................");
		cd.showdetails(1);
		
		cd1.showdetails(2);
		
		cd2.showdetails(3);
		
		cd3.showdetails(4);
		
		cd4.showdetails(5);}		
		
	else if (name.equals("FriedRice"))
	{	
		System.out.println("................................................................");
		System.out.println("FriedRice ");
		System.out.println("................................................................");
		f.showdetails(1);
		
		f1.showdetails(2);
		
		f2.showdetails(3);
		
		f3.showdetails(4);
		
		f4.showdetails(5);
		
		f5.showdetails(6);}	
		
	else if (name.equals("Setmenu"))
	{	
		System.out.println("................................................................");
		System.out.println("Setmenu ");
		System.out.println("................................................................");
        set.showdetails(1);
		
		set1.showdetails(2);
		
		set2.showdetails(3);}	
	else if (name.equals("Dessertandice cream"))
	{	
		System.out.println("................................................................");
		System.out.println("Dessert  and ice cream ");
		System.out.println("................................................................");
		
		dc.showdetails(1);
		
		dc1.showdetails(2);
		
		dc2.showdetails(3);
		
		dc3.showdetails(4);}			
		

		
		else if (name.equals("Juice"))
	{	
		System.out.println("................................................................");
		System.out.println("Juice ");
		System.out.println("................................................................");
		
		j.showdetails(1);
		
		j1.showdetails(2);
		
		j2.showdetails(3);
		
	    j3.showdetails(4);}
	else 
	{
		 System.out.println("dish not found");
	 
	}
	//null factor exception
	try {
		Directory d = new Directory(30);
		d.insertfooditem(p1);
		
		d.removefooditem(p1);
	}
	
	catch(NullPointerException npe)
	{
		
		 System.out.println("Exception:" +npe.getMessage ());
		 
		 System.out.println("String is null !!");
		
	}

          	
		
		Scanner scanner = new Scanner (System.in);
		
		double mealcost;
		
		double tax;
		
		double totalcost;
		
		double tip;
		
		double totalBill;
		
		System.out.println("Please enter the cost of the meal" );
		
		
		
		mealcost= scanner.nextDouble();
		
		tax = 0.0675*mealcost;
		
		totalcost= mealcost + tax;
		
		tip = 0.2*totalcost;
		
		totalBill = totalcost + tip;
		
		System.out.println("cost of meal : " +mealcost);
		
		System.out.println("Tax : " +tax);
		
		System.out.println("Tip : " +tip);
		
		System.out.println("Totalcost: " +totalBill);
	

	
	
}
}
