package com.stackroute.domain;

//import jdk.internal.loader.Resource;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
import com.stackroute.domain.Actor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;





    public class Main {
        public static void main(String[] args) {

            //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

         //Actor act = context.getBean("actor",Actor.class);

         //Movie movieref =(Movie)(context.getBean("movie"));

          //System.out.println(movieref.getActorRef().getAge());


           Resource res =new ClassPathResource("beans.xml");
            BeanFactory factory=new XmlBeanFactory(res);
            Actor act=(Actor)factory.getBean("actor");

            System.out.println(act.getActorName());
            System.out.println(act.getGender());
            System.out.println(act.getAge());
        }

        }



