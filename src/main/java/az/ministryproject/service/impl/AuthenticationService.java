package az.ministryproject.service.impl;


import az.ministryproject.dto.request.SignInRequest;
import az.ministryproject.dto.request.SignUpRequest;
import az.ministryproject.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signIn(SignInRequest request);
}