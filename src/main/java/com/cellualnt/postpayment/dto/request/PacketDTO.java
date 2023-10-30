/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cellualnt.postpayment.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author kobe
 */
@AllArgsConstructor
@NoArgsConstructor
public class PacketDTO {
 public  String accountNumber;
 public String serviceID;
 public String payerTransactionID;
 public String MSISDN;
 public String serviceCode;
}
