package org.myungkeun.coworking240429.exception.notFound;

import lombok.Getter;
import org.myungkeun.coworking240429.exception.CoworkingException;
import org.springframework.http.HttpStatus;

@Getter

public class NotFoundException extends CoworkingException {
    public NotFoundException(String message, int code) {
        super(HttpStatus.NOT_FOUND, message, code);
    }
}
