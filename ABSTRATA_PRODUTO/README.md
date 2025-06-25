# ABSTRACT_PRODUCT

This project is a hypothetical class structure for an inventory system.  
It includes one abstract class (**Product**) and two concrete subclasses (**FoodProduct** and **ClothingProduct**) with the following attributes:

- **Product** (superclass)  
  - name  
  - cost  
  - salePrice  

- **FoodProduct** (subclass)  
  - expirationDate  
  - nutritionalInfo  

- **ClothingProduct** (subclass)  
  - size  
  - color  
  - material  

All classes share common methods. The method `calculateProfit()` is overridden in the subclasses.  
Each class also has unique methods: `save()`, `delete()`, and `update()` that return SQL instructions to interact with a hypothetical database.

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

- **Version 1.0** – This project is a hypothetical class structure for an inventory system, with:  
  - **Product** (superclass):  
    - name  
    - cost  
    - salePrice  

  - **FoodProduct**:  
    - expirationDate  
    - nutritionalInfo  

  - **ClothingProduct**:  
    - size  
    - color  
    - material  

All classes implement `calculateProfit()`, and have specific methods (`save()`, `delete()`, `update()`) that return SQL statements for a hypothetical database.

### ✒️ Authors

- **Giovanni Galli** – *Initial Work* – Abstract Task 2
