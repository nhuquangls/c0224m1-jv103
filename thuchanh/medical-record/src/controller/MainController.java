package controller;

import filemanager.FileManager;
import service.PatientManager;
import ultils.KeyboardInput;

public class MainController {
    private final PatientManager patientManager = new PatientManager();
    private final FactoryController factoryController = new FactoryController();
    private final FileManager fileManager = new FileManager();

    public void showMenu() {
        int choice = -1;
        do {
            System.out.println("1. Thêm bệnh nhân");
            System.out.println("2. Xoá bệnh nhân");
            System.out.println("3. Xem danh sách bệnh nhân");
            System.out.println("4. Save & Exit");
            choice = KeyboardInput.getInteger("Choose an option");

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    deletePatient();
                    break;
                case 3:
                    patientManager.showList();
                    break;
                case 4:
                    fileManager.saveData(patientManager.getPatientList());
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 4);
    }

    private void addPatient() {
        System.out.println("1. Normal Patient");
        System.out.println("2. VIP Patient");
        int type = KeyboardInput.getInteger("Choose an option");
        patientManager.add(factoryController.newPatient(type));
    }
    private void deletePatient() {
        patientManager.delete(patientManager.getPatientByID());
    }
}
