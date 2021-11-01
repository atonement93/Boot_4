package com.iu.b4.board.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
//@Repository 생략 가능
public interface NoticeDAO {
	
	public List<NoticeVO> getList() throws Exception;

}
