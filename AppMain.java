package app;
import java.util.Scanner;

public class AppMain {
   public static void main(String[] args)  {

      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter Place of Purchase");
      String name = myObj.nextLine();
      System.out.println("Enter Purpose of Purchase");
      String purpose = myObj.nextLine();
      System.out.println("Enter Amount of Purchase");
      String amount = myObj.nextLine();

      Finance one = new Finance(name, purpose, amount);
      LinkedList<Finance> springBreak = new LinkedList<Finance>();
      springBreak.addElement(one);

      // To print out all the contents of the linkedlist
      Node<Finance> current = springBreak.getHead();
      for (int i = 0; i < springBreak.size(); i++) {
         System.out.print(current.getData().printString());
         current = current.getNext();
      }

      springBreak.removeElement(one);
      
   }
}