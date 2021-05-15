#!/bin/bash
read -p "enter value: " a
read -p "enter value: " b

read -p "enter any arithmatic operation: " op

case $op in
	+) echo `expr $a + $b`;;
	-) echo `expr $a - $b`;;
	\*) echo `expr $a \* $b`;;
	/) echo `expr $a / $b`;;
	%) echo `expr $a % $b`;;
	*) echo "enter valid operation";;
esac
