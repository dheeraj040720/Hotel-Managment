package main.java.testPrograms;



interface inf1 {

    String a = "hello world";

    void display();
}



class inf2 implements inf1 {


    public void display() {

        System.out.println("test");

    }


    public static void main(String[] args)
    {
        inf2 obj=new inf2();
        obj.display();
        System.out.println(a);



    }




    }



