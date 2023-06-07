package ChamStudy.Dto;

import com.querydsl.core.annotations.QueryProjection;

import ChamStudy.Entity.ClassInfo;
import ChamStudy.Entity.UserInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyClassLearningDto {
	private Long id;

	private String reg_date;

	private UserInfo userInfo;

	private ClassInfo classInfo;

	private String imgUrl;

	private String name;
	
	private Long process;

	@QueryProjection
	public MyClassLearningDto(Long id, String reg_date, UserInfo userInfo, ClassInfo classInfo, String imgUrl,
			String name, Long process) {
		this.id = id;
		this.reg_date = reg_date;
		this.userInfo = userInfo;
		this.classInfo = classInfo;
		this.imgUrl = imgUrl;
		this.name = name;
		this.process = process;
	}
}
