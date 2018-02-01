#!/bin/bash

echo "Enter Username"
read uname

if who | grep -w "$uname"
then
	echo "$uname is logged in"
else 
	echo "$uname isn't logged in"
fi
