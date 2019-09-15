package com.vocabulary.en.learning.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
@Slf4j
public class FileStarageConfig {

    @Bean(name = "basePath")
    public String basePath(){
        File baseDir = new File("upload");
        if (!baseDir.exists()){
            baseDir.mkdir();
        }
        log.info("BasePath: " + baseDir.getAbsolutePath());
        return baseDir.getAbsolutePath();
    }

}
