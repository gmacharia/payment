/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cellualnt.postpayment.dto.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author kobe
 */
@AllArgsConstructor
@NoArgsConstructor
public class ResultsObject {
    private String accountNumber;
    private String serviceID;
    private String serviceCode;
    private String dueDate;
    private String dueAmount;
    private String currency;
    private String customerName;
    private Object responseExtraData;
    private int statusCode;
    private String statusDescription;
    private String invoiceNumber;
    private int beepTransactionID;
}


