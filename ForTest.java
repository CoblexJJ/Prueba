import java.util.Scanner;

public class ForTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number you want to convert into Roman");
        Integer number = scanner.nextInt();
        System.out.println("The equivalent of "+ number + " into Roman numbers is: " + returnRomanNumber(number));
        scanner.close();
    }  
    
    /**
     * First off I realized that maybe I wasn't thinking correctly on how to do this task, because I was avoiding to declare the Roman 
     * numbers per sé, but after considering different elements, I think the fastest way to the fuction is declaring the Roman numbers 
     * like is shown  below. I think there must be better ways to solve this, more scalable and easier for other developers to understand.
     * But a good advantage of this is that there's no need to loop any array or anything. Just  with the number pointing at different indexes
     * is more than enough.
     * 
     * @param number The number that the user wants to convert into  roman numbers.
     * @return A  string with the roman representation of the given number.
     */
    public static String returnRomanNumber(Integer number){
        String [] units = {"","I","II","III","IV", "V","VI","VII","VIII","IX"};  
        String [] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};  
        String [] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; 
        String [] thousands = {"", "M","MM"};
        return thousands[number/1000] + hundreds[(number%1000)/100]  + tens[(number%100)/10] + units[number % 10];
    }
    
}
