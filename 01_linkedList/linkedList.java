import java.util.LinkedList;

public class linkedList{
    public static void main(String[] args) {
        //LinkedList list = new LinkedList(); // 타입 미설정 object로 선언
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.addFirst(1); // 가장앞에 데이터추가
        num.addLast(2); // 가장 뒤에 데이터 추가
        num.add(3); // 데이터 추가 추가시 맨뒤로 추가

        num.size(); // list size
        System.out.println(num.size());

        // list 전체 출력
        for(int i : num){
            System.out.print(" "+i);
        }

        // list내 검색
        System.out.println(num.contains(1)); // list에 1이 있는지 검색

    }
}
