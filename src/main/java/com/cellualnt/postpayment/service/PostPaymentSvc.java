/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cellualnt.postpayment.service;

import com.cellualnt.postpayment.config.Properties;
import com.cellualnt.postpayment.dto.request.PayloadDTO;
import com.cellualnt.postpayment.dto.request.RequestPayload;
import com.cellualnt.postpayment.dto.response.ResponseDTO;
import com.cellualnt.postpayment.impl.PostPaymentSvcImp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author kobe
 */
@Service
@AllArgsConstructor
@Slf4j
public class PostPaymentSvc implements PostPaymentSvcImp {

    private final HttpRequestService httpRequestService;
    private final Properties properties;

    @Override
    public ResponseDTO processQueryBill(PayloadDTO queryBill) {
        try {
            //lets formulate the payload
            var payload = formulateQueryBillPayload(queryBill);
            
             var responseHandler =  httpRequestService.
                    postRequest(properties.getUrl(),
                            payload);
            
            log.info("Response from downstream api {}", new ObjectMapper().writeValueAsString(responseHandler));
            return responseHandler;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(PostPaymentSvc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public PayloadDTO formulateQueryBillPayload(PayloadDTO queryBill) throws JsonProcessingException {
        return PayloadDTO.builder()
                .countryCode(queryBill.countryCode)
                .function(queryBill.function)
                .payload(new ObjectMapper().writeValueAsString(queryBill.payload))
                .build();
    }

}
