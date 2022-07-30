package com.cos.blog.domain.user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cos.blog.config.DB;
import com.cos.blog.domain.user.dto.JoinReqDto;

public class UserDao {

	// 회원가입
	public int save(JoinReqDto dto) {

		String sql = "insert into user (username, password, email, address, userRole, createDate) values (?, ?, ?, ?, 'USER', now())";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;

		try {

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getUsername());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddress());

			System.out.println("pstmt: " + pstmt);

			int result = pstmt.executeUpdate();
			return result;

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			DB.close(conn, pstmt);

		}

		return -1;

	}

	// 회원수정
	public void update() {

	}

	// 아이디 중복 체크
	public void usernmaeCheck() {

	}

	// 회원정보 보기
	public void findById() {

	}

}
