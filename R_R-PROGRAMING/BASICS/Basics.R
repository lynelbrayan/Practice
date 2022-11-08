fun <- function() {
    FirstNo <- readline(prompt = "enter a no :")
    FirstNo <- as.integer(FirstNo)
    print(FirstNo)

    SecondNo <- readline(prompt = "Second no")
    SecondNo <- as.integer(SecondNo)
    print(SecondNo)
    sum <- FirstNo + SecondNo
    print(sum)
}
fun()

funloop <- function() {
    FirstNo <- readline(prompt = "enter a no :")
    FirstNo <- as.integer(FirstNo)
    print(FirstNo)

    SecondNo <- readline(prompt = "Second no")
    SecondNo <- as.integer(SecondNo)
    print(SecondNo)
    sum <- FirstNo + SecondNo
    print(sum)
}

boxplot(c(3, 5, 7, 4, 5, 7))


min <- c(1, 6, 11, 16, 21, 26, 31, 36)
max <- c(5, 10, 15, 20, 25, 30, 35, 40)
f <- c(6, 19, 13, 20, 12, 11, 6, 5)

df <- data.frame(min = min, max = max, f = f)

funquantile <- function(j, n, df) {
    cf <- cumsum(df$f)
    n2 <- j * max(cf) / n
    i <- 1
    while (i <= length(cf)) {
        if (n2 <= cf[i]) {
            up <- i

            break
        }
        i <- i + 1
    }
    print(df$min[up] + (df$max[1] - df$min[1]) / df$f[up] * (j * max(cf) / n - cf[i - 1]))
}
funquantile(1, 4, df)
funquantile(3, 4, df)
funquantile(3, 10, df)
funquantile(20, 100, df)


Year <- matrix(c(146, 78, 48, 98, 54, 22, 42, 92, 20, 10, 10, 20), byrow = T, nrow = 3)

rownames(Year) <- c("Liked", "Disliked", "Indiffernt")
colnames(Year) <- c("Under 20", "20-39", "40-59", "60 and over")

result <- chisq.test(Year)


x <- c(100, 102, 104, 107, 105, 112, 103, 99)

y <- c(15, 12, 13, 11, 12, 12, 19, 26)
sum_x <- sum(x)
sum_y <- sum(y)
sum_xsq <- sum(x^2)
sum_ysq <- sum(y^2)
sum_ofXY <- sum(x * y)
n <- length(x)

corr_coeff <- (n * sum_ofXY - (sum_x * sum_y)) / sqrt((n * sum_xsq - (sum_x^2)) * (n * sum_ysq - (sum_y^2)))

plot(x ~ y)
summary(x, y)
print(corr_coeff)
print(cor(x, y, method = "pearson"))

x=c(2,4,6,8,10)
f=c(1,3,5,8,10)
dx=c()

 x=c(2,4,6,8,10)
 f=c(1,3,5,8,10)
 dx=c()
 for (i in 1:length(x)){
	 for(j in 1:f[i]) {
 	dx=append(dx,x[i])
 }
 
 }
print(dx)
summary(dx)

fun=function(x) {
u=unique(x)
print(u[which.max(tabulate(match(x,u)))])
}
fun(dx)




}
names(sort(-table(dx)))[1]
