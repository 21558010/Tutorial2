package uk.ac.westminster.products_api.Exception;

import java.time.LocalDateTime;

public class ErrorResponse {

    private String message;
    private int status;
    private LocalDateTime timestamp;

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }


    public ErrorResponse(String message,int status) {
        this.message = message;
        this.status = status;
    }
}
