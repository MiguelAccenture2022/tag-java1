package com.accenture.tagtrainingspring.screening;

import java.util.List;

public interface ScreeningDao {
    Screening getScreening(int patientId) ;

    List<Screening> allScreenings();
}
