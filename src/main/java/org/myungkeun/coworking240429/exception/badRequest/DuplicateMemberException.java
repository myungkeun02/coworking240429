package org.myungkeun.coworking240429.exception.badRequest;

import lombok.Getter;

@Getter

public class DuplicateMemberException extends BadRequestException {
    public DuplicateMemberException() {
        super("이미 존재하는 회원 입니다.", 1000);
    }
}
