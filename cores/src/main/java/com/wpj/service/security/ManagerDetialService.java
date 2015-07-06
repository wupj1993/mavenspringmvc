/*
 * Copyright (c) 2015 /5 /12
 * 	      7 :45 : 28
 *               By锛歸upeiji
 *               Q  Q锛?757671834
 * 	      It is not easy to meet each other in such a big world
 */

package com.wpj.service.security;

import com.wpj.service.serviceImpl.UserServiceImp;
import com.wpj.work.entity.T_user;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("managerDetialService")
public class ManagerDetialService implements UserDetailsService {
	private String TAG="ManagerDetialService";
	@Resource
	private UserServiceImp userServiceImp;//与数据库操作的
	@Resource
	MyUserDetails userDetails=new MyUserDetails();
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
			T_user t_user= userServiceImp.selectByUserName(username);
		if(t_user!=null){
				//查到这个用户的话，进行认证吧
			System.out.println(TAG+"管理不空"+t_user.toString());
				userDetails.setPassword(t_user.getUserPassword());
				userDetails.setUsername(t_user.getUserName());
				userDetails.setEnabled(true);
				String role[]=t_user.getUserRole().split(",");
				List<GrantedAuthority> authority=new ArrayList<GrantedAuthority>();
				for(int i=0;i<role.length;i++){
					authority.add(new SimpleGrantedAuthority(role[i]));
				}
				userDetails.setAuthorities(authority);

			}

			return  userDetails;
	}
}
