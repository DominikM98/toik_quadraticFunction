package com.example.quadratic.service;

import com.example.quadratic.dto.ResultDto;
import com.example.quadratic.dto.VertexDto;
import org.springframework.stereotype.Service;

@Service
public class QuadraticFunctionImpl implements QuadraticFunction {


    @Override
    public ResultDto calculateFunction(Double a, Double b, Double c) {

        double delta = b * b - 4 * a * c;

        double p = -b/(2*a);
        double q = -delta/(4*a);


        if (delta > 0){
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            return new ResultDto(x1, x2, new VertexDto(p,q), delta);

        }else if (delta == 0){

            double x0 = (-b) / (2*a);
            return new ResultDto(x0, null, new VertexDto(p,q), delta);
        }

        return new ResultDto(new VertexDto(p,q), delta);
    }
}
