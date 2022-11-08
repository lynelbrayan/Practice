x<-c(5,7,5,3,5,9,9,6,4,12,11,6,17,8,13,18,6)

mean(x)

median(x)

mode=as.integer(names(sort(-table(newx)))[1])
print(mode)



min<-c(5,10,15,20,25,30)
max<-c(10,15,20,25,30,35)
f<-c(1,4,6,4,2,3)


x<-c(5,7,3,9,6,4,12,11,17,8,13,18)
f<-c(3,1,1,2,3,1,1,1,1,1,1,1)

weighted.mean(x,f)
print(sum(x*f)/sum(f))
weighted.median(x,f)
x=(min+max)/2


newx=c()
for(i in 1:length(x)) {
	for(j in 1:f[i]) {
		newx=append(newx,x[i])
	}

}
mean(newx)
median(newx)
mode=as.integer(names(sort(-table(newx)))[1])
print(mode)


x<-c(5,7,5,3,5,9,9,6,4,12,11,6,17,8,13,18,6)
sd(x)
var(x)
plot(sort(unique(x)),table(x),xlab="x",ylab="y")



min<-c(0,20,40,60,80)
max<-c(20,40,60,80,100)
f<-c(5,10,12,6,3)
x=(min+max)/2


newx=c()
for(i in 1:length(x)) {
	for(j in 1:f[i]) {
		newx=append(newx,x[i])
	}

}
mean(newx)
median(newx)


l=min[which(f==max(f))]
fm=f[which(f==max(f))]
f1=f[which(f==max(f))-1]
f2=f[which(f==max(f))+1]
h=max[1]-min[1]


mode=l+((fm-f1)/(2*fm-f1-f2))*h
print(mode)


x <- c(172,176,154,165,152,142)
y <- c(64,56,45,69,49,57)

result = lm(y~x)
print(result)

print(summary(result))

plot(x,y)



Data <- c(13,15,16,19,20,21,22,22,25,25,25,25,30,33,33,35,35,35,35,36,40,45,46,52 ,70)

boxplot(Data)

summary(Data)

IQR(Data)



x<-c(100,102,104,107,105,112,103,99)
y<-c(15,12,13,11,12,12,19,26)
sum_of_x<- sum(x)
sum_of_y<-sum(y)
sum_of_x_square<-sum(x^2)
sum_of_y_square<-sum(y^2)
sum_of_xy<- sum(x*y)
n<-length(x)
div=sqrt((n*sum_of_x_square-(sum_of_x^2))*(n*sum_of_y_square-(sum_of_y^2)))
correlation_coefficient = (n*sum_of_xy-(sum_of_x*sum_of_y))/div
print(correlation_coefficient)
plot(x,y)



Year <- matrix(c(146, 78, 48, 98, 54, 22, 42, 92, 20, 10, 10, 20), byrow = T, nrow = 3)

rownames(Year) <- c("Liked", "Disliked", "Indiffernt")
colnames(Year) <- c("Under 20", "20-39", "40-59", "60 and over")

result <- chisq.test(Year)
print(result)


min=c(0, 5, 10, 15, 20)
max=c(5, 10, 15, 20, 25)
f=c(7, 18, 25, 30, 20)
funquantile=function(j, n, min,max,f) {
  cf=cumsum(f)
  n2=j * sum(f) / n
  i=1
  while (i <= length(cf)) {
    if (n2 <= cf[i]) {
      up = i
      
      break
    }
    i = i + 1
  }
  print(min[up] + (max[1] - min[1]) / f[up] * (j * max(cf) / n - cf[up - 1]))
}
funquantile(1, 4, min,max,f)
funquantile(3, 4, min,max,f)
funquantile(3, 10, min,max,f)
funquantile(20, 100, min,max,f)


temperature<-c(102,101,100,99,98)
pulse<-c(100,90,80,70,60)
if(length(temperature) == length(pulse)){
  n<-length(temperature)
  temperatureMean<-sum(temperature)/n
  pulseMean<-sum(pulse)/n
  
  tempSummation<-0
  for(i in 1:n){
    val<-((temperature[i]-temperatureMean)*(pulse[i]-pulseMean))
    
    tempSummation<-tempSummation+val
  }
  covariance<-tempSummation/n
  cat("The covariance is : ",covariance)
  
}




X<-c(72,50,81,74,94,86,59,83,65,33,88,81)
Y<-c(84,63,77,78,90,75,49,79,77,52,74,90)


if(length(X)==length(Y)){
  sumX=sum(X)
  sumY=sum(Y)
  
  sumXSquare<-sum(X^2)
  sumYSquare<-sum(Y^2)
  
  sumXY<-sum(X*Y)
  
  n<-length(X)

  XMean<-sumX/n
  YMean<-sumY/n
  
  byx<-(((n*sumXY)-(sumX*sumY))/((n*sumXSquare)-(sumX)^2))
  bxy<-(((n*sumXY)-(sumX*sumY))/((n*sumYSquare)-(sumY)^2))

  # formula substitution
  XSubs<-(bxy*(-YMean))+XMean
  YSubs<-(byx*(-XMean))+YMean

  # concatinating + if positive value
  if(XSubs>0){
    XSubs<-paste("+",XSubs)
  }
  if(YSubs>0){
    YSubs<-paste("+",YSubs)
  }


  cat("\nThe regression eqauation for X is ",bxy,"y",XSubs)
  cat("\nThe regression eqauation for Y is ",byx,"x",YSubs)
  
}


data<-c(350,400,450,500,550,600,650,700);
minData<-min(data)
maxData<-max(data)

n=length(data)

mean=sum(data)/n;

denominator<-maxData-minData
resVector<-vector(length=n)
zScoreResVector<-vector(length=n)
decimalScalingVector<-vector(length=n)

zScoreNumerator<-0

for(i in 1:n){
  item<-data[i]
  res<-((item-minData)/denominator)
  resVector[i]<-res

  
  zScoreNumerator<-zScoreNumerator+((item-mean)*(item-mean))
}
cat("The Min Max variance result is : ",resVector);


SD<-sqrt(zScoreNumerator/(n-1))
# print(SD)

for(i in 1:n){
  zScoreResVector[i]<-(data[i]-mean)/SD
  c<-2
  while((data[i]/(10^c))>1){
    c<-c+1
  }
  decimalScalingVector[i]<-(data[i]/(10^c))
}
cat("\nThe Z score variance result is : ",zScoreResVector);
cat("\nThe Decimal scaling variance result is : ",decimalScalingVector);

