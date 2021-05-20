#!/bin/bash

read -p " Enter lower limit: " low
read -p " Enter higher limit: " high

while [ $low -le $high ]
do
	for j in {1..10}
	do
        	echo " $low * $j = "`expr $low \* $j`
        	j=$((j+1))
	done
	echo "************************"
	low=`expr $low + 1`

done

