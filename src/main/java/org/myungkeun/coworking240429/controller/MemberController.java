package org.myungkeun.coworking240429.controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.myungkeun.coworking240429.dto.request.MemberSignupRequest;
import org.myungkeun.coworking240429.dto.response.IsDuplicateEmailResponse;
import org.myungkeun.coworking240429.dto.response.IsDuplicateNicknameResponse;
import org.myungkeun.coworking240429.dto.response.MemberSignupResponse;
import org.myungkeun.coworking240429.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/check-duplicate/email")
    public ResponseEntity<IsDuplicateEmailResponse> checkDuplicateEmail(
            @RequestParam String email
    ) {
        IsDuplicateEmailResponse response = memberService.isDuplicateEmail(email);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/check-duplicate/nickname")
    public ResponseEntity<IsDuplicateNicknameResponse> checkDuplicateNickname(
            @RequestParam String nickname
    ) {
        IsDuplicateNicknameResponse response = memberService.isDuplicateNickname(nickname);
        return ResponseEntity.ok(response);
    }
}
