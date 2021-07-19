import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;


@Service
@Validated
public class CreateQuestion {
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    @Autowired
    public CreateQuestion(QuestionRepository questionRepository, QuestionMapper questionMapper) {
        this.questionRepository = questionRepository;
        this.questionMapper = questionMapper;
    }

    //Crear un Question

    public Mono<QuestionDTO> insertar(QuestionDTO questionDTO) {
        return questionRepository.save(questionMapper.mapperToQuestion(null).apply(questionDTO)).map(questionMapper.mapQuestionToDTO());
    }
}
