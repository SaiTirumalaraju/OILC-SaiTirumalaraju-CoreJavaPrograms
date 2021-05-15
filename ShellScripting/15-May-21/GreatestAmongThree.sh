#!/bin/bash
read -p "enter first value" a
read -p "enter second value" b
read -p "enter third value" c

 

if [ $a -gt $b ]
then
        echo "$a is greater"

 

elif [ $b -gt $c ]
then
        echo "$b is greater"

 

else
        echo "$c is greater"
fi
