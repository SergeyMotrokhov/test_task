package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class SuperHero {
    private String id;
    private String fullName;
    private String birthDate;
    private String city;
    private String mainSkill;
    private String gender;
    private String phone;

}
