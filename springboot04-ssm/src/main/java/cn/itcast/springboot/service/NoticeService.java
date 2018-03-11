package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.pojo.Notice;

/**
 * NoticeService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年3月7日 下午7:03:25
 * @version 1.0
 */
public interface NoticeService {
	
	List<Notice> findAll();
	/**
	 * 分页查询公告
	 * @param page
	 * @param rows
	 * @return
	 */
	Map<String, Object> findByPage(Integer page, Integer rows);
}
