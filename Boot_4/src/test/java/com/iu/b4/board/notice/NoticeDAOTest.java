package com.iu.b4.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class NoticeDAOTest {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	void getListTest() throws Exception{
		List<NoticeVO> ar = noticeDAO.getList();
		assertNotEquals(0, ar.size());
	}

}
