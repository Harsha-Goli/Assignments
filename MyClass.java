import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class MyClass {
	public static void main(String[] args) 
	{
		List<FruitClass> fruits=createList();
		display(fruits);
		for(int i=0;i<fruits.size();i++)
		{
			if(fruits.get(i).getColour().equalsIgnoreCase("Red"))
			{
				System.out.println(fruits.get(i));
				break;
			}
		}
	}
		public static List<FruitClass> createList() {
			 Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the size");
		     int n = sc.nextInt();
		     sc.nextLine();
		     List<FruitClass> fruits=new ArrayList<>();
		     for (int i = 0; i < n; i++) {
		    	 System.out.println("enter the fruit name ");
				 String name = sc.nextLine();
				 System.out.println("Enter the fruit colour ");
				 String colour = sc.nextLine();
				 fruits.add(new FruitClass(name, colour));
		}
			return fruits;
	}
	public static void display(List<FruitClass> fruits) {
		Iterator<FruitClass> itr = (fruits).iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
