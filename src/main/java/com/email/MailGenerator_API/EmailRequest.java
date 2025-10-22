package com.email.MailGenerator_API;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
