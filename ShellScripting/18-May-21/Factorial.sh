#!/bin/bash
while [ true ]
do
        echo -e "\n 1.Factorial of given Number\n 2.Exit\n "
        read -p "Please Select Any Option: " option
        case $option in
                1) read -p " Enter a Number: " number
                echo "$number" | grep "^[1-9]*$"
                val="$?"

                if [ $val == 0 ]
                then

			factorial=1
			i=1
			while [ $i -le $number ]
			do
				factorial=`expr $factorial \* $i`
				i=$(($i + 1))
			done
		else
			echo -e "\nEnter Only Numbers"
		fi
		echo -e "\nFactorial of $nummber :" $factorial;;
		2)exit;;
		*)echo -e "\nInavlid Input Option"
			continue;;
	esac
done
