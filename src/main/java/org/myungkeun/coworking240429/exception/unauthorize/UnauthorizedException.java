package org.myungkeun.coworking240429.exception.unauthorize;

import lombok.Getter;
import org.myungkeun.coworking240429.exception.CoworkingException;
import org.springframework.http.HttpStatus;

@Getter

public class UnauthorizedException extends CoworkingException {
    public UnauthorizedException(String message, int code) {
        super(HttpStatus.UNAUTHORIZED, message, code);
    }
}
