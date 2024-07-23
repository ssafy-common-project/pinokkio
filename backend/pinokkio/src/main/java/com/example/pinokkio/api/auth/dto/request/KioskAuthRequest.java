package com.example.pinokkio.api.auth.dto.request;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
public class KioskAuthRequest {
    private String posId;
    private String username;
    private String password;
}
