# -*- coding: utf-8 -*-
"""
Created on Thu Oct  4 01:17:10 2018

@author: abhishek sen
"""

# -*- coding: utf-8 -*-
"""
Created on Thu Oct  4 00:04:26 2018

@author: abhishek sen

"""
import sys
class Evualation(object):
    """
    This class is used to implement a series of mathematical equations taken input as string containing variables and outputs the variables 
    and their values after the series of operations are over 
    
    Sample inputs:
        "y=5;x=y+4;x=3*x;x= x + y "
        
    sample output:
        ['y', 'x']
        [5, 32]
        
    Sample inputs:
        "y=5;x=y+4;x*=3;x+= y "
        
    sample output:
        ['y', 'x']
        [5, 32]
        
        
    function findValue(expression): recursively finds value of expression
    
    function chechEquation(sequenceOfOperations) goes through the list and evualates each equation and stores the values and corresponding variables
    
    
    
    
    
    """
    bufferVariables=[]
    bufferValues=[]
    
    
    def findValue(self, expression="2+3*(5-3)+2" ):
        expression=expression.strip()#avoiding excess spaces
        
        val=0
        #if bracket is present then compute thet section separately and reinsertiong in the expression
        bracket=expression.find('(')
        if(bracket!=-1):
            endBracket=expression.find(')')
            expression=expression[0:bracket]+str(self.findValue(expression[bracket+1:endBracket]))+expression[endBracket+1:]
            return(self.findValue(expression))
        
        
        divide=expression.find('/')
        multiply=expression.find('*')
        add=expression.find('+')
        sub=expression.find('-')
        
        
        
        #if expression is just number or variable
        if divide==-1 and multiply==-1 and add ==-1 and sub==-1:
            if expression.isnumeric():return(int(expression))
            elif self.bufferVariables.__contains__(expression):return self.bufferValues[self.bufferVariables.index(expression)]
            else:
                sys.exit
            
                   
                   
                   
                   
        #handeling operations as in a binary expression tree while following BEDMAS
        if add!=-1:
            val=self.findValue(expression[0:add])+self.findValue(expression[add+1:])
            return val
        elif sub!=-1:
            val=self.findValue(expression[0:sub])-self.findValue(expression[sub+1:])
            return val
        elif multiply!=-1:
            val=self.findValue(expression[0:multiply])*self.findValue(expression[multiply+1:])
            return val
        else:
            val=self.findValue(expression[0:divide])/self.findValue(expression[divide+1:])
            return val 
            
    
    
    def checkEquations(self,sequenceOfOperations=["y=5","x=y+4","x=3*x","x=x+y"]):
               
        for i in sequenceOfOperations:
            assignment=i.find("=")
            #checking if assignment is taking place in the statement
            if assignment!= -1:
                var=i[0:assignment]#extracting the name of the variable
                rhs=i[assignment+1:]
                #handeling expression like x+=5
                if var.endswith('+') or var.endswith('-') or var.endswith('*') or var.endswith('/'):
                    rhs=var+rhs
                    var=var.strip(var[-1])
                    
                if self.bufferVariables.__contains__(var):  # if variable already present in buffer the its value is updated
                    val=self.findValue(rhs)
                    self.bufferValues[self.bufferVariables.index(var)]=val
                else:  # if variable is not present in buffer it is added and a initialised with 0 followed by assigning its given value
                    self.bufferVariables.append(var)
                    self.bufferValues.append(0)
                    self.bufferValues[-1]=self.findValue(rhs);
                    
        """                              
        print("output")
        print(bufferVariables)
        print(bufferValues)
        """
def main():
    seq=input("enter a sequence of valid mathematical operations separated by ';' :")
    sequenceOfOperations=list(seq.split(';'))
    for i in range(0,len(sequenceOfOperations)):
        sequenceOfOperations[i]=sequenceOfOperations[i].strip()
        
    obj=Evualation()
    obj.checkEquations(sequenceOfOperations)
    print("output")
    print(obj.bufferVariables)
    print(obj.bufferValues)
    
if __name__=='__main__':
    main()
                   
