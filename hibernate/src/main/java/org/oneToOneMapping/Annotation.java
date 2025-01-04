package org.oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Annotation {
    public static void main(String[] args) {
        System.out.println("Hibernate Project Started...");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        System.out.println("SessionFactory: " + sessionFactory);

        // creating object of Question class
        Question question = new Question();

        // creating object of Answer class
        Answer answer = new Answer();
        answer.setAnswer_id(343);
        answer.setAnswer("Java is a programming language");
        answer.setQuestion(question);

        question.setQuestion_id(1212);
        question.setQuestion("What is Java?");
        question.setAnswer(answer);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(question);
        session.save(answer);
        transaction.commit();

        // Fetching the question and answer.......
        Question ques = session.get(Question.class, 1212);
        System.out.println(ques.getQuestion());
        System.out.println(ques.getAnswer().getAnswer());
        session.close();
        sessionFactory.close();
    }
}
