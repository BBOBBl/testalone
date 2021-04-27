package test.my.mvc;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class BoardMybatisDAO {
	
	@Autowired
	SqlSession session;	//mybatis.jar
	
	public List<BoardDTO> getAllBoard(){
		List<BoardDTO> list = session.selectList("board.all");
		return list;
	}
	
	public List<BoardDTO> getDetailBoard(){
		List<BoardDTO> list = session.selectList("board.detail");
		return list;
	}
}
