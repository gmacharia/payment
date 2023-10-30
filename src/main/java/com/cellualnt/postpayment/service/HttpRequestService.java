/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cellualnt.postpayment.service;

import com.cellualnt.postpayment.dto.response.ResponseDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author kobe
 */
@Slf4j
@Service
public class HttpRequestService {

    @Autowired
    private RestTemplate restTemplate;

    ResponseDTO response;

    public ResponseDTO postRequest(String url, Object payload) {
        try {
            log.info("Request sent to {}{}", url, new ObjectMapper().writeValueAsString(payload));

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<?> requestEntity = new HttpEntity<>(payload, headers);

            response = this.restTemplate.postForEntity(url, requestEntity, ResponseDTO.class).getBody();
        } catch (JsonProcessingException ex) {
            Logger.getLogger(HttpRequestService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
}
