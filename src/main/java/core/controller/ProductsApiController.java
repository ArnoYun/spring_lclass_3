package core.controller;

import core.other.FileManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products-api")
public class ProductsApiController {
    @Value("${products-api-path}")
    String productsApiPath;
    @GetMapping("/products")
    public String getGroups() {
        System.out.println(productsApiPath);
        return FileManager.getMapManager().get(String.format("%sproducts.json", productsApiPath));
    }
    @GetMapping("/upload")
    public String upload() {
        return FileManager.getMapManager().get(String.format("%supload\\upload.json", productsApiPath));
    }
}