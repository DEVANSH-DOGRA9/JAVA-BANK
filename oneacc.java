import java.time.LocalTime;
import java.util.*;

class user {
    public int uid;
    public int accno;
    public int bal;
    public int pin;
    public String name;
}


class oneacc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        user u1=new user();
        u1.name="Devansh Dogra";
        u1.accno=6722;
        u1.bal=50000;
        u1.pin=2323;
        u1.uid=1111;
        ArrayList<user> list=new ArrayList<user>();
        list.add(u1);
        user u2=new user();
        u2.name="Ayushi Dogra";
        u2.accno=6723;
        u2.bal=50003;
        u2.pin=2324;
        u2.uid=1121;
        list.add(u2);
        user u3=new user();
        u3.name="Anshika Dogra";
        u3.accno=6724;
        u3.bal=5000000;
        u3.pin=2333;
        u3.uid=1113;
        list.add(u3);
        System.out.println("Enter 1 for opening account  2 for cash withdrawal 3 for balance enquiry  4 for cash deposit 5 for exit");
        int ch;  
                        
         ch=sc.nextInt();
        int bal=0,pin=0,pin1=0;
        while(ch!=5){
            System.out.println("Enter your uid"); 
            int ui=sc.nextInt();
        if(ch==1){
            System.out.println("Enter the 4 digit pin you want to set:");
             pin =sc.nextInt();
            System.out.println("Verify pin again");
             pin1=sc.nextInt();
            while(pin1!=pin){
            System.out.println("Pin does not match");
            pin1=sc.nextInt();}
            LocalTime now = LocalTime.now();

            System.out.println("Your account has been created successfully with balance: 0 at "+now);
            bal=0;
        }         
        if(ch==2)
        {
           
            System.out.println("Enter your amount:");
            int amt=sc.nextInt();
            for(int i=0;i<list.size();i++){
                user u_c=list.get(i);
                if(u_c.uid==ui){
                    if(u1.bal<amt)
                    System.out.println("Insufficient balance");
                    else{
                       u_c.bal-=amt;
                        System.out.println("**************Receipt************* ");
                        LocalTime now = LocalTime.now();
                          System.out.println("Your account no. xxxxxxx6722  is debited with "+amt+" at "+now+" Your current balance is "+u1.bal);                   
        
                    }
                }
            }
         
          
        }   
        if(ch==3)  {
            System.out.println("Enter pin");
            int p=sc.nextInt();
            while(p!=pin){
                System.out.println("Incorrect pin enter again");
                p=sc.nextInt();
            }
        System.out.println("Your current balance is: "+bal);
        }
        if(ch==4) {
            
            System.out.println("Enter the amount:");
            int amt=sc.nextInt();
            bal+=amt;
                    LocalTime now = LocalTime.now();

            System.out.println("*************Receipt***********");
            System.out.println(" Your account has been credited with "+amt+" at "+now+" Your current balance is "+bal);
        } 

        System.out.println("Enter another choice");
        System.out.println("Enter 1 for opening account  2 for cash withdrawal 3 for balance enquiry  4 for cash deposit 5 for exit");
        ch=sc.nextInt();  
        }
        if(ch==5)
        System.out.println("Thank You for banking with us!!!!");
    }
}