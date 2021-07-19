import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class AnswerMapper {
    public Function<AnswerDTO, Answer> fromAnswerDtoToAnswer(String id){
        return updateAnswer->{
            var answer=new Answer();
            answer.setId(id);
            answer.setUserId(updateAnswer.getUserId());
            answer.setQuestionId(updateAnswer.getQuestionId());
            answer.setAnswer(updateAnswer.getAnswer());
            answer.setModificada(updateAnswer.getModificada());
            answer.setVecesModificada(updateAnswer.getVecesModificada());
            answer.setVote(updateAnswer.getVote());
            return answer;
        };

    }

    public Function<Answer,AnswerDTO> fromAnswerToAnswerDTO(){
        return entity->
                new AnswerDTO(
                        entity.getId(),
                        entity.getUserId(),
                        entity.getQuestionId(),
                        entity.getAnswer(),
                        entity.getModificada(),
                        entity.getVecesModificada()
                );
    }
}
