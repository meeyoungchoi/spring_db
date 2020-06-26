package com.spring.db.jdbc.score.repository;

import java.util.List;

import com.spring.db.jdbc.score.model.ScoreVO;

//I�� ���̴� ���� ����
//���� �����Ҷ� � ����� ������ ���ΰ�
//�߸��� ���̸� �Է¹��������� ������ ���� �ȴ�
//���� ������ �ݿ��� �Ǿ���Ѵ�
public interface IScoreDAO {
	//���� ��ϱ��
   void insertScore(ScoreVO scores);
	
	//���� ��ü ��ȸ ���
   List<ScoreVO> selectAllScores();
	
	//���� ���� ���
   void deleteScore(int stuNum);//����� ����
	
	
	//���� ���� ��ȸ ���
   ScoreVO selectOne(int stuNum);
}
