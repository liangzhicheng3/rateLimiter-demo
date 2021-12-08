package com.liangzhicheng.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private int code;
    private String message;

    public static Result success(Integer code, String message){
        return new Result(code, message);
    }

}
