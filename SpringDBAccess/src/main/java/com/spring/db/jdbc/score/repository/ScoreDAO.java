package com.spring.db.jdbc.score.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.db.jdbc.score.model.ScoreVO;
//���������� ��� �ֱ����� ó��
//�������̽����� �ۼ��� �߻�޼��带 ���� �������̵�
//������ ����
@Repository
public class ScoreDAO implements IScoreDAO {

	//import: ctrl shift o
	//����Ʈ �Ⱦ��� ���� ����ó��


	@Override
	public void insertScore(ScoreVO scores) {//��Ʈ�ѷ��� �������� ���Ѽ� ���񽺰� ������� �Ѵ�

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
