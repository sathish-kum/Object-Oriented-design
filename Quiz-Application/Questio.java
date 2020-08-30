import java.util.*;
class Questio
{
	String questio;
	String optio1;
	String optio2;
	String optio3;
	String optio4;
	Aswer aswer;
	public Questio(String questio, String optio1, String optio2, String optio3, String optio4, Aswer aswer) {
		super();
		this.questio = questio;
		this.optio1 = optio1;
		this.optio2 = optio2;
		this.optio3 = optio3;
		this.optio4 = optio4;
		this.aswer = aswer;
	}
	public String getQuestio() {
		return questio;
	}
	public String getOptio1() {
		return optio1;
	}
	public String getOptio2() {
		return optio2;
	}
	public String getOptio3() {
		return optio3;
	}
	public String getOptio4() {
		return optio4;
	}
	public Aswer getAswer() {
		return aswer;
	}
	
}
