package cn.luxun.smartschool.controller;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.service.SystemService;
import cn.luxun.smartschool.utils.Result;
import org.springframework.web.bind.annotation.*;

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

	/**
	 * 账号登陆
	 *
	 * @param loginForm
	 * @param request
	 * @return
	 */
	@PostMapping("/login")
	public Result loginByLogimForm(@RequestBody LoginDto loginForm, HttpServletRequest request) {
		return systemService.loginByLogimForm(loginForm, request);
	}

	/**
	 * 获取登陆用户信息
	 *
	 * @param token
	 * @return
	 */
	@GetMapping("/getInfo")
	public Result getInfoByToken(@RequestHeader String token) {
		return systemService.getInfoByToken(token);

	}

}
