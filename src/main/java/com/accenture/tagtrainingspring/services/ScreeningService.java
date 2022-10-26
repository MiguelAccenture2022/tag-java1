package com.accenture.tagtrainingspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
@Service
public class ScreeningService {
//    @Autowired


//    public ScreeningService(ScreeningDatabase database){
 //        this.screeningDatabase = database;
//     }

    public boolean isScreening(Screening screening, Patient patient){
        if (patient.getId() == screening.getId())
            return true ;
        else 
            return false ;
    }
    
    // public Screening match(String name){ 
    //         for (int i=0; i<screeningDatabase.allScreenings().size(); i++){
    //             if (screeningDatabase.allScreenings().get(i).getPatientId().getName()==name)
    //                 return screeningDatabase.allScreenings().get(i);
    //         }
    //         return null;
    // }

}
