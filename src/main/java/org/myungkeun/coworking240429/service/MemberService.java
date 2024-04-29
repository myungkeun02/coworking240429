package org.myungkeun.coworking240429.service;

import org.myungkeun.coworking240429.dto.request.MemberSignupRequest;
import org.myungkeun.coworking240429.dto.response.MemberSignupResponse;

public interface MemberService {
    MemberSignupResponse signup(MemberSignupRequest request);
}
