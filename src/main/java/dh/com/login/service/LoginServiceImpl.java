package dh.com.login.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dh.com.login.serviceImpl.LoginDaoInter;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDaoInter dao;
	
	public ArrayList<LoginVO> userList() {		
		ArrayList<LoginVO> list = new ArrayList<LoginVO>();
		list = dao.userList();
		return list;
	}
}
