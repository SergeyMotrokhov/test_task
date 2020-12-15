package tests;

import java.util.HashMap;
import java.util.Map;

public class Collect {
    public final static Map<String, String> MAP = new HashMap<>();
    private String id;
    private String birthDate;
    private String city;



    private String fullName;
    private String gender;
    private String mainSkill;
    private String phone;

    public static class Builder {
        private Collect collect;

        public Builder() {
            collect = new Collect();

        }

        public Builder setId(String id) {
            collect.id = id;
            return this;
        }

        public Builder setBirthDate(String birthDate) {
            collect.birthDate = birthDate;
            return this;
        }

        public Collect build(){
            return collect;
        }


    }


}
