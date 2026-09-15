#!/usr/bin/env bash

# A simple interest calculator.
set -euo pipefail

read -r -p "Enter the principal amount: " principal
read -r -p "Enter the annual rate of interest: " rate
read -r -p "Enter the time period in years: " time

is_number='^[0-9]+([.][0-9]+)?$'
for value in "$principal" "$rate" "$time"; do
  if ! [[ "$value" =~ $is_number ]]; then
    echo "Please enter non-negative numeric values only." >&2
    exit 1
  fi
done

interest=$(awk -v principal="$principal" -v rate="$rate" -v time="$time" 'BEGIN { printf "%.2f", principal * rate * time / 100 }')
echo "The simple interest is: $interest"
