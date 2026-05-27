package com.hildawong.tasktracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hildawong.tasktracker.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
