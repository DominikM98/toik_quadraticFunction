package com.example.quadratic.dto;

public class ResultDto {

    private final Double x1;
    private final Double x2;
    private final VertexDto V;
    private final Double delta;


    public ResultDto(VertexDto v, Double delta) {
        V = v;
        this.delta = delta;
        x1 = null;
        x2 = null;
    }

    public ResultDto(Double x1, Double x2, VertexDto v, Double delta) {
        this.x1 = x1;
        this.x2 = x2;
        V = v;
        this.delta = delta;
    }

    public Double getX1() {
        return x1;
    }

    public Double getX2() {
        return x2;
    }

    public VertexDto getV() {
        return V;
    }

    public Double getDelta() {
        return delta;
    }
}
