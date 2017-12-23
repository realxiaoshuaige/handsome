package com.tim.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tim.springboot.mapper.NoticeMapper;
import com.tim.springboot.pojo.Notice;
import com.tim.springboot.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Map<String,Object> data =new HashMap<>();
		
		//统计查询
		Long count = noticeMapper.count();
		data.put("total", count);
		
		//分页查询
		List<Notice> notices=noticeMapper.findByPage((page-1)*rows,rows);
		data.put("rows", notices);
		return data;
	}

}
