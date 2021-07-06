package com.mocadev.thymeleafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-07-07
 **/
@Controller
@RequestMapping("/template")
public class TemplateController {

	@GetMapping("/fragment")
	public String template() {
		return "template/fragment/fragmentMain";
	}

	@GetMapping("/layout")
	public String layout() {
		return "template/layout/layoutMain";
	}

	@GetMapping("/layoutExtend")
	public String layoutExtends() {
		return "template/layoutExtend/layoutExtendMain";
	}

}
