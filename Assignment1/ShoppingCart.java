
	import java.util.HashMap;
	import java.util.Scanner;
	import java.util.*;

	class Store
	{
		
		HashMap<String, Integer> mapprice = new HashMap<>(); 
		HashMap<Integer, String> mapid = new HashMap<>(); 
		
		void create()
		{
		mapprice.put("Pen", 10);
		mapprice.put("Pencil", 5);
		mapprice.put("Book", 40);
		mapprice.put("Notebok", 20);
		
		mapid.put(1, "Pen");
		mapid.put(2, "Pencil");
		mapid.put(3, "Book");
		mapid.put(4, "Notebook");	   
	    }
		void display()
		{
			System.out.println(mapprice);
		}
		
		void displayid()
		{
			System.out.println(mapid);
		}
	}

	class Cart
	{
		HashMap<Integer,Double> mapcart = new HashMap<>(); 
		
		void AddItem()
		{   
			int id;
			double quant;
			System.out.println("Enter the ID");
			 Scanner n= new Scanner(System.in);
	         id=n.nextInt();
	         System.out.println("Enter the quantity");
	         quant=n.nextDouble();
	         mapcart.put(id, quant);
	     }
		
		void DeleteItem()
		{
			int id;
			System.out.println("Enter the ID");
			 Scanner n= new Scanner(System.in);
	         id=n.nextInt();
			mapcart.remove(id);
			
		}
		
		void UpdateCart()
		{
			int id;
			double quant;
			System.out.println("Enter the ID");
			Scanner n= new Scanner(System.in);
			id=n.nextInt();
			System.out.println("Update the Quantity");
			quant=n.nextDouble();
			mapcart.put(id, quant);
		}
		
		void Bill()
		{
			System.out.println("Hello");
		}
		
	}
	
	 class User
	{
		   
		public static void main(String[] args) 
		{
		       int t=1;
		       double t1,total=0;
		       String str;
	          Store s = new Store();
	          Cart c = new Cart();
	          s.create();
	          System.out.println("Items with their prices ");
	          s.display();
	          System.out.println("Items with their ids ");
	          s.displayid(); 
	          
	          while(t!=0)
	          {  
	          System.out.println("Select any one:- ");
	          System.out.println("1.Add Item");
	          System.out.println("2.Delete Item");
	          System.out.println("3.Update Cart");
	          System.out.println("4.Bill Amount");
	          System.out.println("5.Display Cart");
	          System.out.println("6.Exit");
	          
	          Scanner in = new Scanner(System.in);
	          t=in.nextInt();
	          
	          switch (t) { 
	          case 1: 
	              c.AddItem(); 
	              break; 
	          case 2: 
	              c.DeleteItem(); 
	              break; 
	          case 3: 
	              c.UpdateCart(); 
	              break; 
	          case 4: 
	              for(Map.Entry<Integer,Double> entry : c.mapcart.entrySet())
	              {
	            	  int userkey= entry.getKey();
	            	  double userquant = entry.getValue();
	            	  str=s.mapid.get(userkey) ;
	            	  t1= (s.mapprice.get(str)) * userquant;
	            	 
	            	  total+=t1;
	            	  System.out.println(userkey+"  "+str+"  "+userquant+"  "+t1);
	              }
	              System.out.println("Your total amount is "+total);
	              break; 
	          case 5:  
	        	  for(Map.Entry<Integer,Double> entry : c.mapcart.entrySet())
	              {
	            	  int userkey= entry.getKey();
	            	  double userquant = entry.getValue();
	            	  str=s.mapid.get(userkey) ;
	            	  t1= (s.mapprice.get(str)) * userquant;
	            	 
	            	  total+=t1;
	            	  System.out.println(userkey+"  "+str+"  "+userquant+"  "+t1);
	              }
	              System.out.println("Your total amount is "+total);
	               if(total==0)
	               {
	            	   System.out.println("Your cart is empty"); 
	               }
	              break; 
	          case 6:
	        	  t=0;
	        	  break;
	        	  
	          default: 
	              System.out.println("Invalid choice. Please enter again !");
	              break; 
	          }     
	          
	          }

	          
	      }

	}