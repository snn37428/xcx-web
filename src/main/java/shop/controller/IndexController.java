package shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shop.service.IndexService;
import shop.service.ProductService;

import java.util.Map;

/**
 * Created by songningning1 on 2017/9/17.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "banner/list")
    @ResponseBody
    public Map listBanner() {
       return indexService.listBanner();
    }

    @RequestMapping(value = "product/all")
    @ResponseBody
    public Map login() {
        System.out.println("product/all begin----");
        return productService.listProduct();
    }


}
