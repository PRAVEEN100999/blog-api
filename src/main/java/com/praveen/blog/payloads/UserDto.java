package com.praveen.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min = 4,message = " user name must be greater then 4 charater")
	private String name;
	
	@Email(message = " yout given email is not valid")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 10,message = " password must be min of 3 char and max of 10 char")
	private String password;
	
	@NotEmpty
	private String about;

}
