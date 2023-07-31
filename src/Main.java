import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        printAction();
        ArrayList<String> arrayList = new ArrayList<>();
        boolean flag = true;
            while(flag){

                switch(Integer.parseInt(scanner.nextLine())){
                    case 1 -> addToArrayList(arrayList);
                    case 2 -> deleteArrayList(arrayList);

                    default -> flag = false;
                }
                arrayList.sort(Comparator.naturalOrder());
                System.out.println(arrayList);
            }

    }
    private static void printAction(){
        System.out.print("0 - Exit \n1 - Dodaj element\n2 - Usun element\n");
    }

    private static  void addToArrayList(ArrayList<String> arrayList){
        String [] items = scanner.nextLine().split(",");

        for(String i: items){
            String trimmed = i.trim();
            if(arrayList.indexOf(trimmed)<0){
                arrayList.add(trimmed);
            }
        }

    }

    private static void deleteArrayList (ArrayList<String> arrayList){
        String [] items = scanner.nextLine().split(",");

        for(String i: items){
            String trimmed = i.trim();
            arrayList.remove(trimmed);
        }
    }
}