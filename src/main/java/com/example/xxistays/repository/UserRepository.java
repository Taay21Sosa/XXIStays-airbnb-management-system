package com.example.xxistays.repository;

import com.example.xxistays.model.Address;
import com.example.xxistays.model.User;
import com.example.xxistays.model.UserRole;
import com.example.xxistays.util.FileManager;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class UserRepository implements Repository<User> {
    private final List<User> users = new ArrayList<>();
    private final String USERS_FILE = "users/users.`csv`";/*
    private String USER_INFO_FILE = "user/users.csv";
    private String USERS_PASSWORDS_FILE = "user/users.csv";*/

    /**
     * Loads inventory from the users storage file.
     * Each row/record in the file represents a user's attributes with comma-separated values.
     * @param users List storing users from storage file.
     */
    @Override
    public void loadAll(List<User> users) {
        try {
            List<String> records = FileManager.readData(USERS_FILE);
            users.clear();

            for (String row : records) {
                String[] parts = row.split(",");

                if (parts.length == 7) {
                    String userId = parts[0].trim();
                    String email = parts[0].trim();
                    String password = parts[0].trim();
                    String username = parts[0].trim();
                    Set<UserRole> role = Collections.singleton(UserRole.valueOf(parts[0].trim()));
                    String firstName = parts[0].trim();
                    String lastName = parts[0].trim();
                    LocalDate DOB = LocalDate.parse(parts[0].trim());
                    String cell = parts[0].trim();
                    Address address = new Address(parts[0], parts[0], parts[0], parts[0], parts[0]);
                    String profilePicture = parts[0].trim();
                    String aboutMe = parts[0].trim();
                    LocalDate createdAt = LocalDate.parse(parts[0].trim());

                    User user = new User(userId, email, password, username, role, firstName, lastName, DOB,
                            cell, address, profilePicture, aboutMe, createdAt);
                    users.add(user);
                } else {
                    System.err.println("Invalid record format: " + row);
                }
            }

        } catch (IOException e) {   //
            System.err.println("Error reading from user file: " + e.getMessage());
        }
    }

    /**
     * @param Id
     * @return
     */
    @Override
    public Optional<User> findById(String Id) {
        return Optional.empty();
    }

    /**
     * @param newUser
     */
    @Override
    public void add(User newUser) {

    }

    /**
     * @param user
     */
    @Override
    public void update(User user) {

    }

    /**
     * @param user
     */
    @Override
    public void delete(User user) {

    }

    /**
     * Saves the current users to the storage file.
     * @param users List storing users from storage file.
     */
    @Override
    public void saveAll(List<User> users) {
        try {
            List<String> records = new ArrayList<>();

            for (User user : users) {
                records.add(user.toFileString());
            }

            FileManager.writeData(records, USERS_FILE);

        } catch (IOException e) {
            System.err.println("Error writing records to users file: " + e.getMessage());
        }
    }
}
