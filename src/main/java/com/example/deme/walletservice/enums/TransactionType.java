package com.example.deme.walletservice.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;

import java.io.ObjectInputValidation;
import java.text.MessageFormat;


@AllArgsConstructor
public enum TransactionType {


    DEBIT("DEBIT"),
    CREDIT("CREDIT");

    private String type;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static TransactionType fromValue(String value) throws Exception {
        for(TransactionType type : values()){
            if(value.equalsIgnoreCase(String.valueOf(type))){
                return type;
            }
        }

        throw new Exception("Value not found");
    }

}
