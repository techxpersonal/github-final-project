#!/usr/bin/env bash

# Calculates simple interest: principal × annual rate × time / 100.
set -euo pipefail

read -r -p "Enter the principal amount: " principal
read -r -p "Enter the annual rate of interest: " annual_rate
read -r -p "Enter the time period in years: " years

number_pattern='^[0-9]+([.][0-9]+)?$'
for value in "$principal" "$annual_rate" "$years"; do
  if ! [[ "$value" =~ $number_pattern ]]; then
    echo "Please enter non-negative numeric values only." >&2
    exit 1
  fi
done

simple_interest=$(awk -v principal="$principal" -v rate="$annual_rate" -v time="$years" \
  'BEGIN { printf "%.2f", principal * rate * time / 100 }')

echo "The simple interest is: $simple_interest"
