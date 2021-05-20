#!/bin/bash
while [ true ] 
do
	echo -e "\n 1.To Enter a String\n 2.Exit " 
	read -p "Please Select Any Option: " option
	case $option in
		1)read -p "Please Enter a String to Concatenate : " string
			result+="$string ";;
		2)echo -e "\n Resultant String: $result"
			exit;;

		*)echo -e"\n Invalid Option"
			continue;;
	esac

done
