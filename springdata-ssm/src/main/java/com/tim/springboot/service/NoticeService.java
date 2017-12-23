package com.tim.springboot.service;

import java.util.List;
import java.util.Map;

import com.tim.springboot.pojo.Notice;

public interface NoticeService {

	List<Notice> findAll();

	Map<String, Object> findByPage(Integer page, Integer rows);

}
