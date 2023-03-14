package com.zensar.quiz.dao;

import com.zensar.quiz.to.Login;

public interface LoginDAO {

	public void add(Login login);

	public boolean authenticate(Login login);

	public void updateLog(String userName);

}
