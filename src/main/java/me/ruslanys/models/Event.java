package me.ruslanys.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Rami Ben Mohamed
 */
@Data
@AllArgsConstructor
public class Event {

    private Long taskId;
    private Type type;
    private Status status;
    public Event(Long taskID,Type type,Status status){
    	this.taskId=taskID;
    	this.type=type;
    	this.status=status;
    }
    public enum Status {
        STARTED, SUCCESSFUL, FAILED
    }

}
