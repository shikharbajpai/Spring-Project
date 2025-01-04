package org.oneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.oneToOneMapping.Answer;
import org.oneToOneMapping.Question;

import java.util.ArrayList;
import java.util.List;

public class OneToManyMapping {
    public static void main(String[] args) {
        System.out.println("Hibernate Project Started...");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        System.out.println("SessionFactory: " + sessionFactory);

        // creating object of Questionnaire class
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.setQuestionnaire_id(1221);
        questionnaire.setQuestions("What is Java?");

        // creating object of AnswersList class
        AnswersList answer1 = new AnswersList();
        answer1.setAnswersList_id(321);
        answer1.setAnswers("Java is a programming language");
        answer1.setQuestionnaire(questionnaire);

        AnswersList answer2 = new AnswersList();
        answer2.setAnswersList_id(322);
        answer2.setAnswers("Java is developed by Oracle.");
        answer2.setQuestionnaire(questionnaire);

        // creating an Arraylist to store multiple data
        List<AnswersList> answersList = new ArrayList<>();
        answersList.add(answer1);
        answersList.add(answer2);

        // setting answersList in questionnaire object.
        questionnaire.setAnswersLists(answersList);


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(questionnaire);
        session.save(answer1);
        session.save(answer2);

        transaction.commit();

        // Fetching the question and answer.......

        session.close();
        sessionFactory.close();
    }
}
