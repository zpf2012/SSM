package com.hand.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.GoodMapper;
import com.hand.dto.Good;
import com.hand.service.IGoodService;

@Service
public class GoodServiceImpl implements IGoodService {
	
	@Autowired
	private GoodMapper goodMapper;

	public Good getGoodByPremaryKey(long id) throws IOException {
		System.out.println("查询开始。。。");
		return goodMapper.getGoodById(id);
	}

}
