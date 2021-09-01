package kr.or.shi.linkedlist;

/*
 * 대표적인 데이터 구조 : 링크드 리스트 (Linked List)
 * 
 * 1. 링크드 리스트 구조
 * - 연결리스트라고도 함.
 * - 배열 : 순차적으로 연결된 공간에 데이터를 나열하는 데이터 구
 * - 링크드 리스트 : 떨어진 곳에 존재하는 데이터를 화살표로 연결해서 관리하는 데이터 구조
 * 
 * 2. 링크드 리스트 기본 구조와 용어
 * - 노드(Node) : 데이터 저장 단위(데이터값, 포인터)로 구성
 * - 포인터(pointer) : 각 노드안에서 다음이나 이전의 노드와의 연결 정보를 가지고 있는 공간
 * 
 * 3. 간단한 링크드 리스트 예
 * 
 */

public class Node<T> {
	T data;
	Node<T> next = null;
	
	//생성자
	public Node(T data) {
		this.data = data;
	}

}
