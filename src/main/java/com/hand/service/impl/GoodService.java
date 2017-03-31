package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.GoodMapper;
import com.hand.dto.Good;
import com.hand.service.IGoodService;

@Service
public class GoodService implements IGoodService {
	
	@Autowired
	private GoodMapper goodMapper;

	public Good getGoodByPremaryKey(long id) {
		
		return goodMapper.getGoodById(id);
	}

}
