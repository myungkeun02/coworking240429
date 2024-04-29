package org.myungkeun.coworking240429.exception.badRequest;

public class InvalidNicknameException extends BadRequestException {
    public InvalidNicknameException() {
        super("닉네임은 영어 한글로만 구성된 2자에서 6자사이여야만합니다.", 1009);
    }
}
