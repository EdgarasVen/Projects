package lt.workmanger.manager.security;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationBean {

    private String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }
}
