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

    @Value("Sakubot")
    String botName;

    @Value("6009333298:AAG-Di4Pf3L7B4n2cnoiB8DNz0NxIoXE2Xs")
    String token;
}
