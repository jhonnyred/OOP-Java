# INHERITANCE_2

This project is a hypothetical class arrangement for a company, with four personas: Employee, Manager, Salesperson, and Client.  
The classes and their respective attributes are:

- **Person** (superclass):  
  - name  
  - cpf  
  - birthDate  

  **METHODS**:  
  - `formatLocal(String date)` – Converts a String to LocalDate  
  - `formatStr(LocalDate date)` – Converts a LocalDate to String  
  - `printAll()` – Returns a String with the class attributes  

- **Client** (subclass of Person):  
  - email  
  - phone  
  - loyalty  

- **Employee** (subclass of Person):  
  - hiringDate  
  - salary  

- **Manager** (subclass of Employee):  
  - department  

- **Salesperson** (subclass of Employee):  
  - commission  

All classes include their respective getters and setters, and the `printAll()` method is overridden from the Person class.

### 📋 Requirements

You must have Java installed and all required dependencies.  
(If you're on Linux, make sure to install `jdk-23_linux-x64_bin.deb`)

### 🔧 Installation

To run the project, you can use **Visual Studio Code** or run it directly from a Linux shell using the `java` command.  
To do this, first compile the files with:

```bash
javac Main.java
```

### 🛠️ Built With

Tools and libraries used:

- **Visual Studio Code IDE**

### 📌 Version

- **Version 1.0** – This project is a hypothetical class arrangement for a company, with four personas: Employee, Manager, Salesperson, and Client.  
  The classes and their attributes are:

  - **Person** (superclass):  
    - name  
    - cpf  
    - birthDate  

    **METHODS**:  
    - `formatLocal(String date)`  
    - `formatStr(LocalDate date)`  
    - `printAll()`  

  - **Client** (subclass of Person):  
    - email  
    - phone  
    - loyalty  

  - **Employee** (subclass of Person):  
    - hiringDate  
    - salary  

  - **Manager** (subclass of Employee):  
    - department  

  - **Salesperson** (subclass of Employee):  
    - commission  

All classes include appropriate getters and setters, and override the `printAll()` method from the Person class.

### ✒️ Authors

- **Giovanni Galli** – *Initial Work* – Inheritance Task 2
