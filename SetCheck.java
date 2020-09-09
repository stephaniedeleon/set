
//	Date: 		February 26, 2020
//	Description:	
//				This is the main method. This is where I test the Set ADT. 


import java.util.Scanner;

public class SetCheck {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		SetInterface<Integer> aSet = new LinkSet<>();
		SetInterface<Integer> bSet = new LinkSet<>();
		SetInterface<Integer> cSet = new LinkSet<>();
		SetInterface<Integer> dSet = new LinkSet<>();
		SetInterface<Integer> eSet = new LinkSet<>();
		
		SetInterface<Integer> userSet = new LinkSet<>();
	
		System.out.println("S. De Leon's Set ADT\n");
		
		//User's Set
		System.out.println("Input your set? (input -1 when done)\n");
		
		int element = scan.nextInt();
		while(element != -1) {
			userSet.add(element);
			element = scan.nextInt();
		}
		
		//Set A
		aSet.add(1); aSet.add(2); aSet.add(5);
		
		//Set B
		bSet.add(5); bSet.add(1); bSet.add(2);
		
		//Set C
		cSet.add(2); cSet.add(3); cSet.add(4); cSet.add(5);
		
		//Set D
		dSet.add(3); dSet.add(4);
		
		//Set E
		//empty set
		
		
		//toString method
		System.out.println("\nthe Sets & toString Method:");
		System.out.println("Set A = " + aSet.toString());
		System.out.println("Set B = " + bSet.toString());
		System.out.println("Set C = " + cSet.toString());
		System.out.println("Set D = " + dSet.toString());
		System.out.println("Set E = " + eSet.toString());
		System.out.println("User's Set = " + userSet.toString());
		
		//length method
		System.out.println("\nLength Method:");
		System.out.println("Set A = " + aSet.length());
		System.out.println("Set B = " + bSet.length());
		System.out.println("Set C = " + cSet.length());
		System.out.println("Set D = " + dSet.length());
		System.out.println("Set E = " + eSet.length());
		System.out.println("User's Set = " + userSet.length());
		
		//contains method
		System.out.println("\nContains Method:");
		System.out.println("Is 6 in Set A? " + aSet.contains(6));
		System.out.println("Is 1 in Set B? " + bSet.contains(1));
		
		//remove method
		System.out.println("\nRemove Method:");
		System.out.println("Removing 3 in Set D. Success? " + dSet.remove(3));
		System.out.println("Set D = " + dSet.toString());
		System.out.println("Removing 1 in Set E. Success? " + eSet.remove(5));
		System.out.println("Set E = " + eSet.toString());
		
		//add method
		System.out.println("\nAdd Method:");
		System.out.println("Adding 3 in Set D. Success? " + dSet.add(3));
		System.out.println("Set D = " + dSet.toString());
		System.out.println("Adding 2 in Set C. Success? " + cSet.add(2));
		System.out.println("Set C = " + cSet.toString());

		//subset method
		System.out.println("\nSubset Method:");
		System.out.println("Case 1: Is A a subset of B? " + aSet.subset(bSet));
		System.out.println("Case 2: Is D a subset of C? " + dSet.subset(cSet));
		System.out.println("Case 3: Is B a subset of C? " + bSet.subset(cSet)); 
		System.out.println("Case 4: Is D a subset of A? " + dSet.subset(aSet));
		System.out.println("Case 5: Is E a subset of D? " + eSet.subset(dSet));
		System.out.println("Case 6: Is user a subset of A? " + userSet.subset(aSet));
		
		//equals method
		System.out.println("\nEquals Method:");
		System.out.println("Case 1: Is A equal to B? " + aSet.equals(bSet));
		System.out.println("Case 2: Is D equal to C? " + dSet.equals(cSet));
		System.out.println("Case 3: Is B equal to C? " + bSet.equals(cSet)); 
		System.out.println("Case 4: Is D equal to A? " + dSet.equals(aSet));
		System.out.println("Case 5: Is E equal to D? " + eSet.equals(dSet));
		System.out.println("Case 6: Is user equal to A? " + userSet.equals(aSet));
		
		//union method
		System.out.println("\nUnion Method:");
		System.out.println("Case 1: A union B = " + aSet.union(bSet).toString());
		System.out.println("Case 2: D union C = " + dSet.union(cSet).toString()); 
		System.out.println("Case 3: B union C = " + bSet.union(cSet).toString()); 
		System.out.println("Case 4: D union A = " + dSet.union(aSet).toString()); 
		System.out.println("Case 5: E union D = " + eSet.union(dSet).toString()); 
		System.out.println("Case 6: user union A = " + userSet.union(aSet).toString());
		
		
	}
	
}
