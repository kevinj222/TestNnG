package TestNG1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Visha 
{
public static void main(String args[])
{
	Visha1 v1= new Visha1("Trivandrum",1600,800);
	Visha1 v2= new Visha1("Chennai",1800,1000);
	Visha1 v3= new Visha1("Hyderabad",2000,900);
	Visha1 v4= new Visha1("Mumbai",2500,1200);
	Visha1 v5= new Visha1("Kochi",1800,1200);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the city:");
	String n=sc.next();
	System.out.println("Enter the square amount required");
	int x=sc.nextInt();
	List<Visha1>prdet=Arrays.asList(v1,v2,v3,v4,v5);
	List<Visha1> ew=prdet.stream().filter(t->n.equals(t.getCity())).toList();
	System.out.println("Enter Whetther Material required:yes-1/no-0");
	int i=sc.nextInt();
	if(i==1)	
	{
		ew.forEach(t->System.out.println("The price for field of "+ t.getCity()+" is:"+x*t.getPricem()));
	}
	else if(i==0)
	{
		ew.forEach(t->System.out.println("The price for field of "+ t.getCity()+" is:"+x*t.getPricew()));
	}

}
public static int cons(List<Visha1>prdet,int i,String City,int sq) 
{
	List<Visha1>prde=prdet.stream().filter(t->(t.getCity().equals(City))).toList();
	if(prde.isEmpty())
	{
		System.out.println("city not found!!!");
		
	}
	int price=0;
	switch(i)
	{
	case 1:for(Visha1 p:prde) 
				price=(p.pricem*sq);
				break;
	case 2:for(Visha1 p:prde) 
				price=(p.pricew*sq);
				break;}
	return price;
}
}




