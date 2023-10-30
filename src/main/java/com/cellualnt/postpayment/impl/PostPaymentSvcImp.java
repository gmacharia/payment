/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cellualnt.postpayment.impl;

import com.cellualnt.postpayment.dto.request.PayloadDTO;
import com.cellualnt.postpayment.dto.response.ResponseDTO;

/**
 *
 * @author kobe
 */
public interface PostPaymentSvcImp {
     ResponseDTO processQueryBill(PayloadDTO queryBill);
     //processValidateAccount(PayloadDTO validateAccount);
     //processPostPayment(PayloadDTO postPayment);
}
