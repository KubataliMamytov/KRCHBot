package io.project.KRCHBot.config;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
@Data

public class BotConfig {

    @Value("Bot name")
    String botName;

    @Value("ID bot")
    String token;
}
