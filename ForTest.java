
package fortest;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class ForTest {

    public static void main(String[] args) {
    }
    
    // I, V, X, L, C, D, M
    // MCCXXXIV
    public static String returnRomanNumber(Integer number){
        String numberConverted = number.toString(); 
        ArrayList<Character> chars = (ArrayList<Character>) numberConverted.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        for (int i = 0; i <= chars.size(); i++ ){
            if (chars.size() > 3){
                
            } else if ((chars.size() <= 3 ) && chars.size() > 2) {
                
            } else if ((chars.size() <= 2 ) && chars.size() > 1) {
                
            } else {
            
            }
        }
            
        return null;
    }
    
}
