package com.example.ecommerce.controller;


import com.example.ecommerce.dtos.Human;
import com.example.ecommerce.dtos.PageResponse;
import com.example.ecommerce.dtos.Phone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

//    https://rukminim2.flixcart.com/image/312/312/ktketu80/mobile/s/l/c/iphone-13-mlpf3hn-a-apple-original-imag6vzz5qvejz8z.jpeg?q=70

    @GetMapping(value = "/human")
    public Human getHuman() {
        Human h = new Human();
        h.setName("Aritra");
        h.setAge(18);
        h.setHeight(5.5);
        h.setSchool("RKVM");
        return h;
    }

    @GetMapping(value = "/phone")
    public Phone getPhone() {
        Phone p = new Phone();
        p.setName("Iphone13");
        p.setId(007);
        p.setUrl(" https://rukminim2.flixcart.com/image/312/312/ktketu80/mobile/s/l/c/iphone-13-mlpf3hn-a-apple-original-imag6vzz5qvejz8z.jpeg?q=70");
        p.setMrp(49999);
        p.setDiscount(8000);
        p.setFeatures(List.of("128 GB", "6.1 inch Super Retina Dislay", "A15 Bionic", "12+12 MP | 12 MP Front" ));
        return p;
    }

    @GetMapping(value = "/get-all-phones")
    public PageResponse<Phone> getAll(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        List<Phone> phoneList = new ArrayList<>();

        for (int i = (pageNumber-1) * pageSize; i <= pageNumber*pageSize; i++) {
            Phone phone = new Phone();
            phone.setId(i);
            phone.setName("Phone Model " + i);
            phone.setUrl("http://example.com/phone" + i);
            phone.setMrp(10000 + i * 100); // Just sample pricing
            phone.setDiscount(i % 10); // Discount cycles between 0-9

            List<String> features = new ArrayList<>();
            features.add("Feature A" + i);
            features.add("Feature B" + i);
            features.add("Feature C" + i);
            phone.setFeatures(features);

            phoneList.add(phone);
        }
        return new PageResponse<>(pageNumber,pageSize,phoneList);
    }


}
