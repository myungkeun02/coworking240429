package org.myungkeun.coworking240429.exception.notFound;

public class NotFoundMemberException extends NotFoundException {

    public NotFoundMemberException() {
        super("존재하지않은 회원", 1001);
    }
}
