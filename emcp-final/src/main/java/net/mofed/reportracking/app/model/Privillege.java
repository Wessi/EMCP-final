package net.mofed.reportracking.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Table(name = "users_roles")

public class Privillege {

	  @ManyToMany(mappedBy="user")
	  private Long user_id;
	  
	  @ManyToMany(mappedBy="role")
	  private Integer role_id;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	  
	  
	  
  }
