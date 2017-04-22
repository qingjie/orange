package com.qingjie.service;

import com.qingjie.api.auth.model.AuthRequest;
import com.qingjie.model.entity.Admin;
import com.qingjie.model.response.Response;

public interface AdminService {

	Admin getUser(String username);

	Response login(AuthRequest authenticationRequest);

	Response logout(String sessionId);

	void save(Admin admin);
}
