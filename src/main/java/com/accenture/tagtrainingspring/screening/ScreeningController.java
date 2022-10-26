package com.accenture.tagtrainingspring.screening;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.tagtrainingspring.services.ScreeningService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ScreeningController {
    @Autowired
    private ScreeningDaoImpl screeningDaoImpl ;

    @GetMapping("/screening/{patientID}")
    public Screening findScreening(@PathVariable("patientID") int patientId){
        return screeningDaoImpl.getScreening(patientId) ;
    }

    @GetMapping("/screenings")
    public List<Screening> getScreenings(){
        return screeningDaoImpl.allScreenings();
    }
    @PostMapping("/screenings/update")
    public void updateScreening(@RequestBody Screening screening){
        screeningDaoImpl.update(screening);
    }
}
