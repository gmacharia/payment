/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cellualnt.postpayment.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 *
 * @author kobe
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayloadDTO {

    public String countryCode;
    public String function;

    public Object payload;
}
