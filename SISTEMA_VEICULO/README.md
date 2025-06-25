# VEHICLE_SYSTEM

The project consists of a hypothetical arrangement of classes for a vehicle classification system composed of 7 classes and a main class. The classes and their respective attributes are:

* Vehicle (superclass):  
  - model  
  - manufacture  

* Bicycle (subclass of Vehicle):  
  - brand  
  - color  
  - material  
  - gear  
  - shock absorber  

* Skateboard (subclass of Vehicle):  
  - brand  
  - color  
  - hardness  
  - diameter  

* MotorizedVehicle (subclass of Vehicle):  
  - manufacturer  
  - color  
  - mileage  

* Truck (subclass of MotorizedVehicle):  
  - axle  
  - weight  

* Domestic (subclass of MotorizedVehicle):  
  - passengers  
  - brake  
  - airbag  

* Motorcycle (subclass of MotorizedVehicle):  
  - displacement  
  - torque  

All classes have the method `printAll()` inherited from Vehicle that returns all the class attributes as a String and the method `insert()` which returns a string with an SQL command to insert the class data into a table named after the respective class.

### 📋 Requirements

You must have Java installed and all required dependencies.  
(If you use Linux, install `jdk-23_linux-x64_bin.deb`)

### 🔧 Installation

To run the project, you can use Visual Studio Code or run it directly in a Linux shell using the `java` command.  
First, compile the files with:

```bash
javac Main.java
```

### 🛠️ Built With

Tools and libraries used:

- Visual Studio Code IDE

### 📌 Version

- **Version 1.0** The project consists of a hypothetical arrangement of classes for a vehicle classification system composed of 7 classes and a main class. The classes and their respective attributes are:  

* MotorizedVehicle (superclass):  
  - manufacturer  
  - color  
  - mileage  

* Vehicle (superclass):  
  - model  
  - manufacture  

* Truck (subclass of MotorizedVehicle):  
  - axle  
  - weight  

* Domestic (subclass of MotorizedVehicle):  
  - passengers  
  - brake  
  - airbag  

* Motorcycle (subclass of MotorizedVehicle):  
  - displacement  
  - torque  

* Bicycle (subclass of Vehicle):  
  - brand  
  - color  
  - material  
  - gear  
  - shock absorber  

* Skateboard (subclass of Vehicle):  
  - brand  
  - color  
  - hardness  
  - diameter  

All classes have the method `printAll()` inherited from Vehicle that returns all the class attributes as a String and the method `insert()` which returns a string with an SQL command to insert the class data into a table named after the respective class.

### ✒️ Authors

- **Giovanni Galli** – *Initial Work* – Vehicle System
