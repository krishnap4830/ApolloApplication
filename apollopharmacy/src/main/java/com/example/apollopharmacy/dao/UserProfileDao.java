package com.example.apollopharmacy.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.apollopharmacy.bean.Usercredentials;
import com.example.apollopharmacy.bean.Userprofile;

@Repository
public interface UserProfileDao extends CrudRepository<Userprofile, Integer>{

//	Optional<Userprofile> findById(Usercredentials id);


}
