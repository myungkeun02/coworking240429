package org.myungkeun.coworking240429.exception.unauthorize;

public class InvalidAccessTokenException extends UnauthorizedException{
    public InvalidAccessTokenException() {
        super("올바르지 않은 accessToken 입니다. 다시 로그인 바랍니다.", 1015);
    }
}
