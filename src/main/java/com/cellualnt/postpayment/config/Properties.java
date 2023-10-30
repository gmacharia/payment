/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cellualnt.postpayment.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author kobe
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties("com.cellulant")
public class Properties{
        private String url;
        private int  httpConnectTimeout;
        private int httpReadTimeout;
    
}
