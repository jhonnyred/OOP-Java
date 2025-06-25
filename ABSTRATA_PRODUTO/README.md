# ABSTRATA_PRODUTO (Abstract Product)

This project is a hypothetical class arrangement for an inventory system.  
It includes an abstract class (**Produto**) and two concrete classes (**ProdutoAlimenticio** and **ProdutoVestuario**) with the following attributes:

- **Produto** (superclass)
  - name  
  - cost  
  - salePrice  

- **ProdutoAlimenticio** (subclass)
  - expirationDate  
  - nutritionalInfo  

- **ProdutoVestuario** (subclass)
  - size  
  - color  
  - material  

All the classes above share the same methods.  
The method `calculateProfit()` is overridden in the subclasses, and the methods `save()`, `delete()`, and `update()` are unique to each class, returning SQL statements to save, delete, and update data in a hypothetical database.

### 📋 Requirements

You must have Java installed and all required dependencies.  
(If you're on Linux, make sure to install `jdk-23_linux-x64_bin.deb`)

### 🔧 Installation

To run the project, you can use **Visual Studio Code** or run it directly from a Linux shell using the `java` command.  
To do this, first compile the files with:

```bash
javac Main.java
