package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public  class Movie  implements ApplicationContextAware , BeanFactoryAware,BeanNameAware {

    private Actor actor1,actor2,actor3;
    private ApplicationContext context = null;


    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public Actor getActor3() {
        return actor3;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException
    {
        this.context = context;
    }



    public Movie() {
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                ", actor2=" + actor2 +
                ", actor3=" + actor3 +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean name is" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}

