
import java.util.Scanner;

class quiz
{
	void egi()
	{
		Questio q1 = new Questio("Which is a valid keyword in java?", "interface", "inherit", "unsigned", "derive", new Aswer("interface"));
		Questio q2 = new Questio("Where does an object get created in memory?", "stack", "queue", "Heap", "none of the above", new Aswer("Heap"));
		Questio q3 = new Questio("Which keyword is used to prevent a method from getting overridden?", "extends", "final", "static", "implements", new Aswer("final"));
        Questio q4 = new Questio("What is the default value of short variable?", "0.0", "0", "null", "not defined", new Aswer("0"));
		Questio q5 = new Questio("What is JRE?", "JRE is a java ased GUI application", "JRE is an application development framework", "JRE is an implementation of the java Virtual Machine which executes Java Programs", "none of the aove", new Aswer("JRE is an implementation of the java Virtual Machine which executes Java Programs"));
		Questio qarr[] = {q1, q2, q3, q4, q5};  
		int coutTotal = 0;
		int coutCorrect = 0;
		int coutWrog = 0;
		for(Questio q:qarr)
		{
		System.out.println(q.getQuestio());
		System.out.println("A. "+q.getOptio1());
		System.out.println("B. "+q.getOptio2());
        System.out.println("C. "+q.getOptio3());
        System.out.println("D. "+q.getOptio4());
        System.out.println("Enter an option");
        Scanner sc = new Scanner(System.in);
        char optio = sc.next().charAt(0);
        if(optio>='a'&&optio<='z')
        	optio = Character.toUpperCase(optio); 
        String aswer = "";
        switch(optio)
        {
        case 'A':
        	aswer = q.getOptio1();
        	break;
        case 'B':
        	aswer = q.getOptio2();
        	break;
        case 'C':
        	aswer = q.getOptio3();
        	break;
        case 'D':
        	aswer = q.getOptio4();
        	break;
        	default:
            	break;
        }
        if(aswer.equals(q.aswer.getAswer()))
        {
        	System.out.println("------------------------------");
        	System.out.println("Correct Answer");
        	System.out.println("------------------------------");
        	coutCorrect++;
        }
        else
        {
        	System.out.println("------------------------------");
        	System.out.println("Wrong Answer");
        	System.out.println("------------------------------");
        	coutWrog++;
        }
        System.out.println("***********************************");
        coutTotal++;
		} 
		IResult result  = new Result(coutTotal, coutCorrect, coutWrog);
		result.showResult(); 
	}
}
