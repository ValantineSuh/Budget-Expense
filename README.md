# Budget Expense Tracker
A simple Java-based terminal application to help you track and manage expenses efficiently. Built with **Maven** for easy dependency management.

## Features
**Add Expense:** Record new expenses with category and amount.

**View Expenses:** Display all recorded expenses.

**Exit:** Safely close the application.

## Prerequisites
Make sure you have the following installed:

### 1. Java Development Kit (JDK)
[Download and Install JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

Verify installation:

```bash
java -version
```
### 2. Apache Maven

Install Maven:

- **Ubuntu/Debian:**
    ```bash
    sudo apt update && sudo apt install maven
    ```

- **MacOS:**
    ```bash
    brew install maven
    ```

- **Windows:**

    [Download Maven](https://maven.apache.org/download.cgi) and add it to your PATH.

Verify Maven installation:
```bash
mvn -version
```


## Installation
1) Clone the project from the repository:
    ```bash
    git clone https://github.com/your-username/budget-expense-tracker.git
    ```

2) Navigate to the project directory:
    ```bash
    cd budget-expense-tracker
    ```

3) Compile the project using Maven:
    ```bash
    mvn compile
    ```


## How to Run the Application
Use the following command to run the application from the terminal:
```bash
mvn compile exec:java -Dexec.mainClass="com.example.Main"
```


## Usage
Once the application starts, you will see the following menu:
```sql
Welcome to the Expense Tracker!

                Expense Tracker Menu
                ---------------------
                1. Add Expense
                2. View Expenses
                3. Exit
```
- **Option 1:** Add a new expense by entering the category and amount.

- **Option 2:** View all recorded expenses listed by category and amount.

- **Option 3:** Exit the application.


## Future Enhancements (Planned)
- Add categories for better organization.
- Generate reports based on monthly expenses.
- Implement a graphical user interface (GUI).


## Contributing
Feel free to fork the repository and submit pull requests for new features or bug fixes.

## License
This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).