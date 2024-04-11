public class Main{
public static void main(String[] args) {
    def largest_number(num1, num2, num3):
    if num1 == num2 == num3:
        return "All numbers are equal"
    else:
        return max(num1, num2, num3)

num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))

print("The largest number is:", largest_number(num1, num2, num3))

}
