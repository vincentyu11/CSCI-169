input_size = 10

#A simple print function
def print_arr(input):
    for i in range(input_size):
        print (input[i])

#The partition function
def partition(input,p,r):
    pivot = input[r];
    while p < r:
        while input[p] < pivot:
            p = p + 1

        while input[r] > pivot:
            r = r -1
        if input[p] == input[r]:
            p = p + 1
        elif p < r:
            tmp = input[p]
            input[p] = input[r]
            input[r] = tmp
    return r

#The quicksort recursive function
def quickSort(input, p, r):
    if p < r:
        j = partition(input, p, r)
        quickSort(input, p, j-1) 
        quickSort(input, j+1, r) 


input = [500, 700, 800, 100, 300, 200, 900, 400, 1000, 600]

print ("Input: ")
print_arr(input)

quickSort(input, 0, input_size-1)

print ()
print ("Output: ") 
print_arr(input)
