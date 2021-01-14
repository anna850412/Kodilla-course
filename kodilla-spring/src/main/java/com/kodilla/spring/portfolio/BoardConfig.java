package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
//    @Qualifier("toDo")
    Board board;

    @Bean
    Board getBoard(){
        return new Board();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgressList(){
        return new Board().getInProgressList();
    }
    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDoList(){
        return new Board().getToDoList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneList(){
        return new Board().getDoneList();
    }

}
