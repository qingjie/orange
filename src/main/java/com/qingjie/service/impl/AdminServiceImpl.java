package com.qingjie.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingjie.api.auth.model.AuthRequest;
import com.qingjie.model.entity.Admin;
import com.qingjie.model.response.Response;
import com.qingjie.repository.AdminRepository;
import com.qingjie.service.AdminService;
import com.qingjie.util.PasswordUtils;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin getUser(String username) {

		return adminRepository.findByUsername(username);

	}

	@Override
	public Response logout(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public Response login(AuthRequest authenticationRequest) {
		Response response = null;
		Admin admin = null;
		try {
			admin = adminRepository.findByUsername(authenticationRequest.getUsername());
			if (admin != null) {
				if (PasswordUtils.checkPassword(authenticationRequest.getPassword(), admin.getPassword())) {
					response = new Response(Response.ResultCode.SUCCESS, admin);
				} else {
					response = new Response(Response.ResultCode.INVALID_PASSWORD, null, "Invalid password");
				}
			} else {
				response = new Response(Response.ResultCode.INVALID_USERNAME, null, "Invalid username");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in AdminServiceImpl, login(), e: " + e.toString());
			
			response = new Response(Response.ResultCode.ERROR, null, e.getMessage());
		}

		return response;
	}

}
