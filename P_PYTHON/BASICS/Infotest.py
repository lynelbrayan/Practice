

str=input("Enter a string ")

vals=str.split(",")
res=[]

for i in vals:
    i=int(i)
    v=f"{i**0.5}"
    v=v.split(".")
    fct=1
    if v[1]>="0" and v[0]>="0":
        for j in range(1,i+1):
            fct=fct * j
        
        fct=f"{fct}"
    
        if(fct[::-1]=="0"):
            res.append(fct)
        else:
            res.append(fct.rstrip("0")[-3::])

if(len(res)==0):
    print(-1)
else:
    for i in res:
        print(i+", ",end="")

    

