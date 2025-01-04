package org.oneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswersList {
    @Id
    private int answersList_id;
    private String answers;
    @ManyToOne
    private Questionnaire questionnaire;

    public AnswersList() {
    }

    public AnswersList(int answersList_id, String answers, Questionnaire questionnaire) {
        this.answersList_id = answersList_id;
        this.answers = answers;
        this.questionnaire = questionnaire;
    }

    public int getAnswersList_id() {
        return answersList_id;
    }

    public void setAnswersList_id(int answersList_id) {
        this.answersList_id = answersList_id;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    @Override
    public String toString() {
        return "AnswersList{" +
                "answersList_id=" + answersList_id +
                ", answers='" + answers + '\'' +
                ", questionnaire=" + questionnaire +
                '}';
    }
}
