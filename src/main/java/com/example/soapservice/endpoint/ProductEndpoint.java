package com.example.soapservice.endpoint;

import com.example.soapservice.model.Product;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProductEndpoint {
    @PayloadRoot(namespace = "http://example.com/soap", localPart = "getProductRequest")
    @ResponsePayload
    public Product getProduct(@RequestPayload ProductEndpoint request){
        //Mock data
        Product product = new Product(1L, "Produto A", 10.0);
        return product;
    }
}
