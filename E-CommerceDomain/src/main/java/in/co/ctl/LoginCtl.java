package in.co.ctl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.common.BaseCtl;
import in.co.common.ORSResponse;
import in.co.config.JwtTokenUtil;
import in.co.dto.UserDTO;
import in.co.form.LoginForm;
import in.co.service.UserServiceInt;

@RestController
@RequestMapping(value = "Auth")
public class LoginCtl extends BaseCtl<LoginForm, UserDTO, UserServiceInt> {

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtService;

	@PostMapping("login")
	public ORSResponse Authenticate(@RequestBody @Valid LoginForm form, BindingResult bindingResult) {

		ORSResponse res = validate(bindingResult);
		if (!res.isSuccess()) {
			return res;
		}
		UserDTO dto = baseService.authenticate(form.getLoginId(), form.getPassword());
		if (dto == null) {
			res.setSuccess(false);

		} else {
			res.setSuccess(true);
			res.addData(dto);

		}

		final UserDetails userDetails = jwtService.loadUserByUsername(form.getLoginId());
		final String token = jwtTokenUtil.generateToken(userDetails);
		res.addResult("token", token);
		return res;

	}

}
