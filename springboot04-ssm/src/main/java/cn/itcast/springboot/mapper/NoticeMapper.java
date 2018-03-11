package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.pojo.Notice;

/**
 * NoticeMapper
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年3月7日 下午7:03:11
 * @version 1.0
 */
@Mapper
public interface NoticeMapper {
	
	@Select("select * from notice")
	List<Notice> findAll();
	
	Long count();

	List<Notice> findByPage(@Param("page")Integer page,
			@Param("rows") Integer rows);
}
