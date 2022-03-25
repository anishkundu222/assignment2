package assignments;

import java.util.Scanner;

public class Theater extends App {
	
		
		private int no_f_tickets;
		    void th() {
		        System.out.println("the theaters available are \n 1.Inox \n 2.Browdway");
		        try (Scanner sc = new Scanner(System.in)) {
					int n = sc.nextInt();
					if (n == 1) {
					    System.out.println("Inox ");
					    System.out.println("select a movie");
					    System.out.println("movie available are \n 1.abc\n 2.xyz ");
					    try (Scanner a = new Scanner(System.in)) {
							int o = a.nextInt();
							if (o == 1) {
							    System.out.println("Beast movie @ inox");
							    System.out.println("enter the number of tickets");
							    Scanner j = new Scanner(System.in);
							    int r = j.nextInt();
							    int left= no_f_tickets-r;
							    int amount=40*r;
							    System.out.println("to continue to book for this movie press 1");
							    Scanner d = new Scanner(System.in);
							    int h = d.nextInt();
							    System.out.println("\n\n\n");
							    if (h == 1) {
							      
							        System.out.println("theater - Broadway");
							        System.out.println("movie - xyz");
							        System.out.println("cost - Rs."+amount);
							    
							    }

							}
							if (o == 2) {
							    System.out.println("Beast @ Broadway");
							     System.out.println("enter the number of tickets to be booked");
							    Scanner j = new Scanner(System.in);
							    int r = j.nextInt();
							    int left= no_f_tickets-r;
							    int amount=50*r;
							    System.out.println("to continue to book for this movie press 1");
							    Scanner d = new Scanner(System.in);
							    int h = d.nextInt();
							    System.out.println("\n\n\n");
							    if (h == 1) {
							     
							        System.out.println("theater -inox");
							        System.out.println("movie -abc");
							        System.out.println("cost - Rs"+amount);
							       
							    }

							}
						}
}
   
      if (n == 2) {
					System.out.println("Carnival cinemas");
					System.out.println("select a movie");
					System.out.println("movie available are \n 3.RRR \n 4.kashmir files");
					Scanner b = new Scanner(System.in);
					int p = b.nextInt();
					Scanner a = new Scanner(System.in);
					int o = a.nextInt();
					if (o == 3) {
					    System.out.println("RRR @ Carnival cinemas");
					     System.out.println("enter the number of tickets to be booked");
					    Scanner j = new Scanner(System.in);
					    int r = j.nextInt();
					    int left= no_f_tickets-r;
					    int amount=60*r;
					    System.out.println("to continue to book for this movie press 1");
					    Scanner d = new Scanner(System.in);
					    int h = d.nextInt();
					    System.out.println("\n\n\n");
					    if (h == 1) {
					    
					        System.out.println("theater - Carnival cinemas");
					        System.out.println("movie - rrr");
					        System.out.println("cost - Rs."+amount);
					        
					    }

					}
					if (o == 4) {
					    System.out.println("kashmir files @ Carnival cinemas");
					     System.out.println("enter the number of tickets to be booked");
					    Scanner j = new Scanner(System.in);
					    int r = j.nextInt();
					    int left= no_f_tickets-r;
					    int amount=70*r;
					    System.out.println("to continue to book for this movie prees 1");
					    Scanner d = new Scanner(System.in);
					    int h = d.nextInt();
					    System.out.println("\n\n\n");
					    if (h == 1) {
					       
					        System.out.println("theater - Carnival cinemas");
					        System.out.println("movie - Thirller movie");
					        System.out.println("cost - Rs."+amount);
					  
					    }

					}
      }
				}

	    

		    }


}
