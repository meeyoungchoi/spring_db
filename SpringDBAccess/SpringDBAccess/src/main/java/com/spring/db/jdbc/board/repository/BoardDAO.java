package com.spring.db.jdbc.board.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.db.jdbc.board.model.BoardVO;

@Repository
public class BoardDAO implements IBoardDAO {
	
	@Override
	public List<BoardVO> getArticles() {
		return null;
	}

	@Override
	public void insertArticle(BoardVO article) {

	}

	@Override
	public void deleteArticle(int index) {

	}

	@Override
	public BoardVO getContent(int index) {
		return null;
	}

	@Override
	public void modifyArticle(BoardVO article, int index) {

	}

}












