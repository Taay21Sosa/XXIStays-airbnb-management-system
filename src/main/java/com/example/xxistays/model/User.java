package com.example.xxistays.model;

import java.time.LocalDate;
import java.util.Set;

public class User {
    // Private attributes to ensure encapsulation.
    private String userId;
    private String email;
    private String password;
    private String username;
    private Set<UserRole> role;
    private String firstName;
    private String lastName;
    private LocalDate DOB;
    private String phone;
    private Address address;
    private String profilePicture;
    private String aboutMe;
    private LocalDate createdAt;

    /**
     * Constructor to initialize a User object with all attributes.
     * @param userId User's id.
     * @param username Username for user account.
     * @param email Email for user account.
     * @param role Role for user account.
     * @param firstName User's first name.
     * @param lastName User's last name.
     * @param DOB User's date of birth.
     * @param phone User's phone number.
     * @param address User's residential address.
     * @param profilePicture User's profile picture.
     * @param aboutMe User's bio.
     * @param createdAt Date user account was created.
     */
    public User(String userId, String email, String password, String username, Set<UserRole> role,
                String firstName, String lastName, LocalDate DOB, String phone, Address address,
                String profilePicture, String aboutMe, LocalDate createdAt) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.username = username;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.phone = phone;
        this.address = address;
        this.profilePicture = profilePicture;
        this.aboutMe = aboutMe;
        this.createdAt = createdAt;
    }

    /**
     * Getters and Setters (methods) for all attributes.
     * Gets & Sets: user id, username, email, role, first name, last name, dob, cell, address, profile picture,
     * bio and created date for the user.
     */
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public Set<UserRole> getRole() { return role; }
    public void setRole(Set<UserRole> role) { this.role = role; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public LocalDate getDOB() { return DOB; }
    public void setDOB(LocalDate DOB) { this.DOB = DOB; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public String getProfilePicture() { return profilePicture; }
    public void setProfilePicture(String profilePicture) { this.profilePicture = profilePicture; }

    public String getAboutMe() { return aboutMe; }
    public void setAboutMe(String aboutMe) { this.aboutMe = aboutMe; }

    public LocalDate getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDate createdAt) { this.createdAt = createdAt; }

    /**
     * Returns a string representation for User object.
     * @return A formatted string with all the users attributes.
     */
    @Override
    public String toString() {
        return String.format("User ID: %s, Email: %s, Password: %s, Username: %s, Role: %s, First name: %s, " +
                "Last name: %s, DOB: %s, Phone: %s, Address: { %s }, Profile: %s, About Me %s, Created: %s",
                userId, email, password, username, role, firstName, lastName, DOB, phone, address,
                profilePicture, aboutMe, createdAt);
    }

    /**
     * Returns a string format suitable for file storage.
     * @return A comma-separated string with all the users attributes.
     */
    public String toFileString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", userId, email, password, username, role,
                firstName, lastName, DOB, phone, address, profilePicture, aboutMe, createdAt);
    }
}
