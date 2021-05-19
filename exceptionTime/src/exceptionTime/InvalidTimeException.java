package exceptionTime;

public class InvalidTimeException extends Exception{
// 유효하지 않은 범위의 숫자를 입력받았을 때의 예외처리 클래스
    // 예외가 발생한 이유를 넘겨 받아 객체를 생성한다
    public InvalidTimeException(String reason){
          super(reason);
    }	
}
