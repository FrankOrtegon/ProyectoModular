
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateAnswerRouter {
    @Bean
    public RouterFunction<ServerResponse> addAnswer(CreateAnswer createAnswer) {
        return route(POST("/añadirrespuesta").and(accept(MediaType.APPLICATION_JSON)),//uso json
                request -> request.bodyToMono(AnswerDTO.class)
                        .flatMap(answerDto -> createAnswer.addAnswer(answerDto)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)//tipo respuesta texto plano o json
                                        .bodyValue(result))
                        )
        );
    }
}
