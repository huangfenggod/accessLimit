package cn.hf.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

//捕获全局异常
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RateLimitException.class)
    public Map rateLimit(RateLimitException e){
        Map<String, Object> map = new HashMap<>();
        map.put("code",e.getCode());
        map.put("msg",e.getMsg());
        return map;
    }

}
