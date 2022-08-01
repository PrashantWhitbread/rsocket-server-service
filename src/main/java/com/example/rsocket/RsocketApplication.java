package com.example.rsocket;


import java.time.Duration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class RsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(RsocketApplication.class, args);
    }

}

@Controller
class GreetingsController {

    @SubscriptionMapping
    Flux<String> greetings() {
        /**return Flux
                .fromStream(Stream.generate(() -> new Greeting("Hello, world @ " + Instant.now() + "!").toString()))
                .delayElements(Duration.ofSeconds(1))
                .take(10); **/

        return Mono.delay(Duration.ofMillis(50))
            .flatMapMany(aLong -> Flux.just("Hi!", "Bonjour!", "Hola!", "Ciao!", "Zdravo!"));
    }

   /** @QueryMapping
    Greeting greeting() {
        return new Greeting("Hello, world!");
    } **/
}