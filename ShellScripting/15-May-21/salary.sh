#!/bin/bash
  
echo "Enter basic Salary"
read Basic_Salary

Travel_Allowances=`expr $Basic_Salary \* 15 / 100`
House_Rental_Allowances=`expr $Basic_Salary \* 10 / 100`
Daily_Allowances=`expr $Basic_Salary \* 2 / 100`

Allowances=`expr $Travel_Allowances + $House_Rental_Allowances + $Daily_Allowances`
Gross_Salary=`expr $Basic_Salary + $Allowances`

ProvidentFund=`expr $Basic_Salary \* 10 / 100`

Net_Salary=`expr $Gross_Salary  - $ProvidentFund`

Tax=`expr $Net_Salary \* 5 / 100`

echo "Net Salary is $Net_Salary"

Take_Home_Salary=`expr $Net_Salary - $Tax`

echo "TakeHome Salary is:" $Take_Home_Salary

