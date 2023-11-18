package com.skypro.examine.service;

import com.skypro.examine.entity.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add (Question question);

    Question remove (String question, String answer);

    Collection <Question> getAll();

    Question getRandomQuestion();
}
