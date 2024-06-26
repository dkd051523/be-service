package com.example.shose.server.service;

import com.example.shose.server.infrastructure.sercurity.auth.JwtAuhenticationResponse;
import com.example.shose.server.infrastructure.sercurity.auth.RefreshTokenRequets;
import com.example.shose.server.infrastructure.sercurity.auth.SignUpRequets;
import com.example.shose.server.infrastructure.sercurity.auth.SigninRequest;

public interface AuthenticationService {

    String signUp (SignUpRequets signUpRequets);

    JwtAuhenticationResponse singIn(SigninRequest request);
    JwtAuhenticationResponse refreshToken(RefreshTokenRequets refresh);
}
