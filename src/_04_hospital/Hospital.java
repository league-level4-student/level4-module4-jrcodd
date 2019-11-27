package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Patient> patients;
	ArrayList<Doctor> doctors;
	public Hospital() {
		patients = new ArrayList<Patient>();
		doctors = new ArrayList<Doctor>();
	}

	public void addDoctor(GeneralPractictioner generalPractictioner) {
		doctors.add(generalPractictioner);
	}

	public void addDoctor(Surgen surgen) {
		doctors.add(surgen);
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		return patients;
	}

}
