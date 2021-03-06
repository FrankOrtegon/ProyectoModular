import javax.validation.constraints.NotBlank;
import java.util.Objects;
import java.util.Optional;

public class AnswerDTO {
    private String id;
    @NotBlank
    private String userId;
    @NotBlank
    private String questionId;
    @NotBlank
    private String answer;
    private Integer vote;
    private Boolean modificada;
    private Integer vecesModificada;


    public AnswerDTO() {

    }

    public AnswerDTO(@NotBlank String questionId, @NotBlank String userId, @NotBlank String answer) {
        this.userId = userId;
        this.questionId = questionId;
        this.answer = answer;
    }

    public AnswerDTO(String id,String userId, String questionId, String answer, Boolean modificada, Integer vecesModificada) {
        this.id = id;
        this.userId = userId;
        this.questionId = questionId;
        this.answer = answer;
        this.modificada = modificada;
        this.vecesModificada = vecesModificada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVote() {
        return Optional.ofNullable(vote).orElse(1);
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getModificada() {
        return modificada;
    }

    public void setModificada(Boolean modificada) {
        this.modificada = modificada;
    }

    public Integer getVecesModificada() {
        return vecesModificada;
    }

    public void setVecesModificada(Integer vecesModificada) {
        this.vecesModificada = vecesModificada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswerDTO answerDTO = (AnswerDTO) o;
        return Objects.equals(userId, answerDTO.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "AnswerDTO{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", questionId='" + questionId + '\'' +
                ", answer='" + answer + '\'' +
                ", vote=" + vote +
                ", modificada=" + modificada +
                ", vecesModificada=" + vecesModificada +
                '}';
    }
}
