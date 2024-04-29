package org.myungkeun.coworking240429.controller;

import lombok.RequiredArgsConstructor;
import org.myungkeun.coworking240429.dto.request.MemberSignupRequest;
import org.myungkeun.coworking240429.dto.response.MemberSignupResponse;
import org.myungkeun.coworking240429.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/member")
@RequiredArgsConstructor

public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<MemberSignupResponse> signup(
            @RequestBody MemberSignupRequest request
    ) {
        MemberSignupResponse response = memberService.signup(request);
        return ResponseEntity.ok(response);
    }
}
