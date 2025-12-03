import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 for Japanese and type 2 for English.");
        int languageChoice = sc.nextInt();
        Locale locale = null;
        if(languageChoice == 1){
            locale = new Locale("ja", "JP");
        } else{
            locale = new Locale("en", "US");
        }
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Messages", locale);
        System.out.println(resourceBundle.getString("greeting"));
    }
}
