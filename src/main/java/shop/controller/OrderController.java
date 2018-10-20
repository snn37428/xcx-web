package shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shop.service.OrderService;

import java.util.Map;

/**
 * Created by songningning1 on 2017/10/17.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "create")
    @ResponseBody
    public Map create() {
        orderService.create("str");
        return null;
    }
}
