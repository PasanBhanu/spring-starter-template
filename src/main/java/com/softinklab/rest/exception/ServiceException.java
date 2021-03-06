package com.softinklab.rest.exception;

import com.softinklab.rest.action.Action;
import com.softinklab.rest.action.Default;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceException extends RuntimeException {
    private Integer status = 500;
    private HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    private String message = "Internal server error";
    private List<String> errors = null;
    private Action actionCode = Default.NULL;

    public ServiceException(Integer status, HttpStatus httpStatus, String message, List<String> errors) {
        this.status = status;
        this.httpStatus = httpStatus;
        this.message = message;
        this.errors = errors;
    }

    public ServiceException(Integer status, HttpStatus httpStatus, String message, Action actionCode) {
        this.status = status;
        this.httpStatus = httpStatus;
        this.message = message;
        this.actionCode = actionCode;
    }
}
