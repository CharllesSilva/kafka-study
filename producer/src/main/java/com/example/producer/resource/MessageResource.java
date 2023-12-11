package com.example.producer.resource;

import com.example.producer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageResource {

    @Autowired
    MessageService messageService;

    @PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody String mensagem){
        messageService.sendMessage(mensagem);
        return ResponseEntity.ok().body("Message sent successfully: " + mensagem);
    }
}