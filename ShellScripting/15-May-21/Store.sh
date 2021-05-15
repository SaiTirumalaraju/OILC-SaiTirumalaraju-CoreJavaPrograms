#!/bin/bash
  
read -p "enter purchase amount" cost

if [ $cost -lt 1000 ]
then
        tax=`echo $cost \* 2 / 100 | bc`
        discount=`echo $cost \* 10 / 100 | bc`

else
        tax=`echo $cost \* 5 / 100 | bc`
        discount=`echo $cost \* 20 / 100 | bc`
fi

amount=`expr $cost + $tax - $discount`

echo "cash Payment: $amount"
