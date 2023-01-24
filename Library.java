
import java.time.LocalDate;


public class Library {
    
    private String name;
    private LocalDate issueDate;
    private LocalDate expectedReturn;
    
   public Library(String name){
       this.name=name;
   }
   
   public void setIssue(){
       this.issueDate=LocalDate.now();
       this.expectedReturn=issueDate.plusDays(7);
   }
   
   public LocalDate getreturn(){
       return expectedReturn;
       }
   public LocalDate getissue(){
       return issueDate;
   }
}
