import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    try (Scanner scanner = new Scanner(new File(args[0]))) {
      int count = 0;
      while (scanner.hasNextInt()) {
        list.add(scanner.nextInt());
        count++;
      }
    } catch (Exception e) {
      System.out.println("error");
    }
    int sum =0;
    for(int i = 0; i < list.size(); i++){
      sum += list.get(i);
    }
    int avr = sum/list.size();
    int count = 0;
    for(int i = 0; i < list.size(); i++){
      while(list.get(i) != avr){
        if(list.get(i) < avr){
          list.set(i, list.get(i)+1);}
        else  list.set(i, list.get(i)-1);
        count+=1;
      }
  }
    System.out.println(count);
}}

