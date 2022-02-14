import java.util.Scanner;

public class calculator {
    public static void binaryToDecimalConverter() {
        Scanner input = new Scanner(System.in);
        //en scanner implementeres for at tage imod brugerens input
        System.out.print("Type a number in binary that you want converted ");
        //når programmet køres printes der hvilket tal programmet tager imod
        String stringOfBinaryNumbers = input.nextLine();
        //Her laves der en String ud fra det input der er givet af brugeren
        System.out.println("Number converted from binary " + Integer.parseInt(stringOfBinaryNumbers, 2));
        //Her hentes parseInt metoden fra Integer-klassen, der gør at binaryString laves om til en integer og printes.
    }
}
