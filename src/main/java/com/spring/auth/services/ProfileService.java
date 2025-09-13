package com.spring.auth.services;

import com.spring.auth.io.ProfileRequest;
import com.spring.auth.io.ProfileResponse;
import org.springframework.stereotype.Service;

@Service
public interface ProfileService{
    ProfileResponse createProfile(ProfileRequest request);
}
