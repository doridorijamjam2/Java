package kr.or.shi;

import kr.or.shi.utils.Constant;

/*
 *  * 프로그램 개발 과정
 *  	1) RFP --> 요구 사항 분석
 *  	2) 설계
 *  	3) 명세서 작성
 *  	4) 순서도(flowchart) 작성
 *  	5) 소스코드 작성
 *  	6) 컴파일, 실행, 디버깅
 *  	7) 프로그램 유지 보수
 *  
 *  * 문제 정의
 *  
 *  	SCT School학교가 있습니다. 이 학교에 5명의 학생들이 수업을 듣습니다.
 *  	과목은 운영체제와 수학이 있고, 각 학생은 두 과목을 모두 수강합니다.
 *  	전공은 컴퓨터공학과 수학과 두 가지가 있습니다.
 *  	컴퓨터공학과 학생은 운영체제가 필수과목이고, 수학과 학생은 수학이 필수 과목입니다.
 *  	각 학생별로 한 개의 전공을 선택합니다.
 *  	이번 학기 각 학생의 성적은 다음과 같습니다.
 *  	
 *  	이름		학번		전공		전공과목		운영체제 점수		수학 점수
 *  	----------------------------------------------------------
 *  	스티브잡스			컴퓨터공학	 운영체제		   95			  56
 *  	이순신			수학과	 수학			   95			  98
 *  	리누스토발즈		컴퓨터공학	 운영체제		   100			  88
 *  	제임스고슬링		컴퓨터공학  운영체제	       89			  95
 *  	이도				수학과	  수학		   83			  56
 *  
 *  	학점을 부여하는 방법은 여러가지 있습니다. 단순히 A,B,C,D,F 를 부여하는 방법이 있고,
 *  	S,A,B,C,D,F를 부여하는 방법이 있고, Pass/Fail만을 부여하는 방법등이 있습니다.
 *  
 *  	일반과목이라면 A~F로, 전공과목이라면 S~F로 분류합니다.
 *  	점수에 따른 학점 부여기준은 아래와 같습니다.
 *  	
 *  	전공과목
 *  	-------------------------------------------------
 *  	S		A		B		C		D		F
 *  	95~100점 90~94	80~89	70~79	60~69	60점 미만
 *  
 *  	일반과목
 *  	-------------------------------------------------
 *  	A		B		C		D		F
 *  	90~100점 80~89	70~79	60~69	60점 미만  
 *  
 *  
 *  	위와같이 주어진 성적과 각 과목에 대한 학점 정책에 따라 아래와 같이 학점 결과가 나올수 
 *  	있도록 구현하시오.
 *  		
 *  * 업그레이드
 *  	1) 과목과 학점 정책이 추가되는 경우
 *  		- 골프 과목이 새로 개설되고 이 과목의 학점 평가 정책은 pass/fail로 정해졌습니다.
 *  		- 70점 이상인 경우는 pass, 미만인 경우는 fail입니다.
 *  		- 전체 5명 학생중 3명만 이 과목을 수강신청 했습니다.
 *      2) 출력화면
 *      
 *      		-------------------------------------------------
 *      			골프 강의신청자 학점 >>
 *      		이름 		|	학번		|	전공과목		|    점수
 *      		==================================================
 *      		스티브잡스 | 20210916  |	운영체제		|   95 : P  |
 *      		--------------------------------------------------
 *      		이순신	| 20211017	|	수학			|	85 : P	|
 *      		--------------------------------------------------
 *      		리누스토발즈 | 20211118 |	운영체제		|	55 : F	|
 *      		--------------------------------------------------
 */
public class Intro {

}



