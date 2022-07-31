package com.cos.blog.service;

import com.cos.blog.domain.user.User;
import com.cos.blog.domain.user.UserDao;
import com.cos.blog.domain.user.dto.JoinReqDto;
import com.cos.blog.domain.user.dto.LoginReqDto;
import com.cos.blog.domain.user.dto.UpdateReqDto;

public class UserService {

	private UserDao userDao;

	public UserService() {

		userDao = new UserDao();

	}

	// 회원가입
	public int 회원가입(JoinReqDto dto) {

		int result = userDao.save(dto);

		return result;

	}

	// 로그인
	public User 로그인(LoginReqDto dto) {

		return null;

	}

	// 회원수정
	public int 회원수정(UpdateReqDto dto) {

		return -1;

	}

	// 유저네임 중복체크
	public int 유저네임중복체크(String username) {

		int result = userDao.findByUsername(username);

		return result;

	}

}
