package dev.j3c.aopdemo;

import dev.j3c.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
   public static void main(String[] args) {

      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(DemoConfig.class);

      AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

      accountDAO.addAccount();

      context.close();

   }
}
