package org.myungkeun.coworking240429.exception.badRequest;

public class PasswordMismatchException extends BadRequestException {

    public PasswordMismatchException() {
        super("비밀번호가 올바르지 않습니다.", 1003);
    }
}
