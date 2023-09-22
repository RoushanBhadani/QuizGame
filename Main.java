package QuizGame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionService qs = new QuestionService();
		qs.playQuiz();
		qs.calculateScore();
	}

}
