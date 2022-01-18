import lib.LinkedList;

public class Demo {

    public static void main(String[]  args){
      String[] dic= new String[]{"find" , "your", "way"};
      System.out.println(reverseNumber(876));
      linkedListOperation();
    }

    private static void linkedListOperation(){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.addToFirst(5);
        linkedList.midElement();
//        linkedList.print();
//        System.out.println("============");
//        linkedList.delete(3);
//        linkedList.print();
    }

    private static int reverseNumber(int number){
        if(number < 1){
            return number;
        }
        int reverseNumber = 0;
        while(number > 0){
            int tempNumber = number % 10;
            number = number / 10;
            reverseNumber = tempNumber +  reverseNumber * 10;
        }
        return reverseNumber;
    }
}
