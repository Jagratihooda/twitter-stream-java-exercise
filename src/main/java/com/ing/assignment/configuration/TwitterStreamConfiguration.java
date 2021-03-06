package com.ing.assignment.configuration;

import com.google.api.client.http.HttpRequestFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwitterStreamConfiguration {
    @Value("${auth.consumer.key}")
    private String consumerKey;
    @Value("${auth.consumer.secret}")
    private String consumerSecret;

    @Bean
    public HttpRequestFactory getHttpRequestFactory() {
        return new TwitterAuthenticator(consumerKey, consumerSecret).getHttpRequestFactory();
    }

}
