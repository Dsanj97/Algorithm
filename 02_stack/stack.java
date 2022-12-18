// 1. 먼저들어간 자료가 나중에 나오는 LIFO 구조
// 2. 재귀적 함수 호출에 사용
// 3. 그래프의 깊이우선탐색(DFS)에서 사용

import java.util.Stack; 

public class stack{
    public static void main(String[] args){
        Stack<Integer> stackInt = new Stack<>(); //int형 스택 선언
        Stack<String> stackString = new Stack<>(); //string형 스택 선언
        

        //스택 
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);

        //----------------------------------------
        // 스택 3-2-1

        stackInt.pop(); // 맨 위값 출력

        //스택 2-1

        System.out.println(stackInt.pop()); // 터미널에 2 출력

        //스택 1

        stackInt.size(); // 스택의 크기
        System.out.println(stackInt.size());

        stackInt.empty(); // 스택이 비어있는지 체크(비어있다면 true)
        System.out.println(stackInt.empty());

        stackInt.contains(1); // 스택안에 1이 있는지 확인
        System.out.println(stackInt.contains(1));
    }
}