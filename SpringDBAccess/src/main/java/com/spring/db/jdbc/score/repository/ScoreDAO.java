package com.spring.db.jdbc.score.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.db.jdbc.score.model.ScoreVO;
//마지막으로 디비에 넣기전에 처리
//인터페이스에서 작성된 추상메서드를 강제 오버라이딩
//빈등록을 위해
@Repository
public class ScoreDAO implements IScoreDAO {

	//import: ctrl shift o
	//리스트 안쓰고 디비와 연동처리


	@Override
	public void insertScore(ScoreVO scores) {//컨트롤러가 서비스한테 시켜서 서비스가 보내줘야 한다

	}

	@Override
	public List<ScoreVO> selectAllScores() {
		return null;
	}

	@Override
	public void deleteScore(int stuNum) {
		

	}

	@Override
	public ScoreVO selectOne(int stuNum) {
		return null;
	}

}
