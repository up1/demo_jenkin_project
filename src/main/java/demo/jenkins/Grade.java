package demo.jenkins;

public class Grade {

	public String convert(int score) {
		if(score >= 60) {
			return "C";
		}
		if(score >= 50){
			return "D";
		}
		return "F";
	}

}
