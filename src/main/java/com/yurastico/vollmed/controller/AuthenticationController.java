package com.yurastico.vollmed.controller;

import com.yurastico.vollmed.domain.user.AuthenticationData;
import com.yurastico.vollmed.domain.user.User;
import com.yurastico.vollmed.infra.security.TokenJWTData;
import com.yurastico.vollmed.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager manager;
    @Autowired
    private TokenService tokenService;
    @PostMapping
    public ResponseEntity login(@RequestBody @Valid AuthenticationData data) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(data.login(),data.password());
        var authentication = manager.authenticate(authenticationToken);
        var tokenJwt = tokenService.generateToken((User)authentication.getPrincipal());


        return ResponseEntity.ok(new TokenJWTData(tokenJwt));
    }

}
