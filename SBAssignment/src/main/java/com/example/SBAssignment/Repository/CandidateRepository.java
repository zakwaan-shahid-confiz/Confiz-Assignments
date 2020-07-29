package com.example.SBAssignment.Repository;

import com.example.SBAssignment.Model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateRepository extends MongoRepository<Candidate, Integer> {

}
