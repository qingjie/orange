package com.qingjie.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingjie.api.auth.model.AuthRequest;
import com.qingjie.model.entity.Admin;
import com.qingjie.model.response.Response;
import com.qingjie.repository.AdminRepository;
import com.qingjie.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

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
		// TODO Auto-generated method stub
		return null;
	}

}
