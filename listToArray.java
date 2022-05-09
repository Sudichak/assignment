
import java.util.ArrayList;

class listToArray {
  public static void main(String[] args) {
    ArrayList<Object> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("ArrayList: " + languages);

    String[] arr = new String[languages.size()];

    languages.toArray(arr);
    System.out.print("Array: ");
    for(String item:arr) {
      System.out.print(item+", ");
    }
  }
}
