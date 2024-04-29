package org.myungkeun.coworking240429.controller;

import lombok.RequiredArgsConstructor;
import org.myungkeun.coworking240429.dto.response.BaseResponse;
import org.myungkeun.coworking240429.dto.request.MemberSignupRequest;
import org.myungkeun.coworking240429.dto.response.IsDuplicateEmailResponse;
import org.myungkeun.coworking240429.dto.response.IsDuplicateNicknameResponse;
import org.myungkeun.coworking240429.dto.response.MemberSignupResponse;
import org.myungkeun.coworking240429.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/member")
@RequiredArgsConstructor

public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<BaseResponse<MemberSignupResponse>> signup(
            @RequestBody MemberSignupRequest request
    ) {
        MemberSignupResponse response = memberService.signup(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(BaseResponse
                        .<MemberSignupResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .data(response)
                        .build());
    }

    @GetMapping("/check-duplicate/email")
    public ResponseEntity<BaseResponse<IsDuplicateEmailResponse>> checkDuplicateEmail(
            @RequestParam String email
    ) {
        IsDuplicateEmailResponse response = memberService.isDuplicateEmail(email);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse
                        .<IsDuplicateEmailResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .data(response)
                        .build());
    }

    @GetMapping("/check-duplicate/nickname")
    public ResponseEntity<BaseResponse<IsDuplicateNicknameResponse>> checkDuplicateNickname(
            @RequestParam String nickname
    ) {
        IsDuplicateNicknameResponse response = memberService.isDuplicateNickname(nickname);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse
                        .<IsDuplicateNicknameResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .data(response)
                        .build());
    }
}
