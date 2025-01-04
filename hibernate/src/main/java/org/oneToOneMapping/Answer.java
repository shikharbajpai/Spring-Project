package org.oneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    private int answer_id;
    private String answer;
    @OneToOne(mappedBy = "answer")
    @JoinColumn(name = "question_id")
    private Question question;

    public Answer() {
    }

    public Answer(int answer_id, String answer) {
        this.answer_id = answer_id;
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer_id=" + answer_id +
                ", answer='" + answer + '\'' +
                '}';
    }
}
