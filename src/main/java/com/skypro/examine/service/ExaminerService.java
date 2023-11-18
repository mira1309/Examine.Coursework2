package com.skypro.examine.service;

import com.skypro.examine.entity.Question;

import java.util.Collection;

public interface ExaminerService {
        Collection<Question> getQuestions(int size);
}
