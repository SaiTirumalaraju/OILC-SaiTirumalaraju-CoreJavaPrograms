#!/bin/bash

echo -n "enter an Integer"
read var

if [ `expr $var % 2` == 0 ]
then
	echo "$var is Even"
else
	echo "$var is Odd"
fi
