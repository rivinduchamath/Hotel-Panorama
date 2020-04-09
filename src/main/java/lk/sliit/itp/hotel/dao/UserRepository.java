package lk.sliit.itp.hotel.dao;

import org.springframework.data.repository.CrudRepository;

import lk.sliit.itp.hotel.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public User findByUsernameAndPassword(String username, String password);
}
