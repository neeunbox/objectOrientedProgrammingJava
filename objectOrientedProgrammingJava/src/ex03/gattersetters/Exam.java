package ex03.gattersetters;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	// 합계 
	public int getTotal() {
		return kor + eng + math;
	}

	// 평균
	public float getAvg() {
		return this.getTotal() / 3.0f;
	}
	
	
}
