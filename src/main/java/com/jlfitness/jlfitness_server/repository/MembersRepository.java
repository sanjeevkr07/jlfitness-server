package com.jlfitness.jlfitness_server.repository;

import com.jlfitness.jlfitness_server.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends JpaRepository<Members, Long> {
    // Custom query methods (if needed) can be added here
}

