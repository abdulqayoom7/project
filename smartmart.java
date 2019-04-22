import java.util.*;
class smartmart{
	public static void main(String arg[]){
	Scanner input = new Scanner(System.in);
	System.out.print("1). Tablets.\n2). Cold Drinks.\n3). Juices.\nEnter Your Choice to Enter in Categories: ");
	int a=input.nextInt();
	if(a==1)
	{
	System.out.println("\n		Enter The names, Quantities And Prize of 5 Tablets: ");
	
	System.out.print("\n\n1). ");
	String t1=input.next();
	System.out.print("1). ");
	int tq1=input.nextInt();
	System.out.print("1). ");
	int tp1=input.nextInt();

	
	System.out.print("\n2). ");
	String t2=input.next();
	System.out.print("2). ");
	int tq2=input.nextInt();
	System.out.print("2). ");
	int tp2=input.nextInt();

		
	System.out.print("\n3). ");
	String t3=input.next();
	System.out.print("3). ");
	int tq3=input.nextInt();
	System.out.print("3). ");
	int tp3=input.nextInt();

		
	System.out.print("\n4). ");
	String t4=input.next();
	System.out.print("4). ");
	int tq4=input.nextInt();
	System.out.print("4). ");
	int tp4=input.nextInt();

		
	System.out.print("\n5). ");
	String t5=input.next();
	System.out.print("5). ");
	int tq5=input.nextInt();
	System.out.print("5). ");
	int tpc5=input.nextInt();
	}
	


	else if(a==2)
	{
	System.out.println("\n		Enter the Names, Quantities And Prize of 5 Cold Drinks: ");
	System.out.print("\n\n1). ");
	String nc1=input.next();
	System.out.print("1). ");
	int qc1=input.nextInt();
	System.out.print("1). ");
	int qp1=input.nextInt();

	
	System.out.print("\n2). ");
	String nc2=input.next();
	System.out.print("2). ");
	int qc2=input.nextInt();
	System.out.print("2). ");
	int qp2=input.nextInt();

	System.out.print("\n3). ");
	String nc3=input.next();
	System.out.print("3). ");
	int qc3=input.nextInt();
	System.out.print("3). ");
	int qp3=input.nextInt();
	
	System.out.print("\n4). ");
	String nc4=input.next();
	System.out.print("4). ");
	int qc4=input.nextInt();
	System.out.print("4). ");
	int qp4=input.nextInt();
	
	System.out.print("\n5). ");
	String nc5=input.next();
	System.out.print("5). ");
	int qc5=input.nextInt();
	System.out.print("5). ");
	int qp5=input.nextInt();
	}
	


	else if(a==3)
	{
	System.out.println("\n		Enter the Names, Quantities And Prize of 5 Juices: ");
	System.out.print("\n\n1). ");
	String nj1=input.next();
	System.out.print("1). ");
	int qj1=input.nextInt();
	System.out.print("1). ");
	int pj1=input.nextInt();
	
	System.out.print("\n2). ");
	String nj2=input.next();
	System.out.print("2). ");
	int qj2=input.nextInt();
	System.out.print("2). ");
	int pj2=input.nextInt();

	System.out.print("\n3). ");
	String nj3=input.next();
	System.out.print("3). ");
	int qj3=input.nextInt();
	System.out.print("3). ");
	int pj3=input.nextInt();
	
	System.out.print("\n4). ");
	String nj4=input.next();
	System.out.print("4). ");
	int qj4=input.nextInt();
	System.out.print("4). ");
	int pj4=input.nextInt();
	
	System.out.print("\n5). ");
	String nj5=input.next();
	System.out.print("5). ");
	int qj5=input.nextInt();
	System.out.print("5). ");
	int pj5=input.nextInt();
	}
	


	else
	{
	}
		if(choice==1)
	{
	System.out.print("Tablets		Quantites		Prizes");
	System.out.print(t1+"			"+tq1+"			"+tp1);
	System.out.print(t2+"			"+tq2+"			"+tp2);
	System.out.print(t3+"			"+tq3+"			"+tp3);
	System.out.print(t4+"			"+tq4+"			"+tp4);
	System.out.print(t5+"			"+tq5+"			"+tpc5);
	}


	
	}
}
	