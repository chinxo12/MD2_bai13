import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi");
        String str = scanner.nextLine();
        List<Character> myList = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = 0;j< str.length(); j++) {
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if (list.size()>myList.size()){
                myList.clear();
                myList.addAll(list);
            }
        }
        for (Character c :myList) {
            System.out.print(c);
        }



    }
}