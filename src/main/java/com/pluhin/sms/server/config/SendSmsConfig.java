package com.pluhin.sms.server.config;

import com.pluhin.api.websms.service.DefaultWebSmsService;
import com.pluhin.api.websms.service.WebSmsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendSmsConfig {

  @Bean
  public WebSmsService webSmsService() {
    return new DefaultWebSmsService();
  }
}
