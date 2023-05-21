package com.cnu.real_coding.ad.controller;

import com.cnu.real_coding.ad.service.AdService;
import com.cnu.real_coding.common.entity.Advertisement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
public class AdController {
    private final AdService adService;

    @GetMapping
    public Advertisement getAd() { return adService.getAd(); }
}
