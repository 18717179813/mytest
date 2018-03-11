package cn.itcast.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

/**
 * NoticeController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018骞�3鏈�7鏃� 涓嬪崍7:04:03
 * @version 1.0
 */
@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	/** 鍒嗛〉鏌ヨ鍏憡 */
	@PostMapping("/findByPage")
	public Map<String, Object> findByPage(@RequestParam("page")Integer page,
			@RequestParam("rows")Integer rows){
//		1111111111111111111111111
		return noticeService.findByPage(page, rows);
	}
}
