package br.com.mjv;

import br.com.mjv.dto.PlayerDTO;
import br.com.mjv.model.Question;
import br.com.mjv.model.User;
import br.com.mjv.service.GameplayService;
import br.com.mjv.service.QuizDataBaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class SimpleQuizApplicationTests {

	@Autowired
	private QuizDataBaseService quizDataBaseService;

	@Autowired
	private GameplayService gameplayService;


	@Test
	void dataBaseQuizTest() {
		//showQuizDataBase();

		User user = new User("Samuel", "Samuel Ferreira Duarte", 38);
		PlayerDTO playerDTO = gameplayService.startQuizGameplay("Samuquinha", "Cinema", user);

		System.out.println("Meu playerDTO instanciado: " + playerDTO);
		System.out.println("E o nosso player tem a seguinte lista do quiz: " + playerDTO.getPlayerQuestionsList());

	}

	public void showQuizDataBase(){
		ArrayList<Question> allQuestionsList = quizDataBaseService.showAllQuestion();

		System.out.println("Meus dados: " + allQuestionsList);

		System.out.println("Mostrando apenas  o tema Cinema: \n\n" + quizDataBaseService.findByTheme(allQuestionsList, "Cinema"));

		System.out.println("Pause:\n\n");
	}


}
