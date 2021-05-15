#!/bin/bash

echo "Enter basic Salary"
read bs

ta=`echo $bs \* 15 / 100 | bc`
hra=`echo $bs \* 10 / 100 | bc`
da=`echo $bs \* 2 / 100 | bc`

tax=`echo $bs \* 5 / 100 | bc`
pf=`echo $bs \* 10 / 100 | bc`

ad=`echo $ta + $hra + $da | bc`
ded=`echo $tax + $pf | bc`

Anualsal=`echo $bs + $ad - $ded | bc`

echo "Net Salary is $Anualsal"

