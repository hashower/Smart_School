package cn.luxun.smartschool.controller;

import cn.luxun.smartschool.service.SystemService;
import cn.luxun.smartschool.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/sms/system")
public class SystemController {

	public final SystemService systemService;

	public SystemController(SystemService systemService) {
		this.systemService = systemService;
	}

	/**
	 * 获取验证码图片
	 *
	 * @param request
	 * @param response
	 */
	@GetMapping("/getVerifiCodeImage")
	public Result getVerifiCodeImage(HttpServletRequest request, HttpServletResponse response) {
		return systemService.getVerifiCodeImage(request, response);
	}
}
