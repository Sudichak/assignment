
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class arrayToList {
  public static void main(String[] args) {

   
    String[] array = {"Java", "Python", "C"};
    System.out.println("Array: " + Arrays.toString(array));

  
    List<String> languages= new ArrayList<>(Arrays.asList(array));

    System.out.println("List: " + languages);

  }
}
