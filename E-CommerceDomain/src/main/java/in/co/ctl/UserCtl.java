package in.co.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.common.BaseCtl;
import in.co.dto.UserDTO;
import in.co.form.UserForm;
import in.co.service.UserServiceInt;

@RestController
@RequestMapping(value = "User")
public class UserCtl extends BaseCtl<UserForm, UserDTO, UserServiceInt> {

}
