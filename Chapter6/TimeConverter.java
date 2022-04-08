Scanner input = new Scanner (System.in);

System.out.print("Welcome to Time Converter! Please enter '1' to convert hours to minutes. '2' to convert minutes to hours. "
+ "'3' to convert days to hours or '4' to convert hours to days: ");

NumberFormat nf = NumberFormat.getInstance();

int choice = input.nextInt();


       while (choice != -1)
       
     {
       
if (choice == 1)
{
System.out.print("\nPlease enter how many hours you would like to convert to minutes: ");
int h = input.nextInt();

double m = (double) h*60;

System.out.println("\n" +h +" hours converted to minutes is " +nf.format(m) +" minutes.");
}


else if (choice == 2)

{
System.out.print("\nPlease enter how many minutes you would like to convert to hours: ");
int m2 = input.nextInt();

double h2 = (double) m2/60;

System.out.println("\n" +m2 +" minutes converted to hours is " + nf.format(h2) +" hours.");
}


else if (choice == 3)

{
System.out.print("\nPlease enter how many days you would like to convert to hours: ");
int d = input.nextInt();

double h3 = (double) d*24;

System.out.println("\n" +d +" days converted to hours is " +nf.format(h3) +" hours.");
}


else if (choice == 4)

{
System.out.print("\nPlease enter how many hours you would like to convert to days: ");
int h4 = input.nextInt();

double d1 = (double) h4/24;

System.out.print("\n" +h4 +" hours converted to days is " +nf.format(d1) +" days.");
}

System.out.println("\n\nTo convert more, enter '1' to convert hours to minutes. '2' to convert minutes to hours. "
+ "'3' to convert days to hours or '4' to convert hours to days or enter '-1' to end the program: ");

choice = input.nextInt();

    }
       System.out.print("\nThank you for using TimeConverter, have a nice day!")