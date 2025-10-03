'''
      ██╗ █████╗ ███╗   ██╗ █████╗
      ██║██╔══██╗████╗  ██║██╔══██╗
      ██║███████║██╔██╗ ██║███████║
 ██   ██║██╔══██║██║╚██╗██║██╔══██║
 ╚█████╔╝██║  ██║██║ ╚████║██║  ██║
  ╚════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝
'''

"""employee_data = {
"John": {"age": 30, "department": "HR", "salary": 5000},
"Alice": {"age": 25, "department": "Finance", "salary": 6000},
"Bob": {"age": 28, "department": "IT", "salary": 7000},
"Eve": {"age": 35, "department": "Marketing", "salary": 5500}}
print(employee_data["John"]["salary"])
employee_data["Charlie"]= {"age": 27, "department": "Operations", "salary": 4800}
print(employee_data["Charlie"])
employee_data["Alice"]["department"]="Legal"
print(employee_data["Alice"])
if "Eve" in employee_data:
    print("Eve is exist")
else:
    print("Eve is not exist")
del employee_data["Bob"]
print(employee_data)
print(employee_data.keys())
print(employee_data .values())
for name, details in employee_data.items():
    print(f'{name}:{details['department']}')
print(len (employee_data))
employee_data.clear()
print(employee_data)"""

'''employees = {
"emp001": {"name": "John", "age": 30, "department": "HR", "salary": 5000},
"emp002": {"name": "Alice", "age": 25, "department": "Finance", "salary": 6000},
"emp003": {"name": "Bob", "age": 28, "department": "IT", "salary": 7000},
"emp004": {"name": "Eve", "age": 35, "department": "Marketing", "salary": 5500}, }
print(employees["emp002"]["department"])
employees ["emp005"]={"name":"Charlie","age": 27,"department":"operations","salary":4800}
print(employees["emp005"])
employees ["emp003"] ["salary"]*=1.10
print(employees ["emp003"] ["salary"])
del employees["emp001"]
#print(employees)
print("emp006" in employees)
for x, details in employees.items():
    print(details["name"])
result=sum(x["salary"] for x in employees.values())
print(result/len(employees))
department_count = {}
for emp in employees.values():
    department = emp["department"]
    if department in department_count:
        department_count[department] += 1
    else:
        department_count[department] = 1
print(department_count)
print(len(employees.keys()))  
department_count = {}
for emp_id, emp_info in employees.items():
    department = emp_info["department"]
    if department in department_count:
        department_count[department] += 1
    else:
        department_count[department] = 1
print(department_count)'''
# problem 1
"""def count_of_even(numbers):
    evenNumber=0
    for num in numbers:
        if num%2==0:
            evenNumber+=1
    print(f"there are {evenNumber} even numbers")
numbers=[52541,546,878,215]
count_of_even(numbers)"""
# problem 2
'''def sum_of_numbers(numbers):
    sum=0
    for i in numbers:
        sum+=i
    print(sum)
numbers=[22, 43, 54, 3]
sum_of_numbers(numbers)'''

'''def get_sum(numbers):
    result=sum(numbers)
    print(f'{result}')
numbers = [22, 43, 54, 5]
get_sum(numbers)'''
# problem 3
'''def find_negative_number(numbers):
    for num in numbers:
        if num<1:
            print(f"the first negative number is {num}")
            return
    print('no negative numbers')
numbers=[55,64,-54,548]
find_negative_number(numbers)'''
# problem 4
'''def count_great_numbers(numbers):
    count=0
    for num in numbers:
        if num>threshold:
            count+=1
    print(f"there are {count} greater than threshold")
numbers=[654,554,548,5489,995]
threshold=700
count_great_numbers(numbers)'''
# problem 5
'''def find_the_largest_second_number(numbers):
    largest=max(numbers)
    numbers.remove(largest)
    largest2=max(numbers)
    print(f"{largest2} is the second largest number")
numbers=[6656,84,2105,65,5521]
find_the_largest_second_number(numbers)'''
# problem 6
'''def how_many_vowels(strings):
    count=0
    for char in strings:
        if char in 'aeoui':
            count+=1
    print(f"there is {count} in the string")
strings="congratulations"
how_many_vowels(strings)'''
# problem 7
'''def reverse_a_string(x):
    y=x[::-1]
    print(f'the reserved string is {y}')
reverse_a_string("python")'''
# problem 8
"""def find_all_words(words,letter):
    for specified in words:
        if specified.startswith(letter):
            new_list=[]
            new_list.append(specified)
            print(new_list)
words=["apple", "banana", "cherry", "apricot", "blueberry"]
letter ="a"
find_all_words(words,letter)"""
# problem 9
'''def Calculate_the_Length_of_Each_String(my_list):
    length=[]
    for x in my_list:
        length.append(len(x))
    print(length)
my_list=['jana','mohamed', 'shebl']
Calculate_the_Length_of_Each_String(my_list)'''
# problem 10
'''def find_the_longest_word(words):
    longest=words[0]
    for x in words:
        if len(x) > len(longest):
            longest=x
    print(f'the longest word is {longest}')
words = ["apple", "banana", "cherry", "blueberry"]
find_the_longest_word(words)'''
# problem 11
'''def remove_specific_element(numbers , element):
    new_list=[]
    for x in numbers:
        if x!=element:
            new_list.append(x)
    print(new_list)
numbers = [1, 2, 3, 2, 4, 2, 5]
element = 2
remove_specific_element(numbers,element) '''
# problem 12
'''def all_string_in_sentence(words):
    sentence=''
    for x in words:
        sentence += x +' '
    print(f' the new sentence is {sentence}')
words= ["I", "love", "coding"]
all_string_in_sentence(words)'''
# problem 13
'''def Palindromes(words):
    for x in words:
        if x==x[::-1]:
            print(f"{x} is a palindrome")
        else:
            print(f"{x} is not a palindrome")
words=["madam", "hello", "racecar"]
Palindromes(words)'''
# problem 14
'''def factorial(n):
    result=1
    for i in range(1, n + 1):
       result*=i
    print(result)
n=2
factorial(n)'''
# problem 15

# problem 16
'''def average_of_numbers(numbers):
    average=1
    result=1
    for x in numbers:
        result +=x
        average= result /len(numbers)
    print(average)
numbers = [10, 20, 30, 40]
average_of_numbers(numbers)'''
# problem 17
'''def how_many_words(sentence):
    count=0
    for x in sentence.split():
        count+=1
    print(f'The sentence has {count} words.')
sentence="I love programming"
how_many_words(sentence)'''
# problem 18
'''def reverse_elements(numbers):
    numbers.reverse()
    print(numbers)
numbers = [1, 2, 3, 4]
reverse_elements(numbers)'''
# problem 19
'''def Check_for_Palindrome(string):
    if string==string[::-1]:
        print(f"{string} is a palidroom")
    else:
        print(f"{string} is not a palindrome")
string="madam"
Check_for_Palindrome(string)'''
# problem 20
'''def find_the_largest(numbers):
    largest=max(numbers)
    print(f'the largest number is {largest}')
numbers = [10, 25, 5, 90 ,150]
find_the_largest(numbers)'''
# the last problem finallyyyyyyy
'''def calculate_area(radius):
    area=3.14* radius**2
    print(f'{area}')
radius=3
calculate_area(radius)'''
# احر حاجة خلاص
'''def calculate_circumference(radius):
    circumference=2*3.14*radius
    print(circumference)
radius=5

calculate_circumference(radius)'''

