import user.UserManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserManager listUsers = new UserManager();
        listUsers.showMenu();
    }
}
