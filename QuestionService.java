package QuizGame;

import java.util.Scanner;

public class QuestionService {
	Question[] question = new Question[5];
	String[] selection = new String[5];
	public QuestionService() {
		question[0] = new Question(1,"size of char","2","3","4","8","2");
		question[1] = new Question(2,"size of int","2","3","4","8","4");
		question[2] = new Question(3,"size of bool","2","3","4","8","4");
		question[3] = new Question(4,"size of double","2","3","4","8","8");
		question[4] = new Question(5,"size of long","2","3","4","8","8");
	}
	
	public void playQuiz() {
		int i=0;
		for(Question q : question) {
			System.out.println("Question : "+q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Your Answer : ");
			selection[i] = sc.nextLine();
			i++;
			
		}
	}
	
	public void calculateScore() {
		int score=0;
		for(int i=0;i<question.length;i++) {
			Question que = question[i];
			String actualAnswer = que.getAnswer();
			String userAnswer = selection[i];
			
			if(actualAnswer.equals(userAnswer)) {
				score++;
			}
		}
		System.out.println("Your Score : "+score);
	}
}
