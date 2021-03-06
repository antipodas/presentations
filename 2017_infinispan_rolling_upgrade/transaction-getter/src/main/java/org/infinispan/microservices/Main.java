package org.infinispan.microservices;

import org.infinispan.microservices.transactions.service.TransactionsGetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

   public static void main(String[] args) throws InterruptedException {
      ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
      TransactionsGetter transactionsGetter = context.getBean(TransactionsGetter.class);
      transactionsGetter.getTransactionKeys();
   }
}
