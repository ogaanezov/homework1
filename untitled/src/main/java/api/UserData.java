package api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserData{
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;


    public UserData(String email, Integer id, String first_name, String last_name, String avatar) {
        this.email = email;
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }
    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAvatar() {
        return avatar;
    }
}