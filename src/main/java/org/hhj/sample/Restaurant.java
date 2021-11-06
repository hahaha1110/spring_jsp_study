package org.hhj.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	// @Component : �ش� Ŭ������ ���������� �����ؾ� �ϴ� ������� ǥ��
	// Setter :  �ڵ����� ������ ����
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
