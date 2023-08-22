num1=int(input("Ingrese numero 1"))
num2:int(input("Ingrese el numero 2"))
try:
    resultado=num1/num2
    print("el resultado es:", resultado)
except ZeroDivisionError:
    print("El segundo número no puede ser cero")