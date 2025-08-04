-- Create database
CREATE DATABASE bankmanagementsystem;
USE bankmanagementsystem;

-- Table: login
CREATE TABLE login (
    formno VARCHAR(20),
    cardnumber VARCHAR(20),
    pin VARCHAR(10)
);

-- Table: signup
CREATE TABLE signup (
    formno VARCHAR(20),
    name VARCHAR(100),
    fname VARCHAR(100),
    dob VARCHAR(20),
    gender VARCHAR(10),
    email VARCHAR(100),
    marital VARCHAR(20),
    address VARCHAR(200),
    city VARCHAR(50),
    state VARCHAR(50),
    pincode VARCHAR(10)
);

-- Table: signupthree
CREATE TABLE signupthree (
    formno VARCHAR(20),
    accountType VARCHAR(50),
    cardnumber VARCHAR(20),
    pinnumber VARCHAR(10),
    facility VARCHAR(200)
);

-- Table: signuptwo
CREATE TABLE signuptwo (
    formno VARCHAR(20),
    religion VARCHAR(50),
    category VARCHAR(50),
    income VARCHAR(50),
    education VARCHAR(50),
    occupation VARCHAR(50),
    pan VARCHAR(20),
    aadhar VARCHAR(20),
    seniorCitizen VARCHAR(10),
    existingAccount VARCHAR(10)
);

-- Table: bank
CREATE TABLE bank (
    pin VARCHAR(10),
    date DATETIME,
    type VARCHAR(20),
    amount INT
);
