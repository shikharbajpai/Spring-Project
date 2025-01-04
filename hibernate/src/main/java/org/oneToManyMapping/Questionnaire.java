package org.oneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Questionnaire {
    @Id
    private int questionnaire_id;
    private String questions;
    @OneToMany(mappedBy = "questionnaire")
    private List<AnswersList> answersLists;

    public Questionnaire() {
    }

    public Questionnaire(int questionnaire_id, String questions, List<AnswersList> answersLists) {
        this.questionnaire_id = questionnaire_id;
        this.questions = questions;
        this.answersLists = answersLists;
    }

    public int getQuestionnaire_id() {
        return questionnaire_id;
    }

    public void setQuestionnaire_id(int questionnaire_id) {
        this.questionnaire_id = questionnaire_id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public List<AnswersList> getAnswersLists() {
        return answersLists;
    }

    public void setAnswersLists(List<AnswersList> answersLists) {
        this.answersLists = answersLists;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "questionnaire_id=" + questionnaire_id +
                ", questions='" + questions + '\'' +
                ", answersLists=" + answersLists +
                '}';
    }
}
