package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
        public static void main(String[] args) {

            ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

         Actor actor11 = context.getBean("actor1",Actor.class);
            System.out.println(actor11.toString());
         Actor actor22=context.getBean("actor2",Actor.class);
            System.out.println(actor22.toString());
         Actor actor33=context.getBean("actor3",Actor.class);
            System.out.println(actor33.toString());



         Movie movie11 =context.getBean("movie1",Movie.class);
            System.out.println(movie11.toString());
         Movie movie22 =context.getBean("movie2",Movie.class);
            System.out.println(movie22.toString());

            System.out.println(movie11== movie22);


        }

        }



