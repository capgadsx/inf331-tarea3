import java.util.HashMap;

public class BankConsoleSystem {
    private Client currentUser;
    private HashMap<Integer, Client> systemUsers;

    public BankConsoleSystem() {
        setup();
    }

    private void setup() {
        currentUser = null;
        systemUsers = new HashMap<>();
        createUsers();
    }

    private void createUsers() {
        systemUsers.put(2021, new Client(2021, "new_year!"));
    }

    public SystemError logIn(int id, String password) {
        if(systemUsers.containsKey(id)) {
            Client client = systemUsers.get(id);
            if (client.validatePassword(password)) {
                currentUser = client;
                return SystemError.OK;
            } else {
                return SystemError.USER_INVALID_CREDENTIALS;
            }
        } else {
            return SystemError.USER_NOT_EXISTS;
        }
    }

    public SystemError logOut() {
        if (currentUser != null) {
            currentUser = null;
            return SystemError.OK;
        } else {
            return SystemError.NOT_LOGGED_IN;
        }
    }

    public Client getCurrentUser() {
        return currentUser;
    }

    public void reloadDefaults() {
        // This resets accounts
    }

    public void interactive() {
        // This starts the interactive flow for users
    }
}
