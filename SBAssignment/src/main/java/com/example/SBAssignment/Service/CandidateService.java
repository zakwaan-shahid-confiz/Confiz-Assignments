package com.example.SBAssignment.Service;

import com.example.SBAssignment.Model.Candidate;
import com.example.SBAssignment.Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> getAllCandidates()
    {
        List<Candidate> candidateList = new ArrayList<>();
        candidateRepository.findAll().forEach(candidateList::add);
        return candidateList;
    }

    public Optional<Candidate> getCandidate(int id)
    {
        return candidateRepository.findById(id);
    }

    public void addCandidate(Candidate candidate)
    {
        candidateRepository.save(candidate);
    }

    public void updateCandidate(Candidate candidate)
    {
        candidateRepository.save(candidate);
    }

    public void deleteCandidate(int id)
    {
        candidateRepository.deleteById(id);
    }

}
