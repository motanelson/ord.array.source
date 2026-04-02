#!/bin/python
a="\033[40;37m\nhello world...\n"

f1=open("hello.txt","w")
f1.write(a)
f1.close()

