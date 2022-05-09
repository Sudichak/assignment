
public class getDigits {

	static String getNbr(String str) 
    { 
        // Replace each non-numeric number with a space
        str = str.replaceAll("[^\\d]", " "); 
        // Remove leading and trailing spaces
        str = str.trim(); 
        // Replace consecutive spaces with a single space
        str = str.replaceAll(" +", " "); 
  
        return str; 
    } 
  
    public static void main(String[] args) 
    { 
        String str = "texte321 paragraphe12 569 lorem"; 
        System.out.print(getNbr(str)); 
    } 
}
