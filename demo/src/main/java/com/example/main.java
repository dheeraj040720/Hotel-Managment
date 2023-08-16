package com.example;



import java.util.Scanner;

public class main {
    static Scanner input = new Scanner(System.in);




    public int mult(){


        int a =6;
        int b=7;
        int prod=a*b;
        System.out.println(prod);
        return prod;
    }


    public static void main(String[] args ) {




        Scanner scan = new Scanner(System.in);


        System.out.println("*******Hotel Managment********");

        System.out.println("Welcome ");

        System.out.println("Book a room");
        System.out.println("Customer Records");
        System.out.println("Rooms Allocated");
        System.out.println("Exit");
        System.out.println("Enter your choice");

        int choice =scan.nextInt();

  /*     main instance = new main();

       instance.mult();*/




        switch (choice) {


            case 1:booking();
            break;

            case 2:CustomerRecords() ;
            break;

            case 3: RoomsAllocated();
            break;

            case 4:
                break;





        }












    }




    private  static String booking()
    {

        System.out.println("Which type of room  Single or Deluxe");
        String userinput=input.nextLine();
        System.out.println(userinput);

        if(userinput.equalsIgnoreCase("single"))
        {

            System.out.println("enter your name ");
            String name=input.nextLine();
            System.out.println("Enter your phone number ");
            int phoneNo=input.nextInt();
            System.out.println("Enter your room no");
            int roomNo=input.nextInt();







        } else if (userinput.equalsIgnoreCase("deluxe")){
            System.out.println(userinput);


            System.out.println("enter your name ");
            String name=input.nextLine();
            System.out.println("Enter your phone number ");
            int phoneNo=input.nextInt();
            System.out.println("No of persons staying ");
            int personCount=input.nextInt();

        }
        else {

            System.out.println("wrong choice");
        }


       return "";

    }



    private  static String CustomerRecords()
    {

        String records="view customer records";

        System.out.println(records);

                return records;
    }



    private  static String RoomsAllocated()
    {

        String allocated="rooms allocated";

        System.out.println(allocated);
        return allocated;
    }


}
