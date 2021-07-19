import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
@Repository
public interface AnswerRepository extends ReactiveCrudRepository<Answer,String> {
    Mono<Answer> findByIdAndUserId(String Id, String userId);
    Mono<Void> deleteByQuestionId(String questionId);
}
