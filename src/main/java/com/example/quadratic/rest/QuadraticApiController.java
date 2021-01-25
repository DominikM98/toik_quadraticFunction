package com.example.quadratic.rest;

import com.example.quadratic.dto.ParamsDto;
import com.example.quadratic.dto.ResultDto;
import com.example.quadratic.service.QuadraticFunction;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuadraticApiController {

    private static final Logger LOG = LoggerFactory.getLogger(QuadraticApiController.class);

    private final QuadraticFunction quadraticFunction;

    public QuadraticApiController(QuadraticFunction quadraticFunction) {
        this.quadraticFunction = quadraticFunction;
    }


    @GetMapping("/api/math/quadratic-function")
    public ResponseEntity<ResultDto> calculateFunction(@RequestParam Double a,
                                                       @RequestParam Double b,
                                                       @RequestParam Double c){

        LOG.info("--- a: {}", a);
        LOG.info("--- b: {}", b);
        LOG.info("--- c: {}", c);

        return ResponseEntity.ok(quadraticFunction.calculateFunction(a,b,c));
    }

    @PostMapping("/api/math/quadratic-function")
    public ResponseEntity<ResultDto> calculateFunctionPost(@RequestBody ParamsDto paramsDto){

        LOG.info("--- params: {}", paramsDto.toString());

        return ResponseEntity.ok(quadraticFunction.calculateFunction(paramsDto.getA(),paramsDto.getB(),paramsDto.getC()));
    }
}
