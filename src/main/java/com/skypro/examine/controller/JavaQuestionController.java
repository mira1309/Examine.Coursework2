package com.skypro.examine.controller;

import com.skypro.examine.entity.Question;
import com.skypro.examine.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private final QuestionService questionService;
    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;

    }

    @GetMapping("/add")
    public Question add(@RequestParam String question,@RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping("/remove")
    public Question remove(@RequestParam String question,@RequestParam String answer) {
        return questionService.remove(question, answer);
    }
    @GetMapping
    public Collection<Question> getAll(){
        return questionService.getAll();
    }
}
