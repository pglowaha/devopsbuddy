package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

/**
 * Mock implementation of an email service.
 * Created by Pawel on 6/25/2017.
 */
public class MockEmailService extends AbstractEmailService{

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message){
        LOG.debug("Simulationg an email service...");
        LOG.info(message.toString());
        LOG.debug("Email sent.");
    }
}
