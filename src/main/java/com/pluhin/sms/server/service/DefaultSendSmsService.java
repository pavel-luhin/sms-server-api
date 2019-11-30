package com.pluhin.sms.server.service;

import com.pluhin.api.websms.service.WebSmsService;
import org.springframework.stereotype.Service;

@Service
public class DefaultSendSmsService implements SendSmsService {

  private final WebSmsService webSmsService;

  public DefaultSendSmsService(WebSmsService webSmsService) {
    this.webSmsService = webSmsService;
  }
}
