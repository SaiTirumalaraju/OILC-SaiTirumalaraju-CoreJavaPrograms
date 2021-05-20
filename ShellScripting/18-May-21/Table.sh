#!/bin/bash
while [ true ]
do
	echo -e "\n 1.Multiplication Table for a given Number\n 2.Exit\n "
        read -p "Please Select Any Option: " option
        case $option in
		1) read -p " Enter a Number: " number
		echo "$number" | grep "^[1-9]*$"
                val="$?"

                if [ $val == 0 ]
		then
			echo "Multiplication Table Of $number "
			for i in {1..10}
			do
				echo " $number * $i = "`expr $number \* $i`
				i=$((i+1))
			done
		else
			echo -e "Please Enter Only Number\n"
	
		fi;;
		2)exit;;
		*)echo -e "Enter a Valid Option\n"
			continue;;
	esac
done


