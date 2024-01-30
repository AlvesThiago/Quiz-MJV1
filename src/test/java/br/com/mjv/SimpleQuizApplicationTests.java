package br.com.mjv;

import br.com.mjv.model.Question;
import br.com.mjv.service.QuizDataBaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class SimpleQuizApplicationTests {

	@Autowired
	private QuizDataBaseService quizDataBaseService;


	@Test
	void dataBaseQuizTest() {
		ArrayList<Question> allQuestionsList = quizDataBaseService.showAllQuestion();

		System.out.println("Meus dados: " + allQuestionsList);
		System.out.println("Pause \n\n");


		System.out.println("Mostrando apenas  o tema Cinema: \n\n" + quizDataBaseService.findByTheme(allQuestionsList, "Cinema"));

	}

}
