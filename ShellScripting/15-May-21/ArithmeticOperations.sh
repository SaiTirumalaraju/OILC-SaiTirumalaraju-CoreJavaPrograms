#!/bin/bash

while [ true ]
do


	echo -e " Select Any Operation \n 1.Addition.\n 2.Subtraction.\n 3.Multiplication.\n 4.Division.\n 5.ModularDivision.\n 6.Exit.\n"
	read -p "Enter any Arithmetic operation: " op
	if [ $op -le 5 ]
	then
	read -p " Enter First Number: " a
	read -p " Enter Second Number: " b
	fi
	case $op in
		1) echo "Sum of $a and $b ="`expr $a + $b`;;
		2) echo "Difference of $a and $b ="`expr $a - $b`;;
		3) echo "Product of $a and $b ="`expr $a \* $b`;;
		4) echo "Quotient of $a and $b ="`expr $a / $b`;;
		5) echo "Reminder of $a and $b ="`expr $a % $b`;;
		6) echo "Menu Terminated "
			exit;;
		*) echo "Enter valid operation"
			continue
	
	esac

done
