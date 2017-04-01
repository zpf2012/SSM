package com.hand.dao;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.hand.dto.Good;

@Component
public interface GoodMapper {

	Good getGoodById(long id) throws IOException;
}
