package exceptionTime;

public class TimeInUseException extends Exception{
// 사용중인 시간의 예외를 처리하는 클래스
    // 예외가 발생한 이유를 넘겨 받아 객체를 생성한다
    public TimeInUseException(String reason){
          super(reason);
    }
}
