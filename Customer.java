import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class Customer {
    
    public static void main(String[] args) {
        HashMap<String,Library>map=new HashMap<String,Library>();
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("Enter Options : ");
            System.out.println("1.Register 2.IssueBook 3.ReturnBook 4.Exit");
            int opt=s.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Enter you name : ");
                    String name=s.next();
                    if(!map.containsKey(name))
                    map.put(name, new Library(name));
                    else{
                        System.out.println("Already registered");
                    }
                    break;
                case 2:
                    System.out.println("Enter your name : ");
                    String name1=s.next();
                    if(map.containsKey(name1)){
                        map.get(name1).setIssue();
                        System.out.println("Book issued successfully");
                        System.out.println("Your Return Date is : "+map.get(name1).getreturn());
                    }
                    else
                        System.out.println("Not a valid user");
                    break;
                case 3:
                    System.out.println("Enter your name : ");
                    String name2=s.next();
                    if(map.containsKey(name2)){
                        Period days= Period.between(map.get(name2).getreturn(),LocalDate.now());
                        if(days.getDays()>0){
                            System.out.println("You have made a delay of "+ (days.getDays()));
                            System.out.println("You have to pay "+ 5*(days.getDays())+" as fine");
                        }
                        else{
                            System.out.println("You don't have any fine");
                        }
                                 
                    }
                    else{
                        System.out.println("Invalid user.");
                    }
                    break;
                case 4:
                    System.exit(0);
                    
            }
        }
    }
    
    
}
