import java.util.ArrayList;
import java.util.Scanner;
public class Student {
private String name;
private int score;

public Student(String nm, int sc)
	{
	name=nm;
	score=sc;
	}	
	
		public static void main(String[] args) 
		{
		ArrayList<Student>results= new ArrayList<Student>();	
		results.add(new Student("John",78));
		results.add(new Student("Abraham",82));
		results.add(new Student("Barn",23));
		results.add(new Student("Pat",18));
		results.add(new Student("Vince",87));
			for (int i=0;i<results.size(); i++)
			{
			System.out.println(results.get(i).getName());
			System.out.println(results.get(i).getScore());
			}
		System.out.println("What is your name?");
		Scanner userInput= new Scanner(System.in);
		String nome=userInput.nextLine();
		System.out.println("What is your score?");
		int scure=userInput.nextInt();
		System.out.println();
			results.add(new Student(nome,scure));
			for (int i=0;i<results.size(); i++)
				{				
				System.out.println(results.get(i).getName());
				System.out.println(results.get(i).getScore());
				}
			System.out.println();
		
		for (int i=0;i<results.size(); i++)
		{
			if (results.get(i).getScore()<50)
				{
				results.get(i).setScore(55);
				}
			System.out.println(results.get(i).getName());
			System.out.println(results.get(i).getScore());
			}
		}	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}	
}
