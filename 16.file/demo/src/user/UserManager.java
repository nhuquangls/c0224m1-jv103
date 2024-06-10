package user;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserManager {
    private final List<User> USERS = new ArrayList<User>();
    private final File DATA_PATH = new File("./src/data/data.txt");
    private boolean isRead = false;

    public void addUser(int id, String name, String password) {
        User user = new User(id, name, password);
        USERS.add(user);
        if (isRead) writeAppend(id, name, password);
    }

    public void displayUsers() {
        for (User user : USERS) {
            System.out.println(user);
        }
    }

    public void updateUser(int id, int newID, String newName, String newPassword) {
        for (User user : USERS) {
            if (user.getId() == id) {
                user.setId(newID);
                user.setName(newName);
                user.setPassword(newPassword);
            }
        }
        overWriteData();
    }

    public void removeUser(int id) {
        Iterator<User> iterator = USERS.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
            }
        }
        overWriteData();
    }

    public void readData() {
        try {
            FileReader data = new FileReader(DATA_PATH);
            BufferedReader reader = new BufferedReader(data);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(",");
                if (splitLine.length >= 3) {
                    addUser(Integer.parseInt(splitLine[0]), splitLine[1], splitLine[2]);
                }
            }
            isRead = true;
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeAppend(int id, String name, String password) {
        try {
            FileWriter data = new FileWriter(DATA_PATH, true);
            BufferedWriter writer = new BufferedWriter(data);
            if (DATA_PATH.length() > 0) writer.newLine();
            writer.write(id + "," + name + "," + password);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void overWriteData() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_PATH));
            String data = "";
            for (User user : USERS) {
                data += user.getId() + "," + user.getName() + "," + user.getPassword() + "\n";
            }
            writer.write(data);
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
