package com.hand.service;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.hand.dto.Good;

@Component
public interface IGoodService {
	
	Good getGoodByPremaryKey(long id) throws IOException;
}
