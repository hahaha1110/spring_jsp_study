package org.hhj.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	// @Component : 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시
	// Setter :  자동으로 생성자 생성
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
