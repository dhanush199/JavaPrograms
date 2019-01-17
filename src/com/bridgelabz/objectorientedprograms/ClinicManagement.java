package com.bridgelabz.objectorientedprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class ClinicManagement {
    static Appointment newApp;
    static List<Doctor> doctorList=new ArrayList<Doctor>();
    static List<Appointment> appointList=new ArrayList<Appointment>();
    static List<Patient> patientList=new ArrayList<Patient>();
    static String doctorFile="/home/admin1/ClinicManagement/doctor.json";
    static String patientFile="/home/admin1/ClinicManagement/patient.json";
    static String appointmentFile="/home/admin1/ClinicManagement/appointment.json";
     static Patient patient=null;
    static Doctor doctor=null;
    static int dfam=1;
   

    public static  void addDoctor() throws JsonGenerationException, JsonMappingException, IOException {
        String string = ObjectOrientedUtility.readFile(doctorFile);
        try {
            doctorList = ObjectOrientedUtility.userReadValue(string, Doctor.class);
            System.out.println("File is not empty!");
        } catch (Exception e) {
            System.out.println("File is empty!");
        }
        doctor = new Doctor();
        System.out.println("Enter the Doctor Name");
        String dname=DataStructureUtility.readString();
        doctor.setdName(dname);

        System.out.println("Enter the Doctor ID");
        int did=DataStructureUtility.readInteger();
        doctor.setdId(did);

        System.out.println("Enter the Doctor Specalization");
        String dspecial=DataStructureUtility.readString();
        doctor.setSpeciality(dspecial);

        System.out.println("Enter the Doctor Availability");
        String davl=DataStructureUtility.readString();
        doctor.setAvailability(davl);

        doctorList.add(doctor);
        System.out.println("Doctor is Succesfully addded to the list");
        System.out.println("Doctor added successfully!!!");
        displayDoctor(doctorList);
        String json = ObjectOrientedUtility.userWriteValueAsString(doctorList);
        ObjectOrientedUtility.writeFile(json, doctorFile);
       
    }
    public static void addPatient() throws JsonGenerationException, JsonMappingException, IOException
     {
         String string = ObjectOrientedUtility.readFile(patientFile);
            try {
                patientList = ObjectOrientedUtility.userReadValue(string, Patient.class);
                System.out.println("File is not empty!");
            } catch (Exception e) {
                System.out.println("File is empty!");
            }
         patient=new Patient();
         System.out.println("Enter the Patient id");
         int pid=DataStructureUtility.readInteger();
         patient.setPid(pid);
         System.out.println("Enter the Patient name");
         String pname=DataStructureUtility.readString();
         patient.setpName(pname);
         System.out.println("Enter the Patient age");
         int page=DataStructureUtility.readInteger();
         patient.setpAge(page);
         System.out.println("Enter the Phone No");
         String phoneno=DataStructureUtility.readString();
         patient.setpName(phoneno);
         patientList.add(patient);
         System.out.println("Patient is succesfully added to the list");
         displayPatient();
            String json = ObjectOrientedUtility.userWriteValueAsString(patientList);
            ObjectOrientedUtility.writeFile(json, patientFile);
     }
    public static void searchDoctor() throws IOException
    {
        System.out.println("How do you want to search Doctor By");
        int ch=0;
        do {
        System.out.println("1: Search Doctor By Doctor id");
        System.out.println("2: Search Doctor By Name");
        System.out.println("3: Search Doctor By Specialization");
        System.out.println("4: Search Doctor By Availabilty");
        int choice=DataStructureUtility.readInteger();
        switch(choice)
        {
        case 1:{
            System.out.println("Searching by Doctor id");
            List<Doctor> doctor1 = searchByDoctorId();
            if (!doctor1.isEmpty())
                System.out.println("Doctor is present");
            else
                System.out.println("Doctor is not present");
           
            break; 
        }
        case 2:
        {System.out.println("Searching by name");
        List<Doctor> doctor2 = searchByDoctorId();
        if (!doctor2.isEmpty())
            System.out.println("Doctor is present");
        else
            System.out.println("Doctor is not present");
           
            break;
        }
        case 3:
        {
            System.out.println("Searching by Specialization");
            List<Doctor> doctor3 = searchByDoctorSpecialization();
            if (!doctor3.isEmpty())
                System.out.println("Doctor is present");
            else
                System.out.println("Doctor is not present");
           
            break;

        }
        case 4:
        {
            System.out.println("Searching by Availability");
            List<Doctor> doctor4 = searchByDoctorAvailability();
            if (!doctor4.isEmpty())
                System.out.println("Doctor is present");
            else
                System.out.println("Doctor is not present");
           
            break;
        }
        default:
            System.out.println("Pls enter the correct choice");
        }ch++;}while(ch<100);
    }

        public static  List<Doctor> searchByName() throws IOException {
                String string = ObjectOrientedUtility.readFile(ClinicManagement.doctorFile);
                try {
                    doctorList = ObjectOrientedUtility.userReadValue(string, Doctor.class);
                    List<Doctor> list = new ArrayList<>();
                    System.out.println("Enter the doctor's name to be searched");
                    String name = DataStructureUtility.readString();
                    System.out.println(name);
                    for (Doctor doctor : doctorList) {
                        if (name.equals(doctor.getdName())) {
                            list.add(doctor);
                        }
                    }
                    return list;
                } catch (Exception e) {
                    System.out.println("File is empty!");
                    return null;
                }

            }
   
         public static List<Doctor> searchByDoctorId() throws IOException {
                String string = ObjectOrientedUtility.readFile(doctorFile);
                try {
                    doctorList = ObjectOrientedUtility.userReadValue(string, Doctor.class);
                    List<Doctor> list = new ArrayList<>();
                    System.out.println("Enter the doctor's id to be searched");
                    int id = DataStructureUtility.readInteger();
                    for (Doctor doctor : doctorList) {
                        if (id == doctor.getdId()) {
                            list.add(doctor);

                        }
                    }
                    return list;
                } catch (Exception e) {
                    System.out.println("File is empty! Doctor cannot be searched");
                    return null;
                }

            }

    public static List<Doctor> searchByDoctorSpecialization() {
        System.out.println("Enter the doctor's specialization to be searched");
        String docspec = DataStructureUtility.readString();
        try {
            for (Doctor doctor : doctorList) {
                if (docspec.equals(doctor.getSpeciality())) {
                    System.out.println("Doctor of the " + docspec + " specialization is present");
                }
            }
        } catch (Exception e) {
            System.out.println("Doctor of the " + docspec + " specialization is not present");
        }
        return null;
    }


    public static List<Doctor> searchByDoctorAvailability() {
        System.out.println("Enter when you need the doctor (eg: am/pm)");
        String docavl = DataStructureUtility.readString();
        try {
            for (Doctor doctor : doctorList) {
                if (docavl.equals(doctor.getAvailability())) {
                    System.out.println(doctor.getdName() + " of id " + doctor.getdId() + " is available");
                }
            }
        } catch (Exception e) {
            System.out.println("No doctors are available at this hour");
        }
        return null; }

     public static void takeAppointment() throws IOException {
            String string = ObjectOrientedUtility.readFile(appointmentFile);
            try {
                appointList = ObjectOrientedUtility.userReadValue(string, Appointment.class);
                System.out.println("File is not empty");

            } catch (Exception e) {
                System.out.println("File is empty");
            }
            Patient patient = ClinicManagement.searchByPhoneno();
            if (patient != null) {
                System.out.println("Patient data already exist!!\nTaking appointment now....");
                appoint(patient);
                String json = ObjectOrientedUtility.userWriteValueAsString(appointList);
                ObjectOrientedUtility.writeFile(json, appointmentFile);
            } else {
                System.out.println("Patient data doesnot exist\nPlease first add patient detials on to database");
            }
        }

     
     
     public static void searchpatient()
     {
         System.out.println("1: Search Patient by Patient ID" );
         System.out.println("2: Search Patient by Phone no");
         int choice=DataStructureUtility.readInteger();
         switch (choice)
         {
         case 1:
         {System.out.println("Searching by ID");
            List<Patient> patient =  searchByID();
            if (!patient.isEmpty())
                System.out.println("Doctor is present");
            else
                System.out.println("Doctor is not present");
               
           
             break;
         }
         case 2:
         {
             System.out.println("Searching by ID");
                List<Patient> patient1 =  (List<Patient>) searchByPhoneno();
                if (!patient1.isEmpty())
                    System.out.println("Doctor is present");
                else
                    System.out.println("Doctor is not present");
           
             break;
           
         }
         default:
             System.out.println("Pls eneter the correct choice");
             
         }
     }
     public static List<Patient> searchByID() {

         System.out.println("Enter the patient's id to be searched");
         int patid = DataStructureUtility.readInteger();
         try {
             for (Patient patient : patientList) {
                 if (patid == patient.getPid()) {
                     System.out.println("patient of id " + patid + " is present");
                 }
             }
         } catch (Exception e) {
             System.out.println("patient of id " + patid + " is not present");
         }
        return null;
     }
     
     
     
     public static Patient searchByPhoneno()
     {
         System.out.println("enter the patient's phone no to be searched");
         double pn=DataStructureUtility.readdouble();
         try {
             for(Patient patient : patientList) {
                 if(pn==patient.getpNum()) {
                     System.out.println("patient of phone number" + pn+"is present");
                 }
             }
         }catch(Exception e) {
             System.out.println("patient of phone number" + pn+"is not present");
         }
        return patient;
     }
     public static void displayPatient()
     {
         if(!patientList.isEmpty())
         {
             for(Patient pd :patientList)
             {
                 System.out.println("PatientID :" + pd.getPid());
                 System.out.println("Patient Name :" + pd.getpName());
                 System.out.println("Patient Age :" + pd.getpAge());
                 System.out.println("Patient PhoneNo :" + pd.getpNum());
                 System.out.println("------------------------------");
             } }
         else
             System.out.println("There are No Patient to display");
     }
     public static void displayDoctor(List<Doctor> doctorList1)
     {
         if(!doctorList.isEmpty())
         {
             for(Doctor pd :doctorList)
             {
                 System.out.println("DoctorID :" + pd.getdId());
                 System.out.println("Doctor Name :" + pd.getdName());
                 System.out.println("Doctor Availablity :" + pd.getAvailability());
                 System.out.println("Doctor Speciality :" + pd.getSpeciality());
                 System.out.println("------------------------------");
             } }
         else
             System.out.println("There are No Patient to display");
     }
     public static void writelistDoctor(String json) throws IOException
        {
            FileWriter file = new FileWriter("/home/admin1/Tharun/Filesforjava/doctor.json");
            @SuppressWarnings("resource")
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write(json);
            buffer.flush();
        }
     public static void writelistPatient(String json) throws IOException
        {
            FileWriter file = new FileWriter("/home/admin1/Tharun/Filesforjava/patient.json");
            @SuppressWarnings("resource")
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write(json);
            buffer.flush();
        }
     
     public static void writelistAppointment(String json) throws IOException
        {
            FileWriter file = new FileWriter("/home/admin1/Tharun/Filesforjava/appointment.json");
            @SuppressWarnings("resource")
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write(json);
            buffer.flush();
        }
     public static String readFile(String message) throws FileNotFoundException {
            FileReader f = new FileReader(message);
            @SuppressWarnings("resource")
            BufferedReader read = new BufferedReader(f);
            String line = "";
            try {
                String word="";
                while ((word = read.readLine()) != null) {
                    line = word;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return line;
        }
     
     public static void displayList() throws JsonParseException, JsonMappingException, IOException
     {
         System.out.println("1: list of Pateint ");
         System.out.println("2:list of Doctor ");
         
         switch (DataStructureUtility.readInteger()) {
        case 1:displayPaList();
           
            break;
    case 2:displayDoList();
           
            break;
        default:System.out.println("Enter valid option");
            break;
        }
     }
     public static  List<Doctor> displayDoList() throws JsonParseException, JsonMappingException, IOException
        {ObjectMapper objectmapper=new ObjectMapper();
         String string = ObjectOrientedUtility.readFile("/home/admin1/Tharun/Filesforjava/doctor.json");
            doctorList = objectmapper.readValue(string, new TypeReference<List<Doctor>>() {
            });
            return doctorList;
        }
     public static  List<Patient> displayPaList() throws JsonParseException, JsonMappingException, IOException
        {ObjectMapper objectmapper=new ObjectMapper();
         String string = ObjectOrientedUtility.readFile("/home/admin1/Tharun/Filesforjava/patient.json");
         patientList = objectmapper.readValue(string, new TypeReference<List<Doctor>>() {
            });
            return patientList;
        }
        public static void famousDoctor() throws IOException {
            String string = ObjectOrientedUtility.readFile(appointmentFile);
            java.util.Map<String, Integer> map = new HashMap<>();
            try {
                appointList = ObjectOrientedUtility.userReadValue(string, Appointment.class);
                for (int i = 0; i < appointList.size(); i++) {
                    Appointment appointment = appointList.get(i);
                    String doctorName = appointment.getDocName();
                    Integer numberOfAppointments = appointment.getListOfPatients().size();
                    map.put(doctorName, numberOfAppointments);
                }
                int maxValue = Collections.max(map.values());
                for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == maxValue) {
                        System.out.println(
                                "Famous Doctor Name: " + entry.getKey() + "\nNo of appointments: " + entry.getValue());
                    }
                }
            } catch (Exception e) {
                System.out.println("There are no doctors in the Hospital system.");
            }
        }

        public static void famousSpecialist() throws IOException {
            String string = ObjectOrientedUtility.readFile(doctorFile);
            List<String> list = new ArrayList<>();
            try {
                doctorList = ObjectOrientedUtility.userReadValue(string, Doctor.class);
                for (Doctor doctor : doctorList) {
                    for (Doctor doctor1 : doctorList) {
                        if (doctor.getSpeciality().equals(doctor1.getSpeciality())) {
                            list.add(doctor.getSpeciality());
                        }
                    }
                }
                int max = 0;
                int curr = 0;
                String currKey = null;
                Set<String> unique = new HashSet<String>(list);
                for (String key : unique) {
                    curr = Collections.frequency(list, key);
                    if (max < curr) {
                        max = curr;
                        currKey = key;
                    }
                }
                System.out.println(currKey + " is the famous specialization.");
            } catch (Exception e) {
                System.out.println("There are no doctors in the Hospital system.");
            }
        }
        public static void searchDoc(List<Doctor> doctorList, Patient patient) {
            System.out.println("Enter id");
            int id = DataStructureUtility.readInteger();
            try {
                for (Doctor doctor : doctorList) {
                    if (id == doctor.getdId()) {
                        for (Appointment appointment : appointList) {
                            if (doctor.getdName().equals(appointment.getDocName())) {
                                List<Patient> patientAppointmentList = appointment.getListOfPatients();
                                if (patientAppointmentList.size() < 5) {
                                    patientAppointmentList.add(patient);
                                    appointment.setListOfPatients(patientAppointmentList);
                                    System.out.println("Appointment is set");
                                    break;
                                } else {
                                    System.out.println(
                                            "Appointment is full !!! Please wait for the next schedule or Select different doctor");

                                }
                                break;
                            } else {
                                Appointment newAppointment = new Appointment();
                                newAppointment.setDocName(doctor.getdName());
                                List<Patient> newPatientAppointmentList = new ArrayList<>();
                                newPatientAppointmentList.add(patient);
                                newAppointment.setListOfPatients(newPatientAppointmentList);
                                appointList.add(newAppointment);
                                System.out.println("Appointment is set");

                            }
                        }
                        if (appointList.size() == 0) {
                            Appointment appointment2 = new Appointment();
                            List<Patient> patientList1 = new ArrayList<Patient>();
                            patientList1.add(patient);
                            appointment2.setDocName(doctor.getdName());
                            appointment2.setListOfPatients(patientList1);
                            appointList.add(appointment2);
                            System.out.println("Appointment is set");
                        }

                    }
                }

            } catch (Exception e) {
                System.out.println("Enter the correct id");
            }
        }
        public static List<Doctor> searchById() throws IOException {
            String string = ObjectOrientedUtility.readFile(doctorFile);
            try {
                doctorList = ObjectOrientedUtility.userReadValue(string, Doctor.class);
                List<Doctor> list = new ArrayList<>();
                System.out.println("Enter the doctor's id to be searched");
                int id = DataStructureUtility.readInteger();
                for (Doctor doctor : doctorList) {
                    if (id == doctor.getdId()) {
                        list.add(doctor);

                    }
                }
                return list;
            } catch (Exception e) {
                System.out.println("File is empty! Doctor cannot be searched");
                return null;
            }

        }
        public static List<Doctor> searchBySpecialization() throws IOException {
            String string = ObjectOrientedUtility.readFile(doctorFile);
            try {
                doctorList = ObjectOrientedUtility.userReadValue(string, Doctor.class);
                List<Doctor> list = new ArrayList<>();
                System.out.println("Enter the doctor's name to be searched");
                String specialization = DataStructureUtility.readString();
                for (Doctor doctor : doctorList) {
                    if (specialization.equals(doctor.getSpeciality())) {
                        list.add(doctor);
                    }
                }

                return list;
            } catch (Exception e) {
                System.out.println("File is empty! Doctor cannot be searched");
                return null;
            }

        }
        public static List<Doctor> searchByAvailability() throws IOException {
            String string = ObjectOrientedUtility.readFile(doctorFile);
            try {
                doctorList = ObjectOrientedUtility.userReadValue(string, Doctor.class);
                List<Doctor> list = new ArrayList<>();
                System.out.println("Enter when you need the doctor (eg: am/pm)");
                String availability = DataStructureUtility.readString();
                for (Doctor doctor : doctorList) {
                    if (availability.equals(doctor.getAvailability())) {
                        list.add(doctor);
                    }
                }
                return list;
            } catch (Exception e) {
                System.out.println("File is empty! Doctor cannot be searched");
                return null;
            }

        }
        public static Patient searchByPatientId() throws IOException {
            String string = ObjectOrientedUtility.readFile(patientFile);
            patientList = ObjectOrientedUtility.userReadValue(string, Patient.class);
            System.out.println("Enter the patient's id to be searched");
            int id = DataStructureUtility.readInteger();
            for (Patient patient : patientList) {
                if (id == patient.getPid()) {
                    return patient;
                }
            }
            return null;
        }
        public static Patient searchByPhoneNo() throws IOException {
            String string = ObjectOrientedUtility.readFile(patientFile);
            patientList = ObjectOrientedUtility.userReadValue(string, Patient.class);
            System.out.println("Enter the patient's phone number to search");
            double phoneNo = DataStructureUtility.readdouble();

            for (Patient patient : patientList) {
                if (phoneNo == patient.getpNum()) {
                    return patient;
                }
            }
            return null;
        }

        public static void appoint(Patient patient) throws IOException {
            System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
            int choice = DataStructureUtility.readInteger();
            switch (choice) {
            case 1:
                List<Doctor> doctorList = searchByName();
                displayDoctor(doctorList);
                searchDoc(doctorList, patient);
                break;
            case 2:
                List<Doctor> doctorList1 = searchBySpecialization();
                displayDoctor(doctorList1);
                searchDoc(doctorList1, patient);
                break;
            case 3:
                List<Doctor> doctorList2 = searchByAvailability();
                displayDoctor(doctorList2);
                searchDoc(doctorList2, patient);
                break;
            }
        }
}