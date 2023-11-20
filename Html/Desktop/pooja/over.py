n=int(input("total number of integers:"))
list1=[]
for i in range(n):
    a=int(input("enter an interger:"))
    if a<100:
        list1.append("over")
        print(list1)
