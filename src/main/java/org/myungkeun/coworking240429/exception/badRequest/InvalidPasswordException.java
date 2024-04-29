package org.myungkeun.coworking240429.exception.badRequest;

public class InvalidPasswordException extends BadRequestException{
    public InvalidPasswordException() {
        super("비밀번호는 소문자, 숫자를 포함한 8자에서 20자로 구성해야합니다.", 1007);
    }
}
