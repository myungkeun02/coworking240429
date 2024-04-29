package org.myungkeun.coworking240429.exception.badRequest;

public class DuplicateMemberException extends BadRequestException {
    public DuplicateMemberException() {
        super("이미 존재하는 회원 입니다.", 1000);
    }
}
