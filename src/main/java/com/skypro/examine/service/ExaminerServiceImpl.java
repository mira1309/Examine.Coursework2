package com.skypro.examine.service;

import com.skypro.examine.entity.Question;
import com.skypro.examine.exception.ExaminerServiceException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    private ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }
    @Override
    public Collection<Question> getQuestions(int size) {

        if(questionService.getAll().size()< size) {
            throw new ExaminerServiceException("Запрошено большее количество вопросов, чем хранится в  сервисе");
        }

        Collection<Question> result = new HashSet<>();
        while (result.size()<= size){
            result.add(questionService.getRandomQuestion());
        }
        return result;
    }
}
