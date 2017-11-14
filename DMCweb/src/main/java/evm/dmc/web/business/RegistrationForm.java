package evm.dmc.web.business;

import org.hibernate.validator.constraints.*;

import evm.dmc.business.account.Account;


public class RegistrationForm {

	private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";
	private static final String EMAIL_MESSAGE = "{email.message}";

    @NotBlank(message = RegistrationForm.NOT_BLANK_MESSAGE)
	@Email(message = RegistrationForm.EMAIL_MESSAGE)
	private String email;

    @NotBlank(message = RegistrationForm.NOT_BLANK_MESSAGE)
	private String password;

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public Account createAccount() {
//        return new Account(getEmail(), getPassword(), "ROLE_USER");
//	}
}
