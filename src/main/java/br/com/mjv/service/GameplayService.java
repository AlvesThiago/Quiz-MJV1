package br.com.mjv.service;

import br.com.mjv.dto.PlayerDTO;
import br.com.mjv.model.Question;
import br.com.mjv.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GameplayService {

    @Autowired
    private QuizDataBaseService quizDataBaseService;

    public PlayerDTO startQuizGameplay(String nickName, String theme, User user){
        PlayerDTO playerDTO = new PlayerDTO(nickName, 0, theme, user);

        ArrayList<Question> questionsList  = quizDataBaseService.showAllQuestion();
        ArrayList<Question> filteredQuestionsList = quizDataBaseService.findByTheme(questionsList, playerDTO.getTheme());

        playerDTO.setPlayerQuestionsList(filteredQuestionsList);

        return playerDTO;

    }
}
