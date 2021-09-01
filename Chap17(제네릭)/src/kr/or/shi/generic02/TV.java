package kr.or.shi.generic02;

import kr.or.shi.generic.Powder;

public class TV<E> {
	
private TV e;
	
	public TV getMaterial() {
		return e;
	}
	
	public void setMaterial(TV e) {
		this.e = e;
	}
	
	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}

}
