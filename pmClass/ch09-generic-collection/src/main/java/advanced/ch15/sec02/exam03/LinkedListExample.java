package advanced.ch15.sec02.exam03;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1. Board 클래스를 저장하기 위한 LinkedList 인스턴스 생성
        List<Board> list = new LinkedList<>();

        // 2. Board 클래스의 인스턴스 5개 생성하여 LinkedList에 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // 3. LinkedList에 저장된 요소의 개수 출력
        System.out.println("총 객체 수: " + list.size());
        System.out.println();

        // 4. 3번째 데이터 추출하여 출력
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        // 5. 일반 for문으로 순회하며 리스트의 각 요소 출력
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // 6. 인덱스 2에 해당하는 요소 삭제(3번째삭제)
        list.remove(2);

        // 7. 인덱스 2에 해당하는 요소 삭제 (삭제 후 한 칸 당겨지므로 원래 3번째였던 4번이 현재 인덱스 2)
        list.remove(2);

        // 8. 향상된 for문으로 순회하면서 리스트의 각 요소 출력
        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}