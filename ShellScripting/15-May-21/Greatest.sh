#!/bin/bash

read -p " Enter the Size: " size

i=1
max=0

echo "Enter "$size" numbers: "

while [ $i -le $size ]
do
	read num
	if [ $i -eq 1 ]
	then
		max=$num
	elif [ $num -gt $max ]
	then
		max=$num
		
	fi
	i=$((i+1))
done

echo "Greatest Number: "$max
