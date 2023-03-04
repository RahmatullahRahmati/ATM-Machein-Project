
package atm4;
                               // main file   
import java.util.ArrayList;
import java.util.Scanner;
 class bank extends ATM{
    public
    int code ;
    String address;
    void maintains( ){
        System.out.println("now you done the mantaince in your acdount ");
    }
 
}
class ATM{
    public
    String location;
   String  ManagBY_b;
   void transection(){
       System.out.println("Dear customer now your add mony or deposit mony to ATM account.");
   }
       
}
class Branch{
    static ArrayList <String> Name = new ArrayList<String>();
    static ArrayList <Integer> ID = new ArrayList<Integer>();
    String name ;
   int B_ID ;
    public void branch_1(){
        this.name="University_Branch";
        this.B_ID = 1;
        System.out.println("this Branch Name is :"+this.name); 
        System.out.println("this Branch ID   is :"+this.B_ID);
        
    }
      public void branch_2(){
        this.name="chok madad_Branch";
        this.B_ID = 2;
        
        System.out.println("this Branch Name is :"+this.name); 
        System.out.println("this Branch ID   is :"+this.B_ID);
        
    }  public void branch_3(){
        this.name="chenaiy medical_Branch";
        this.B_ID = 3;
        
        System.out.println("this Branch Name is :"+ name); 
        System.out.println("this Branch ID   is :"+B_ID);
        
        
    }
   
 
}

class customer{
    public
    String name;
    String address;
    int ID;
   void information(){
       System.out.println("");
       System.out.println("\n This is your custmer");
       
       name="Rahmatullah";
       address="Kandahar";
       ID=4042;
       System.out.println("Name:  "+name);
       System.out.println("Address: "+address );
               
       System.out.println("ID : "+ID);
}
}
class  pyment  extends bank {
   customer obj4=new customer();
     Branch b_obj= new  Branch();
    // static block .
    static{
        System.out.println("\t\n *******************< Welcom to our ATM Project >************************* ");
    }
    String Card= "11111";
    int  atm_code= 2222;
  double mony= 250000;
    double  deposite;
    double balance;
    Scanner scanner = new Scanner(System.in);


    public void cod_Checking(String Card,int  atm_code){  //  for code checking 
   
     if(this .Card .equals(Card)&& this.atm_code == atm_code){
         Welcom();
        
     }else{
         
         System.out.println("\n *** you dont have a card  OR ***\n ***   your atm cod is wrong *** \n *** Please Try Again     !!!! ");
        
       }
    }
    
   public void Welcom(){
        System.out.println("   ******* <    Welcom to our  ATM machin   > *******  ");
        System.out.println("\n\t\t<< Please  Select You Lanwuage >>\n");
        
        System.out.println("  1 ----->  English language ");
        System.out.println("  2 ----->  Pashto  language ");
        System.out.println("  3 ----->   Dari  language ");
        
         int choice;
         System.out.println("\n  ~~~~  Enter your choice ~~~~   ");
         choice=scanner.nextInt();
         if(choice != 1){
             System.out.println(" ~~~Dear customer you dont hase this Language in your program ...");
        }
         else{
             Balance();
         }
     }
    
     public void Balance(){
             
             System.out.println("\t ~~~ Select one optin from fallowing  options ~~~  \n");
            
               System.out.println("  1 ----->  Check balance  ");
               System.out.println("  2 ----->  Get Balance  ");
               System.out.println("  3 ----->  Deposit mony  ");
               System.out.println("  4 ----->  information about ATM   ");
               System.out.println("  5 ----->     Exit  ");
               System.out.println("  6 ----->     Bank Branches  ");
               
             
           
             int choice = scanner.nextInt();
             
                 switch (choice){
                 case 1:
                     System.out.println(" your balance is =  "+mony); 
                     break;
                 case 2:
                     System.out.println(" howmany belance do you  want to get ?   \n");
                      
                     balance = scanner.nextInt();
                     mony = mony - balance ;
                     System.out.println("   your withraw mony is: --> "+balance);
                     System.out.println("   And NOW you left balence is :--> "+ mony);
                     maintains( );
                     transection();
                     obj4.information();
                     
                     
                    break;
                 case 3:
                     System.out.println(" enter your mony to deposite...");
                     deposite = scanner.nextInt();
                    mony  = mony + deposite;
                     System.out.println(" your Total balance is: "+mony );
                     transection();
                     obj4.information();
                     break;
                 case 4:
                     System.out.println(" ~~~~ Dear cstomer: ~~~~");    
                     System.out.println(" Belongs to :   Azizi Banks   ");
                     System.out.println("  Amoun    :    200000 AF/day .");
                     System.out.println("  Work     :    active all time without holiday.");
                     System.out.println("  Start_time:   8 AM ---> 7 Pm  ");
                     System.out.println("  Address:      kandhar university .");
                     break;
                 case 5:
                 
                     System.out.println("..... program Exite ......... "); 
                      System.exit(0);
                     break;
                 case 6:
                 
                     System.out.println("..... program Exite ......... "); 
                      b_obj.branch_1();
                      b_obj.branch_2();
                      b_obj.branch_3();
                     break;
         
                 default:
                     
                     System.out.println("\t\n you choice is Worng !!!! ");
                  
                  }
                 
         }
}

public class ATM4 extends pyment{


    public static void main(String[] args) {
         pyment obj= new  pyment();
        ATM4  obj3 = new ATM4();
      //  obj3.Balance();
       int choice;
    
    do
    {
            String carde_number;
            int  carde_ATM_code;
       
      Scanner scanner=new Scanner(System.in);
  
        System.out.print(" Enter your ATM carde number ..... : ");
        carde_number=scanner.next();
  
        System.out.print(" Enter your ATM carde code  ..... : ");
        carde_ATM_code=scanner.nextInt();
        obj3.cod_Checking(carde_number, carde_ATM_code);
        
        System.out.println("\n do you want to play agine ?  \n \n  < if you want  Eter : 1 > \n  < if you dont want Enter : 0  >  ");
        choice = scanner.nextInt();
            
    }while(choice==1);
    }
    
}
