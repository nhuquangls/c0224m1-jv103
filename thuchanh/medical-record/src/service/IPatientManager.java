package service;


import patient.Patient;

public interface IPatientManager {
    void add(Patient patient);
    void delete(Patient patient);
    void showList();
}
