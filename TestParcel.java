package labs;
import java.util.Scanner;
public class TestParcel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

	System.out.print("Enter parcel ID: ");
	String id = scan.nextLine();

	System.out.print("Enter receiver name: ");
	String name = scan.nextLine();

	System.out.print("Enter weight: ");
	double w = scan.nextDouble();
	Parcel p1=new Parcel( id,  name,w);
	
	
	System.out.print("Enter parcel ID: ");
	String id2 = scan.nextLine();

	System.out.print("Enter receiver name: ");
	String name2 = scan.nextLine();

	System.out.print("Enter weight: ");
	double w2 = scan.nextDouble();
	System.out.print("Enter distance: ");
	int distance = scan.nextInt();
	System.out.println(p1);
	System.out.println("Total cost: "+p1.totalCost());
	System.out.println("Heavy: "+p1.isHeavy());
	Parcel p2=new Parcel( id2,  name2,w2,distance);
	System.out.println(p2);
	System.out.print("Total cost: "+p2.totalCost());
	System.out.print("Heavy: "+p2.isHeavy());
	
	}

}
