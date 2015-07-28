package io.rahul.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class ProducerClient {

    @Autowired
    @LoadBalanced
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getProducerFallback")
    public ProducerResponse getValue() {
        return restTemplate.getForObject("http://producer", ProducerResponse.class);
    }

    @SuppressWarnings("unused")
    private ProducerResponse getProducerFallback() {
        return new ProducerResponse(42);
    }
}