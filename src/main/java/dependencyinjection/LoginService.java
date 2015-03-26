package dependencyinjection;

import dependencyinjection.authentication.AuthenticationException;
import dependencyinjection.authentication.Authenticator;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chris Campo
 */
public class LoginService {

    private final Authenticator authenticator;

    public LoginService(@NotNull final Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void login(final String username, final String password) {
        try {
            authenticator.authenticate(username, password);
        } catch (final AuthenticationException e) {
            System.out.println("Error while authenticating.");
            e.printStackTrace();
            return;
        }

        System.out.println("Successfully authenticated.");
    }
}
