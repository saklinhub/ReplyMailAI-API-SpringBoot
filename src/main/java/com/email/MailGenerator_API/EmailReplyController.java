package com.email.MailGenerator_API;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/api/email")
public class EmailReplyController {

    @Autowired
    private final EmailReplyService emailReplyService;

    @PostMapping("/reply")
    public ResponseEntity<String> replyEmail(@RequestBody EmailRequest emailRequest){
        String response= emailReplyService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
