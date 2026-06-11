package com.notificationsystem.handler;

import com.notificationsystem.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class NotificationHandler {
    private final NotificationService notificationService;

    @Autowired
    public NotificationHandler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public Mono<ServerResponse> sendNotification(ServerRequest request) {
        String event = request.bodyToMono(String.class).block();
        notificationService.processEvent(event);
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).bodyValue("Notification sent");
    }
}