#!/bin/bash


read -p "Enter an Integer: " num

if [ `expr $num % 2` == 0 ]
then
	echo "$num is Even"
else
	echo "$num is Odd"
fi
