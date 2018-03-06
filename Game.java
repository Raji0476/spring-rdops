import java.io.Console;
class Game {
    public static void main(String[] args) {
       System.out.println("Welcome to the capitals name");
       Console console = System.console();
       String answer = console.readLine("What is the Capital of Australia?");
       String capital = "Sydney";
       if (answer.equals(capital)) {
           System.out.println("Correct!");
         }
       else {
           System.out.println("No, the answer is" +capital);
         }
    }
}