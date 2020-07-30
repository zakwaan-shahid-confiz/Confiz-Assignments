package com.example.SBAssignment.Controller;

import com.example.SBAssignment.Model.Candidate;
import com.example.SBAssignment.Service.CandidateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CandidateController {

    Logger logger = LoggerFactory.getLogger(CandidateController.class);

    @Autowired
    private CandidateService candidateService;

    @RequestMapping("/candidates")
    public List<Candidate> getAll()
    {
       return candidateService.getAllCandidates();
    }

    @RequestMapping("/candidates/{id}")
    public Optional<Candidate> getByID(@PathVariable int id){
        return candidateService.getCandidate(id);
    }

    @PostMapping(value="/candidates")
    public void add(@RequestBody Candidate candidate,@Value("${sbpg.init.logging}") String logging)
    {
        String loggingMessage = "Candidate Added with ID : %d";

        if(logging.equals("DEBUG"))
            logger.debug(loggingMessage,candidate.getId());
        else if(logging.equals("INFO"))
            logger.info(loggingMessage,candidate.getId());

        candidateService.addCandidate(candidate);
    }

    @PutMapping(value="/candidates/{id}")
    public void update(@RequestBody Candidate candidate, @PathVariable int id,@Value("${sbpg.init.logging}") String logging){

        String loggingMessage = "Candidate Updated with ID : %d";
        candidateService.updateCandidate(candidate);

        if(logging.equals("DEBUG"))
            logger.debug(loggingMessage,id);
        else if(logging.equals("INFO"))
            logger.info(loggingMessage,id);
    }

    @DeleteMapping(value="/candidates/{id}")
    public void delete(@PathVariable int id){
        candidateService.deleteCandidate(id);
    }

}
