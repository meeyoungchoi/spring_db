package com.spring.db.jdbc.score.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.db.jdbc.score.model.ScoreVO;
import com.spring.db.jdbc.score.repository.IScoreDAO;

//dao��ü�� �ʿ��ϴ�
//���� ������ ���񽺿��� �̷������
@Service
public class ScoreService implements IScoreService {
	//������ ���� ��ü �ڵ�����
	@Autowired
	private IScoreDAO dao;
	
	
	@Override
	public void insertScore(ScoreVO scores) {//��Ʈ�ѷ��� �θ���
		//��Ʈ�ѷ��κ��� �޾Ƽ� dao��
		scores.calcData();
		dao.insertScore(scores);
	}

	@Override
	public List<ScoreVO> selectAllScores() {
		//List<ScoreVO> list = dao.selectAllScores();
		return dao.selectAllScores();
	}

	@Override
	public void deleteScore(int stuNum) {
		dao.deleteScore(stuNum - 1);

		
	}

	@Override
	public ScoreVO selectOne(int stuNum) {
		ScoreVO score = dao.selectOne(stuNum - 1);
		System.out.println(score.toString());
		
		
		return score;
	}

}
