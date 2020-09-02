# Unit1-Problem-Set
Homework Problems for CSAwesome Unit 1

## SecondsPastMidnight.java
### Statement
Given an integer n - the number of seconds that is passed since midnight - how many full hours and full minutes have passed since midnight?

The program should print two numbers: the number of hours (between 0 and 23) and the number of minutes (between 0 and 1339).

 
For example, if n = 7500, then 7500 seconds have passed since midnight - i.e. now it's 2:05am. So the program should print 2 125 - 2 full hours have passed since midnight, 125 full minutes passed since midnight. 
 
### Example input
`7500`
 
### Example output
`2 125`

## TimeStamps.java
### Statement
Given two timestamps of the same day: a number of hours, minutes and seconds for both of the timestamps. The moment of the first timestamp happened before the moment of the second one. Calculate how many seconds passed between them.
 
### Example input #1
```
1
1
1
2
2
2
```
 
### Example output #1
`3661`
 
### Example input #2
```
1
2
30
1
3
20
```
 
### Example output #2
`50`

## StudentDesks.java
### Statement
A school decided to replace the desks in three classrooms. Each desk sits two students. Given the number of students in each class, print the smallest possible number of desks that can be purchased.
 
The program should read three integers: the number of students in each of the three classes, a, b and c respectively.
 
In the first test there are three groups. The first group has 20 students and thus needs 10 desks. The second group has 21 students, so they can get by with no fewer than 11 desks. 11 desks is also enough for the third group of 22 students. So we need 32 desks in total.

 
### Example input
```
20
21
22
```
 
### Example output
`32`

## AnalogClock.java
### Statement
The hour hand of an analog clock turned α degrees since midnight. Determine the angle by which the minute hand turned since the start of the current hour. Input and output in this problem are integers.

 
### Example input
`190`
(6:20)
 
### Example output
`120`
(20 minutes)
