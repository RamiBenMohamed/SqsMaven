package me.ruslanys.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.atomic.AtomicLong;
/**
 * @author Rami Ben Mohamed
 */
@Data
@NoArgsConstructor
public class Task {

    private static final AtomicLong COUNTER = new AtomicLong();

    private Long id = COUNTER.incrementAndGet();
    private Type type;
    private String runner;
    private String description;

    public Task(Type type, String runner, String description) {
        this.type = type;
        this.runner = runner;
        this.description = description;
    }

    public Long getId(){
    	return this.id;
    }
    public Type getType(){
    	return this.type;
    }
}
