package com.accenture.tagtrainingspring.screening;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.lang.Nullable;

public class ScreeningRowMapper implements org.springframework.jdbc.core.RowMapper<Screening> {

    @Override
    @Nullable
    public Screening mapRow(ResultSet rs, int rowNum) throws SQLException {
        Screening screening = new Screening();

        screening.setAreaMean(rs.getDouble("area_mean"));

        screening.setAreaSe(rs.getDouble("area_se"));

        screening.setRadiusMean(rs.getDouble("radius_mean"));

        screening.setSymmetryMean(rs.getDouble("symmetry_mean"));

        screening.setCompactnessMean(rs.getDouble("compactness_mean"));

        screening.setSmoothnessMean(rs.getDouble("smoothness_mean"));

        screening.setConcavityMean(rs.getDouble("concavity_mean"));

        screening.setSymmetryWorst(rs.getDouble("symmetry_worst"));

        screening.setTextureMean(rs.getDouble("texture_mean"));

        screening.setPerimeterMean(rs.getDouble("perimeter_mean"));

        screening.setConcavePointsMean(rs.getDouble("concave_points_mean"));

        screening.setId(rs.getInt("id"));

        return screening;
    }

}
