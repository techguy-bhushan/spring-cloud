package com.configclient.configclient.api;

import com.configclient.configclient.config.ConfigClientConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigApi {
    private static final Logger logger = LoggerFactory.getLogger(ConfigApi.class);
    @Autowired
    private ConfigClientConfiguration configClientConfiguration;

    @Value("${project.profile}")
    private String profileProperty;

    @RequestMapping("/")
    public String getConfigProperties() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(configClientConfiguration.getProperty());
        stringBuilder.append("/");
        stringBuilder.append(profileProperty);
        String result = stringBuilder.toString();
        logger.info("properties : "+ result);
        return result;
    }
}
