package kr.or.shi.generic;

public class ThreeDPrinter01 {
	
	private Powder material;
	
	public Powder getMaterial() {
		return material;
	}
	
	public void setMaterial(Powder powder) {
		this.material = powder;
	}
	
	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}

}
