package com.hildawong.tasktracker_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hildawong.tasktracker_api.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
