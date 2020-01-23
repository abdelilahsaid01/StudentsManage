/*import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Welcome!");
        System.out.print("What is your Name?");
    	String name = input.next();
    	System.out.print("What is your Age?");
    	int age = input.nextInt();
    	System.out.print("What is your Weight?");
    	double weight = input.nextDouble();
    	System.out.println(name + " is " + age + " year old and weighs " + weight +"kg");
    }
}*/



import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	//Part 1 : greeting part
    	System.out.println("Welcome To Vacation Planner !");
        System.out.print("What is your Name?");
    	String name = input.nextLine();
    	System.out.print("Nice to meet you"+" " + name +" " + "where are you travelling");
    	String location = input.next();
    	System.out.println("Great"+" " + location+ " " +"sounds like a great trip");
    	System.out.println("*****************************************");
    	/*double weight = input.nextDouble();*/
    	/*System.out.println(name + " is " + age + " year old and weighs " + weight +"kg");*/
    // End of part 1 : greeting part
    
    	//  Part 2 – Travel time and Budget
       System.out.print("How many days are your going to spend in your destination?");
    	int day = input.nextInt();
        
       System.out.print("What is your total budget for the trip in USD?");
        float  budget = input.nextFloat();
        
       System.out.print("What is The conversion rate between 1 USD to currency of your  destinations?");
        Float nbr = input.nextFloat();
         
       System.out.print("What is the currency symbol for your destination?");
        String symbol = input.next();
        
        
        System.out.println("If you are travelling for"+" " + day +" "+" days that is the same as"+ " " +day*24 +" "+"hours" +" or " + " " +day*1440 + " "+"minutes");
        
        System.out.println("If you are going to spend"+" " +"$"+ budget*1 +"USD"+" "+ ",that means per day you can spend up to " +" "+(budget/day)*1+" "+"USD");
        
        System.out.println("Your Total budget in" +" "+symbol+" "+ "is " + budget*nbr+symbol+" , which per day is " + " " + (budget*nbr)/day +symbol);
        
        System.out.println("*****************************************");
    	//  END OF Part 2 – Travel time and Budget

    //  Part 3 – Time Difference
        
        
        System.out.print(" What is the time difference between your home and where your are going");
        
        
        int  time = input.nextInt();
        
  
        
   
        System.out.println(" That means when it is midnight at home it will be "+time+"PM"+" " + " in your travel destination " +"and when it is noon at home it will be "+ time+"AM"+" ");
        
    
    //  end of Part 3 – Time Difference
    
        
        
    //  Part 4 – Country Area
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
    
    
}