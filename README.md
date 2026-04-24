Task-3: ATM Interface

This system is designed to simulate the working of an ATM machine by providing basic banking functionalities to the user. It begins with the creation of a class that represents the ATM, which acts as the main interface for user interaction. The user interface is designed to offer options such as withdrawing money, depositing funds, and checking the account balance, making the system interactive and easy to use.

Each functionality is implemented through dedicated methods, such as withdraw(amount) for withdrawing money, deposit(amount) for adding funds, and checkBalance() for viewing the current balance. A separate class is created to represent the user’s bank account, which securely stores and manages the account balance.

The ATM class is connected to the bank account class, allowing it to access and update the balance based on the user’s actions. Input validation is an important part of the system, ensuring that operations are performed within acceptable limits—for example, preventing withdrawals when there are insufficient funds or rejecting invalid input values.

Throughout the process, the system provides clear and appropriate messages to the user, indicating whether a transaction was successful or if any errors occurred. This ensures a smooth and user-friendly experience while accurately simulating real-world ATM operations.
