package com.hand.dao;

import org.springframework.stereotype.Component;

import com.hand.dto.Good;

@Component
public interface GoodMapper {

	Good getGoodById(long id);
}
