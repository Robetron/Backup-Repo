#!/bin/bash

echo "Enter Month"
read month

echo "Enter Year"
read year

echo "****************************************"
echo "Single Month"
cal -1 "$month" "$year"
echo "****************************************"
echo "Three Months"
cal -3 "$month" "$year"
echo "****************************************"
echo "Julian Dates"
cal -j "$month" "$year"
echo "****************************************"

<< comment
Hello baba
comment
