package com.maytic.pokemondb.Exceptions;

import java.util.Date;

/**
 * basic Exception response containing a time stamp for the time of exception
 * a message from the exception and the details of the exception
 */
public class ExceptionResponse {

    private Date timeStamp;
    private String message;
    private String details;

    // removes default constructor
    private ExceptionResponse(){

    }

    /**
     * constructs ExceptionsResponse with variables
     * @param timeStamp - time stamp of exception
     * @param message - message sent from web service
     * @param details - details from exception
     */
    public ExceptionResponse(Date timeStamp, String message, String details) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
