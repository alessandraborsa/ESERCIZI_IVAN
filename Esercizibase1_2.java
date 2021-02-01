/* import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean continue_ = true;
        while (continue_) {
            
            Scanner number = new Scanner(System.in);
            

            System.out.println("inserisci due numeri");
            

            int num1 = number.nextInt();
            int num2 = number.nextInt();

            

            System.out.println("i numeri inseriti sono: " + num1 + " e " + num2);

            Scanner myVar = new Scanner(System.in);
            System.out.println("vuoi procedere con una nuova operazione?");

            String answer = myVar.nextLine();
            

            if (answer.equals("N")) {
                System.out.println("operazione finita");
                continue_ = false;
            } else if (answer.equals("Y")) {
                continue_ = true;
            } else {
                System.out.println("operazione non valida");
                continue_ = false;
                
            }

            
        
        }
        
    }
}

 
*/