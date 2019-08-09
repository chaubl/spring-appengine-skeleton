package com.fcs.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fcs.models.Project;

public interface ProjectRepository extends CrudRepository<Project, String> {

}