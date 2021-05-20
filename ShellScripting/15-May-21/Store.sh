#!/bin/bash
read -p "Enter the Price of Product Purchased : " Amount

if [ $Amount -lt 1000 ]
then
	Discount=`expr $Amount \* 10 / 100`
	After_Discount_Amount=`expr $Amount - $Discount`
	Tax=`expr $After_Discount_Amount \* 2 / 100`

else
	Discount=`expr $Amount \* 20 / 100`
	After_Discount_Amount=`expr $Amount - $Discount`
	Tax=`expr $After_Discount_Amount \* 5 / 100`
fi

Final_Amount=`expr $After_Discount_Amount + $Tax`
echo "Price: Rs."$Amount
echo "Discount: Rs."$Discount
echo "Net Total: Rs."$After_Discount_Amount
echo "Tax: Rs."$Tax
echo "Final Amount to be  Paid : Rs."$Final_Amount

