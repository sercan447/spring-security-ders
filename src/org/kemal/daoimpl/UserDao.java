package org.kemal.daoimpl;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.kemal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

	
	private DataSource dataSource;
	private NamedParameterJdbcTemplate template;
	
	@Autowired
	private PasswordEncoder passwordEncode;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}
	
	
	public void create(User user)
	{
		Map<String,Object> params = new HashMap<>();
							params.put("username",user.getUsername());
							params.put("password", passwordEncode.encode(user.getPassword()));
							params.put("email", user.getEmail());
							params.put("authority",user.getAuthority());
							params.put("enabled", user.isEnabled());
								
			template.update("INSERT INTO users(username,password,email,enabled) VALUES (:username,:password,:email,:enabled)" ,params);
			template.update("INSERT INTO authorities(username,authority) VALUES (:username,:authority)", params);
	}//CREATE FUNC
	
	
	
	
	
	
}
