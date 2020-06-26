package com.spring.db.jdbc.score.service;

import java.util.List;

import com.spring.db.jdbc.score.model.ScoreVO;

public interface IScoreService  {

	//���� ctrl a + ctrl i
	//���� ��ϱ��
	void insertScore(ScoreVO scores);

	//���� ��ü ��ȸ ���
	List<ScoreVO> selectAllScores();

	//���� ���� ���
	void deleteScore(int stuNum);//����� ����


	//���� ���� ��ȸ ���
	ScoreVO selectOne(int stuNum);



}
