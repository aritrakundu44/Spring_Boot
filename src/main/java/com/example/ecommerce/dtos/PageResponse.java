package com.example.ecommerce.dtos;

import java.util.List;


public class  PageResponse <T> {
    private Integer pageNumber;
    private Integer pageSize;
    private List<T> body;

    public PageResponse(Integer pageNumber, Integer pageSize, List<T> body) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.body = body;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getBody() {
        return body;
    }

    public void setBody(List<T> body) {
        this.body = body;
    }
}
