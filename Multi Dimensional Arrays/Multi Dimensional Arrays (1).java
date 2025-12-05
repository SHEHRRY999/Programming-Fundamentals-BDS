num = int(input("Enter a number (0-1000): "))

# Validate input
if num < 0 or num > 1000:
    print("Error: Number must be between 0 and 1000!")
else:
    # Initialize sum
    digit_sum = 0
    temp_num = num
    
    # Special case for 1000
    if temp_num == 1000:
        # Manually handle 1000
        digit_sum = 1 + 0 + 0 + 0
    else:
        # Use modulus and division for other numbers
        while temp_num > 0:
            # Get last digit using modulus
            digit = temp_num % 10
            # Add digit to sum
            digit_sum = digit_sum + digit
            # Remove last digit
            temp_num = temp_num // 10
    
    print(f"sum of digits is {digit_sum}")