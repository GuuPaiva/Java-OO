package com.educandoweb.course.config;

import com.educandoweb.course.entities.*;
import com.educandoweb.course.repositories.*;
import com.educandoweb.course.repositories.enums.OrderStatus;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Fatima Christina", "fatchris@gmail.com", "987654321", "852963741");
        User u2 = new User(null, "Gustavo Paiva", "guchristt@gmail.com", "741852963", "1554785");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2021-06-20T19:45:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2022-07-20T22:35:07Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2023-08-20T13:14:07Z"), OrderStatus.WAITING_PAYMENT, u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Product p1 = new Product(null, "The Lord of Rings", "Lorem ipsu", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Best TV", 2190.44, "");
        Product p3 = new Product(null, "Mac book PRO", "Lorem ipsu", 5258.55, "");
        Product p4 = new Product(null, "PC gamer", "The Best PC gamer", 24000.55, "");
        Product p5 = new Product(null, "Rails for Dummies", "Lorem ipsu", 74.58, "");

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));


        OrderItem oi1 = new OrderItem(o1, p1,2,p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p3,1,p4.getPrice());
        OrderItem oi3 = new OrderItem(o2, p3,2,p1.getPrice());
        OrderItem oi4 = new OrderItem(o3, p5,2,p5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));

        Payment pay1 = new Payment(null,Instant.parse("2021-06-20T21:45:07Z"),o1);
        o1.setPayment(pay1);

        orderRepository.save(o1);
    }
}
