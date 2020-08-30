import java.util.*;
interface IResult
{
	void showResult();
	String showPerformance(double percentage);
	double showPercentage(int correctAswer, int totalQuestios);
}
class Result implements IResult
{
	int totalQuestios;
	int correctAswers;
	int wrogAswers;
	public Result(int totalQuestios, int correctAswers, int wrogAswers) {
		super();
		this.totalQuestios = totalQuestios;
		this.correctAswers = correctAswers;
		this.wrogAswers = wrogAswers;
	}
	public void showResult()
	{
		System.out.println("Your Result:");
		System.out.println("Total Questions:            "+totalQuestios);
		System.out.println("Correct Answers:            "+correctAswers);
		System.out.println("Wrong Answer:               "+wrogAswers);
		System.out.println("Percentage:                 "+showPercentage(correctAswers, totalQuestios));
		System.out.println("Overall performance:        "+showPerformance(showPercentage(correctAswers, totalQuestios)));
	}
	public double showPercentage(int correctAswers, int totalQuestios)
	{
		return((double)correctAswers/totalQuestios)*100;
	}
	public String showPerformance(double percentage)
	{
		String performace = "";
		if(percentage>60)
			performace = "Good";
		else if(percentage < 40)
			performace = "Poor";
		else
			performace = "Average";
		return performace;
	}
	
}
