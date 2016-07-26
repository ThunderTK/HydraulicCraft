import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int day=0;
		
		
		
		
		do{System.out.println("Enter an interger between 1 and 12");
		day=in.nextInt();
		
		}
		while (day<1 || day>12);
		
		
		switch (day){
		
		case 1: 
				System.out.println("The gift for day 1 are A partridge in a pear tree");
				System.out.println("Cost of day 1: $27.50");
				System.out.println("All the gifts up to day 1: A partridge in a pear tree");
				System.out.println("Total cost: $27.50");  
			break;
		case 2: 
				System.out.println("The gift for day 2 are 2 turtle doves");
				System.out.println("Cost of day 2: $77.50");
				System.out.println("The gifts up to day 2 are 2 turtle doves and a partridge in a pear tree");
				System.out.println("Total cost: $105.00");
			break;
		case 3:
				System.out.println("The gift for day 3 are 3 french hens");
				System.out.println("Cost of day 3: $92.50");
				System.out.println("The gifts up to day 3 are 3 french hens 2 turtle doves and a partridge in a pear tree");
				System.out.println("Total cost: $197.50");
			break;
		case 4:
				System.out.println("The gift for day 4 are 4 calling brids");
				System.out.println("Cost of day 4: $372.50");
				System.out.println("The gifts up to day 4 are 4 calling birds 3 french hens 2 turtle doves and a partridge in a pear tree");
				System.out.println("Total cost: 570.00");
			break;
		case 5:
				System.out.println("The gift for day 5 are 5 gold rings");
				System.out.println("Cost of day 5: $672.50");
				System.out.println("The gifts up to day 5 are 5 gold rings 4 calling birds 3 french hens 2 turtle doves an a partridge and a pear tree");
				System.out.println("Total cost: $1242.50");
			break;
		case 6:
				System.out.println("The gift for day 6 are 6 geese a laying");
				System.out.println("Cost of day 6: $822.50");
				System.out.println("The gifts up to day 6 are 6 geese a laying 5 gold rings 4 calling birds  3 french hens 2 turtle doves and a partridge in a pear tree");
				System.out.println("Total cost: $2065.00");
			break;
		case 7:
				System.out.println("The gift for day 7 are 7 swans a swimming");
				System.out.println("Cost of day 7: $7882.50");
				System.out.println("The gifts up to day 7 are 7 swans a swimming 6 geese a laying 5 gold rings 4 calling doves 3 french hens 2 turtle doves and a partridge in a pear tree");
				System.out.println("Total cost: $9887.50");
			break;
		case 8:
				System.out.println("the gift for day 8 are 8 maids a milking");
				System.out.println("Cost of day 8:78 $");
		
		
		
		
		
		
		
		}
		
		
		

	}

}
