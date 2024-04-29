package org.myungkeun.coworking240429.dto.response;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class BaseResponse<T> {
    private long statusCode;
    private T data;
}
