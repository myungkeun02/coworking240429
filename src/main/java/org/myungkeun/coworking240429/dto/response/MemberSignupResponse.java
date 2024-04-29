package org.myungkeun.coworking240429.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class MemberSignupResponse {
    private Long id;
    private String email;
    private String nickname;
}
