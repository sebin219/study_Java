package advanced.ch15.sec02.exam03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter, setter, toString, equals, hashCode 모두 자동 생성
@NoArgsConstructor //기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 받는 생성자 자동 생성

public class Board {
    private String subject;
    private String content;
    private String writer;
}
