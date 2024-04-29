package org.myungkeun.coworking240429.exception.unauthorize;


public class AccessTokenExpiredException extends UnauthorizedException {
    public AccessTokenExpiredException() {
        super("AccessToken 유효기간이 만료되었습니다.", 1014);
    }
}
