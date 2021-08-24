def collatz_sequence(num):
  if(num % 2 == 0):
    return num // 2
  elif(num % 2 == 1):
    return 3 * num + 1
  
def a_or_b(a, b):
  a_list = []
  b_list = []
  while a > 1:
    a = collatz_sequence(a)
    a_list.append(a)
    
  while b > 1:
    b = collatz_sequence(b)
    b_list.append(b)
    
  a_length = len(a_list)
  b_length = len(b_list)
  
  if(a_length < b_length):
		return 'a'
  elif(b_length < a_length):
    return 'b'
  elif(a_length == b_length):
    return 'a and b have the same amount of steps'
  