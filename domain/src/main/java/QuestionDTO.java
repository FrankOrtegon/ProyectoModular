import answer.domain.AnswerDTO;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class QuestionDTO {
    private String id;
    @NotBlank
    private String userId;
    @NotBlank
    private String question;
    @NotBlank
    private String type;
    @NotBlank
    private String category;
    private Integer answerDelete;
    private List<AnswerDTO> answers;


    public QuestionDTO() {

    }



    public QuestionDTO(String userId, String question, String type, String category, Integer answerDelete) {
        this.userId = userId;
        this.question = question;
        this.type = type;
        this.category = category;
        this.answerDelete = answerDelete;
    }

    public QuestionDTO(String id, String userId, String question, String type, String category,Integer answerDelete) {
        this.id = id;
        this.userId = userId;
        this.question = question;
        this.type = type;
        this.category = category;
        this.answerDelete = answerDelete;
    }

    public List<AnswerDTO> getAnswers() {
        this.answers = Optional.ofNullable(answers).orElse(new ArrayList<>());
        return answers;
    }

    public void setAnswers(List<AnswerDTO> answers) {
        this.answers = answers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getAnswerDelete() {
        return answerDelete;
    }

    public void setAnswerDelete(Integer answerDelete) {
        this.answerDelete = answerDelete;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", question='" + question + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", answerDelete=" + answerDelete +
                ", answers=" + answers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionDTO that = (QuestionDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
