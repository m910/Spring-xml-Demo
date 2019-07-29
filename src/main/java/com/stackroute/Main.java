package com.stackroute;



import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
        public static  void main(String[] args) {
//            Actor actor;
//            Movie movie;
//
//            //ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
//
//            ApplicationContext context=  new ClassPathXmlApplicationContext("beans.xml");
//            //Movie movie1= Movie(context.getBean("movie1"));
//            Movie movie1= (Movie) context.getBean("movie1");
//            System.out.println(movie1.toString());

//         Actor actor11 = context.getClass(Actor);
//            System.out.println(actor11.toString());
//         Actor actor22=context.getClass(Actor);
//            System.out.println(actor22.toString());
//         Actor actor33=context.getClass(Actor);
//            System.out.println(actor33.toString());
//
//
//
//         Movie movie1 =Movie(context.getClass(Movie));
//            System.out.println(movie1.toString());


            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

            BeanLifeCycleDemoBean bean = (BeanLifeCycleDemoBean)context.getBean("beanLifecycle");

            bean.getMessage();


        }

        }



