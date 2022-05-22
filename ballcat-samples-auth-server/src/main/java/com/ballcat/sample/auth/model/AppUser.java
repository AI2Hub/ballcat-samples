package com.ballcat.sample.auth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hccake
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

	private Integer userId;

	private String username;

	private String password;

	private String nickname;

	private String phoneNumber;

}
