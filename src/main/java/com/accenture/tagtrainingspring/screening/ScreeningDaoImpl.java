package com.accenture.tagtrainingspring.screening;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class ScreeningDaoImpl implements ScreeningDao{
    @Autowired
    private JdbcTemplate jdbcTemplate ;


    public Screening getScreening(int patientId){

        Screening screening = new Screening();
        try {
            String sql1 ="select * from screening_results where id = ?";
            screening = jdbcTemplate.queryForObject(sql1, new Object[]{patientId}, new com.accenture.tagtrainingspring.screening.ScreeningRowMapper());
            return screening;
        } catch (Exception e) {
            log.info("...");
            // System.out.println(
            //     "ERROR: " + e.getMessage()
            // );
            return null ;
        }


    }

    @Override
    public List<Screening> allScreenings() {
        String sql2 ="select * from screening_results";
        List<Screening> screenings = jdbcTemplate.query(sql2, new com.accenture.tagtrainingspring.screening.ScreeningRowMapper());
        return screenings;
    }

    public int update(Screening screening) {
        String sql3 = "INSERT INTO SCREENING_RESULTS  (ID, DIAGNOSIS, symmetry_mean , group_id) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql3, screening.getId(),screening.getDiagnosis(),screening.getSymmetryMean(),screening.getGroupId());
    }
    
}
