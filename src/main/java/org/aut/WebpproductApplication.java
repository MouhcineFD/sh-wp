package org.aut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class WebpproductApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebpproductApplication.class, args);
    }

    @org.springframework.stereotype.Controller
    public class Controller {



    }

    /*@Bean
    CommandLineRunner start(CategoryRepository categoryRepository, SubCategoryRepository subCategoryRepository, ProductRepository productRepository) {
        return args -> {
            subCategoryRepository.deleteAll();
            Stream.of("C1 ordinateurs","C2 imprimentes").forEach(c -> {
                subCategoryRepository.save(new Category(c.split("")[0],c.split("")[1], new ArrayList<>()));
            });
            subCategoryRepository.findAll().forEach(System.out::println);


            productRepository.deleteAll();
            SubCategory c3 = subCategoryRepository.findById("C1").get();
            Stream.of("P1", "P2","P3","P4").forEach(name -> {
                Product p = productRepository.save(new Product(null, name, Math.random() * 1000,null,null,null,null,null,null,null,null,null,null,null,null,null,c3));
                c3.getProducts().add(p);
                subCategoryRepository.save(c3);
            });

            SubCategory sc2 = subCategoryRepository.findById("C2").get();
            Stream.of("P5", "P6").forEach(name -> {
                Product p = productRepository.save(new Product(null, name, Math.random() * 1000,null,null,null,null,null,null,null,null,null,null,null,null,null, sc2));
                sc2.getProducts().add(p);
                subCategoryRepository.save(sc2);
            });

            productRepository.findAll().forEach(p -> {
                System.out.println(p.toString());
            });
        };
    }*/
}