import java.text.SimpleDateFormat;  
import java.util.Date;  
public class stringToDate {  
public static void main(String[] args)throws Exception {  
    String sDate1="26/04/1997";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(sDate1+"\t"+date1);  
}  
} 
