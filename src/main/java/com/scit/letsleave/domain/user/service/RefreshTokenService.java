// TODO 아직 리프레쉬 토큰 구현 안함
// RefreshTokenService는 리프레쉬토큰을 서버에서 관리할때 필요.. 근데..이걸 서버에서 할거야?? 할 수 있음?

// 토큰 > 이메일 x, id o

// package com.scit.letsleave.domain.user.service;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.stereotype.Service;

// import com.scit.letsleave.global.jwt.JwtUtil;

// @Service
// public class RefreshTokenService {

//     private final Map<String, String> refreshTokens = new HashMap<>(); // 간단한 메모리 저장소 (DB로 대체 가능)

//     private final JwtUtil jwtUtil;

//     public RefreshTokenService(JwtUtil jwtUtil) {
//         this.jwtUtil = jwtUtil;
//     }

//     public String createRefreshToken(String email) {
//         String refreshToken = jwtUtil.generateRefreshToken(email);
//         refreshTokens.put(email, refreshToken);
//         return refreshToken;
//     }

//     public boolean validateRefreshToken(String token) {
//         return refreshTokens.containsValue(token);
//     }

//     public String getEmailFromRefreshToken(String token) {
//         return refreshTokens.entrySet().stream()
//                 .filter(entry -> entry.getValue().equals(token))
//                 .map(Map.Entry::getKey)
//                 .findFirst()
//                 .orElse(null);
//     }
// }
