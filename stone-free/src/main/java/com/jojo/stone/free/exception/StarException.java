package com.jojo.stone.free.exception;

import com.jojo.stone.free.enums.ErrorCodeEn;
import lombok.Data;

/**
 * @author Clozer
 * @date 2022/3/26 8:31 PM
 */
@Data
public class StarException extends RuntimeException{
    private String message;
    private Integer code;

    public StarException(){
        this(ErrorCodeEn.SYSTEM_ERROR);
    }

    public StarException(ErrorCodeEn errorCodeEn){
        this(errorCodeEn.getCode(),errorCodeEn.getMessage());
    }

    public StarException(Integer code,String message){
        super(message);
        this.message = message;
        this.code = code;
    }
}
