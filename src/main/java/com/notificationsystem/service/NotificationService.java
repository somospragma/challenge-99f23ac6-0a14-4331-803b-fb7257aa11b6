package com.notificationsystem.service;

import com.notificationsystem.config.WebClientConfig;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class NotificationService {
    private final WebClient webClient;

    public NotificationService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    @CircuitBreaker(name = "notification", fallbackMethod = "fallbackSendNotification")
    @Retry(name = "notification")
    public Mono<Void> processEvent(String event) {
        return webClient.post()
               .uri("http://localhost:8080/send-notification")
               .bodyValue(event)
               .retrieve()
               .bodyToMono(Void.class);
    }

    public Mono<Void> fallbackSendNotification(String event, Throwable throwable) {
        return Mono.empty();
    }
}