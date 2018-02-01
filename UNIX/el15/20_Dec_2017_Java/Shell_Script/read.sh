#!/bin/bash

#Bash Shell Script: User read command to accept data via console

echo "Enter your First Name: "
read fname

echo "Enter your Last Name"
read lname

echo "Enter your City"
read city

echo "--------------------------------------"
echo "My name is $fname $lname from $city"
echo "--------------------------------------"

fullname="$fname_$lname"
echo "fullname" 
