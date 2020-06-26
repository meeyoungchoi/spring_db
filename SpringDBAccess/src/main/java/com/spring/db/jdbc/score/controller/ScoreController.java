package com.spring.db.jdbc.score.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.db.jdbc.score.model.ScoreVO;
import com.spring.db.jdbc.score.service.IScoreService;

@Controller
@RequestMapping("/score")
public class ScoreController {
	
	//������ @Autowired�� ���� ����
	@Autowired
	private IScoreService service;
	
	//���� ��� ȭ���� �����ִ� ó���� �ϴ� ��û�޼���
	@GetMapping("/register")
	public String register() {
		System.out.println("/score/register: GET");
		return "score/write-form";
	}
	
	//��������� ó���ϴ� ��û �޼���
	@PostMapping("/register")
	public String register(ScoreVO scores) {
		//�ʱ�ȭ�� �ϰڴ�
		System.out.println("/score/register: POST");
		System.out.println("controller param: " + scores);
		
		//������ ó���Ҽ��ִ� ���񽺸� ����ڴ�
		//���� ���񽺰�ü����
		//scores.calcData();
		//���񽺸� �ҷ��� �Ѵ�
		//���� ��ü �ʿ�
		service.insertScore(scores);
		
		return "score/write-result";
	}
	

	//���� ��ü ��ȸ�� ó���ϴ� ��û �޼���
	@GetMapping("/list")
	public void list(Model model) {
		System.out.println("/score/list: GET");
		
		//���񽺰� dao���� ���� ��û
		//List<ScoreVO> list = service.selectAllScores();
		
		//model�� ����ؼ� list.jsp�� �Ѱ��ش�
		//model.addAttribute("slist", list);
		//���
		model.addAttribute("slist", service.selectAllScores());
		
	}
	
	@GetMapping("/delete")
	public String delete( int stuNum, RedirectAttributes ra) {//dao���� �����϶�� �˷��ֱ�����(@RequestParam�Ķ���Ϳ� �Ķ���Ͱ��� ���� �������� ������ @RequestParam�� �Ƚᵵ�ȴ�)
		
		System.out.println("������ �й�: " + stuNum);
		
		//����ó�� �Ϸ� �� list��ó�� ���� �ֵ��� ó��
		 service.deleteScore(stuNum);
		 //�����̷�Ʈ ��û��  ���� ���� ����
		ra.addFlashAttribute("msg", "delSuccess");
		return "redirect:/score/list";
	}
	
	@GetMapping("/search")
	public void search() {
		System.out.println("/score/search: GET");
	}
	
	
//	@GetMapping("/selectOne")
//	public String find(int stuNum, Model model, RedirectAttributes ra) {
//		System.out.println("��ȸ�� �й�: " + stuNum);
//		
//		if (service.selectOne(stuNum).equals(null)) {
//			ra.addFlashAttribute("msg", "selectFail");
//			System.out.println("�������� �ʴ� �й��Դϴ�.");
//			return "score/search-result";
//		}
//		
//		
//		model.addAttribute("stuNum" , stuNum);
//		model.addAttribute("stuOne", service.selectOne(stuNum));
//		
//		return "score/search-result";
//	}
//	
	
	@GetMapping("/selectOne")
	public String selectOne(int stuNum , Model model, RedirectAttributes ra) {
		
		System.out.println("/score/selectOne: GET");
		
		// �й��� �߸� ���ð�� ��� ��� �л��� ������ ���� �ҷ��´�
		List<ScoreVO> scores = service.selectAllScores();
		
		//�߸� �Էµ� �й��� ���
		if (scores.size() < stuNum) {
			ra.addFlashAttribute("msg", "�й� ������ �����ϴ�.");
			return "redirect:/score/search";
		} else {
			model.addAttribute("stu",service.selectOne(stuNum));
			return "score/search-result";
		}
		
	
	}
	
	
}
