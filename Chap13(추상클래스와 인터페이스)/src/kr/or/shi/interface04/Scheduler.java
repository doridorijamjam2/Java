package kr.or.shi.interface04;
/*
 * 1) 인터페이스 요소
 *    : 추상 메서드
 *      상수　ー 선언된 모든 변수는 상수로 처리됨.
 *      디폴드 메서드 - 기본 구현을 가지는 메서드, 구현하는 클래스에서 재정의 가능.
 *      정적 메서드 - 인스턴스 생성과 상관없이 인터페이스 타입으로 호출하는 메서드
 *      private 메서드
 * 2) 클라이언트 프로그램은 실제 구현 내용을 몰라도 인터페이스의 정의만 알면 그 객체를 사용할수 있음.
 *    => 인터페이스를 구현해 놓은 다양한 객체를 사용함 (다형성)
 *    
 * 3) 고객 센터에서 전화 상담하는 상담원이 있습니다.
 *    일단 고객 센터로 전화가 오면 대기열에 저장됩니다.
 *    상담원이 지정되기 전까지 대기 상태가 됩니다.
 *    각 전화가 상담원에게 배분되는 정책은 여러 방식으로 구현될수 있습니다.
 *    - 상담원 순서대로 배분하기
 *    - 대기가 짧은 상담원 먼저 배분하기
 *    - 우선순위가 높은(숙련도 높은) 상담원에게 먼저 배분하기
 *    
 *    위와 같은 여러 정책이 사용되는 경우 interface를 정의하고 다양한 정책을 구현하여 실행하시오.
 */

public interface Scheduler {
	
	public void getNextCall();
	public void sendCallToAgent();
	

}
