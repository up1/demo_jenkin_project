package demo.jenkins;

public class Grade {

	public String convert(int score) {
		if(score >= 50){
			return "D";
		}
		return "F";
	}

}
