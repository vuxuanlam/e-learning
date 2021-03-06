package framgiavn.project01.web.business;

import framgiavn.project01.web.model.User;

public interface UserBusiness {
	public User findByUserId(Integer user_id);

	public User findByUsername(String username);

	public User checkLogin(User user);

	public boolean signup(User user);
}