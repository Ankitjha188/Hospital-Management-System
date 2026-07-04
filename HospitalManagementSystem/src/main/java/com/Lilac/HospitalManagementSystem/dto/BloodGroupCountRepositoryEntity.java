package com.Lilac.HospitalManagementSystem.dto;

import com.Lilac.HospitalManagementSystem.entity.type.BloodGroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupCountRepositoryEntity {

    private BloodGroupType bloodGroupType;

    private Long count;
}
