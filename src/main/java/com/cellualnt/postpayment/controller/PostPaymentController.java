/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cellualnt.postpayment.controller;

import com.cellualnt.postpayment.dto.request.PayloadDTO;
import com.cellualnt.postpayment.impl.PostPaymentSvcImp;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kobe
 */
@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("cellulat/v1")
public class PostPaymentController {
     private final PostPaymentSvcImp impSvc;
     
    @PostMapping(value = "/queryBill")
    public ResponseEntity<Object> createConfigDeta(@Valid @RequestBody PayloadDTO payload) {
        return new ResponseEntity<>(impSvc.processQueryBill(payload), HttpStatus.OK);
    } 
    
}
